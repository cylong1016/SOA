package service;

import javax.jws.WebService;

/**
 * 登陆接口
 * @author cylong
 * @version 2016年7月1日  下午3:32:28
 */
@WebService(name = "MailLoginPort")
public interface MailLoginPort {
	
	/** 登陆成功：老师 */
	public static final String TEACHER = "Teacher";
	/** 登陆成功：学生 */
	public static final String STUDENT = "Student";
	/** 登陆成功：研究生 */
	public static final String GRA_STUDENT = "Graduate Student";
	/** 登陆成功：身份未知 */
	public static final String UNKNOWN = "Unknown";
	/** 登陆失败 */
	public static final String FAIL = "Fail";

	/**
	 * @param mail
	 * @param password
	 * @return 	{@link #TEACHER Teacher},
	 * 			{@link #STUDENT Student},
	 * 			{@link #GRA_STUDENT Graduate Student},
	 * 			{@link #UNKNOWN Unknown},
	 * 			{@link #FAIL Fail}
	 * @author cylong
	 * @version 2016年7月1日  下午3:32:58
	 */
	public String login(String mail, String password);
}
