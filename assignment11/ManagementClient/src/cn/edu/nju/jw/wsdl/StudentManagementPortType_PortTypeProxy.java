package cn.edu.nju.jw.wsdl;

public class StudentManagementPortType_PortTypeProxy implements cn.edu.nju.jw.wsdl.StudentManagementPortType_PortType {
  private String _endpoint = null;
  private cn.edu.nju.jw.wsdl.StudentManagementPortType_PortType studentManagementPortType_PortType = null;
  
  public StudentManagementPortType_PortTypeProxy() {
    _initStudentManagementPortType_PortTypeProxy();
  }
  
  public StudentManagementPortType_PortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initStudentManagementPortType_PortTypeProxy();
  }
  
  private void _initStudentManagementPortType_PortTypeProxy() {
    try {
      studentManagementPortType_PortType = (new cn.edu.nju.jw.wsdl.StudentManagementSOAPImplServiceLocator()).getStudentManagementSOAPImplPort();
      if (studentManagementPortType_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)studentManagementPortType_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)studentManagementPortType_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (studentManagementPortType_PortType != null)
      ((javax.xml.rpc.Stub)studentManagementPortType_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.edu.nju.jw.wsdl.StudentManagementPortType_PortType getStudentManagementPortType_PortType() {
    if (studentManagementPortType_PortType == null)
      _initStudentManagementPortType_PortTypeProxy();
    return studentManagementPortType_PortType;
  }
  
  public cn.edu.nju.jw.wsdl.个人信息类型 studentManagement(cn.edu.nju.jw.wsdl.UpdateInformation arg0) throws java.rmi.RemoteException{
    if (studentManagementPortType_PortType == null)
      _initStudentManagementPortType_PortTypeProxy();
    return studentManagementPortType_PortType.studentManagement(arg0);
  }
  
  
}