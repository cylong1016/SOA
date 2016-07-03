/**
 * StudentManagementPortType_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.wsdl;

public class StudentManagementPortType_ServiceLocator extends org.apache.axis.client.Service implements cn.edu.nju.jw.wsdl.StudentManagementPortType_Service {

    public StudentManagementPortType_ServiceLocator() {
    }


    public StudentManagementPortType_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StudentManagementPortType_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for studentManagementSOAP
    private java.lang.String studentManagementSOAP_address = "http://localhost:8080/SFWsdl/services/studentManagementSOAP/";

    public java.lang.String getstudentManagementSOAPAddress() {
        return studentManagementSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String studentManagementSOAPWSDDServiceName = "studentManagementSOAP";

    public java.lang.String getstudentManagementSOAPWSDDServiceName() {
        return studentManagementSOAPWSDDServiceName;
    }

    public void setstudentManagementSOAPWSDDServiceName(java.lang.String name) {
        studentManagementSOAPWSDDServiceName = name;
    }

    public cn.edu.nju.jw.wsdl.StudentManagementPortType_PortType getstudentManagementSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(studentManagementSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getstudentManagementSOAP(endpoint);
    }

    public cn.edu.nju.jw.wsdl.StudentManagementPortType_PortType getstudentManagementSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.edu.nju.jw.wsdl.StudentManagementSOAPStub _stub = new cn.edu.nju.jw.wsdl.StudentManagementSOAPStub(portAddress, this);
            _stub.setPortName(getstudentManagementSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setstudentManagementSOAPEndpointAddress(java.lang.String address) {
        studentManagementSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.edu.nju.jw.wsdl.StudentManagementPortType_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.edu.nju.jw.wsdl.StudentManagementSOAPStub _stub = new cn.edu.nju.jw.wsdl.StudentManagementSOAPStub(new java.net.URL(studentManagementSOAP_address), this);
                _stub.setPortName(getstudentManagementSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("studentManagementSOAP".equals(inputPortName)) {
            return getstudentManagementSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "studentManagementPortType");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "studentManagementSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("studentManagementSOAP".equals(portName)) {
            setstudentManagementSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
