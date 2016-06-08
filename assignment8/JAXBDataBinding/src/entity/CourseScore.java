package entity;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://jw.nju.edu.cn/schema", name = "课程成绩")
public class CourseScore implements Comparable<Object>{

	private String id;
	private String type;
	private ArrayList<ScoreType> courseScrores;
	
	@XmlAttribute(name = "课程编号")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@XmlAttribute(name = "成绩性质")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@XmlElement(name = "成绩", namespace = "http://jw.nju.edu.cn/schema")
	public ArrayList<ScoreType> getCourseScrores() {
		return courseScrores;
	}
	public void setCourseScrores(ArrayList<ScoreType> courseScrores) {
		this.courseScrores = courseScrores;
	}
	@Override
	public int compareTo(Object o) {
		
		CourseScore cs = (CourseScore)o;
		if(id.compareTo(cs.id) == 0)
		{
			return type.compareTo(cs.type);
		}
		return id.compareTo(cs.id);
	}
	 
	 
}
