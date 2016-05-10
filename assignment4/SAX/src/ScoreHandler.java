import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class ScoreHandler extends DefaultHandler {

	private ArrayList<ScoreRecord> scoreRecords;
	private ScoreRecord currentRecord;
	private String tag;
	
	public ScoreHandler(){
	}
	
	@Override
	public void startDocument() throws SAXException {
		scoreRecords = new ArrayList<ScoreRecord>();
		currentRecord = new ScoreRecord();
		tag = new String();
		super.startDocument();
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		
		switch (qName) {
		case "姓名":case "学号":case "课程编号":case "平时成绩":case "期末成绩":case "总评成绩":
			tag = qName;
			break;
		default:
			break;
		}
		super.startElement(uri, localName, qName, attributes);
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		String value = new String(ch,start,length);
		if(!value.equals("\n")&&!value.equals("\n\t"))
		{
			switch (tag) {
			case "姓名":
				currentRecord.setName(value);
				break;
			case "学号":
				currentRecord.setId(value);
				break;
			case "课程编号":
				currentRecord.setCourse(value);
				break;
			case "平时成绩":
				addScore(value,"平时成绩");
				break;
			case "期末成绩":
				addScore(value,"期末成绩");
				break;
			case "总评成绩":
				addScore(value,"总评成绩");
				break;
			default:
				break;
			}
		}
		
		super.characters(ch, start, length);
	}
	
	private void addScore(String value,String type)
	{
		if(!value.equals("\n")&&!value.equals("\n\t"))
		{
			Double score = Double.parseDouble(value);
			if(score < 60)
			{
				ScoreRecord s = new ScoreRecord();
				s.setName(currentRecord.getName());
				s.setId(currentRecord.getId());
				s.setCourse(currentRecord.getCourse());
				s.setScore(value);
				s.setType(type);
				scoreRecords.add(s);
			}
		}
	}

	public ArrayList<ScoreRecord> getScoreRecords() {
		return scoreRecords;
	}

	public void setScoreRecords(ArrayList<ScoreRecord> scoreRecords) {
		this.scoreRecords = scoreRecords;
	}
	
	
}
