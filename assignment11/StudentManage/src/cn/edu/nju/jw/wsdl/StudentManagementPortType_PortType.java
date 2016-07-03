/**
 * StudentManagementPortType_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.wsdl;

import javax.jws.WebService;

@WebService
public interface StudentManagementPortType_PortType extends java.rmi.Remote {

    /**
     * This operation returns information of a student if update operation
     * succeed.
     */
    public cn.edu.nju.www.schema.个人信息类型 studentManagement(cn.edu.nju.www.schema.UpdateInformation updateInfo) throws java.rmi.RemoteException;
}
