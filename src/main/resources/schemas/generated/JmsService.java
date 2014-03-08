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
    "jmsHost",
    "property"
})
@XmlRootElement(name = "jms-service")
public class JmsService {

    @XmlAttribute(name = "init-timeout-in-seconds")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String initTimeoutInSeconds;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "start-args")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String startArgs;
    @XmlAttribute(name = "default-jms-host")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String defaultJmsHost;
    @XmlAttribute(name = "reconnect-interval-in-seconds")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String reconnectIntervalInSeconds;
    @XmlAttribute(name = "reconnect-attempts")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String reconnectAttempts;
    @XmlAttribute(name = "reconnect-enabled")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String reconnectEnabled;
    @XmlAttribute(name = "addresslist-behavior")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String addresslistBehavior;
    @XmlAttribute(name = "addresslist-iterations")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String addresslistIterations;
    @XmlAttribute(name = "mq-scheme")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mqScheme;
    @XmlAttribute(name = "mq-service")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mqService;
    @XmlElement(name = "jms-host")
    protected List<JmsHost> jmsHost;
    protected List<Property> property;

    /**
     * Gets the value of the initTimeoutInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitTimeoutInSeconds() {
        if (initTimeoutInSeconds == null) {
            return "60";
        } else {
            return initTimeoutInSeconds;
        }
    }

    /**
     * Sets the value of the initTimeoutInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitTimeoutInSeconds(String value) {
        this.initTimeoutInSeconds = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the startArgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartArgs() {
        return startArgs;
    }

    /**
     * Sets the value of the startArgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartArgs(String value) {
        this.startArgs = value;
    }

    /**
     * Gets the value of the defaultJmsHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultJmsHost() {
        return defaultJmsHost;
    }

    /**
     * Sets the value of the defaultJmsHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultJmsHost(String value) {
        this.defaultJmsHost = value;
    }

    /**
     * Gets the value of the reconnectIntervalInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconnectIntervalInSeconds() {
        if (reconnectIntervalInSeconds == null) {
            return "5";
        } else {
            return reconnectIntervalInSeconds;
        }
    }

    /**
     * Sets the value of the reconnectIntervalInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconnectIntervalInSeconds(String value) {
        this.reconnectIntervalInSeconds = value;
    }

    /**
     * Gets the value of the reconnectAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconnectAttempts() {
        if (reconnectAttempts == null) {
            return "3";
        } else {
            return reconnectAttempts;
        }
    }

    /**
     * Sets the value of the reconnectAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconnectAttempts(String value) {
        this.reconnectAttempts = value;
    }

    /**
     * Gets the value of the reconnectEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconnectEnabled() {
        if (reconnectEnabled == null) {
            return "true";
        } else {
            return reconnectEnabled;
        }
    }

    /**
     * Sets the value of the reconnectEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconnectEnabled(String value) {
        this.reconnectEnabled = value;
    }

    /**
     * Gets the value of the addresslistBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresslistBehavior() {
        if (addresslistBehavior == null) {
            return "random";
        } else {
            return addresslistBehavior;
        }
    }

    /**
     * Sets the value of the addresslistBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresslistBehavior(String value) {
        this.addresslistBehavior = value;
    }

    /**
     * Gets the value of the addresslistIterations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresslistIterations() {
        if (addresslistIterations == null) {
            return "3";
        } else {
            return addresslistIterations;
        }
    }

    /**
     * Sets the value of the addresslistIterations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresslistIterations(String value) {
        this.addresslistIterations = value;
    }

    /**
     * Gets the value of the mqScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMqScheme() {
        return mqScheme;
    }

    /**
     * Sets the value of the mqScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMqScheme(String value) {
        this.mqScheme = value;
    }

    /**
     * Gets the value of the mqService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMqService() {
        return mqService;
    }

    /**
     * Sets the value of the mqService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMqService(String value) {
        this.mqService = value;
    }

    /**
     * Gets the value of the jmsHost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jmsHost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJmsHost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JmsHost }
     * 
     * 
     */
    public List<JmsHost> getJmsHost() {
        if (jmsHost == null) {
            jmsHost = new ArrayList<JmsHost>();
        }
        return this.jmsHost;
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
