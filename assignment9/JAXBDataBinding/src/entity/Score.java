package entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author cylong
 * @version 2016年6月8日 上午1:13:27
 */
@XmlRootElement(namespace = "http://jw.nju.edu.cn/schema", name = "单科成绩")
public class Score {

	private String normal;
	private String end;
	private String overall;
	private Course course;

	@XmlElement(name = "平时成绩", namespace = "http://jw.nju.edu.cn/schema")
	public String getNormal() {
		return this.normal;
	}

	public void setNormal(String normal) {
		this.normal = normal;
	}

	@XmlElement(name = "期末成绩", namespace = "http://jw.nju.edu.cn/schema")
	public String getEnd() {
		return this.end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	@XmlElement(name = "总评成绩", namespace = "http://jw.nju.edu.cn/schema")
	public String getOverall() {
		return this.overall;
	}

	public void setOverall(String overall) {
		this.overall = overall;
	}

	@XmlElement(name = "课程", namespace = "http://jw.nju.edu.cn/schema")
	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
