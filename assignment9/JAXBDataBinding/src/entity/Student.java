package entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author cylong
 * @version 2016年6月8日 上午1:19:35
 */
@XmlRootElement(namespace = "http://jw.nju.edu.cn/schema", name = "学生")
public class Student {

	private PersonInfo info;
	private ScoreList scoreList;

	@XmlElement(name = "个人基本信息", namespace = "http://jw.nju.edu.cn/schema")
	public PersonInfo getInfo() {
		return this.info;
	}

	public void setInfo(PersonInfo info) {
		this.info = info;
	}

	@XmlElement(name = "个人成绩", namespace = "http://jw.nju.edu.cn/schema")
	public ScoreList getScoreList() {
		return this.scoreList;
	}

	public void setScoreList(ScoreList scoreList) {
		this.scoreList = scoreList;
	}

}
