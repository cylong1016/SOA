package data;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;

public class Score {

	private String course;
	private int score;
	
	public Score() {
		super();
	}
	
	public Score(String course, int score) {
		super();
		this.course = course;
		this.score = score;
	}

	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public void addToSOAP(SOAPElement soapElement) {
		try {
			QName rootQName = soapElement.createQName("成绩单项", "tns");
			SOAPElement root = soapElement.addChildElement(rootQName);

			QName courseQName = soapElement.createQName("课程", "tns");
			SOAPElement studentIdDOM = root.addChildElement(courseQName);
			studentIdDOM.addTextNode(course);
			
			QName scoreNQName = soapElement.createQName("成绩", "tns");
			SOAPElement studentNameDOM = root.addChildElement(scoreNQName);
			studentNameDOM.addTextNode(score + "");

		} catch (SOAPException e) {
			e.printStackTrace();
		}
	}
}
