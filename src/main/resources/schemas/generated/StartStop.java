//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.03 at 07:42:07 PM BRT 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for start-stop.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="start-stop">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="start"/>
 *     &lt;enumeration value="stop"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "start-stop")
@XmlEnum
public enum StartStop {

    @XmlEnumValue("start")
    START("start"),
    @XmlEnumValue("stop")
    STOP("stop");
    private final java.lang.String value;

    StartStop(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static StartStop fromValue(java.lang.String v) {
        for (StartStop c: StartStop.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
