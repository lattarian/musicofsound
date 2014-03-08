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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "property"
})
@XmlRootElement(name = "listener-config")
public class ListenerConfig {

    @XmlAttribute(name = "listener-class-name", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String listenerClassName;
    @XmlAttribute(name = "subscribe-listener-with", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String subscribeListenerWith;
    protected List<Property> property;

    /**
     * Gets the value of the listenerClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListenerClassName() {
        return listenerClassName;
    }

    /**
     * Sets the value of the listenerClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListenerClassName(String value) {
        this.listenerClassName = value;
    }

    /**
     * Gets the value of the subscribeListenerWith property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscribeListenerWith() {
        return subscribeListenerWith;
    }

    /**
     * Sets the value of the subscribeListenerWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscribeListenerWith(String value) {
        this.subscribeListenerWith = value;
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
