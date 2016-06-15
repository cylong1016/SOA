package service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登陆 NJU 邮箱
 * @author cylong
 * @version 2016年6月15日  下午7:13:34
 */
@WebServlet("/MailLoginService")
public class MailLoginService extends HttpServlet {

	/** serialVersionUID */
	private static final long serialVersionUID = -8499207644494251824L;
	private static final String TEACHER = "Teacher";
	private static final String STUDENT = "Student";
	private static final String GRA_STUDENT = "Graduate Student";
	private static final String UNKNOWN = "Unknown";
	
	
	/**
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String mail = request.getParameter("mail");
		String password = request.getParameter("password");
		out.println(login(mail, password));
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	public String login(String mail, String password) {
		boolean success = authenticate(mail, password);
		if(success) {
			String message = "登陆成功！您的身份：";
			String identity = checkIdentity(mail);
			switch(identity) {
			case TEACHER:
				message += "老师";
				break;
			case STUDENT:
				message += "学生";
				break;
			case GRA_STUDENT:
				message += "研究生";
				break;
			case UNKNOWN:
				message += "未知";
				break;

			default:
				break;
			}
			return message;
		} else {
			return "登陆失败";
		}
	}	

	/**
	 * 验证登陆
	 * @param mail 邮箱
	 * @param password 密码
	 * @return boolean
	 * @author cylong
	 * @version 2016年6月15日  下午7:19:31
	 */
	public boolean authenticate(String mail, String password) {
		boolean isConnection = true;
		
		Properties props = new Properties();
		props.setProperty("mail.debug", "true");
		props.setProperty("mail.store.protocol", "imap");
		props.setProperty("mail.imap.host", "imap.exmail.qq.com");

		// 利用 Properties 对象获得 Session 对象
		Session session = Session.getInstance(props);
		session.setDebug(true);

		Store store = null;
		try {
			// 利用 Session 对象获得 Store 对象，并连接POP3/IMAP服务器
			store = session.getStore();
			store.connect(mail, password);
			isConnection = store.isConnected();
		} catch (MessagingException e) {
			isConnection = false;
		} finally {
			try {
				store.close();
			} catch (MessagingException e) {
				e.printStackTrace();
			}
		}
		return isConnection;  
	}

	/**
	 * 验证登陆身份
	 * @param mail
	 * @return TEACHER、STUDENT、GRA_STUDENT、UNKNOWN
	 * @author cylong
	 * @version 2016年6月15日  下午7:18:40
	 */
	private String checkIdentity(String mail) {
		String[] strArr = mail.split("@");
		if (strArr.length < 2) {
			return UNKNOWN;
		} else {
			String prefix = strArr[0];
			String postfix = strArr[1];
			if (postfix.equals("smail.nju.edu.cn")) {
				if (prefix.startsWith("MF") || prefix.startsWith("MG")) {
					return GRA_STUDENT;
				} else if (isNum(prefix)) {
					return STUDENT;
				}
			} else if (postfix.equals("nju.edu.cn")) {
				return TEACHER;
			}
		}
		return UNKNOWN;
	}

	/**
	 * 验证字符串是否全部是数字
	 * @param str
	 * @return boolean
	 * @author cylong
	 * @version 2016年6月15日 下午4:34:37
	 */
	private boolean isNum(String str) {
		for(int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
