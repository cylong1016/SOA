package cn.edu.nju.jw.exception;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import cn.edu.nju.jw.wsdl.ScoreManageSOAPImpl;

@WebService
public class Test {

    public static void main(String[] args){
    	Endpoint.publish("http://localhost:1001/ScoreManage", new ScoreManageSOAPImpl());
    	System.out.println("发布成功");
//    	ScoreManage_PortType sp = new ScoreManageSOAPImpl();
//    	课程成绩类型 kc = new 课程成绩类型();
//    	成绩类型 cj = new 成绩类型();
//    	cj.set学号("131250000");
//    	cj.set得分(0);
//    	kc.set成绩(cj);
//    	kc.set成绩性质("平时成绩");
//    	kc.set课程编号("AC1001");
//    	try {
//    		课程成绩类型[] list=sp.getScore("131250067");
//    		for(int i=0;i<list.length;i++){
//    			System.out.println(list[i].get课程编号()+" "+list[i].get成绩性质()+" "+list[i].get成绩().get得分());
//    		}
//    		sp.addScore(kc);
//    		sp.delScore(kc);
//    		sp.modifyScore(kc);
//    		System.out.println("success");
//		} catch (RemoteException e) {
//			e.printStackTrace();
//		}
    }
    
	
    
}
