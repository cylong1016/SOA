package data;

import java.util.ArrayList;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;


public class ScoreStudent {

	private int id;
	private String name;
	private ArrayList<Score> scores;
	
	public ScoreStudent() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Score> getScores() {
		return scores;
	}
	public void setScores(ArrayList<Score> scores) {
		this.scores = scores;
	}
	
	public void addToSOAP(SOAPElement soapElement) {
		try {
			QName rootQName = soapElement.createQName("学生成绩", "tns");
			SOAPElement root = soapElement.addChildElement(rootQName);

			QName studentQName = soapElement.createQName("学号", "tns");
			SOAPElement studentIdDOM = root.addChildElement(studentQName);
			studentIdDOM.addTextNode(id + "");
			
			QName studentNQName = soapElement.createQName("姓名", "tns");
			SOAPElement studentNameDOM = root.addChildElement(studentNQName);
			studentNameDOM.addTextNode(name);

			QName scorelistQName = soapElement.createQName("成绩信息", "tns");
			SOAPElement scorelistDOM = root.addChildElement(scorelistQName);

			for (Score score : scores) {
				score.addToSOAP(scorelistDOM);
			}

		} catch (SOAPException e) {
			e.printStackTrace();
		}
	}
}
