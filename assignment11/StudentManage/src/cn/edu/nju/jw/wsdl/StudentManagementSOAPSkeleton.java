/**
 * StudentManagementSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.wsdl;

public class StudentManagementSOAPSkeleton implements cn.edu.nju.jw.wsdl.StudentManagementPortType_PortType, org.apache.axis.wsdl.Skeleton {
    private cn.edu.nju.jw.wsdl.StudentManagementPortType_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "updateInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.nju.edu.cn/schema", "updateInformation"), cn.edu.nju.www.schema.UpdateInformation.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("studentManagement", _params, new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "updateSuccess"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.nju.edu.cn/schema", "个人信息类型"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "studentManagement"));
        _oper.setSoapAction("http://jw.nju.edu.cn/wsdl/studentManagement");
        _myOperationsList.add(_oper);
        if (_myOperations.get("studentManagement") == null) {
            _myOperations.put("studentManagement", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("studentManagement")).add(_oper);
    }

    public StudentManagementSOAPSkeleton() {
        this.impl = new cn.edu.nju.jw.wsdl.StudentManagementSOAPImpl();
    }

    public StudentManagementSOAPSkeleton(cn.edu.nju.jw.wsdl.StudentManagementPortType_PortType impl) {
        this.impl = impl;
    }
    public cn.edu.nju.www.schema.个人信息类型 studentManagement(cn.edu.nju.www.schema.UpdateInformation updateInfo) throws java.rmi.RemoteException
    {
        cn.edu.nju.www.schema.个人信息类型 ret = impl.studentManagement(updateInfo);
        return ret;
    }

}
