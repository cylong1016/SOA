/**
 * 院系部门类型.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.edu.nju.www.schema;

public class 院系部门类型  implements java.io.Serializable {
    private cn.edu.nju.www.schema.DType 院系;

    private cn.edu.nju.www.schema.AType 行政部门;

    private cn.edu.nju.www.schema.UType 直属单位;

    public 院系部门类型() {
    }

    public 院系部门类型(
           cn.edu.nju.www.schema.DType 院系,
           cn.edu.nju.www.schema.AType 行政部门,
           cn.edu.nju.www.schema.UType 直属单位) {
           this.院系 = 院系;
           this.行政部门 = 行政部门;
           this.直属单位 = 直属单位;
    }


    /**
     * Gets the 院系 value for this 院系部门类型.
     * 
     * @return 院系
     */
    public cn.edu.nju.www.schema.DType get院系() {
        return 院系;
    }


    /**
     * Sets the 院系 value for this 院系部门类型.
     * 
     * @param 院系
     */
    public void set院系(cn.edu.nju.www.schema.DType 院系) {
        this.院系 = 院系;
    }


    /**
     * Gets the 行政部门 value for this 院系部门类型.
     * 
     * @return 行政部门
     */
    public cn.edu.nju.www.schema.AType get行政部门() {
        return 行政部门;
    }


    /**
     * Sets the 行政部门 value for this 院系部门类型.
     * 
     * @param 行政部门
     */
    public void set行政部门(cn.edu.nju.www.schema.AType 行政部门) {
        this.行政部门 = 行政部门;
    }


    /**
     * Gets the 直属单位 value for this 院系部门类型.
     * 
     * @return 直属单位
     */
    public cn.edu.nju.www.schema.UType get直属单位() {
        return 直属单位;
    }


    /**
     * Sets the 直属单位 value for this 院系部门类型.
     * 
     * @param 直属单位
     */
    public void set直属单位(cn.edu.nju.www.schema.UType 直属单位) {
        this.直属单位 = 直属单位;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof 院系部门类型)) return false;
        院系部门类型 other = (院系部门类型) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.院系==null && other.get院系()==null) || 
             (this.院系!=null &&
              this.院系.equals(other.get院系()))) &&
            ((this.行政部门==null && other.get行政部门()==null) || 
             (this.行政部门!=null &&
              this.行政部门.equals(other.get行政部门()))) &&
            ((this.直属单位==null && other.get直属单位()==null) || 
             (this.直属单位!=null &&
              this.直属单位.equals(other.get直属单位())));
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
        if (get院系() != null) {
            _hashCode += get院系().hashCode();
        }
        if (get行政部门() != null) {
            _hashCode += get行政部门().hashCode();
        }
        if (get直属单位() != null) {
            _hashCode += get直属单位().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(院系部门类型.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nju.edu.cn/schema", "院系部门类型"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("院系");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nju.edu.cn/schema", "院系"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nju.edu.cn/schema", "dType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("行政部门");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nju.edu.cn/schema", "行政部门"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nju.edu.cn/schema", "aType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("直属单位");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nju.edu.cn/schema", "直属单位"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nju.edu.cn/schema", "uType"));
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
