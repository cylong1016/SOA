
public class ScoreRecord {

	private String name;
	private String id;
	private String course;
	private String score;
	private String type;
	
	public static String NAME_TAG = "姓名";
	public static String ID_TAG = "学号";
	public static String COURSE_TAG = "课程编号";
	public static String NORMAL_SCORE_TAG = "平时成绩";
	public static String TEST_SCORE_TAG = "期末成绩";
	public static String LAST_SCORE_TAG = "总评成绩";
	
	public ScoreRecord() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
