package cn.edu.nju.jw.wsdl;

public class ScoreManage_PortTypeProxy implements cn.edu.nju.jw.wsdl.ScoreManage_PortType {
  private String _endpoint = null;
  private cn.edu.nju.jw.wsdl.ScoreManage_PortType scoreManage_PortType = null;
  
  public ScoreManage_PortTypeProxy() {
    _initScoreManage_PortTypeProxy();
  }
  
  public ScoreManage_PortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initScoreManage_PortTypeProxy();
  }
  
  private void _initScoreManage_PortTypeProxy() {
    try {
      scoreManage_PortType = (new cn.edu.nju.jw.wsdl.ScoreManageSOAPImplServiceLocator()).getScoreManageSOAPImplPort();
      if (scoreManage_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)scoreManage_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)scoreManage_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (scoreManage_PortType != null)
      ((javax.xml.rpc.Stub)scoreManage_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.edu.nju.jw.wsdl.ScoreManage_PortType getScoreManage_PortType() {
    if (scoreManage_PortType == null)
      _initScoreManage_PortTypeProxy();
    return scoreManage_PortType;
  }
  
  public cn.edu.nju.jw.wsdl.课程成绩类型[] getScore(java.lang.String arg0) throws java.rmi.RemoteException{
    if (scoreManage_PortType == null)
      _initScoreManage_PortTypeProxy();
    return scoreManage_PortType.getScore(arg0);
  }
  
  public boolean addScore(cn.edu.nju.jw.wsdl.课程成绩类型 arg0) throws java.rmi.RemoteException{
    if (scoreManage_PortType == null)
      _initScoreManage_PortTypeProxy();
    return scoreManage_PortType.addScore(arg0);
  }
  
  public boolean modifyScore(cn.edu.nju.jw.wsdl.课程成绩类型 arg0) throws java.rmi.RemoteException{
    if (scoreManage_PortType == null)
      _initScoreManage_PortTypeProxy();
    return scoreManage_PortType.modifyScore(arg0);
  }
  
  public boolean delScore(cn.edu.nju.jw.wsdl.课程成绩类型 arg0) throws java.rmi.RemoteException{
    if (scoreManage_PortType == null)
      _initScoreManage_PortTypeProxy();
    return scoreManage_PortType.delScore(arg0);
  }
  
  
}