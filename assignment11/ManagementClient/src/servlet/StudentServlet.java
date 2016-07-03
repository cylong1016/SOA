package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.nju.jw.wsdl.DType;
import cn.edu.nju.jw.wsdl.ScoreManage_PortType;
import cn.edu.nju.jw.wsdl.ScoreManage_PortTypeProxy;
import cn.edu.nju.jw.wsdl.StudentManagementPortType_PortType;
import cn.edu.nju.jw.wsdl.StudentManagementPortType_PortTypeProxy;
import cn.edu.nju.jw.wsdl.UpdateInformation;
import cn.edu.nju.jw.wsdl.个人信息类型;
import cn.edu.nju.jw.wsdl.性别类型;
import cn.edu.nju.jw.wsdl.课程成绩类型;
import cn.edu.nju.jw.wsdl.院系部门类型;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String address = "/jsp/student.jsp";
		String studentNO = (String)request.getSession().getAttribute("studentNo");
		if(request.getAttribute("oper") != null){
			ScoreManage_PortType scoreServiceProxy = new ScoreManage_PortTypeProxy();
			
			课程成绩类型[] result =  scoreServiceProxy.getScore(studentNO);
	
			request.setAttribute("studentNo", studentNO);
			if(result == null)
			{
				request.setAttribute("error", "没有对应学号的成绩");
			}else{
				
				ArrayList<课程成绩类型> r1 = new ArrayList<课程成绩类型>();
				for(课程成绩类型 s:result)
				{
					r1.add(s);
				}
				request.setAttribute("socres", r1);
			}
			address = "/jsp/student.jsp";
		}else{
			StudentManagementPortType_PortType studentServiceProxy = new StudentManagementPortType_PortTypeProxy();
			
			String name = request.getParameter("name");
	    	String phone = request.getParameter("phone");
	    	String departmentName = request.getParameter("dname");
	    	String departmentId = request.getParameter("did");
	    	
	    	个人信息类型 personInfo = new 个人信息类型();
	    	性别类型 genderType = new 性别类型();
	    	院系部门类型 department = new 院系部门类型();
	    	DType dType = new DType(departmentId, departmentName, "1234");
	    	department.set院系(dType);
	    	personInfo.set姓名(name);
	    	personInfo.set手机号(phone);
	    	personInfo.set性别(genderType);
			UpdateInformation updateInfo = new UpdateInformation();
			updateInfo.set个人基本信息(personInfo);
			updateInfo.set学号(studentNO);
			
			if(studentServiceProxy.studentManagement(updateInfo) != null)
			{
				request.setAttribute("result", "修改信息成功！");
			}else{
				request.setAttribute("result", "修改信息失败");
			}
			address = "/jsp/modified.jsp";
		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(address);
		dispatcher.forward(request, response);
	}

}
