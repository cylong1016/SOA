/**
 * ScoreManageSOAPImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.wsdl;

public class ScoreManageSOAPImplServiceLocator extends org.apache.axis.client.Service implements cn.edu.nju.jw.wsdl.ScoreManageSOAPImplService {

    public ScoreManageSOAPImplServiceLocator() {
    }


    public ScoreManageSOAPImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ScoreManageSOAPImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ScoreManageSOAPImplPort
    private java.lang.String ScoreManageSOAPImplPort_address = "http://localhost:1001/ScoreManage";

    public java.lang.String getScoreManageSOAPImplPortAddress() {
        return ScoreManageSOAPImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ScoreManageSOAPImplPortWSDDServiceName = "ScoreManageSOAPImplPort";

    public java.lang.String getScoreManageSOAPImplPortWSDDServiceName() {
        return ScoreManageSOAPImplPortWSDDServiceName;
    }

    public void setScoreManageSOAPImplPortWSDDServiceName(java.lang.String name) {
        ScoreManageSOAPImplPortWSDDServiceName = name;
    }

    public cn.edu.nju.jw.wsdl.ScoreManage_PortType getScoreManageSOAPImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ScoreManageSOAPImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getScoreManageSOAPImplPort(endpoint);
    }

    public cn.edu.nju.jw.wsdl.ScoreManage_PortType getScoreManageSOAPImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.edu.nju.jw.wsdl.ScoreManageSOAPImplPortBindingStub _stub = new cn.edu.nju.jw.wsdl.ScoreManageSOAPImplPortBindingStub(portAddress, this);
            _stub.setPortName(getScoreManageSOAPImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setScoreManageSOAPImplPortEndpointAddress(java.lang.String address) {
        ScoreManageSOAPImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.edu.nju.jw.wsdl.ScoreManage_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.edu.nju.jw.wsdl.ScoreManageSOAPImplPortBindingStub _stub = new cn.edu.nju.jw.wsdl.ScoreManageSOAPImplPortBindingStub(new java.net.URL(ScoreManageSOAPImplPort_address), this);
                _stub.setPortName(getScoreManageSOAPImplPortWSDDServiceName());
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
        if ("ScoreManageSOAPImplPort".equals(inputPortName)) {
            return getScoreManageSOAPImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "ScoreManageSOAPImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jw.nju.edu.cn/wsdl", "ScoreManageSOAPImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ScoreManageSOAPImplPort".equals(portName)) {
            setScoreManageSOAPImplPortEndpointAddress(address);
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
