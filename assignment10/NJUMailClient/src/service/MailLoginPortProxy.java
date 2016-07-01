package service;

public class MailLoginPortProxy implements service.MailLoginPort {
  private String _endpoint = null;
  private service.MailLoginPort mailLoginPort = null;
  
  public MailLoginPortProxy() {
    _initMailLoginPortProxy();
  }
  
  public MailLoginPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initMailLoginPortProxy();
  }
  
  private void _initMailLoginPortProxy() {
    try {
      mailLoginPort = (new service.MailLoginServiceLocator()).getMailLoginPort();
      if (mailLoginPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mailLoginPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mailLoginPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mailLoginPort != null)
      ((javax.xml.rpc.Stub)mailLoginPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.MailLoginPort getMailLoginPort() {
    if (mailLoginPort == null)
      _initMailLoginPortProxy();
    return mailLoginPort;
  }
  
  public java.lang.String login(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (mailLoginPort == null)
      _initMailLoginPortProxy();
    return mailLoginPort.login(arg0, arg1);
  }
  
  
}