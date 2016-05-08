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
		//����XML�еĽڵ�:
        
        Element studentElement = doc.createElement("ѧ��");
        Element nameElement = doc.createElement("����");
        Element idElement = doc.createElement("ѧ��");
        Element singleManScoreElement = doc.createElement("���˳ɼ�");
        Element singleCourseElement1 = doc.createElement("���Ƴɼ�");
        Element singleCourseElement2 = doc.createElement("���Ƴɼ�");
        Element singleCourseElement3 = doc.createElement("���Ƴɼ�");
        Element singleCourseElement4 = doc.createElement("���Ƴɼ�");
        Element singleCourseElement5 = doc.createElement("���Ƴɼ�");
        Element normalElement1 = doc.createElement("ƽʱ�ɼ�");
        Element testElement1 = doc.createElement("��ĩ�ɼ�");
        Element lastElement1 = doc.createElement("�����ɼ�");
        Element normalElement2 = doc.createElement("ƽʱ�ɼ�");
        Element testElement2 = doc.createElement("��ĩ�ɼ�");
        Element lastElement2 = doc.createElement("�����ɼ�");
        Element normalElement3 = doc.createElement("ƽʱ�ɼ�");
        Element testElement3 = doc.createElement("��ĩ�ɼ�");
        Element lastElement3 = doc.createElement("�����ɼ�");
        Element normalElement4 = doc.createElement("ƽʱ�ɼ�");
        Element testElement4 = doc.createElement("��ĩ�ɼ�");
        Element lastElement4 = doc.createElement("�����ɼ�");
        Element normalElement5 = doc.createElement("ƽʱ�ɼ�");
        Element testElement5 = doc.createElement("��ĩ�ɼ�");
        Element lastElement5 = doc.createElement("�����ɼ�");
        
        //���ݼ���:
        Text studentValue = doc.createTextNode(name);
        Text idValue = doc.createTextNode(id);
        
        
        
       //��˳����Ӹ����ڵ�

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
        
        singleCourseElement1.setAttribute("�γ̱��", "000001");
        Text normalValue1 = doc.createTextNode(String.valueOf(Math.random()*100));
        Text testValue1 = doc.createTextNode(String.valueOf(Math.random()*100));
        Text lastValue1 = doc.createTextNode(String.valueOf(Math.random()*100));
        
        singleCourseElement1.appendChild(normalElement1);
        singleCourseElement1.appendChild(testElement1);
        singleCourseElement1.appendChild(lastElement1);
        normalElement1.appendChild(normalValue1);
        testElement1.appendChild(testValue1);
        lastElement1.appendChild(lastValue1);
        
        singleCourseElement2.setAttribute("�γ̱��", "000002");
        Text normalValue2 = doc.createTextNode(String.valueOf(Math.random()*100));
        Text testValue2 = doc.createTextNode(String.valueOf(Math.random()*100));
        Text lastValue2 = doc.createTextNode(String.valueOf(Math.random()*100));
        
        singleCourseElement2.appendChild(normalElement2);
        singleCourseElement2.appendChild(testElement2);
        singleCourseElement2.appendChild(lastElement2);
        normalElement2.appendChild(normalValue2);
        testElement2.appendChild(testValue2);
        lastElement2.appendChild(lastValue2);
        
        singleCourseElement3.setAttribute("�γ̱��", "000003");
        Text normalValue3 = doc.createTextNode(String.valueOf(Math.random()*100));
        Text testValue3 = doc.createTextNode(String.valueOf(Math.random()*100));
        Text lastValue3 = doc.createTextNode(String.valueOf(Math.random()*100));
        
        singleCourseElement3.appendChild(normalElement3);
        singleCourseElement3.appendChild(testElement3);
        singleCourseElement3.appendChild(lastElement3);
        normalElement3.appendChild(normalValue3);
        testElement3.appendChild(testValue3);
        lastElement3.appendChild(lastValue3);
        
        singleCourseElement4.setAttribute("�γ̱��", "000004");
        Text normalValue4 = doc.createTextNode(String.valueOf(Math.random()*100));
        Text testValue4 = doc.createTextNode(String.valueOf(Math.random()*100));
        Text lastValue4 = doc.createTextNode(String.valueOf(Math.random()*100));
        
        singleCourseElement4.appendChild(normalElement4);
        singleCourseElement4.appendChild(testElement4);
        singleCourseElement4.appendChild(lastElement4);
        normalElement4.appendChild(normalValue4);
        testElement4.appendChild(testValue4);
        lastElement4.appendChild(lastValue4);
        
        singleCourseElement5.setAttribute("�γ̱��", "000005");
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
               
        //����XML�еĽڵ�:
        Element root = doc.createElement("ѧ���б�");
       
       //��˳����Ӹ����ڵ�
        doc.appendChild(root);
        
        addStudent(doc,root,"131250004","�컪�");
        addStudent(doc,root,"131250018","��һ��");
        addStudent(doc,root,"131250216","������");
        addStudent(doc,root,"131250181","������");
        addStudent(doc,root,"131250XXX","�����");
        addStudent(doc,root,"131250XXX","����");
        addStudent(doc,root,"131250XXX","������");
        addStudent(doc,root,"131250XXX","Ф��");
        addStudent(doc,root,"131250XXX","���");
        addStudent(doc,root,"131250XXX","����");
        addStudent(doc,root,"131250XXX","�Ž�");
        addStudent(doc,root,"131250XXX","������");
         
        Transformer t=TransformerFactory.newInstance().newTransformer();
        //���û��к�����
        t.setOutputProperty(OutputKeys.INDENT,"yes");
        t.setOutputProperty(OutputKeys.METHOD, "xml");
        t.transform(new DOMSource(doc), new StreamResult(new FileOutputStream(new File("../domtest/text.xml"))));
 
    }
 
}