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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "applications",
    "resources",
    "configs",
    "servers",
    "clusters",
    "nodeAgents",
    "lbConfigs",
    "loadBalancers",
    "systemProperty",
    "property"
})
@XmlRootElement(name = "domain")
public class Domain {

    @XmlAttribute(name = "application-root")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String applicationRoot;
    @XmlAttribute(name = "log-root")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String logRoot;
    @XmlAttribute
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String locale;
    protected Applications applications;
    protected Resources resources;
    @XmlElement(required = true)
    protected Configs configs;
    @XmlElement(required = true)
    protected Servers servers;
    protected Clusters clusters;
    @XmlElement(name = "node-agents")
    protected NodeAgents nodeAgents;
    @XmlElement(name = "lb-configs")
    protected LbConfigs lbConfigs;
    @XmlElement(name = "load-balancers")
    protected LoadBalancers loadBalancers;
    @XmlElement(name = "system-property")
    protected List<SystemProperty> systemProperty;
    protected List<Property> property;

    /**
     * Gets the value of the applicationRoot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationRoot() {
        return applicationRoot;
    }

    /**
     * Sets the value of the applicationRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationRoot(String value) {
        this.applicationRoot = value;
    }

    /**
     * Gets the value of the logRoot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogRoot() {
        return logRoot;
    }

    /**
     * Sets the value of the logRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogRoot(String value) {
        this.logRoot = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the applications property.
     * 
     * @return
     *     possible object is
     *     {@link Applications }
     *     
     */
    public Applications getApplications() {
        return applications;
    }

    /**
     * Sets the value of the applications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Applications }
     *     
     */
    public void setApplications(Applications value) {
        this.applications = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link Resources }
     *     
     */
    public Resources getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resources }
     *     
     */
    public void setResources(Resources value) {
        this.resources = value;
    }

    /**
     * Gets the value of the configs property.
     * 
     * @return
     *     possible object is
     *     {@link Configs }
     *     
     */
    public Configs getConfigs() {
        return configs;
    }

    /**
     * Sets the value of the configs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Configs }
     *     
     */
    public void setConfigs(Configs value) {
        this.configs = value;
    }

    /**
     * Gets the value of the servers property.
     * 
     * @return
     *     possible object is
     *     {@link Servers }
     *     
     */
    public Servers getServers() {
        return servers;
    }

    /**
     * Sets the value of the servers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Servers }
     *     
     */
    public void setServers(Servers value) {
        this.servers = value;
    }

    /**
     * Gets the value of the clusters property.
     * 
     * @return
     *     possible object is
     *     {@link Clusters }
     *     
     */
    public Clusters getClusters() {
        return clusters;
    }

    /**
     * Sets the value of the clusters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Clusters }
     *     
     */
    public void setClusters(Clusters value) {
        this.clusters = value;
    }

    /**
     * Gets the value of the nodeAgents property.
     * 
     * @return
     *     possible object is
     *     {@link NodeAgents }
     *     
     */
    public NodeAgents getNodeAgents() {
        return nodeAgents;
    }

    /**
     * Sets the value of the nodeAgents property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeAgents }
     *     
     */
    public void setNodeAgents(NodeAgents value) {
        this.nodeAgents = value;
    }

    /**
     * Gets the value of the lbConfigs property.
     * 
     * @return
     *     possible object is
     *     {@link LbConfigs }
     *     
     */
    public LbConfigs getLbConfigs() {
        return lbConfigs;
    }

    /**
     * Sets the value of the lbConfigs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LbConfigs }
     *     
     */
    public void setLbConfigs(LbConfigs value) {
        this.lbConfigs = value;
    }

    /**
     * Gets the value of the loadBalancers property.
     * 
     * @return
     *     possible object is
     *     {@link LoadBalancers }
     *     
     */
    public LoadBalancers getLoadBalancers() {
        return loadBalancers;
    }

    /**
     * Sets the value of the loadBalancers property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadBalancers }
     *     
     */
    public void setLoadBalancers(LoadBalancers value) {
        this.loadBalancers = value;
    }

    /**
     * Gets the value of the systemProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemProperty }
     * 
     * 
     */
    public List<SystemProperty> getSystemProperty() {
        if (systemProperty == null) {
            systemProperty = new ArrayList<SystemProperty>();
        }
        return this.systemProperty;
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
