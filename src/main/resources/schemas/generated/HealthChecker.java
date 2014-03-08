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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "health-checker")
public class HealthChecker {

    @XmlAttribute
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String url;
    @XmlAttribute(name = "interval-in-seconds")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String intervalInSeconds;
    @XmlAttribute(name = "timeout-in-seconds")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String timeoutInSeconds;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        if (url == null) {
            return "/";
        } else {
            return url;
        }
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the intervalInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntervalInSeconds() {
        if (intervalInSeconds == null) {
            return "30";
        } else {
            return intervalInSeconds;
        }
    }

    /**
     * Sets the value of the intervalInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntervalInSeconds(String value) {
        this.intervalInSeconds = value;
    }

    /**
     * Gets the value of the timeoutInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeoutInSeconds() {
        if (timeoutInSeconds == null) {
            return "10";
        } else {
            return timeoutInSeconds;
        }
    }

    /**
     * Sets the value of the timeoutInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeoutInSeconds(String value) {
        this.timeoutInSeconds = value;
    }

}