/**
 * StudentManagementSOAPImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.wsdl;

public class StudentManagementSOAPImplServiceLocator extends org.apache.axis.client.Service implements cn.edu.nju.jw.wsdl.StudentManagementSOAPImplService {

    public StudentManagementSOAPImplServiceLocator() {
    }


    public StudentManagementSOAPImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StudentManagementSOAPImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StudentManagementSOAPImplPort
    private java.lang.String StudentManagementSOAPImplPort_address = "http://localhost:1002/StudentManage";

    public java.lang.String getStudentManagementSOAPImplPortAddress() {
        return StudentManagementSOAPImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StudentManagementSOAPImplPortWSDDServiceName = "StudentManagementSOAPImplPort";

    public java.lang.String getStudentManagementSOAPImplPortWSDDServiceName() {
        return StudentManagementSOAPImplPortWSDDServiceName;
    }

    public void setStudentManagementSOAPImplPortWSDDServiceName(java.lang.String name) {
        StudentManagementSOAPImplPortWSDDServiceName = name;
    }

    public cn.edu.nju.jw.wsdl.StudentManagementPortType_PortType getStudentManagementSOAPImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StudentManagementSOAPImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStudentManagementSOAPImplPort(endpoint);
    }

    public cn.edu.nju.jw.wsdl.StudentManagementPortType_PortType getStudentManagementSOAPImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.edu.nju.jw.wsdl.StudentManagementSOAPImplPortBindingStub _stub = new cn.edu.nju.jw.wsdl.StudentManagementSOAPImplPortBindingStub(portAddress, this);
            _stub.setPortName(getStudentManagementSOAPImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStudentManagementSOAPImplPortEndpointAddress(java.lang.String address) {
        StudentManagementSOAPImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.edu.nju.jw.wsdl.StudentManagementPortType_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.edu.nju.jw.wsdl.StudentManagementSOAPImplPortBindingStub _stub = new cn.edu.nju.jw.wsdl.StudentManagementSOAPImplPortBindingStub(new java.net.URL(StudentManagementSOAPImplPort_address), this);
                _stub.setPortName(getStudentManagementSOAPImplPortWSDDServiceName());
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
        if ("StudentManagementSOAPImplPort".equals(inputPortName)) {
            return getStudentManagementSOAPImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "StudentManagementSOAPImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "StudentManagementSOAPImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StudentManagementSOAPImplPort".equals(portName)) {
            setStudentManagementSOAPImplPortEndpointAddress(address);
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
