/**
 * 单个学生成绩列表类型.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.schema;

public class 单个学生成绩列表类型  implements java.io.Serializable {
    private cn.edu.nju.jw.schema.单项成绩类型 单项成绩;

    public 单个学生成绩列表类型() {
    }

    public 单个学生成绩列表类型(
           cn.edu.nju.jw.schema.单项成绩类型 单项成绩) {
           this.单项成绩 = 单项成绩;
    }


    /**
     * Gets the 单项成绩 value for this 单个学生成绩列表类型.
     * 
     * @return 单项成绩
     */
    public cn.edu.nju.jw.schema.单项成绩类型 get单项成绩() {
        return 单项成绩;
    }


    /**
     * Sets the 单项成绩 value for this 单个学生成绩列表类型.
     * 
     * @param 单项成绩
     */
    public void set单项成绩(cn.edu.nju.jw.schema.单项成绩类型 单项成绩) {
        this.单项成绩 = 单项成绩;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof 单个学生成绩列表类型)) return false;
        单个学生成绩列表类型 other = (单个学生成绩列表类型) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.单项成绩==null && other.get单项成绩()==null) || 
             (this.单项成绩!=null &&
              this.单项成绩.equals(other.get单项成绩())));
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
        if (get单项成绩() != null) {
            _hashCode += get单项成绩().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(单个学生成绩列表类型.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "单个学生成绩列表类型"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("单项成绩");
        elemField.setXmlName(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "单项成绩"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://jw.nju.edu.cn/schema", "单项成绩类型"));
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
