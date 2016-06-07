package entity;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author cylong
 * @version 2016年6月8日 上午2:56:02
 */
@XmlRootElement(namespace = "http://jw.nju.edu.cn/schema")
public class ScoreList {

	private ArrayList<Score> scoreList;

	@XmlElement(name = "单科成绩", namespace = "http://jw.nju.edu.cn/schema")
	public ArrayList<Score> getScoreList() {
		return this.scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}

}
