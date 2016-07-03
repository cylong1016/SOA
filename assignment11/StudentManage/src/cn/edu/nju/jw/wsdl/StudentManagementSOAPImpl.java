/**
 * StudentManagementSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.wsdl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.jws.WebService;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import cn.edu.nju.exception.InvalidUpdateException;
import cn.edu.nju.exception.NoDataException;
import cn.edu.nju.exception.NoExistIDException;
import cn.edu.nju.www.schema.个人信息类型;

@WebService(targetNamespace = "http://jw.nju.edu.cn/wsdl", endpointInterface = "cn.edu.nju.jw.wsdl.StudentManagementPortType_PortType")
public class StudentManagementSOAPImpl implements cn.edu.nju.jw.wsdl.StudentManagementPortType_PortType{
	private String xmlPath;
	
	public StudentManagementSOAPImpl() {
		String path = getClass().getResource("/").getPath();
		this.xmlPath=path.replace("/build/classes", "").replace("%20", " ") + "WebContent/persons.xml";
	}
	
	public cn.edu.nju.www.schema.个人信息类型 studentManagement(cn.edu.nju.www.schema.UpdateInformation updateInfo) throws java.rmi.RemoteException {
        
		// 没有任何输入
    	if (updateInfo == null) {
			NoDataException noData = new NoDataException();
			noData.printErrorMessage();
			return null;
		}
    	
    	String id = updateInfo.get学号();
    	
    	
    	
    	try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
			Document doc = dbBuilder.parse(xmlPath);
			NodeList idList = doc.getElementsByTagName("tns:学号");
			
			boolean idExist = false;
			Element studentInfo = null;
			
			for (int i = 0; i < idList.getLength(); i++) {
				Node studentId = idList.item(i);
				if (studentId.getFirstChild().getNodeValue().equals(id)) {
					idExist = true;
					studentInfo = (Element) studentId.getParentNode().getChildNodes().item(3);
					break;
				}
			}
			// 不存在输入的ID
			if (!idExist) {
				NoExistIDException noExistIDException = new NoExistIDException();
				noExistIDException.printErrorMessage();
				return null;
			}
			
			个人信息类型 personInfo = updateInfo.get个人基本信息();
			String name = null, phone = null, departmentId = null, departmentName = null, gender = null;
			if (personInfo != null) {
				
				name = personInfo.get姓名();
				phone = personInfo.get手机号();
				if (personInfo.get院系部门() != null && personInfo.get院系部门().get院系() != null) {
					departmentName = personInfo.get院系部门().get院系().get院系名();
					departmentId = personInfo.get院系部门().get院系().get院系编号();
				}
				if (personInfo.get性别() != null) {
					gender = personInfo.get性别().getValue();
				}
				
			} 
			
			if (name != null) {
				studentInfo.getElementsByTagName("nju:姓名").item(0).getFirstChild().setNodeValue(name);
			}
			if (gender != null) {
				studentInfo.getElementsByTagName("nju:性别").item(0).getFirstChild().setNodeValue(gender);
			}
			if (phone != null) {
				studentInfo.getElementsByTagName("nju:手机号").item(0).getFirstChild().setNodeValue(phone);
			}
			if (departmentId != null) {
				studentInfo.getElementsByTagName("nju:院系编号").item(0).getFirstChild().setNodeValue(departmentId);
			}
			if (departmentName != null) {
				studentInfo.getElementsByTagName("nju:院系名").item(0).getFirstChild().setNodeValue(departmentName);
			}
			
			
			TransformerFactory tf = TransformerFactory.newInstance();
			try {
				Transformer t=tf.newTransformer();
				t.setOutputProperty(OutputKeys.INDENT,"yes");
				t.setOutputProperty("{http://xml.apache.org/xslt}indent-amount","2");
				t.setOutputProperty(OutputKeys.METHOD,"xml");
				t.transform(new DOMSource(doc),  new StreamResult(new FileOutputStream(new File(xmlPath))));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//			 返回正确的信息
			
			return personInfo;
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
    }

}
