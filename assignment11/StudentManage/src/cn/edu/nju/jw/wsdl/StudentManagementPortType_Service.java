/**
 * StudentManagementPortType_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.wsdl;

public interface StudentManagementPortType_Service extends javax.xml.rpc.Service {
    public java.lang.String getstudentManagementSOAPAddress();

    public cn.edu.nju.jw.wsdl.StudentManagementPortType_PortType getstudentManagementSOAP() throws javax.xml.rpc.ServiceException;

    public cn.edu.nju.jw.wsdl.StudentManagementPortType_PortType getstudentManagementSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
