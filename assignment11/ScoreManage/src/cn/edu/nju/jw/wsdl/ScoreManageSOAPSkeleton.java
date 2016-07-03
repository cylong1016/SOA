/**
 * ScoreManageSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.wsdl;

public class ScoreManageSOAPSkeleton implements cn.edu.nju.jw.wsdl.ScoreManage_PortType, org.apache.axis.wsdl.Skeleton {
    private cn.edu.nju.jw.wsdl.ScoreManage_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "sid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "学号类型"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getScore", _params, new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "scoreList"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "课程成绩列表类型"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "getScore"));
        _oper.setSoapAction("http://example.com/getTerm");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getScore") == null) {
            _myOperations.put("getScore", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getScore")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "stuScore"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "课程成绩类型"), cn.edu.nju.jw.schema.课程成绩类型.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("modifyScore", _params, new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "IsSuccess"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "modifyScore"));
        _oper.setSoapAction("http://example.com/getTerm");
        _myOperationsList.add(_oper);
        if (_myOperations.get("modifyScore") == null) {
            _myOperations.put("modifyScore", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("modifyScore")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "stuScore"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "课程成绩类型"), cn.edu.nju.jw.schema.课程成绩类型.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addScore", _params, new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "IsSuccess"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "addScore"));
        _oper.setSoapAction("http://example.com/getTerm");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addScore") == null) {
            _myOperations.put("addScore", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addScore")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "stuScore"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "课程成绩类型"), cn.edu.nju.jw.schema.课程成绩类型.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("delScore", _params, new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "IsSuccess"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "delScore"));
        _oper.setSoapAction("http://example.com/getTerm");
        _myOperationsList.add(_oper);
        if (_myOperations.get("delScore") == null) {
            _myOperations.put("delScore", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("delScore")).add(_oper);
    }

    public ScoreManageSOAPSkeleton() {
        this.impl = new cn.edu.nju.jw.wsdl.ScoreManageSOAPImpl();
    }

    public ScoreManageSOAPSkeleton(cn.edu.nju.jw.wsdl.ScoreManage_PortType impl) {
        this.impl = impl;
    }
    public cn.edu.nju.jw.schema.课程成绩类型[] getScore(java.lang.String sid) throws java.rmi.RemoteException
    {
        cn.edu.nju.jw.schema.课程成绩类型[] ret = impl.getScore(sid);
        return ret;
    }

    public boolean modifyScore(cn.edu.nju.jw.schema.课程成绩类型 stuScore) throws java.rmi.RemoteException
    {
        boolean ret = impl.modifyScore(stuScore);
        return ret;
    }

    public boolean addScore(cn.edu.nju.jw.schema.课程成绩类型 stuScore) throws java.rmi.RemoteException
    {
        boolean ret = impl.addScore(stuScore);
        return ret;
    }

    public boolean delScore(cn.edu.nju.jw.schema.课程成绩类型 stuScore) throws java.rmi.RemoteException
    {
        boolean ret = impl.delScore(stuScore);
        return ret;
    }

}
