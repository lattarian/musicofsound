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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "property"
})
@XmlRootElement(name = "module-log-levels")
public class ModuleLogLevels {

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String root;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String server;
    @XmlAttribute(name = "ejb-container")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ejbContainer;
    @XmlAttribute(name = "cmp-container")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cmpContainer;
    @XmlAttribute(name = "mdb-container")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mdbContainer;
    @XmlAttribute(name = "web-container")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String webContainer;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String classloader;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String configuration;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String naming;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String security;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String jts;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String jta;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String admin;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deployment;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String verifier;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String jaxr;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String jaxrpc;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String saaj;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String corba;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String javamail;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String jms;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String connector;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String jdo;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cmp;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String util;
    @XmlAttribute(name = "resource-adapter")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String resourceAdapter;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String synchronization;
    @XmlAttribute(name = "node-agent")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nodeAgent;
    @XmlAttribute(name = "self-management")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String selfManagement;
    @XmlAttribute(name = "group-management-service")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String groupManagementService;
    @XmlAttribute(name = "management-event")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String managementEvent;
    protected List<Property> property;

    /**
     * Gets the value of the root property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoot() {
        if (root == null) {
            return "INFO";
        } else {
            return root;
        }
    }

    /**
     * Sets the value of the root property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoot(String value) {
        this.root = value;
    }

    /**
     * Gets the value of the server property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServer() {
        if (server == null) {
            return "INFO";
        } else {
            return server;
        }
    }

    /**
     * Sets the value of the server property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServer(String value) {
        this.server = value;
    }

    /**
     * Gets the value of the ejbContainer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEjbContainer() {
        if (ejbContainer == null) {
            return "INFO";
        } else {
            return ejbContainer;
        }
    }

    /**
     * Sets the value of the ejbContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEjbContainer(String value) {
        this.ejbContainer = value;
    }

    /**
     * Gets the value of the cmpContainer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmpContainer() {
        if (cmpContainer == null) {
            return "INFO";
        } else {
            return cmpContainer;
        }
    }

    /**
     * Sets the value of the cmpContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmpContainer(String value) {
        this.cmpContainer = value;
    }

    /**
     * Gets the value of the mdbContainer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdbContainer() {
        if (mdbContainer == null) {
            return "INFO";
        } else {
            return mdbContainer;
        }
    }

    /**
     * Sets the value of the mdbContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdbContainer(String value) {
        this.mdbContainer = value;
    }

    /**
     * Gets the value of the webContainer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebContainer() {
        if (webContainer == null) {
            return "INFO";
        } else {
            return webContainer;
        }
    }

    /**
     * Sets the value of the webContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebContainer(String value) {
        this.webContainer = value;
    }

    /**
     * Gets the value of the classloader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassloader() {
        if (classloader == null) {
            return "INFO";
        } else {
            return classloader;
        }
    }

    /**
     * Sets the value of the classloader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassloader(String value) {
        this.classloader = value;
    }

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfiguration() {
        if (configuration == null) {
            return "INFO";
        } else {
            return configuration;
        }
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfiguration(String value) {
        this.configuration = value;
    }

    /**
     * Gets the value of the naming property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaming() {
        if (naming == null) {
            return "INFO";
        } else {
            return naming;
        }
    }

    /**
     * Sets the value of the naming property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaming(String value) {
        this.naming = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurity() {
        if (security == null) {
            return "INFO";
        } else {
            return security;
        }
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurity(String value) {
        this.security = value;
    }

    /**
     * Gets the value of the jts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJts() {
        if (jts == null) {
            return "INFO";
        } else {
            return jts;
        }
    }

    /**
     * Sets the value of the jts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJts(String value) {
        this.jts = value;
    }

    /**
     * Gets the value of the jta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJta() {
        if (jta == null) {
            return "INFO";
        } else {
            return jta;
        }
    }

    /**
     * Sets the value of the jta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJta(String value) {
        this.jta = value;
    }

    /**
     * Gets the value of the admin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmin() {
        if (admin == null) {
            return "INFO";
        } else {
            return admin;
        }
    }

    /**
     * Sets the value of the admin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmin(String value) {
        this.admin = value;
    }

    /**
     * Gets the value of the deployment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeployment() {
        if (deployment == null) {
            return "INFO";
        } else {
            return deployment;
        }
    }

    /**
     * Sets the value of the deployment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeployment(String value) {
        this.deployment = value;
    }

    /**
     * Gets the value of the verifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifier() {
        if (verifier == null) {
            return "INFO";
        } else {
            return verifier;
        }
    }

    /**
     * Sets the value of the verifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifier(String value) {
        this.verifier = value;
    }

    /**
     * Gets the value of the jaxr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJaxr() {
        if (jaxr == null) {
            return "INFO";
        } else {
            return jaxr;
        }
    }

    /**
     * Sets the value of the jaxr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJaxr(String value) {
        this.jaxr = value;
    }

    /**
     * Gets the value of the jaxrpc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJaxrpc() {
        if (jaxrpc == null) {
            return "INFO";
        } else {
            return jaxrpc;
        }
    }

    /**
     * Sets the value of the jaxrpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJaxrpc(String value) {
        this.jaxrpc = value;
    }

    /**
     * Gets the value of the saaj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaaj() {
        if (saaj == null) {
            return "INFO";
        } else {
            return saaj;
        }
    }

    /**
     * Sets the value of the saaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaaj(String value) {
        this.saaj = value;
    }

    /**
     * Gets the value of the corba property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorba() {
        if (corba == null) {
            return "INFO";
        } else {
            return corba;
        }
    }

    /**
     * Sets the value of the corba property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorba(String value) {
        this.corba = value;
    }

    /**
     * Gets the value of the javamail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJavamail() {
        if (javamail == null) {
            return "INFO";
        } else {
            return javamail;
        }
    }

    /**
     * Sets the value of the javamail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJavamail(String value) {
        this.javamail = value;
    }

    /**
     * Gets the value of the jms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJms() {
        if (jms == null) {
            return "INFO";
        } else {
            return jms;
        }
    }

    /**
     * Sets the value of the jms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJms(String value) {
        this.jms = value;
    }

    /**
     * Gets the value of the connector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnector() {
        if (connector == null) {
            return "INFO";
        } else {
            return connector;
        }
    }

    /**
     * Sets the value of the connector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnector(String value) {
        this.connector = value;
    }

    /**
     * Gets the value of the jdo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJdo() {
        if (jdo == null) {
            return "INFO";
        } else {
            return jdo;
        }
    }

    /**
     * Sets the value of the jdo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJdo(String value) {
        this.jdo = value;
    }

    /**
     * Gets the value of the cmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmp() {
        if (cmp == null) {
            return "INFO";
        } else {
            return cmp;
        }
    }

    /**
     * Sets the value of the cmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmp(String value) {
        this.cmp = value;
    }

    /**
     * Gets the value of the util property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtil() {
        if (util == null) {
            return "INFO";
        } else {
            return util;
        }
    }

    /**
     * Sets the value of the util property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtil(String value) {
        this.util = value;
    }

    /**
     * Gets the value of the resourceAdapter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceAdapter() {
        if (resourceAdapter == null) {
            return "INFO";
        } else {
            return resourceAdapter;
        }
    }

    /**
     * Sets the value of the resourceAdapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceAdapter(String value) {
        this.resourceAdapter = value;
    }

    /**
     * Gets the value of the synchronization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynchronization() {
        if (synchronization == null) {
            return "INFO";
        } else {
            return synchronization;
        }
    }

    /**
     * Sets the value of the synchronization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynchronization(String value) {
        this.synchronization = value;
    }

    /**
     * Gets the value of the nodeAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeAgent() {
        if (nodeAgent == null) {
            return "INFO";
        } else {
            return nodeAgent;
        }
    }

    /**
     * Sets the value of the nodeAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeAgent(String value) {
        this.nodeAgent = value;
    }

    /**
     * Gets the value of the selfManagement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfManagement() {
        if (selfManagement == null) {
            return "INFO";
        } else {
            return selfManagement;
        }
    }

    /**
     * Sets the value of the selfManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfManagement(String value) {
        this.selfManagement = value;
    }

    /**
     * Gets the value of the groupManagementService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupManagementService() {
        if (groupManagementService == null) {
            return "INFO";
        } else {
            return groupManagementService;
        }
    }

    /**
     * Sets the value of the groupManagementService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupManagementService(String value) {
        this.groupManagementService = value;
    }

    /**
     * Gets the value of the managementEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementEvent() {
        if (managementEvent == null) {
            return "INFO";
        } else {
            return managementEvent;
        }
    }

    /**
     * Sets the value of the managementEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementEvent(String value) {
        this.managementEvent = value;
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
