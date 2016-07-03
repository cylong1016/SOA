/**
 * 个人信息类型.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.wsdl;

public class 个人信息类型  implements java.io.Serializable {
    private java.lang.String 姓名;

    private java.lang.String 密码;

    private cn.edu.nju.jw.wsdl.性别类型 性别;

    private java.lang.String 手机号;

    private cn.edu.nju.jw.wsdl.院系部门类型 院系部门;

    public 个人信息类型() {
    }

    public 个人信息类型(
           java.lang.String 姓名,
           java.lang.String 密码,
           cn.edu.nju.jw.wsdl.性别类型 性别,
           java.lang.String 手机号,
           cn.edu.nju.jw.wsdl.院系部门类型 院系部门) {
           this.姓名 = 姓名;
           this.密码 = 密码;
           this.性别 = 性别;
           this.手机号 = 手机号;
           this.院系部门 = 院系部门;
    }


    /**
     * Gets the 姓名 value for this 个人信息类型.
     * 
     * @return 姓名
     */
    public java.lang.String get姓名() {
        return 姓名;
    }


    /**
     * Sets the 姓名 value for this 个人信息类型.
     * 
     * @param 姓名
     */
    public void set姓名(java.lang.String 姓名) {
        this.姓名 = 姓名;
    }


    /**
     * Gets the 密码 value for this 个人信息类型.
     * 
     * @return 密码
     */
    public java.lang.String get密码() {
        return 密码;
    }


    /**
     * Sets the 密码 value for this 个人信息类型.
     * 
     * @param 密码
     */
    public void set密码(java.lang.String 密码) {
        this.密码 = 密码;
    }


    /**
     * Gets the 性别 value for this 个人信息类型.
     * 
     * @return 性别
     */
    public cn.edu.nju.jw.wsdl.性别类型 get性别() {
        return 性别;
    }


    /**
     * Sets the 性别 value for this 个人信息类型.
     * 
     * @param 性别
     */
    public void set性别(cn.edu.nju.jw.wsdl.性别类型 性别) {
        this.性别 = 性别;
    }


    /**
     * Gets the 手机号 value for this 个人信息类型.
     * 
     * @return 手机号
     */
    public java.lang.String get手机号() {
        return 手机号;
    }


    /**
     * Sets the 手机号 value for this 个人信息类型.
     * 
     * @param 手机号
     */
    public void set手机号(java.lang.String 手机号) {
        this.手机号 = 手机号;
    }


    /**
     * Gets the 院系部门 value for this 个人信息类型.
     * 
     * @return 院系部门
     */
    public cn.edu.nju.jw.wsdl.院系部门类型 get院系部门() {
        return 院系部门;
    }


    /**
     * Sets the 院系部门 value for this 个人信息类型.
     * 
     * @param 院系部门
     */
    public void set院系部门(cn.edu.nju.jw.wsdl.院系部门类型 院系部门) {
        this.院系部门 = 院系部门;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof 个人信息类型)) return false;
        个人信息类型 other = (个人信息类型) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.姓名==null && other.get姓名()==null) || 
             (this.姓名!=null &&
              this.姓名.equals(other.get姓名()))) &&
            ((this.密码==null && other.get密码()==null) || 
             (this.密码!=null &&
              this.密码.equals(other.get密码()))) &&
            ((this.性别==null && other.get性别()==null) || 
             (this.性别!=null &&
              this.性别.equals(other.get性别()))) &&
            ((this.手机号==null && other.get手机号()==null) || 
             (this.手机号!=null &&
              this.手机号.equals(other.get手机号()))) &&
            ((this.院系部门==null && other.get院系部门()==null) || 
             (this.院系部门!=null &&
              this.院系部门.equals(other.get院系部门())));
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
        if (get姓名() != null) {
            _hashCode += get姓名().hashCode();
        }
        if (get密码() != null) {
            _hashCode += get密码().hashCode();
        }
        if (get性别() != null) {
            _hashCode += get性别().hashCode();
        }
        if (get手机号() != null) {
            _hashCode += get手机号().hashCode();
        }
        if (get院系部门() != null) {
            _hashCode += get院系部门().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(个人信息类型.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsdl.jw.nju.edu.cn/", "个人信息类型"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("姓名");
        elemField.setXmlName(new javax.xml.namespace.QName("", "姓名"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("密码");
        elemField.setXmlName(new javax.xml.namespace.QName("", "密码"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("性别");
        elemField.setXmlName(new javax.xml.namespace.QName("", "性别"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsdl.jw.nju.edu.cn/", "性别类型"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("手机号");
        elemField.setXmlName(new javax.xml.namespace.QName("", "手机号"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("院系部门");
        elemField.setXmlName(new javax.xml.namespace.QName("", "院系部门"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsdl.jw.nju.edu.cn/", "院系部门类型"));
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
