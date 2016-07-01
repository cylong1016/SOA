/**
 * LoginServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package loginByMailService;

public class LoginServiceLocator extends org.apache.axis.client.Service implements loginByMailService.LoginService {

    public LoginServiceLocator() {
    }


    public LoginServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LoginServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LoginPort
    private java.lang.String LoginPort_address = "http://172.17.173.38:81/login";

    public java.lang.String getLoginPortAddress() {
        return LoginPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LoginPortWSDDServiceName = "LoginPort";

    public java.lang.String getLoginPortWSDDServiceName() {
        return LoginPortWSDDServiceName;
    }

    public void setLoginPortWSDDServiceName(java.lang.String name) {
        LoginPortWSDDServiceName = name;
    }

    public loginByMailService.Login getLoginPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LoginPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLoginPort(endpoint);
    }

    public loginByMailService.Login getLoginPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            loginByMailService.LoginPortBindingStub _stub = new loginByMailService.LoginPortBindingStub(portAddress, this);
            _stub.setPortName(getLoginPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLoginPortEndpointAddress(java.lang.String address) {
        LoginPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (loginByMailService.Login.class.isAssignableFrom(serviceEndpointInterface)) {
                loginByMailService.LoginPortBindingStub _stub = new loginByMailService.LoginPortBindingStub(new java.net.URL(LoginPort_address), this);
                _stub.setPortName(getLoginPortWSDDServiceName());
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
        if ("LoginPort".equals(inputPortName)) {
            return getLoginPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://loginByMailService/", "LoginService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://loginByMailService/", "LoginPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LoginPort".equals(portName)) {
            setLoginPortEndpointAddress(address);
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
