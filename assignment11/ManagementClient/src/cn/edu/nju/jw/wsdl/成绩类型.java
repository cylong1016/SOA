/**
 * 成绩类型.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.wsdl;

public class 成绩类型  implements java.io.Serializable {
    private java.lang.String 学号;

    private int 得分;

    public 成绩类型() {
    }

    public 成绩类型(
           java.lang.String 学号,
           int 得分) {
           this.学号 = 学号;
           this.得分 = 得分;
    }


    /**
     * Gets the 学号 value for this 成绩类型.
     * 
     * @return 学号
     */
    public java.lang.String get学号() {
        return 学号;
    }


    /**
     * Sets the 学号 value for this 成绩类型.
     * 
     * @param 学号
     */
    public void set学号(java.lang.String 学号) {
        this.学号 = 学号;
    }


    /**
     * Gets the 得分 value for this 成绩类型.
     * 
     * @return 得分
     */
    public int get得分() {
        return 得分;
    }


    /**
     * Sets the 得分 value for this 成绩类型.
     * 
     * @param 得分
     */
    public void set得分(int 得分) {
        this.得分 = 得分;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof 成绩类型)) return false;
        成绩类型 other = (成绩类型) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.学号==null && other.get学号()==null) || 
             (this.学号!=null &&
              this.学号.equals(other.get学号()))) &&
            this.得分 == other.get得分();
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
        if (get学号() != null) {
            _hashCode += get学号().hashCode();
        }
        _hashCode += get得分();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(成绩类型.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsdl.jw.nju.edu.cn/", "成绩类型"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("学号");
        elemField.setXmlName(new javax.xml.namespace.QName("", "学号"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("得分");
        elemField.setXmlName(new javax.xml.namespace.QName("", "得分"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
