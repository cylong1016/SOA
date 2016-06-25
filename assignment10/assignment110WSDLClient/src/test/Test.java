package test;

import cn.edu.nju.jw.schema.成绩性质类型;
import cn.edu.nju.jw.schema.添加或修改成绩类型;

public class Test {

	public static void main(String[] args){
		
	}
	public void testSearch(){
		System.out.println("-----测试添加Score-----");
		
		添加或修改成绩类型 score  = new 添加或修改成绩类型();
		score.set学号("131250004");
		score.set得分(40);
		score.set课程编号("00001");
		score.set成绩性质(成绩性质类型.平时成绩);
	}
	public static void testAdd() {
		System.out.println("-----测试添加Score-----");
		
		添加或修改成绩类型 score  = new 添加或修改成绩类型();
		score.set学号("131250004");
		score.set得分(40);
		score.set课程编号("00001");
		score.set成绩性质(成绩性质类型.平时成绩);
		
//		AddStuInterfaceProxy proxy = new AddStuInterfaceProxy("http://localhost:8080/assignment6_wsdl/services/addStuPort");
//		try {
//			System.out.println(proxy.addStu(student));
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("添加学生失败： " + e.getMessage());
//		}
	}
}
