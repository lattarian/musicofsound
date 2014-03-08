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
@XmlRootElement(name = "cluster-ref")
public class ClusterRef {

    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ref;
    @XmlAttribute(name = "lb-policy")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lbPolicy;
    @XmlAttribute(name = "lb-policy-module")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lbPolicyModule;
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
     * Gets the value of the lbPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbPolicy() {
        if (lbPolicy == null) {
            return "round-robin";
        } else {
            return lbPolicy;
        }
    }

    /**
     * Sets the value of the lbPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbPolicy(String value) {
        this.lbPolicy = value;
    }

    /**
     * Gets the value of the lbPolicyModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLbPolicyModule() {
        return lbPolicyModule;
    }

    /**
     * Sets the value of the lbPolicyModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLbPolicyModule(String value) {
        this.lbPolicyModule = value;
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