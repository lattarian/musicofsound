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
    "webContainerAvailability",
    "ejbContainerAvailability",
    "jmsAvailability",
    "property"
})
@XmlRootElement(name = "availability-service")
public class AvailabilityService {

    @XmlAttribute(name = "availability-enabled")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String availabilityEnabled;
    @XmlAttribute(name = "ha-agent-hosts")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String haAgentHosts;
    @XmlAttribute(name = "ha-agent-port")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String haAgentPort;
    @XmlAttribute(name = "ha-agent-password")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String haAgentPassword;
    @XmlAttribute(name = "ha-store-name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String haStoreName;
    @XmlAttribute(name = "auto-manage-ha-store")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String autoManageHaStore;
    @XmlAttribute(name = "store-pool-name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String storePoolName;
    @XmlAttribute(name = "ha-store-healthcheck-enabled")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String haStoreHealthcheckEnabled;
    @XmlAttribute(name = "ha-store-healthcheck-interval-in-seconds")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String haStoreHealthcheckIntervalInSeconds;
    @XmlElement(name = "web-container-availability")
    protected WebContainerAvailability webContainerAvailability;
    @XmlElement(name = "ejb-container-availability")
    protected EjbContainerAvailability ejbContainerAvailability;
    @XmlElement(name = "jms-availability")
    protected JmsAvailability jmsAvailability;
    protected List<Property> property;

    /**
     * Gets the value of the availabilityEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilityEnabled() {
        if (availabilityEnabled == null) {
            return "true";
        } else {
            return availabilityEnabled;
        }
    }

    /**
     * Sets the value of the availabilityEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailabilityEnabled(String value) {
        this.availabilityEnabled = value;
    }

    /**
     * Gets the value of the haAgentHosts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHaAgentHosts() {
        return haAgentHosts;
    }

    /**
     * Sets the value of the haAgentHosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHaAgentHosts(String value) {
        this.haAgentHosts = value;
    }

    /**
     * Gets the value of the haAgentPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHaAgentPort() {
        return haAgentPort;
    }

    /**
     * Sets the value of the haAgentPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHaAgentPort(String value) {
        this.haAgentPort = value;
    }

    /**
     * Gets the value of the haAgentPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHaAgentPassword() {
        return haAgentPassword;
    }

    /**
     * Sets the value of the haAgentPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHaAgentPassword(String value) {
        this.haAgentPassword = value;
    }

    /**
     * Gets the value of the haStoreName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHaStoreName() {
        return haStoreName;
    }

    /**
     * Sets the value of the haStoreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHaStoreName(String value) {
        this.haStoreName = value;
    }

    /**
     * Gets the value of the autoManageHaStore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoManageHaStore() {
        if (autoManageHaStore == null) {
            return "false";
        } else {
            return autoManageHaStore;
        }
    }

    /**
     * Sets the value of the autoManageHaStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoManageHaStore(String value) {
        this.autoManageHaStore = value;
    }

    /**
     * Gets the value of the storePoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorePoolName() {
        return storePoolName;
    }

    /**
     * Sets the value of the storePoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorePoolName(String value) {
        this.storePoolName = value;
    }

    /**
     * Gets the value of the haStoreHealthcheckEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHaStoreHealthcheckEnabled() {
        if (haStoreHealthcheckEnabled == null) {
            return "false";
        } else {
            return haStoreHealthcheckEnabled;
        }
    }

    /**
     * Sets the value of the haStoreHealthcheckEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHaStoreHealthcheckEnabled(String value) {
        this.haStoreHealthcheckEnabled = value;
    }

    /**
     * Gets the value of the haStoreHealthcheckIntervalInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHaStoreHealthcheckIntervalInSeconds() {
        if (haStoreHealthcheckIntervalInSeconds == null) {
            return "5";
        } else {
            return haStoreHealthcheckIntervalInSeconds;
        }
    }

    /**
     * Sets the value of the haStoreHealthcheckIntervalInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHaStoreHealthcheckIntervalInSeconds(String value) {
        this.haStoreHealthcheckIntervalInSeconds = value;
    }

    /**
     * Gets the value of the webContainerAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link WebContainerAvailability }
     *     
     */
    public WebContainerAvailability getWebContainerAvailability() {
        return webContainerAvailability;
    }

    /**
     * Sets the value of the webContainerAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebContainerAvailability }
     *     
     */
    public void setWebContainerAvailability(WebContainerAvailability value) {
        this.webContainerAvailability = value;
    }

    /**
     * Gets the value of the ejbContainerAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link EjbContainerAvailability }
     *     
     */
    public EjbContainerAvailability getEjbContainerAvailability() {
        return ejbContainerAvailability;
    }

    /**
     * Sets the value of the ejbContainerAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link EjbContainerAvailability }
     *     
     */
    public void setEjbContainerAvailability(EjbContainerAvailability value) {
        this.ejbContainerAvailability = value;
    }

    /**
     * Gets the value of the jmsAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link JmsAvailability }
     *     
     */
    public JmsAvailability getJmsAvailability() {
        return jmsAvailability;
    }

    /**
     * Sets the value of the jmsAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JmsAvailability }
     *     
     */
    public void setJmsAvailability(JmsAvailability value) {
        this.jmsAvailability = value;
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