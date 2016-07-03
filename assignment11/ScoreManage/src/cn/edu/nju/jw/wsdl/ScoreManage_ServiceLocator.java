/**
 * ScoreManage_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.wsdl;

public class ScoreManage_ServiceLocator extends org.apache.axis.client.Service implements cn.edu.nju.jw.wsdl.ScoreManage_Service {

    public ScoreManage_ServiceLocator() {
    }


    public ScoreManage_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ScoreManage_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for scoreManageSOAP
    private java.lang.String scoreManageSOAP_address = "http://localhost:8080/Wsdl/services/scoreManageSOAP";

    public java.lang.String getscoreManageSOAPAddress() {
        return scoreManageSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String scoreManageSOAPWSDDServiceName = "scoreManageSOAP";

    public java.lang.String getscoreManageSOAPWSDDServiceName() {
        return scoreManageSOAPWSDDServiceName;
    }

    public void setscoreManageSOAPWSDDServiceName(java.lang.String name) {
        scoreManageSOAPWSDDServiceName = name;
    }

    public cn.edu.nju.jw.wsdl.ScoreManage_PortType getscoreManageSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(scoreManageSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getscoreManageSOAP(endpoint);
    }

    public cn.edu.nju.jw.wsdl.ScoreManage_PortType getscoreManageSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.edu.nju.jw.wsdl.ScoreManageSOAPStub _stub = new cn.edu.nju.jw.wsdl.ScoreManageSOAPStub(portAddress, this);
            _stub.setPortName(getscoreManageSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setscoreManageSOAPEndpointAddress(java.lang.String address) {
        scoreManageSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.edu.nju.jw.wsdl.ScoreManage_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.edu.nju.jw.wsdl.ScoreManageSOAPStub _stub = new cn.edu.nju.jw.wsdl.ScoreManageSOAPStub(new java.net.URL(scoreManageSOAP_address), this);
                _stub.setPortName(getscoreManageSOAPWSDDServiceName());
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
        if ("scoreManageSOAP".equals(inputPortName)) {
            return getscoreManageSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "scoreManage");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "scoreManageSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("scoreManageSOAP".equals(portName)) {
            setscoreManageSOAPEndpointAddress(address);
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
