/**
 * DType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.jw.wsdl;

public class DType  implements java.io.Serializable {
    private java.lang.String 联系方式;

    private java.lang.String 院系名;

    private java.lang.String 院系编号;

    public DType() {
    }

    public DType(
           java.lang.String 联系方式,
           java.lang.String 院系名,
           java.lang.String 院系编号) {
           this.联系方式 = 联系方式;
           this.院系名 = 院系名;
           this.院系编号 = 院系编号;
    }


    /**
     * Gets the 联系方式 value for this DType.
     * 
     * @return 联系方式
     */
    public java.lang.String get联系方式() {
        return 联系方式;
    }


    /**
     * Sets the 联系方式 value for this DType.
     * 
     * @param 联系方式
     */
    public void set联系方式(java.lang.String 联系方式) {
        this.联系方式 = 联系方式;
    }


    /**
     * Gets the 院系名 value for this DType.
     * 
     * @return 院系名
     */
    public java.lang.String get院系名() {
        return 院系名;
    }


    /**
     * Sets the 院系名 value for this DType.
     * 
     * @param 院系名
     */
    public void set院系名(java.lang.String 院系名) {
        this.院系名 = 院系名;
    }


    /**
     * Gets the 院系编号 value for this DType.
     * 
     * @return 院系编号
     */
    public java.lang.String get院系编号() {
        return 院系编号;
    }


    /**
     * Sets the 院系编号 value for this DType.
     * 
     * @param 院系编号
     */
    public void set院系编号(java.lang.String 院系编号) {
        this.院系编号 = 院系编号;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DType)) return false;
        DType other = (DType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.联系方式==null && other.get联系方式()==null) || 
             (this.联系方式!=null &&
              this.联系方式.equals(other.get联系方式()))) &&
            ((this.院系名==null && other.get院系名()==null) || 
             (this.院系名!=null &&
              this.院系名.equals(other.get院系名()))) &&
            ((this.院系编号==null && other.get院系编号()==null) || 
             (this.院系编号!=null &&
              this.院系编号.equals(other.get院系编号())));
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
        if (get联系方式() != null) {
            _hashCode += get联系方式().hashCode();
        }
        if (get院系名() != null) {
            _hashCode += get院系名().hashCode();
        }
        if (get院系编号() != null) {
            _hashCode += get院系编号().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsdl.jw.nju.edu.cn/", "dType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("联系方式");
        elemField.setXmlName(new javax.xml.namespace.QName("", "联系方式"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("院系名");
        elemField.setXmlName(new javax.xml.namespace.QName("", "院系名"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("院系编号");
        elemField.setXmlName(new javax.xml.namespace.QName("", "院系编号"));
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
