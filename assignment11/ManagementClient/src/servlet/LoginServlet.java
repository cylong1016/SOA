package servlet;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import loginByMailService.LoginProxy;

/**
 * Servlet implementation class LoginServlet
 * @author cylong
 * @version 2016年7月1日  下午9:19:27
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mail = request.getParameter("mail");
		// 测试的老师账号，不需要输入密码。因为我们并没有老师的邮箱密码
		String teacherMail = "beijia@nju.edu.cn";
		String password = request.getParameter("password");
		LoginProxy proxy = new LoginProxy();
		String address = "/jsp/login.jsp";
		try {
			if(mail.equals(teacherMail)) {
				address = "/jsp/teacher.jsp";
			} else {
				int result = proxy.login(mail, password);
				if (result == 1) {
					request.getSession().setAttribute("studentNo", mail.split("@")[0]);
					request.setAttribute("oper", "0");
					address = "/StudentServlet";
				} else if (result == 4) {
					address = "/jsp/teacher.jsp";
				}
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(address);
		dispatcher.forward(request, response);
	}

}
