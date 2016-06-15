/**
 * ScoreSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.wsdl;

public class ScoreSoapBindingSkeleton implements cn.edu.nju.jw.wsdl.ScoreInterface, org.apache.axis.wsdl.Skeleton {
    private cn.edu.nju.jw.wsdl.ScoreInterface impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "studentNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "学号类型"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("searchScore", _params, new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "scoreList"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "学生成绩列表的结构"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "searchScore"));
        _oper.setSoapAction("http://jw.nju.edu.cn/wsdl/searchScore");
        _myOperationsList.add(_oper);
        if (_myOperations.get("searchScore") == null) {
            _myOperations.put("searchScore", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("searchScore")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("fault");
        _fault.setQName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "invalidDataError"));
        _fault.setClassName("cn.edu.nju.jw.wsdl.SearchScoreFault");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "学号"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "学号类型"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "课程编号"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "课程编号"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "成绩类型"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "成绩类型"), cn.edu.nju.jw.schema.成绩类型.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "得分"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "得分类型"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("addScore", _params, new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "isSuccess"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "addScore"));
        _oper.setSoapAction("http://jw.nju.edu.cn/wsdl/addScore");
        _myOperationsList.add(_oper);
        if (_myOperations.get("addScore") == null) {
            _myOperations.put("addScore", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("addScore")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("fault");
        _fault.setQName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "invalidDataError"));
        _fault.setClassName("cn.edu.nju.jw.wsdl.AddScoreFault");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "delScore"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "删除学生成绩的结构"), cn.edu.nju.jw.schema.删除学生成绩的结构.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("deleteScore", _params, new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "isSuccess"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "deleteScore"));
        _oper.setSoapAction("http://jw.nju.edu.cn/wsdl/deleteScore");
        _myOperationsList.add(_oper);
        if (_myOperations.get("deleteScore") == null) {
            _myOperations.put("deleteScore", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("deleteScore")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("fault");
        _fault.setQName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "invalidDataError"));
        _fault.setClassName("cn.edu.nju.jw.wsdl.DeleteScoreFault");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "addScore"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "添加或修改学生成绩的结构"), cn.edu.nju.jw.schema.添加或修改学生成绩的结构.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("modifyScore", _params, new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "isSuccess"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "modifyScore"));
        _oper.setSoapAction("http://jw.nju.edu.cn/wsdl/modifyScore");
        _myOperationsList.add(_oper);
        if (_myOperations.get("modifyScore") == null) {
            _myOperations.put("modifyScore", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("modifyScore")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("fault");
        _fault.setQName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "invalidDataError"));
        _fault.setClassName("cn.edu.nju.jw.wsdl.ModifyScoreFault");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.addFault(_fault);
    }

    public ScoreSoapBindingSkeleton() {
        this.impl = new cn.edu.nju.jw.wsdl.ScoreSoapBindingImpl();
    }

    public ScoreSoapBindingSkeleton(cn.edu.nju.jw.wsdl.ScoreInterface impl) {
        this.impl = impl;
    }
    public cn.edu.nju.jw.schema.学生成绩列表的结构 searchScore(java.lang.String studentNo) throws java.rmi.RemoteException, cn.edu.nju.jw.wsdl.SearchScoreFault
    {
        cn.edu.nju.jw.schema.学生成绩列表的结构 ret = impl.searchScore(studentNo);
        return ret;
    }

    public java.lang.String addScore(java.lang.String 学号, java.lang.String 课程编号, cn.edu.nju.jw.schema.成绩类型 成绩类型, int 得分) throws java.rmi.RemoteException, cn.edu.nju.jw.wsdl.AddScoreFault
    {
        java.lang.String ret = impl.addScore(学号, 课程编号, 成绩类型, 得分);
        return ret;
    }

    public java.lang.String deleteScore(cn.edu.nju.jw.schema.删除学生成绩的结构 delScore) throws java.rmi.RemoteException, cn.edu.nju.jw.wsdl.DeleteScoreFault
    {
        java.lang.String ret = impl.deleteScore(delScore);
        return ret;
    }

    public java.lang.String modifyScore(cn.edu.nju.jw.schema.添加或修改学生成绩的结构 modSocre) throws java.rmi.RemoteException, cn.edu.nju.jw.wsdl.ModifyScoreFault
    {
        java.lang.String ret = impl.modifyScore(modSocre);
        return ret;
    }

}
