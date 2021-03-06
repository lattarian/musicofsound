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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "property"
})
@XmlRootElement(name = "das-config")
public class DasConfig {

    @XmlAttribute(name = "dynamic-reload-enabled")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dynamicReloadEnabled;
    @XmlAttribute(name = "dynamic-reload-poll-interval-in-seconds")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dynamicReloadPollIntervalInSeconds;
    @XmlAttribute(name = "autodeploy-enabled")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String autodeployEnabled;
    @XmlAttribute(name = "autodeploy-polling-interval-in-seconds")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String autodeployPollingIntervalInSeconds;
    @XmlAttribute(name = "autodeploy-dir")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String autodeployDir;
    @XmlAttribute(name = "autodeploy-verifier-enabled")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String autodeployVerifierEnabled;
    @XmlAttribute(name = "autodeploy-jsp-precompilation-enabled")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String autodeployJspPrecompilationEnabled;
    @XmlAttribute(name = "deploy-xml-validation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deployXmlValidation;
    @XmlAttribute(name = "admin-session-timeout-in-minutes")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String adminSessionTimeoutInMinutes;
    protected List<Property> property;

    /**
     * Gets the value of the dynamicReloadEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicReloadEnabled() {
        if (dynamicReloadEnabled == null) {
            return "false";
        } else {
            return dynamicReloadEnabled;
        }
    }

    /**
     * Sets the value of the dynamicReloadEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicReloadEnabled(String value) {
        this.dynamicReloadEnabled = value;
    }

    /**
     * Gets the value of the dynamicReloadPollIntervalInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicReloadPollIntervalInSeconds() {
        if (dynamicReloadPollIntervalInSeconds == null) {
            return "2";
        } else {
            return dynamicReloadPollIntervalInSeconds;
        }
    }

    /**
     * Sets the value of the dynamicReloadPollIntervalInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicReloadPollIntervalInSeconds(String value) {
        this.dynamicReloadPollIntervalInSeconds = value;
    }

    /**
     * Gets the value of the autodeployEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutodeployEnabled() {
        if (autodeployEnabled == null) {
            return "false";
        } else {
            return autodeployEnabled;
        }
    }

    /**
     * Sets the value of the autodeployEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutodeployEnabled(String value) {
        this.autodeployEnabled = value;
    }

    /**
     * Gets the value of the autodeployPollingIntervalInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutodeployPollingIntervalInSeconds() {
        if (autodeployPollingIntervalInSeconds == null) {
            return "2";
        } else {
            return autodeployPollingIntervalInSeconds;
        }
    }

    /**
     * Sets the value of the autodeployPollingIntervalInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutodeployPollingIntervalInSeconds(String value) {
        this.autodeployPollingIntervalInSeconds = value;
    }

    /**
     * Gets the value of the autodeployDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutodeployDir() {
        if (autodeployDir == null) {
            return "autodeploy";
        } else {
            return autodeployDir;
        }
    }

    /**
     * Sets the value of the autodeployDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutodeployDir(String value) {
        this.autodeployDir = value;
    }

    /**
     * Gets the value of the autodeployVerifierEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutodeployVerifierEnabled() {
        if (autodeployVerifierEnabled == null) {
            return "false";
        } else {
            return autodeployVerifierEnabled;
        }
    }

    /**
     * Sets the value of the autodeployVerifierEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutodeployVerifierEnabled(String value) {
        this.autodeployVerifierEnabled = value;
    }

    /**
     * Gets the value of the autodeployJspPrecompilationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutodeployJspPrecompilationEnabled() {
        if (autodeployJspPrecompilationEnabled == null) {
            return "false";
        } else {
            return autodeployJspPrecompilationEnabled;
        }
    }

    /**
     * Sets the value of the autodeployJspPrecompilationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutodeployJspPrecompilationEnabled(String value) {
        this.autodeployJspPrecompilationEnabled = value;
    }

    /**
     * Gets the value of the deployXmlValidation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeployXmlValidation() {
        if (deployXmlValidation == null) {
            return "full";
        } else {
            return deployXmlValidation;
        }
    }

    /**
     * Sets the value of the deployXmlValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeployXmlValidation(String value) {
        this.deployXmlValidation = value;
    }

    /**
     * Gets the value of the adminSessionTimeoutInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminSessionTimeoutInMinutes() {
        if (adminSessionTimeoutInMinutes == null) {
            return "60";
        } else {
            return adminSessionTimeoutInMinutes;
        }
    }

    /**
     * Sets the value of the adminSessionTimeoutInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminSessionTimeoutInMinutes(String value) {
        this.adminSessionTimeoutInMinutes = value;
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
