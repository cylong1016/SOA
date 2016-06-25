package test;

import cn.edu.nju.jw.schema.删除成绩类型;
import cn.edu.nju.jw.schema.单项成绩类型;
import cn.edu.nju.jw.schema.成绩性质类型;
import cn.edu.nju.jw.schema.添加或修改成绩类型;
import cn.edu.nju.jw.wsdl.ScoreInterfaceProxy;

public class TestScoreManage {

	ScoreInterfaceProxy proxy = new ScoreInterfaceProxy("http://localhost:8080/assignment10WSDL/services/ScorePort");

	public void testSearch(){
		System.out.println("-----测试搜索-----");
		try {
			单项成绩类型[] scorelist = proxy.searchScore("131250004");
			if (scorelist != null) {
				if(scorelist.length==0){
					System.out.println("There is no score for 131250004");
				} else{
					for(单项成绩类型 temp : scorelist){
						System.out.println("课程编号"+temp.get课程编号());
						System.out.println("成绩类型"+temp.get成绩性质().getValue());
						System.out.println("得分"+temp.get得分());
					}
					System.out.println();
				}
			} else {
				System.out.println("该学生不存在");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("获取学生信息失败： " + e.getMessage());
		}
		
		System.out.println();
	}
	
	public void testAdd(){
		System.out.println("-----测试添加-----");
		try {
			添加或修改成绩类型 add = new 添加或修改成绩类型("131250004", 53, "00005", new 成绩性质类型("平时成绩"));
			System.out.println(proxy.addScore(add));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("获取学生信息失败： " + e.getMessage());
		}
		
		System.out.println();
	}
	
	public void testDelete(){
		System.out.println("-----测试删除-----");
		try {
			删除成绩类型 del = new 删除成绩类型("131250004", "00005", new 成绩性质类型("平时成绩"));
			System.out.println(proxy.deleteScore(del));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("获取学生信息失败： " + e.getMessage());
		}
		
		System.out.println();
	}
	
	public void testModify(){
		System.out.println("-----测试修改-----");
		try {
			添加或修改成绩类型 add = new 添加或修改成绩类型("131250004", 24, "00005", new 成绩性质类型("平时成绩"));
			System.out.println(proxy.modifyScore(add));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("获取学生信息失败： " + e.getMessage());
		}
		
		System.out.println();
	}
}
