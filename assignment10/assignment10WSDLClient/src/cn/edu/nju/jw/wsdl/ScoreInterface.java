/**
 * ScoreInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.wsdl;

public interface ScoreInterface extends java.rmi.Remote {
    public cn.edu.nju.jw.schema.单项成绩类型[] searchScore(java.lang.String studentNo) throws java.rmi.RemoteException, cn.edu.nju.jw.wsdl.SearchScoreFault;
    public java.lang.String addScore(cn.edu.nju.jw.schema.添加或修改成绩类型 addScore) throws java.rmi.RemoteException, cn.edu.nju.jw.wsdl.AddScoreFault;
    public java.lang.String deleteScore(cn.edu.nju.jw.schema.删除成绩类型 delScore) throws java.rmi.RemoteException, cn.edu.nju.jw.wsdl.DeleteScoreFault;
    public java.lang.String modifyScore(cn.edu.nju.jw.schema.添加或修改成绩类型 modSocre) throws java.rmi.RemoteException, cn.edu.nju.jw.wsdl.ModifyScoreFault;
}
