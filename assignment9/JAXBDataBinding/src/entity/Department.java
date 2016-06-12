package entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author cylong
 * @version 2016年6月8日 上午12:57:25
 */
@XmlRootElement(namespace = "http://www.nju.edu.cn/schema")
public class Department {

	private String id;
	private String name;
	private String duty;

	@XmlElement(name = "部门编号", namespace = "http://jw.nju.edu.cn/schema")
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlElement(name = "单位部门名", namespace = "http://jw.nju.edu.cn/schema")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "职务", namespace = "http://jw.nju.edu.cn/schema")
	public String getDuty() {
		return this.duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

}