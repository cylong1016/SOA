import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;


public class XMLBuilder {

	public static void build(ArrayList<ScoreRecord> records,String filePath)
	{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Document doc = builder.newDocument();
        
        Element root = doc.createElement("不及格成绩列表");
        
        doc.appendChild(root);
        
        for(ScoreRecord s:records)
        {
        	addChild(doc, root, s);
        }
        Transformer t = null;
		try {
			t = TransformerFactory.newInstance().newTransformer();
		} catch (TransformerConfigurationException
				| TransformerFactoryConfigurationError e) {
			e.printStackTrace();
		}
        //设置换行和缩进
        t.setOutputProperty(OutputKeys.INDENT,"yes");
        t.setOutputProperty(OutputKeys.METHOD, "xml");
        try {
			t.transform(new DOMSource(doc), new StreamResult(new FileOutputStream(new File(filePath))));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void addChild(Document doc,Element root,ScoreRecord scoreRecord)
	{
		Element score = doc.createElement("成绩");
		
		Element nameElement = doc.createElement("姓名");
		Element idElement = doc.createElement("学号");
		Element courseElement = doc.createElement("课程编号");
		Element scoreElement = doc.createElement("成绩");
		Element typeElement = doc.createElement("成绩类型");
		
		Text nameText = doc.createTextNode(scoreRecord.getName());
		Text idText = doc.createTextNode(scoreRecord.getId());
		Text courseText = doc.createTextNode(scoreRecord.getCourse());
		Text scoreText = doc.createTextNode(scoreRecord.getScore());
		Text typeText = doc.createTextNode(scoreRecord.getType());
		
		nameElement.appendChild(nameText);
		idElement.appendChild(idText);
		courseElement.appendChild(courseText);
		scoreElement.appendChild(scoreText);
		typeElement.appendChild(typeText);
		
		score.appendChild(nameElement);
		score.appendChild(idElement);
		score.appendChild(courseElement);
		score.appendChild(scoreElement);
		score.appendChild(typeElement);
		
		root.appendChild(score);
	}
}
