/**
 * ScoreManage_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.wsdl;

public interface ScoreManage_PortType extends java.rmi.Remote {
    public cn.edu.nju.jw.wsdl.课程成绩类型[] getScore(java.lang.String arg0) throws java.rmi.RemoteException;
    public boolean addScore(cn.edu.nju.jw.wsdl.课程成绩类型 arg0) throws java.rmi.RemoteException;
    public boolean modifyScore(cn.edu.nju.jw.wsdl.课程成绩类型 arg0) throws java.rmi.RemoteException;
    public boolean delScore(cn.edu.nju.jw.wsdl.课程成绩类型 arg0) throws java.rmi.RemoteException;
}
