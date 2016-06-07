package entity;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author cylong
 * @version 2016年6月8日 上午1:37:57
 */
@XmlRootElement(namespace = "http://jw.nju.edu.cn/schema", name = "学生列表")
public class StudentList {

	private ArrayList<Student> studentList;

	@XmlElement(name = "学生", namespace = "http://jw.nju.edu.cn/schema")
	public ArrayList<Student> getStudentList() {
		return this.studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

}