/**
 * UType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.wsdl;

public class UType  implements java.io.Serializable {
    private java.lang.String 直属单位名;

    private java.lang.String 直属单位编号;

    private java.lang.String 联系方式;

    public UType() {
    }

    public UType(
           java.lang.String 直属单位名,
           java.lang.String 直属单位编号,
           java.lang.String 联系方式) {
           this.直属单位名 = 直属单位名;
           this.直属单位编号 = 直属单位编号;
           this.联系方式 = 联系方式;
    }


    /**
     * Gets the 直属单位名 value for this UType.
     * 
     * @return 直属单位名
     */
    public java.lang.String get直属单位名() {
        return 直属单位名;
    }


    /**
     * Sets the 直属单位名 value for this UType.
     * 
     * @param 直属单位名
     */
    public void set直属单位名(java.lang.String 直属单位名) {
        this.直属单位名 = 直属单位名;
    }


    /**
     * Gets the 直属单位编号 value for this UType.
     * 
     * @return 直属单位编号
     */
    public java.lang.String get直属单位编号() {
        return 直属单位编号;
    }


    /**
     * Sets the 直属单位编号 value for this UType.
     * 
     * @param 直属单位编号
     */
    public void set直属单位编号(java.lang.String 直属单位编号) {
        this.直属单位编号 = 直属单位编号;
    }


    /**
     * Gets the 联系方式 value for this UType.
     * 
     * @return 联系方式
     */
    public java.lang.String get联系方式() {
        return 联系方式;
    }


    /**
     * Sets the 联系方式 value for this UType.
     * 
     * @param 联系方式
     */
    public void set联系方式(java.lang.String 联系方式) {
        this.联系方式 = 联系方式;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UType)) return false;
        UType other = (UType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.直属单位名==null && other.get直属单位名()==null) || 
             (this.直属单位名!=null &&
              this.直属单位名.equals(other.get直属单位名()))) &&
            ((this.直属单位编号==null && other.get直属单位编号()==null) || 
             (this.直属单位编号!=null &&
              this.直属单位编号.equals(other.get直属单位编号()))) &&
            ((this.联系方式==null && other.get联系方式()==null) || 
             (this.联系方式!=null &&
              this.联系方式.equals(other.get联系方式())));
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
        if (get直属单位名() != null) {
            _hashCode += get直属单位名().hashCode();
        }
        if (get直属单位编号() != null) {
            _hashCode += get直属单位编号().hashCode();
        }
        if (get联系方式() != null) {
            _hashCode += get联系方式().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsdl.jw.nju.edu.cn/", "uType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("直属单位名");
        elemField.setXmlName(new javax.xml.namespace.QName("", "直属单位名"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("直属单位编号");
        elemField.setXmlName(new javax.xml.namespace.QName("", "直属单位编号"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("联系方式");
        elemField.setXmlName(new javax.xml.namespace.QName("", "联系方式"));
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
