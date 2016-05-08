package domtest;

import java.io.File;
import java.io.FileOutputStream;
 
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
 
public class Test {
	
	public static void addStudent(Document doc,Element root,String id,String name){
		//构建XML中的节点:
        
        Element studentElement = doc.createElement("学生");
        Element nameElement = doc.createElement("姓名");
        Element idElement = doc.createElement("学号");
        Element singleManScoreElement = doc.createElement("个人成绩");
        Element singleCourseElement1 = doc.createElement("单科成绩");
        Element singleCourseElement2 = doc.createElement("单科成绩");
        Element singleCourseElement3 = doc.createElement("单科成绩");
        Element singleCourseElement4 = doc.createElement("单科成绩");
        Element singleCourseElement5 = doc.createElement("单科成绩");
        Element normalElement1 = doc.createElement("平时成绩");
        Element testElement1 = doc.createElement("期末成绩");
        Element lastElement1 = doc.createElement("总评成绩");
        Element normalElement2 = doc.createElement("平时成绩");
        Element testElement2 = doc.createElement("期末成绩");
        Element lastElement2 = doc.createElement("总评成绩");
        Element normalElement3 = doc.createElement("平时成绩");
        Element testElement3 = doc.createElement("期末成绩");
        Element lastElement3 = doc.createElement("总评成绩");
        Element normalElement4 = doc.createElement("平时成绩");
        Element testElement4 = doc.createElement("期末成绩");
        Element lastElement4 = doc.createElement("总评成绩");
        Element normalElement5 = doc.createElement("平时成绩");
        Element testElement5 = doc.createElement("期末成绩");
        Element lastElement5 = doc.createElement("总评成绩");
        
        //数据加载:
        Text studentValue = doc.createTextNode(name);
        Text idValue = doc.createTextNode(id);
        
        
        
       //按顺序添加各个节点

        root.appendChild(studentElement);
        studentElement.appendChild(nameElement);
        nameElement.appendChild(studentValue);
        studentElement.appendChild(idElement);
        idElement.appendChild(idValue);
        studentElement.appendChild(singleManScoreElement);
        singleManScoreElement.appendChild(singleCourseElement1);
        singleManScoreElement.appendChild(singleCourseElement2);
        singleManScoreElement.appendChild(singleCourseElement3);
        singleManScoreElement.appendChild(singleCourseElement4);
        singleManScoreElement.appendChild(singleCourseElement5);
        
        singleCourseElement1.setAttribute("课程编号", "000001");
        Text normalValue1 = doc.createTextNode(String.valueOf(Math.random()*100));
        Text testValue1 = doc.createTextNode(String.valueOf(Math.random()*100));
        Text lastValue1 = doc.createTextNode(String.valueOf(Math.random()*100));
        
        singleCourseElement1.appendChild(normalElement1);
        singleCourseElement1.appendChild(testElement1);
        singleCourseElement1.appendChild(lastElement1);
        normalElement1.appendChild(normalValue1);
        testElement1.appendChild(testValue1);
        lastElement1.appendChild(lastValue1);
        
        singleCourseElement2.setAttribute("课程编号", "000002");
        Text normalValue2 = doc.createTextNode(String.valueOf(Math.random()*100));
        Text testValue2 = doc.createTextNode(String.valueOf(Math.random()*100));
        Text lastValue2 = doc.createTextNode(String.valueOf(Math.random()*100));
        
        singleCourseElement2.appendChild(normalElement2);
        singleCourseElement2.appendChild(testElement2);
        singleCourseElement2.appendChild(lastElement2);
        normalElement2.appendChild(normalValue2);
        testElement2.appendChild(testValue2);
        lastElement2.appendChild(lastValue2);
        
        singleCourseElement3.setAttribute("课程编号", "000003");
        Text normalValue3 = doc.createTextNode(String.valueOf(Math.random()*100));
        Text testValue3 = doc.createTextNode(String.valueOf(Math.random()*100));
        Text lastValue3 = doc.createTextNode(String.valueOf(Math.random()*100));
        
        singleCourseElement3.appendChild(normalElement3);
        singleCourseElement3.appendChild(testElement3);
        singleCourseElement3.appendChild(lastElement3);
        normalElement3.appendChild(normalValue3);
        testElement3.appendChild(testValue3);
        lastElement3.appendChild(lastValue3);
        
        singleCourseElement4.setAttribute("课程编号", "000004");
        Text normalValue4 = doc.createTextNode(String.valueOf(Math.random()*100));
        Text testValue4 = doc.createTextNode(String.valueOf(Math.random()*100));
        Text lastValue4 = doc.createTextNode(String.valueOf(Math.random()*100));
        
        singleCourseElement4.appendChild(normalElement4);
        singleCourseElement4.appendChild(testElement4);
        singleCourseElement4.appendChild(lastElement4);
        normalElement4.appendChild(normalValue4);
        testElement4.appendChild(testValue4);
        lastElement4.appendChild(lastValue4);
        
        singleCourseElement5.setAttribute("课程编号", "000005");
        Text normalValue5 = doc.createTextNode(String.valueOf(Math.random()*100));
        Text testValue5 = doc.createTextNode(String.valueOf(Math.random()*100));
        Text lastValue5 = doc.createTextNode(String.valueOf(Math.random()*100));
        
        singleCourseElement5.appendChild(normalElement5);
        singleCourseElement5.appendChild(testElement5);
        singleCourseElement5.appendChild(lastElement5);
        normalElement5.appendChild(normalValue5);
        testElement5.appendChild(testValue5);
        lastElement5.appendChild(lastValue5);
	}
 
    public static void main(String[] args) throws Exception {
 
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();
               
        //构建XML中的节点:
        Element root = doc.createElement("学生列表");
       
       //按顺序添加各个节点
        doc.appendChild(root);
        
        addStudent(doc,root,"131250004","徐华韬");
        addStudent(doc,root,"131250018","王一琦");
        addStudent(doc,root,"131250216","文煊义");
        addStudent(doc,root,"131250181","陈云龙");
        addStudent(doc,root,"131250XXX","黄振豪");
        addStudent(doc,root,"131250XXX","利力");
        addStudent(doc,root,"131250XXX","雷泽政");
        addStudent(doc,root,"131250XXX","肖瑞");
        addStudent(doc,root,"131250XXX","程昊");
        addStudent(doc,root,"131250XXX","王宁");
        addStudent(doc,root,"131250XXX","张捷");
        addStudent(doc,root,"131250XXX","董宁宁");
         
        Transformer t=TransformerFactory.newInstance().newTransformer();
        //设置换行和缩进
        t.setOutputProperty(OutputKeys.INDENT,"yes");
        t.setOutputProperty(OutputKeys.METHOD, "xml");
        t.transform(new DOMSource(doc), new StreamResult(new FileOutputStream(new File("../domtest/text.xml"))));
 
    }
 
}