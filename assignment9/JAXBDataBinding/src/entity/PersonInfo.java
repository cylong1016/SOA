package entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author cylong
 * @version 2016年6月8日 上午12:36:29
 */
@XmlRootElement(namespace = "http://www.nju.edu.cn/schema")
public class PersonInfo {

	private String id;
	private String name;
	private Department department;

	@XmlElement(name = "学号", namespace = "http://jw.nju.edu.cn/schema")
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlElement(name = "姓名", namespace = "http://jw.nju.edu.cn/schema")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "单位信息", namespace = "http://jw.nju.edu.cn/schema")
	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
