package servlet;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import data.ScoreList;
import data.ScoreStudent;

/**
 * Servlet implementation class ReceiverServlet
 */
@WebServlet("/ReceiverServlet")
public class ReceiverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private ScoreList scoreList;
	private MessageFactory messageFactory;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReceiverServlet() {
        super();
        scoreList = new ScoreList();
        try {
			messageFactory = MessageFactory.newInstance();
		} catch (SOAPException e) {
			e.printStackTrace();
		}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		request.setCharacterEncoding("utf-8");
		response.setContentType("application/soap+xml;charset=utf-8");
		response.setHeader("Content-Disposition", "attachment; filename=result.xml");
		response.setCharacterEncoding("utf-8");
	    try {
			SOAPMessage message = messageFactory.createMessage();
			SOAPPart part = message.getSOAPPart();
			SOAPEnvelope envelope = part.getEnvelope();
			SOAPBody body = envelope.getBody();
			
			body.addNamespaceDeclaration("nju",
					"http://www.nju.edu.cn/schema");
			body.addNamespaceDeclaration("tns",
					"http://jw.nju.edu.cn/schema");
			QName ename = new QName("http://www.nju.edu.cn",
					"getStudent", "m");
			
			if (id == null ) {
				SOAPFault soapFault = body.addFault();
				soapFault.setFaultCode(new QName("env", "client"));

				soapFault.setFaultString("请求缺少参数", Locale.CHINESE);
			}else{
				int studentId = -1;
				try{
					studentId = Integer.parseInt(id);
					ScoreStudent student = scoreList.getScoreById(studentId);
					if(student == null)
					{
						SOAPFault soapFault = body.addFault();
						soapFault.setFaultCode(new QName("env", "client"));

						soapFault.setFaultString("未含有对应学号的任何成绩", Locale.CHINESE);
					}else{
						SOAPBodyElement element = body.addBodyElement(ename);

						student.addToSOAP(element);
					}
				}catch(Exception e)
				{
					SOAPFault soapFault = body.addFault();
					soapFault.setFaultCode(new QName("env", "client"));

					soapFault.setFaultString("学号格式不正确", Locale.CHINESE);
				}
			}
			
		
			message.writeTo(response.getOutputStream());
		} catch (SOAPException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
