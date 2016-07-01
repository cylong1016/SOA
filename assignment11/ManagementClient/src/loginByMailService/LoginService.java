/**
 * LoginService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package loginByMailService;

public interface LoginService extends javax.xml.rpc.Service {
    public java.lang.String getLoginPortAddress();

    public loginByMailService.Login getLoginPort() throws javax.xml.rpc.ServiceException;

    public loginByMailService.Login getLoginPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
