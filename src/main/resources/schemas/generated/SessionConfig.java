//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.03 at 07:23:17 PM BRT 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionManager",
    "sessionProperties"
})
@XmlRootElement(name = "session-config")
public class SessionConfig {

    @XmlElement(name = "session-manager")
    protected SessionManager sessionManager;
    @XmlElement(name = "session-properties")
    protected SessionProperties sessionProperties;

    /**
     * Gets the value of the sessionManager property.
     * 
     * @return
     *     possible object is
     *     {@link SessionManager }
     *     
     */
    public SessionManager getSessionManager() {
        return sessionManager;
    }

    /**
     * Sets the value of the sessionManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionManager }
     *     
     */
    public void setSessionManager(SessionManager value) {
        this.sessionManager = value;
    }

    /**
     * Gets the value of the sessionProperties property.
     * 
     * @return
     *     possible object is
     *     {@link SessionProperties }
     *     
     */
    public SessionProperties getSessionProperties() {
        return sessionProperties;
    }

    /**
     * Sets the value of the sessionProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionProperties }
     *     
     */
    public void setSessionProperties(SessionProperties value) {
        this.sessionProperties = value;
    }

}