//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.03 at 07:23:17 PM BRT 
//


package generated;

import java.util.ArrayList;
import java.util.List;
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
    "ejbTimerService",
    "property"
})
@XmlRootElement(name = "ejb-container")
public class EjbContainer {

    @XmlAttribute(name = "steady-pool-size")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String steadyPoolSize;
    @XmlAttribute(name = "pool-resize-quantity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String poolResizeQuantity;
    @XmlAttribute(name = "max-pool-size")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String maxPoolSize;
    @XmlAttribute(name = "cache-resize-quantity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cacheResizeQuantity;
    @XmlAttribute(name = "max-cache-size")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String maxCacheSize;
    @XmlAttribute(name = "pool-idle-timeout-in-seconds")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String poolIdleTimeoutInSeconds;
    @XmlAttribute(name = "cache-idle-timeout-in-seconds")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cacheIdleTimeoutInSeconds;
    @XmlAttribute(name = "removal-timeout-in-seconds")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String removalTimeoutInSeconds;
    @XmlAttribute(name = "victim-selection-policy")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String victimSelectionPolicy;
    @XmlAttribute(name = "commit-option")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String commitOption;
    @XmlAttribute(name = "session-store")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sessionStore;
    @XmlElement(name = "ejb-timer-service")
    protected EjbTimerService ejbTimerService;
    protected List<Property> property;

    /**
     * Gets the value of the steadyPoolSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSteadyPoolSize() {
        if (steadyPoolSize == null) {
            return "32";
        } else {
            return steadyPoolSize;
        }
    }

    /**
     * Sets the value of the steadyPoolSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSteadyPoolSize(String value) {
        this.steadyPoolSize = value;
    }

    /**
     * Gets the value of the poolResizeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolResizeQuantity() {
        if (poolResizeQuantity == null) {
            return "16";
        } else {
            return poolResizeQuantity;
        }
    }

    /**
     * Sets the value of the poolResizeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolResizeQuantity(String value) {
        this.poolResizeQuantity = value;
    }

    /**
     * Gets the value of the maxPoolSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPoolSize() {
        if (maxPoolSize == null) {
            return "64";
        } else {
            return maxPoolSize;
        }
    }

    /**
     * Sets the value of the maxPoolSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPoolSize(String value) {
        this.maxPoolSize = value;
    }

    /**
     * Gets the value of the cacheResizeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheResizeQuantity() {
        if (cacheResizeQuantity == null) {
            return "32";
        } else {
            return cacheResizeQuantity;
        }
    }

    /**
     * Sets the value of the cacheResizeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheResizeQuantity(String value) {
        this.cacheResizeQuantity = value;
    }

    /**
     * Gets the value of the maxCacheSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxCacheSize() {
        if (maxCacheSize == null) {
            return "512";
        } else {
            return maxCacheSize;
        }
    }

    /**
     * Sets the value of the maxCacheSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxCacheSize(String value) {
        this.maxCacheSize = value;
    }

    /**
     * Gets the value of the poolIdleTimeoutInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolIdleTimeoutInSeconds() {
        if (poolIdleTimeoutInSeconds == null) {
            return "600";
        } else {
            return poolIdleTimeoutInSeconds;
        }
    }

    /**
     * Sets the value of the poolIdleTimeoutInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolIdleTimeoutInSeconds(String value) {
        this.poolIdleTimeoutInSeconds = value;
    }

    /**
     * Gets the value of the cacheIdleTimeoutInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheIdleTimeoutInSeconds() {
        if (cacheIdleTimeoutInSeconds == null) {
            return "600";
        } else {
            return cacheIdleTimeoutInSeconds;
        }
    }

    /**
     * Sets the value of the cacheIdleTimeoutInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheIdleTimeoutInSeconds(String value) {
        this.cacheIdleTimeoutInSeconds = value;
    }

    /**
     * Gets the value of the removalTimeoutInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemovalTimeoutInSeconds() {
        if (removalTimeoutInSeconds == null) {
            return "5400";
        } else {
            return removalTimeoutInSeconds;
        }
    }

    /**
     * Sets the value of the removalTimeoutInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemovalTimeoutInSeconds(String value) {
        this.removalTimeoutInSeconds = value;
    }

    /**
     * Gets the value of the victimSelectionPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVictimSelectionPolicy() {
        if (victimSelectionPolicy == null) {
            return "nru";
        } else {
            return victimSelectionPolicy;
        }
    }

    /**
     * Sets the value of the victimSelectionPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVictimSelectionPolicy(String value) {
        this.victimSelectionPolicy = value;
    }

    /**
     * Gets the value of the commitOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitOption() {
        if (commitOption == null) {
            return "B";
        } else {
            return commitOption;
        }
    }

    /**
     * Sets the value of the commitOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitOption(String value) {
        this.commitOption = value;
    }

    /**
     * Gets the value of the sessionStore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionStore() {
        return sessionStore;
    }

    /**
     * Sets the value of the sessionStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionStore(String value) {
        this.sessionStore = value;
    }

    /**
     * Gets the value of the ejbTimerService property.
     * 
     * @return
     *     possible object is
     *     {@link EjbTimerService }
     *     
     */
    public EjbTimerService getEjbTimerService() {
        return ejbTimerService;
    }

    /**
     * Sets the value of the ejbTimerService property.
     * 
     * @param value
     *     allowed object is
     *     {@link EjbTimerService }
     *     
     */
    public void setEjbTimerService(EjbTimerService value) {
        this.ejbTimerService = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     * 
     * 
     */
    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return this.property;
    }

}
