/**
 * ScoreInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.wsdl;

public interface ScoreInterface extends java.rmi.Remote {
    public cn.edu.nju.jw.schema.学生成绩列表的结构 searchScore(java.lang.String studentNo) throws java.rmi.RemoteException, cn.edu.nju.jw.wsdl.SearchScoreFault;
    public java.lang.String addScore(java.lang.String 学号, java.lang.String 课程编号, cn.edu.nju.jw.schema.成绩类型 成绩类型, int 得分) throws java.rmi.RemoteException, cn.edu.nju.jw.wsdl.AddScoreFault;
    public java.lang.String deleteScore(cn.edu.nju.jw.schema.删除学生成绩的结构 delScore) throws java.rmi.RemoteException, cn.edu.nju.jw.wsdl.DeleteScoreFault;
    public java.lang.String modifyScore(cn.edu.nju.jw.schema.添加或修改学生成绩的结构 modSocre) throws java.rmi.RemoteException, cn.edu.nju.jw.wsdl.ModifyScoreFault;
}
