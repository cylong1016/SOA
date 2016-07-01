package service;

import java.util.Properties;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.xml.ws.Endpoint;

/**
 * 登陆 NJU 邮箱
 * @author cylong
 * @version 2016年6月15日  下午7:13:34
 */
@WebService
public class MailLogin {

	/** 登陆成功：老师 */
	private static final String TEACHER = "Teacher";
	/** 登陆成功：学生 */
	private static final String STUDENT = "Student";
	/** 登陆成功：研究生 */
	private static final String GRA_STUDENT = "Graduate Student";
	/** 登陆成功：身份未知 */
	private static final String UNKNOWN = "Unknown";
	/** 登陆失败 */
	private static final String FAIL = "Fail";
	
	public String login(String mail, String password) {
		boolean success = authenticate(mail, password);
		if(success) {
			return checkIdentity(mail);
		} else {
			return FAIL;
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
	@WebMethod(exclude=true) // 或者把方法设置成 private，在发布的时候隐藏此方法
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
	
	public static void main(String[] args){
		String address = "http://172.17.135.165:8080/mailLogin";
		Endpoint.publish(address, new MailLogin());
		System.out.println("Publish Success!");
		System.out.println("Address:" + address);
	}

}
