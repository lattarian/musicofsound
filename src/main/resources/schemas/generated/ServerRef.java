//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.03 at 07:23:17 PM BRT 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "healthChecker"
})
@XmlRootElement(name = "server-ref")
public class ServerRef {

    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ref;
    @XmlAttribute(name = "disable-timeout-in-minutes")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String disableTimeoutInMinutes;
    @XmlAttribute(name = "lb-enabled")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lbEnabled;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String enabled;
    @XmlElement(name = "health-checker")
    protected HealthChecker healthChecker;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the disableTimeoutInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisableTimeoutInMinutes() {
        if (disableTimeoutInMinutes == null) {
            return "30";
        } else {
            return disableTimeoutInMinutes;
        }
    }

    /**
     * Sets the value of the disableTimeoutInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisableTimeoutInMinutes(String value) {
        this.disableTimeoutInMinutes = value;
    }

    /**
     * Gets the value of the lbEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbEnabled() {
        if (lbEnabled == null) {
            return "false";
        } else {
            return lbEnabled;
        }
    }

    /**
     * Sets the value of the lbEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbEnabled(String value) {
        this.lbEnabled = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabled() {
        if (enabled == null) {
            return "true";
        } else {
            return enabled;
        }
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabled(String value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the healthChecker property.
     * 
     * @return
     *     possible object is
     *     {@link HealthChecker }
     *     
     */
    public HealthChecker getHealthChecker() {
        return healthChecker;
    }

    /**
     * Sets the value of the healthChecker property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthChecker }
     *     
     */
    public void setHealthChecker(HealthChecker value) {
        this.healthChecker = value;
    }

}