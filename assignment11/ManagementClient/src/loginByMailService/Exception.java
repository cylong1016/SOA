/**
 * Exception.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package loginByMailService;

public class Exception  implements java.io.Serializable {
    private loginByMailService.StackTraceElement[] throwable;  // attribute

    public Exception() {
    }

    public Exception(
           loginByMailService.StackTraceElement[] param1) {
        this.param1 = param1;
    }


    /**
     * Gets the throwable value for this Exception.
     * 
     * @return throwable
     */
    public loginByMailService.StackTraceElement[] getThrowable() {
        return throwable;
    }


    /**
     * Sets the throwable value for this Exception.
     * 
     * @param throwable
     */
    public void setThrowable(loginByMailService.StackTraceElement[] throwable) {
        this.throwable = throwable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Exception)) return false;
        Exception other = (Exception) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.throwable==null && other.getThrowable()==null) || 
             (this.throwable!=null &&
              java.util.Arrays.equals(this.throwable, other.getThrowable())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getThrowable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThrowable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThrowable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Exception.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://loginByMailService/", "exception"));
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
