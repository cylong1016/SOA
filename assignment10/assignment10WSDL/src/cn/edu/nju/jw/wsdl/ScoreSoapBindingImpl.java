/**
 * ScoreSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.wsdl;
import java.io.File;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import cn.edu.nju.jw.schema.删除成绩类型;
import cn.edu.nju.jw.schema.成绩性质类型;

public class ScoreSoapBindingImpl implements cn.edu.nju.jw.wsdl.ScoreInterface{
	
    public cn.edu.nju.jw.schema.单个学生成绩列表类型 searchScore(java.lang.String studentNo) throws java.rmi.RemoteException, cn.edu.nju.jw.wsdl.SearchScoreFault {
        Document document = getDocument();
        cn.edu.nju.jw.schema.单个学生成绩列表类型 result = new cn.edu.nju.jw.schema.单个学生成绩列表类型();
        
        NodeList nodes = document.getDocumentElement().getElementsByTagName("tns:课程成绩");
        for(int i=0; i<nodes.getLength(); i++){
        	NodeList childNodes = nodes.item(i).getChildNodes();
        	NamedNodeMap nodeAttr = nodes.item(i).getAttributes();
        	for(int j=0; j<childNodes.getLength(); j++){
        		Node temp = childNodes.item(j);
        		// 学号相同
        		if(temp.getFirstChild().getTextContent().equals(studentNo)){
        			cn.edu.nju.jw.schema.单项成绩类型 single = new cn.edu.nju.jw.schema.单项成绩类型();
        			single.set得分(Integer.parseInt(temp.getLastChild().getTextContent()));
        			single.set成绩性质((成绩性质类型) nodeAttr.getNamedItem("成绩性质"));
        			single.set课程编号(nodeAttr.getNamedItem("课程编号").toString());
        			result.set单项成绩(single);
        		}
        	}
        }
    	return result;
    }

    public java.lang.String addScore(cn.edu.nju.jw.schema.添加或修改成绩类型 addScore) throws java.rmi.RemoteException, cn.edu.nju.jw.wsdl.AddScoreFault {
    	
	    Document document = getDocument();
	   
	    /*
	     * 检验课程和成绩性质是否已经存在
	     */
	    NodeList nodes = document.getDocumentElement().getElementsByTagName("tns:课程成绩");
	    Element scoreType = null;
	    for (int i = 0; i < nodes.getLength(); i++) {
			NamedNodeMap scoreAttr = nodes.item(i).getAttributes();
			if (scoreAttr.getNamedItem("课程编号").equals(addScore.get课程编号()) && scoreAttr.getNamedItem("成绩性质").equals(addScore.get成绩性质()) ) {
				scoreType = (Element) nodes.item(i);
				break;
			}
	    }
	    // 课程与成绩类型不存在，添加课程和成绩类型
	    if(scoreType==null){
	    	scoreType = document.createElement("tns:课程成绩");
			scoreType.setAttribute("成绩性质", addScore.get成绩性质().toString());
			scoreType.setAttribute("课程编号", addScore.get课程编号().toString());
	    }
	    Element score = document.createElement("tns:成绩");
	   	Element studentID = document.createElement("tns:学号");
	   	studentID.setTextContent(addScore.get学号());
	   	Element number = document.createElement("tns:得分");
	   	number.setTextContent( String.valueOf(addScore.get得分()) );
    	score.appendChild(studentID);
    	score.appendChild(number);
	   	//再把成绩添加进课程组
	   	scoreType.appendChild(score);
	    	
	    return writeXML(document);
    }

    public java.lang.String deleteScore(cn.edu.nju.jw.schema.删除成绩类型 delScore) throws java.rmi.RemoteException, cn.edu.nju.jw.wsdl.DeleteScoreFault {
        
    	Document document = getDocument();
  	   
	    /*
	     * 检验课程和成绩性质是否已经存在
	     */
	    NodeList nodes = document.getDocumentElement().getElementsByTagName("tns:课程成绩");
	    Element scoreType = null;
	    for (int i = 0; i < nodes.getLength(); i++) {
			NamedNodeMap scoreAttr = nodes.item(i).getAttributes();
			if (scoreAttr.getNamedItem("课程编号").equals(delScore.get课程编号()) && scoreAttr.getNamedItem("成绩性质").equals(delScore.get成绩性质()) ) {
				scoreType = (Element) nodes.item(i);
				break;
			}
	    }
	    // 课程与成绩类型不存在，添加课程和成绩类型
	    if(scoreType==null){
	    	return "score does not exist!";
	    }
	    document.removeChild(scoreType);
	    	
	    return writeXML(document);
    }

    public java.lang.String modifyScore(cn.edu.nju.jw.schema.添加或修改成绩类型 modSocre) throws java.rmi.RemoteException, cn.edu.nju.jw.wsdl.ModifyScoreFault {
    	cn.edu.nju.jw.schema.删除成绩类型 delScore = new 删除成绩类型(modSocre.get学号(), modSocre.get课程编号(), modSocre.get成绩性质());
    	if(deleteScore(delScore).equals("score does not exist!")){
    		return "score does not exist!";
    	}
    	return addScore(modSocre);
    }
    
    /*
	 * 将修改后的document对象写入XML中
	 */
    private String writeXML(Document document){
    	URL url = getClass().getResource("");
    	String filePath = url.getPath().replace("WEB-INF/classes/cn/edu/nju/jw/wsdl", "");
    	
    	try{
    		TransformerFactory tFactory = TransformerFactory.newInstance();
    		Transformer transformer = tFactory.newTransformer();
    		transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
    		DOMSource source = new DOMSource(document);
    		StreamResult result = new StreamResult(new File(filePath + "ScoreList.xml"));
    		transformer.transform(source, result);
    		return "添加成功";
    	} catch (Exception e) {
			e.printStackTrace();
			return "添加失败： " + e.getMessage();
		}
    }
    
    /**
     * 读ScoreList.xml文件
     */
    private Document getDocument(){
    	URL url = getClass().getResource("");
    	String filePath = url.getPath().replace("WEB-INF/classes/cn/edu/nju/jw/wsdl", "");
    	
    	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    	factory.setIgnoringElementContentWhitespace(true);
    	
    	Document document=null;
    	try{	
    		DocumentBuilder builder = factory.newDocumentBuilder();
    		document = builder.parse(filePath + "ScoreList.xml");
    		//score = document.getDocumentElement();
    	} catch(Exception e){
    		e.printStackTrace();
    	}
    	return document;
    }

}
