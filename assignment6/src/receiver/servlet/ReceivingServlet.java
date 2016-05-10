package receiver.servlet;

import javax.servlet.annotation.WebServlet;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import com.sun.xml.messaging.soap.server.SAAJServlet;

/**
 * SOAP消息的接收端Servlet
 */
@SuppressWarnings("serial")
@WebServlet("/ReceivingServlet")
public class ReceivingServlet extends SAAJServlet {

	/**
	 * 接收客户端的请求SOAP消息，并返回一个SOAP消息
	 */
	@Override
	public SOAPMessage onMessage(SOAPMessage reqMsg) {
		try {
			// 写一个返回消息
			SOAPMessage respMsg = this.msgFactory.createMessage();
			SOAPEnvelope envelope = respMsg.getSOAPPart().getEnvelope();
			SOAPBody body = envelope.getBody();
			String userID = findUserID(reqMsg);
			if(userID.equals("131250181")) {
				body.addChildElement(envelope.createName("ResponseMsg")).addTextNode("修改 " + userID + " 的成绩成功!");
				SOAPBodyElement stuElement = body.addBodyElement(envelope.createName("学生"));
				stuElement.addChildElement(envelope.createName("姓名")).addTextNode("陈云龙");
				stuElement.addChildElement(envelope.createName("学号")).addTextNode("131250181");
				SOAPBodyElement courseElement = body.addBodyElement(envelope.createName("课程"));
				courseElement.addChildElement(envelope.createName("课程编号")).addTextNode("000001");
				courseElement.addChildElement(envelope.createName("课程讲师")).addTextNode("xxx");
				courseElement.addChildElement(envelope.createName("平时成绩")).addTextNode("77");
				courseElement.addChildElement(envelope.createName("期末成绩")).addTextNode("58");
				courseElement.addChildElement(envelope.createName("总评成绩")).addTextNode("92");
			} else {
				SOAPElement faultElement = body.addChildElement(envelope.createName("Fault", "env", "http://www.w3.org/2003/05/soap-envelope"));
				SOAPElement soapCode = faultElement.addChildElement(envelope.createName("Code", "env", "http://www.w3.org/2003/05/soap-envelope"));
				SOAPElement soapCodeValue=soapCode.addChildElement(envelope.createName("Value", "env", "http://www.w3.org/2003/05/soap-envelope"));
				soapCodeValue.addTextNode("学号");
				SOAPElement soapReason=faultElement.addChildElement(envelope.createName("Reason", "env", "http://www.w3.org/2003/05/soap-envelope"));
				SOAPElement soapText=soapReason.addChildElement(envelope.createName("Text", "env", "http://www.w3.org/2003/05/soap-envelope"));
				soapText.addTextNode("学号不存在");
			}
			return respMsg;
		} catch (SOAPException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 找到SOAP消息中的的参数：username
	 * <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
	 * 	<SOAP-ENV:Header/>
	 * 	<SOAP-ENV:Body>
	 * 		<zhaoql:sayHello xmlns:zhaoql="http://zhaoql.java.cn">
	 * 			<zhaoql:username>清玲</zhaoql:username>
	 * 		</zhaoql:sayHello>
	 * 	</SOAP-ENV:Body>
	 * </SOAP-ENV:Envelope>
	 */
	private String findUserID(SOAPMessage reqMsg) throws SOAPException {
		// soap信封
		SOAPEnvelope env = reqMsg.getSOAPPart().getEnvelope();
		// soap消息体
		SOAPBody body = reqMsg.getSOAPBody();
		SOAPElement stuElem = (SOAPElement)body.getChildElements(env.createName("学生")).next();
		SOAPElement paramElem = (SOAPElement)stuElem.getChildElements(env.createName("学号")).next();
		return paramElem.getTextContent();
	}
}
