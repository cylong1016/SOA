package cn.edu.nju.jw.wsdl;

import javax.xml.ws.Endpoint;

public class Test {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1002/StudentManage", new StudentManagementSOAPImpl());
    	System.out.println("发布成功");
//		StudentManagementPortType_PortType sp = new StudentManagementSOAPImpl();
//		
//		String name = "高威";
//    	String phone = "15850535810";
//    	String departmentName = "哲学";
//    	String departmentId = "1251";
//    	
//    	个人信息类型 personInfo = new 个人信息类型();
//    	性别类型 genderType = 性别类型.男;
//    	院系部门类型 department = new 院系部门类型();
//    	DType dType = new DType(departmentId, departmentName, "1234");
//    	department.set院系(dType);
//    	personInfo.set姓名(name);
//    	personInfo.set手机号(phone);
//    	personInfo.set性别(genderType);
//		UpdateInformation updateInfo = new UpdateInformation("131250067", personInfo);
//		
//		try {
//			sp.studentManagement(updateInfo);
//		} catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
}
