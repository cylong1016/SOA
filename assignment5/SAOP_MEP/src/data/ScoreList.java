package data;

import java.util.ArrayList;
import java.util.HashMap;

public class ScoreList {

	private HashMap<Integer, ScoreStudent> scoreMap;
	
	public ScoreList(){
		
		scoreMap = new HashMap<Integer, ScoreStudent>();
		initData();
	}
	
	private void initData(){
		ArrayList<Score> scores = new ArrayList<Score>();
		ScoreStudent student = new ScoreStudent();
		
		scores.add(new Score("J2EE",90));
		scores.add(new Score("WEB",80));
		scores.add(new Score("LINUX",70));
		
		student.setScores(scores);
		student.setId(1);
		student.setName("student1");
		scoreMap.put(1, student);
		student.setId(2);
		student.setName("student2");
		scoreMap.put(2, student);
		student.setId(3);
		student.setName("student3");
		scoreMap.put(3, student);
	}
	
	public ScoreStudent getScoreById(int id){
		return scoreMap.get(id);
	}
}
