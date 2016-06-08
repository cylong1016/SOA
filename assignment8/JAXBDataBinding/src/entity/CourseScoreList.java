package entity;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://jw.nju.edu.cn/schema", name = "课程成绩列表")
public class CourseScoreList {

	private ArrayList<CourseScore> courseScores;

	@XmlElement(name = "课程成绩", namespace = "http://jw.nju.edu.cn/schema")
	public ArrayList<CourseScore> getCourseScores() {
		return courseScores;
	}

	
	public void setCourseScores(ArrayList<CourseScore> courseScores) {
		this.courseScores = courseScores;
	}
	
	
}
