package jaxb;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

import entity.Course;
import entity.CourseScore;
import entity.CourseScoreList;
import entity.Department;
import entity.PersonInfo;
import entity.Score;
import entity.ScoreList;
import entity.ScoreType;
import entity.Student;
import entity.StudentList;

/**
 * @author cylong
 * @version 2016年6月8日 上午1:51:26
 */
public class CreateXml {

	public static void main(String[] args) throws Exception {
		assigment3();
		assigment4();
	}

	public static void assigment3() throws Exception {
		JAXBContext context = JAXBContext.newInstance(StudentList.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		StudentList stuList = CreateXml.getStudentList();
		m.setProperty("com.sun.xml.bind.namespacePrefixMapper", new NamespacePrefixMapper() {
			@Override
			public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
				if (namespaceUri.equals("http://jw.nju.edu.cn/schema"))
					return "tns";
				if (namespaceUri.contains("http://www.nju.edu.cn/schema"))
					return "nju";
				return suggestion;
			}
		});

		String stuListXML = "xml/studentList.xml";
		String stuListXSD = "xsd/StudentList.xsd";
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		File file = new File(stuListXML);
		m.marshal(stuList, file);
		System.out.println("生成 " + stuListXML + " 成功！");
		checkXml(stuListXML, stuListXSD);
	}
	
	public static void assigment4() throws Exception {
		JAXBContext context = JAXBContext.newInstance(CourseScoreList.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		StudentList stuList = CreateXml.getStudentList();
		m.setProperty("com.sun.xml.bind.namespacePrefixMapper", new NamespacePrefixMapper() {
			@Override
			public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
				if (namespaceUri.equals("http://jw.nju.edu.cn/schema"))
					return "tns";
				if (namespaceUri.contains("http://www.nju.edu.cn/schema"))
					return "nju";
				return suggestion;
			}
		});
		//所有成绩
		CourseScoreList courseScoreList = getCourseScoreList(stuList,false);
		
		String stuListXML = "xml/ScoreList.xml";
		String stuListXSD = "xsd/ScoreList.xsd";
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		File file = new File(stuListXML);
		m.marshal(courseScoreList, file);
		System.out.println("生成 " + stuListXML + " 成功！");
		checkXml(stuListXML, stuListXSD);
		//不及格成绩
		CourseScoreList courseScoreListFail = getCourseScoreList(stuList,true);
		
		String stuListXMLFail = "xml/ScoreListFail.xml";
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		File fileFail = new File(stuListXMLFail);
		m.marshal(courseScoreListFail, fileFail);
		System.out.println("生成 " + stuListXMLFail + " 成功！");
		checkXml(stuListXMLFail, stuListXSD);
	}
	public static void checkXml(String xmlFile, String xsdFile) throws Exception {
		SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		File schemaLocation = new File(xsdFile);
		Schema schema = factory.newSchema(schemaLocation);
		Validator validator = schema.newValidator();
		Source source = new StreamSource(xmlFile);
		try {
			validator.validate(source);
			System.out.println(xmlFile + " 合法");

		} catch (SAXException ex) {
			System.out.println(xmlFile + " 不合法。 ");
			System.out.println(ex.getMessage());
		}
	}
	
	public static Student getStudent() throws JAXBException {
		Student student = ReadXML.readString(Student.class, "xml/Student.xml");
		return student;
	}

	public static StudentList getStudentList() throws JAXBException {
		ArrayList<Student> stuArray = new ArrayList<Student>();
		StudentList stuList = new StudentList();
		stuList.setStudentList(stuArray);
		Student student = getStudent();
		stuArray.add(student);

		String stuidArr[] = {"131250004", "131250018", "131250216", "131250181", "131250123", "131250145", "131250129", "131250209"};
		String stuNameArr[] = {"徐华韬", "王一琦", "文煊义", "陈云龙", "黄振豪", "利力", "雷泽政", "肖瑞"};
		String cidArr[] = {"00001", "00002", "00003", "00004", "00005"};
		String teacherArr[] = {"老师1", "老师2", "老师3", "老师4", "老师5"};

		for(int i = 0; i < 8; i++) {
			Student stu = new Student();
			PersonInfo pInfo = new PersonInfo();
			pInfo.setName(stuNameArr[i]);
			pInfo.setId(stuidArr[i]);
			Department d = new Department();
			d.setId("1250");
			d.setName("软件学院");
			d.setDuty("学工");
			pInfo.setDepartment(d);
			stu.setInfo(pInfo);
			ArrayList<Score> scoreList = new ArrayList<Score>();
			for(int j = 0; j < 5; j++) {
				Score score = new Score();
				score.setNormal(String.valueOf((int)(Math.random() * 60)));
				score.setEnd(String.valueOf((int)(Math.random() * 100)));
				score.setOverall(String.valueOf((int)(Math.random() * 100)));
				
				Course course = new Course();
				course.setId(cidArr[j]);
				course.setTeacherName(teacherArr[j]);
				score.setCourse(course);
				scoreList.add(score);
			}
			ScoreList scoList = new ScoreList();
			scoList.setScoreList(scoreList);
			stu.setScoreList(scoList);
			stuArray.add(stu);
		}

		return stuList;
	}

	public static CourseScoreList getCourseScoreList(StudentList stuList,boolean isFail) {
		
		CourseScoreList courseScoreList = new CourseScoreList();
		HashMap<String, CourseScore> courseMap = new HashMap<String, CourseScore>();
		for(Student student: stuList.getStudentList()){
			String sid = student.getInfo().getId();
			
			for(Score score:student.getScoreList().getScoreList())
			{
				String cid = score.getCourse().getId();
				checkAddScore(courseMap,sid,cid,"期末成绩",Integer.parseInt(score.getEnd()),isFail);
				checkAddScore(courseMap,sid,cid,"平时成绩",Integer.parseInt(score.getNormal()),isFail);
				checkAddScore(courseMap,sid,cid,"总评成绩",Integer.parseInt(score.getOverall()),isFail);
				
			}
		}
		
		ArrayList<CourseScore> courseScores = new ArrayList<CourseScore>();
		Iterator<?> iterator = courseMap.entrySet().iterator();
		while (iterator.hasNext()) {
			@SuppressWarnings("unchecked")
			Entry<String, CourseScore> entry = (Entry<String, CourseScore>) iterator.next();
			ArrayList<ScoreType> cs = ((CourseScore)entry.getValue()).getCourseScrores();
			java.util.Collections.sort(cs);
			courseScores.add((CourseScore)entry.getValue());
		}
		java.util.Collections.sort(courseScores);
		courseScoreList.setCourseScores(courseScores);
		return courseScoreList;
	}
	
	public static void checkAddScore(HashMap<String, CourseScore> courseMap,String sid
			,String cid,String type,int score,boolean isFail){
		
		if(isFail)
		{
			if(score >= 60)
				return;
		}
		ScoreType scoreType = new ScoreType();
		scoreType.setId(sid);
		scoreType.setScore(score);
		
		String key = cid + '-' + type;
		if(courseMap.containsKey(key))
		{
			CourseScore courseScore = courseMap.get(key);
			courseScore.getCourseScrores().add(scoreType);
		}else{
			CourseScore courseScore = new CourseScore();
			courseScore.setId(cid);
			courseScore.setType(type);
			courseScore.setCourseScrores(new ArrayList<ScoreType>());
			courseScore.getCourseScrores().add(scoreType);
			courseMap.put(key, courseScore);
		}
	}
}
