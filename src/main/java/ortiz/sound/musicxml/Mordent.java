//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.03 at 07:45:33 PM BRT 
//


package ortiz.sound.musicxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The mordent type is used for both represents the mordent sign with the vertical line and the inverted-mordent sign without the line. The long attribute is "no" by default.
 * 
 * <p>Java class for mordent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mordent">
 *   &lt;complexContent>
 *     &lt;extension base="{}empty-trill-sound">
 *       &lt;attribute name="long" type="{}yes-no" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mordent")
public class Mordent
    extends EmptyTrillSound
{

    @XmlAttribute(name = "long")
    protected YesNo _long;

    /**
     * Gets the value of the long property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getLong() {
        return _long;
    }

    /**
     * Sets the value of the long property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setLong(YesNo value) {
        this._long = value;
    }

}
