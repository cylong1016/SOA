package sender.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

/**
 * SOAP消息的发送端Servlet
 */
@SuppressWarnings("serial")
@WebServlet("/SendingServlet")
public class SendingServlet extends HttpServlet {

	ServletContext servletContext;
	// 发送消息的链接
	private SOAPConnection conn;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		servletContext = config.getServletContext();
		try {
			// 创建一个SOAP链接工厂
			SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();
			// 创建一个SOAP链接
			conn = factory.createConnection();
		} catch (SOAPException e) {
			System.out.println("创建SOAP链接失败!");
			e.printStackTrace();
		}
	}

	/**
	 * SOAP消息格式
	 * <?xml version="1.0"?>
	 * <soap:Envelope
	 * xmlns:soap="http://www.w3.org/2001/12/soap-envelope"
	 * soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
	 * 	<soap:Header>
	 * 	...
	 * 	</soap:Header>
	 * 	<soap:Body>
	 * 		...
	 * 		<soap:Fault>
	 * 		...
	 * 		</soap:Fault>
	 * 	</soap:Body>
	 * </soap:Envelope>
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html; charset=UTF-8");
		try {
			// 1.创建消息工厂
			MessageFactory factory = MessageFactory.newInstance();
			// 2.创建soap消息reqMsg
			SOAPMessage reqMsg = factory.createMessage();
			// 3.创建soap消息的部分reqMsgpart
			SOAPPart part = reqMsg.getSOAPPart();
			// 3.1.创建sope信封envelope，开始写信
			SOAPEnvelope envelope = part.getEnvelope();
			// envelope.setPrefix("soap");	// 默认是SOAP-ENV
			// 3.2.写header
			// SOAPHeader header = envelope.getHeader();
			// 3.3.写body
			SOAPBody body = envelope.getBody();
			// 3.4.向body中添加元素，即要传递的数据
			SOAPBodyElement stuElement = body.addBodyElement(envelope.createName("学生"));
			stuElement.addChildElement(envelope.createName("姓名")).addTextNode("陈云龙");
			stuElement.addChildElement(envelope.createName("学号")).addTextNode("131250181");
			SOAPBodyElement courseElement = body.addBodyElement(envelope.createName("课程"));
			courseElement.addChildElement(envelope.createName("课程编号")).addTextNode("000001");
			courseElement.addChildElement(envelope.createName("课程讲师")).addTextNode("xxx");
			courseElement.addChildElement(envelope.createName("平时成绩")).addTextNode("77");
			courseElement.addChildElement(envelope.createName("期末成绩")).addTextNode("58");
			courseElement.addChildElement(envelope.createName("总评成绩")).addTextNode("92");
			// 4.创建SOAP消息的目标对象（服务端点endPoint），即消息发给谁
			String reqBaseUrl = getReqBaseUrl(request);
			URL endPoint = new URL(reqBaseUrl + "/ReceivingServlet");
			// 5.发送SOAP消息，并接收返回信息
			SOAPMessage respMsg = conn.call(reqMsg, endPoint);

			out.print("success!");
			System.out.println("\n=====================请求的消息 : ");
			reqMsg.writeTo(System.out);
			System.out.println("\n=====================接收的消息 : ");
			respMsg.writeTo(System.out);
		} catch (SOAPException e) {
			e.printStackTrace();
			out.print("error!\n" + e.getMessage());
		}
		out.flush();
		out.close();
	}

	/**
	 * 返回请示的URL前面部分，如
	 * 请求URL： http://localhost:8080/[ProjectName]/[Module]/[MyServlet]
	 * 返回： http://localhost:8080/[ProjectName]
	 */
	private String getReqBaseUrl(HttpServletRequest req) {
		StringBuffer urlSB = new StringBuffer();
		urlSB.append(req.getScheme()).append("://").append(req.getServerName()).append(":").append(req.getServerPort()).append(req.getContextPath());
		return urlSB.toString();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	public SendingServlet() {
		super();
	}
}