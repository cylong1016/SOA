package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.nju.jw.wsdl.ScoreManage_PortType;
import cn.edu.nju.jw.wsdl.ScoreManage_PortTypeProxy;
import cn.edu.nju.jw.wsdl.成绩类型;
import cn.edu.nju.jw.wsdl.课程成绩类型;


/**
 * Servlet implementation class ScoreServlet
 */
@WebServlet("/ScoreServlet")
public class ScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String address = "/jsp/teacher.jsp";
		int type = Integer.parseInt(request.getParameter("oper"));
		ScoreManage_PortType scoreServiceProxy = new ScoreManage_PortTypeProxy();
		
		switch (type) {
		case 0:
			String idString = request.getParameter("studentNo");
			课程成绩类型[] result =  scoreServiceProxy.getScore(idString);
	
			request.setAttribute("studentNo", idString);
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
			address = "/jsp/teacher_query.jsp";
			
			break;
		case 1:
			String studentNo = request.getParameter("studentNo");
			String courseNo = request.getParameter("courseNo");
			String property = request.getParameter("property");
			int point = Integer.parseInt(request.getParameter("point"));
			
			成绩类型 pp = new 成绩类型();
			pp.set学号(studentNo);
			pp.set得分(point);
			课程成绩类型 score = new 课程成绩类型();
			score.set成绩(pp);
			score.set课程编号(courseNo);
			score.set成绩性质(property);
			if(scoreServiceProxy.addScore(score))
			{
				request.setAttribute("result", "提交成绩成功！");
			}else{
				request.setAttribute("result", "提交成绩失败");
			}
			address = "/jsp/teacher_submitted.jsp";
			break;
		case 2:
			String studentNo2 = request.getParameter("studentNo");
			String courseNo2 = request.getParameter("courseNo");
			String property2 = request.getParameter("property");
			int point2 = Integer.parseInt(request.getParameter("point"));
			
			成绩类型 pp2 = new 成绩类型();
			pp2.set学号(studentNo2);
			pp2.set得分(point2);
			课程成绩类型 score2 = new 课程成绩类型();
			score2.set成绩(pp2);
			score2.set课程编号(courseNo2);
			score2.set成绩性质(property2);
			if(scoreServiceProxy.modifyScore(score2))
			{
				request.setAttribute("result", "修改成绩成功！");
			}else{
				request.setAttribute("result", "修改成绩失败");
			}
			address = "/jsp/teacher_modified.jsp";
			break;
		case 3:
			String studentNo3 = request.getParameter("studentNo");
			String courseNo3 = request.getParameter("courseNo");
			String property3 = request.getParameter("property");
			
			成绩类型 pp3 = new 成绩类型();
			pp3.set学号(studentNo3);
			课程成绩类型 score3 = new 课程成绩类型();
			score3.set成绩(pp3);
			score3.set课程编号(courseNo3);
			score3.set成绩性质(property3);
			if(scoreServiceProxy.delScore(score3))
			{
				request.setAttribute("result", "删除成绩成功！");
			}else{
				request.setAttribute("result", "删除成绩失败");
			}
			address = "/jsp/teacher_deleted.jsp";
			break;
		default:
			break;
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(address);
		dispatcher.forward(request, response);
	}

}
