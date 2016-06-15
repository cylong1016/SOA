package cn.edu.nju.jw.wsdl;

public class ScoreInterfaceProxy implements cn.edu.nju.jw.wsdl.ScoreInterface {
  private String _endpoint = null;
  private cn.edu.nju.jw.wsdl.ScoreInterface scoreInterface = null;
  
  public ScoreInterfaceProxy() {
    _initScoreInterfaceProxy();
  }
  
  public ScoreInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initScoreInterfaceProxy();
  }
  
  private void _initScoreInterfaceProxy() {
    try {
      scoreInterface = (new cn.edu.nju.jw.wsdl.ScoreServiceLocator()).getScorePort();
      if (scoreInterface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)scoreInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)scoreInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (scoreInterface != null)
      ((javax.xml.rpc.Stub)scoreInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.edu.nju.jw.wsdl.ScoreInterface getScoreInterface() {
    if (scoreInterface == null)
      _initScoreInterfaceProxy();
    return scoreInterface;
  }
  
  public cn.edu.nju.jw.schema.单个学生成绩列表类型 searchScore(java.lang.String studentNo) throws java.rmi.RemoteException, cn.edu.nju.jw.wsdl.SearchScoreFault{
    if (scoreInterface == null)
      _initScoreInterfaceProxy();
    return scoreInterface.searchScore(studentNo);
  }
  
  public java.lang.String addScore(cn.edu.nju.jw.schema.添加或修改成绩类型 addScore) throws java.rmi.RemoteException, cn.edu.nju.jw.wsdl.AddScoreFault{
    if (scoreInterface == null)
      _initScoreInterfaceProxy();
    return scoreInterface.addScore(addScore);
  }
  
  public java.lang.String deleteScore(cn.edu.nju.jw.schema.删除成绩类型 delScore) throws java.rmi.RemoteException, cn.edu.nju.jw.wsdl.DeleteScoreFault{
    if (scoreInterface == null)
      _initScoreInterfaceProxy();
    return scoreInterface.deleteScore(delScore);
  }
  
  public java.lang.String modifyScore(cn.edu.nju.jw.schema.添加或修改成绩类型 modSocre) throws java.rmi.RemoteException, cn.edu.nju.jw.wsdl.ModifyScoreFault{
    if (scoreInterface == null)
      _initScoreInterfaceProxy();
    return scoreInterface.modifyScore(modSocre);
  }
  
  
}