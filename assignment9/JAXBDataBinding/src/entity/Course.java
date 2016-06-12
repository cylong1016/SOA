package entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author cylong
 * @version 2016年6月8日 上午12:20:17
 */
@XmlRootElement(namespace = "http://jw.nju.edu.cn/schema")
public class Course {

	private String id;
	private String teacherName;

	@XmlElement(name = "课程编号", namespace = "http://jw.nju.edu.cn/schema")
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlElement(name = "课程讲师", namespace = "http://jw.nju.edu.cn/schema")
	public String getTeacherName() {
		return this.teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

}
