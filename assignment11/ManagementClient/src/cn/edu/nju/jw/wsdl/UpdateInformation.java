/**
 * UpdateInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.wsdl;

public class UpdateInformation  implements java.io.Serializable {
    private cn.edu.nju.jw.wsdl.个人信息类型 个人基本信息;

    private java.lang.String 学号;

    public UpdateInformation() {
    }

    public UpdateInformation(
           cn.edu.nju.jw.wsdl.个人信息类型 个人基本信息,
           java.lang.String 学号) {
           this.个人基本信息 = 个人基本信息;
           this.学号 = 学号;
    }


    /**
     * Gets the 个人基本信息 value for this UpdateInformation.
     * 
     * @return 个人基本信息
     */
    public cn.edu.nju.jw.wsdl.个人信息类型 get个人基本信息() {
        return 个人基本信息;
    }


    /**
     * Sets the 个人基本信息 value for this UpdateInformation.
     * 
     * @param 个人基本信息
     */
    public void set个人基本信息(cn.edu.nju.jw.wsdl.个人信息类型 个人基本信息) {
        this.个人基本信息 = 个人基本信息;
    }


    /**
     * Gets the 学号 value for this UpdateInformation.
     * 
     * @return 学号
     */
    public java.lang.String get学号() {
        return 学号;
    }


    /**
     * Sets the 学号 value for this UpdateInformation.
     * 
     * @param 学号
     */
    public void set学号(java.lang.String 学号) {
        this.学号 = 学号;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateInformation)) return false;
        UpdateInformation other = (UpdateInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.个人基本信息==null && other.get个人基本信息()==null) || 
             (this.个人基本信息!=null &&
              this.个人基本信息.equals(other.get个人基本信息()))) &&
            ((this.学号==null && other.get学号()==null) || 
             (this.学号!=null &&
              this.学号.equals(other.get学号())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (get个人基本信息() != null) {
            _hashCode += get个人基本信息().hashCode();
        }
        if (get学号() != null) {
            _hashCode += get学号().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsdl.jw.nju.edu.cn/", "updateInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("个人基本信息");
        elemField.setXmlName(new javax.xml.namespace.QName("", "个人基本信息"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsdl.jw.nju.edu.cn/", "个人信息类型"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("学号");
        elemField.setXmlName(new javax.xml.namespace.QName("", "学号"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
