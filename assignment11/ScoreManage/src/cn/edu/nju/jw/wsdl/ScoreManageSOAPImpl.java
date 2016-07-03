/**
 * ScoreManageSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.wsdl;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.WebServiceContext;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import cn.edu.nju.jw.exception.CourseNotExistException;
import cn.edu.nju.jw.exception.NumNotExistException;
import cn.edu.nju.jw.exception.ScoreFormatException;
import cn.edu.nju.jw.exception.ScoreTypeException;
import cn.edu.nju.jw.exception.StudentIdException;
import cn.edu.nju.jw.schema.成绩类型;
import cn.edu.nju.jw.schema.课程成绩类型;

@WebService(targetNamespace = "http://jw.nju.edu.cn/wsdl", endpointInterface = "cn.edu.nju.jw.wsdl.ScoreManage_PortType")
public class ScoreManageSOAPImpl implements cn.edu.nju.jw.wsdl.ScoreManage_PortType {
	@Resource
	WebServiceContext wscontext;

	private String xmlPath;

	public ScoreManageSOAPImpl() {
		String path = getClass().getResource("/").getPath();
		this.xmlPath = path.replace("/build/classes", "").replace("%20", " ") + "WebContent/output.xml";
	}

	public cn.edu.nju.jw.schema.课程成绩类型[] getScore(java.lang.String sid) throws java.rmi.RemoteException {
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
			Document doc = dbBuilder.parse(xmlPath);
			NodeList nList = doc.getElementsByTagName("tns:课程成绩");
			NodeList nList2 = doc.getElementsByTagName("tns:成绩");
			ArrayList<String> scoreList = new ArrayList<String>();
			for (int j = 0; j < nList2.getLength(); j++) {
				Element node2 = (Element) nList2.item(j);
				String num = node2.getElementsByTagName("tns:学号").item(0).getFirstChild().getNodeValue();
				if (num.equals(sid)) {
					String score = node2.getElementsByTagName("tns:得分").item(0).getFirstChild().getNodeValue();
					scoreList.add(score);
				}
			}
			if (scoreList.size() == 0) {
				throw new NumNotExistException("查找的学号不存在", "查找的学号不存在");
			} else {
				ArrayList<String> cidArr = new ArrayList<String>();
				ArrayList<String> sAttArr = new ArrayList<String>();
				for (int i = 0; i < nList.getLength(); i++) {
					NamedNodeMap attributes = nList.item(i).getAttributes();
					for (int j = 0; j < attributes.getLength(); j++) {
						Node attribute = attributes.item(j);
						if (j == 0) {
							sAttArr.add(attribute.getNodeValue());
						} else {
							cidArr.add(attribute.getNodeValue());
						}
					}
				}
				课程成绩类型[] karr = new 课程成绩类型[cidArr.size()];
				for (int i = 0; i < cidArr.size(); i++) {
					成绩类型 s = new 成绩类型(sid, Integer.parseInt(scoreList.get(i)));
					课程成绩类型 kc = new 课程成绩类型(s, cidArr.get(i), sAttArr.get(i));
					karr[i] = kc;
				}
				return karr;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private boolean hasSId = false;
	private boolean hasCId = false;
	private boolean vType = false;
	private boolean vScore = false;

	private boolean isNum(String str) {
		try {
			new BigDecimal(str);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean doSth(cn.edu.nju.jw.schema.课程成绩类型 stuScore, String oper) {
		String sid = stuScore.get成绩().get学号();
		String cid = stuScore.get课程编号();
		String type = stuScore.get成绩性质();
		String score = stuScore.get成绩().get得分() + "";
		boolean existId = false;
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
			Document doc = dbBuilder.parse(xmlPath);
			NodeList nList = doc.getElementsByTagName("tns:课程成绩");

			Element scoreEle = doc.createElement("tns:成绩");
			Element sidEle = doc.createElement("tns:学号");
			sidEle.setTextContent(sid);
			Element getScore = doc.createElement("tns:得分");
			getScore.setTextContent(score);
			scoreEle.appendChild(sidEle);
			scoreEle.appendChild(getScore);

			if ((type.equals("平时成绩") || (type.equals("期末成绩")) || type.equals("总评成绩"))) {
				vType = true;
			} else {
				vType = false;
			}
			if (isNum(score)) {
				if ((Integer.parseInt(score) >= 0) && (Integer.parseInt(score) <= 100)) {
					vScore = true;
				} else
					vScore = false;
			} else {
				vScore = false;
			}
			// System.out.println(vType);
			if (vType && vScore) {
				for (int i = 0; i < nList.getLength(); i++) {
					if ((nList.item(i).getAttributes().item(1).getNodeValue().equals(cid))
							&& nList.item(i).getAttributes().item(0).getNodeValue().equals(type)) {
						hasCId = true;
						NodeList list = nList.item(i).getChildNodes();
						// System.out.println(list.item(1).getChildNodes().getLength());
						for (int k = 0; k < list.getLength(); k++) {
							if (list.item(k).getNodeType() != Node.TEXT_NODE) {
								if (list.item(k).getChildNodes().item(1).getChildNodes().item(0).getNodeValue()
										.equals(sid)) {
									hasSId = true;
									if (oper.equals("mod")) {
										list.item(k).getChildNodes().item(3).getChildNodes().item(0)
												.setNodeValue(score);
										TransformerFactory tf = TransformerFactory.newInstance();
										try {
											Transformer t = tf.newTransformer();
											t.setOutputProperty(OutputKeys.INDENT, "yes");
											t.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
											t.setOutputProperty(OutputKeys.METHOD, "xml");
											t.transform(new DOMSource(doc),
													new StreamResult(new FileOutputStream(new File(xmlPath))));
										} catch (Exception e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										return true;
									} else if (oper.equals("del")) {
										Node delNode = list.item(k);
										Node parentNode = nList.item(i);
										parentNode.removeChild(delNode);
										TransformerFactory tf = TransformerFactory.newInstance();
										try {
											Transformer t = tf.newTransformer();
											t.setOutputProperty(OutputKeys.INDENT, "yes");
											t.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
											t.setOutputProperty(OutputKeys.METHOD, "xml");
											t.transform(new DOMSource(doc),
													new StreamResult(new FileOutputStream(new File(xmlPath))));
										} catch (Exception e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										return true;
									} else if (oper.equals("add")) {
										existId = true;
										throw new StudentIdException("您要添加的学生成绩已存在", "您要添加的学生成绩已存在");
									}
									// System.out.println(list.item(k).getChildNodes().item(3).getChildNodes().item(0).getNodeValue());

									break;
								} else {
									hasSId = false;
								}
							} else {
								continue;
							}
						}
						if (oper.equals("add") && existId == false) {
							System.out.println("添加节点");
							Node parentNode = nList.item(i);
							parentNode.appendChild(scoreEle);
							TransformerFactory tf = TransformerFactory.newInstance();
							try {
								Transformer t = tf.newTransformer();
								t.setOutputProperty(OutputKeys.INDENT, "yes");
								t.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
								t.setOutputProperty(OutputKeys.METHOD, "xml");
								t.transform(new DOMSource(doc),
										new StreamResult(new FileOutputStream(new File(xmlPath))));
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							return true;
						}
					} else {
						hasCId = false;
					}
				}
			}
			if (vScore == false) {
				throw new ScoreFormatException("分数格式不正确", "分数格式不正确");
			} else if (vType == false) {
				throw new ScoreTypeException("成绩性质不正确", "分数类型不正确");
			} else if (hasCId == false) {
				throw new CourseNotExistException("课程不存在", "课程不存在");
			} else if (hasSId == false) {
				throw new NumNotExistException("查找的学号不存在", "查找的学号不存在");
			} else {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean modifyScore(cn.edu.nju.jw.schema.课程成绩类型 stuScore) throws java.rmi.RemoteException {
		return doSth(stuScore, "mod");
	}

	public boolean addScore(cn.edu.nju.jw.schema.课程成绩类型 stuScore) throws java.rmi.RemoteException {
		return doSth(stuScore, "add");
	}

	public boolean delScore(cn.edu.nju.jw.schema.课程成绩类型 stuScore) throws java.rmi.RemoteException {
		return doSth(stuScore, "del");
	}

}
