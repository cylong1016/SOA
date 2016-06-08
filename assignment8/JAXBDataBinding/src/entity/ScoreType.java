package entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(namespace = "http://jw.nju.edu.cn/schema", name = "成绩")
public class ScoreType implements Comparable<Object>{

	private String id;//学号
	private int score;
	
	@XmlElement(name = "学号", namespace = "http://jw.nju.edu.cn/schema")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@XmlElement(name = "得分", namespace = "http://jw.nju.edu.cn/schema")
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public int compareTo(Object o) {
		
		ScoreType scoreType = (ScoreType)o;
		
		if(score < scoreType.score)
		{
			return 1;
		}else if(score == scoreType.score){
			return 0;
		}
		return -1;
	}
	
	
}
