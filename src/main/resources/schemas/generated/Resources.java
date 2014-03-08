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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customResourceOrExternalJndiResourceOrJdbcResourceOrMailResourceOrPersistenceManagerFactoryResourceOrAdminObjectResourceOrConnectorResourceOrResourceAdapterConfigOrJdbcConnectionPoolOrConnectorConnectionPool"
})
@XmlRootElement(name = "resources")
public class Resources {

    @XmlElements({
        @XmlElement(name = "custom-resource", type = CustomResource.class),
        @XmlElement(name = "external-jndi-resource", type = ExternalJndiResource.class),
        @XmlElement(name = "jdbc-resource", type = JdbcResource.class),
        @XmlElement(name = "mail-resource", type = MailResource.class),
        @XmlElement(name = "persistence-manager-factory-resource", type = PersistenceManagerFactoryResource.class),
        @XmlElement(name = "admin-object-resource", type = AdminObjectResource.class),
        @XmlElement(name = "connector-resource", type = ConnectorResource.class),
        @XmlElement(name = "resource-adapter-config", type = ResourceAdapterConfig.class),
        @XmlElement(name = "jdbc-connection-pool", type = JdbcConnectionPool.class),
        @XmlElement(name = "connector-connection-pool", type = ConnectorConnectionPool.class)
    })
    protected List<Object> customResourceOrExternalJndiResourceOrJdbcResourceOrMailResourceOrPersistenceManagerFactoryResourceOrAdminObjectResourceOrConnectorResourceOrResourceAdapterConfigOrJdbcConnectionPoolOrConnectorConnectionPool;

    /**
     * Gets the value of the customResourceOrExternalJndiResourceOrJdbcResourceOrMailResourceOrPersistenceManagerFactoryResourceOrAdminObjectResourceOrConnectorResourceOrResourceAdapterConfigOrJdbcConnectionPoolOrConnectorConnectionPool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customResourceOrExternalJndiResourceOrJdbcResourceOrMailResourceOrPersistenceManagerFactoryResourceOrAdminObjectResourceOrConnectorResourceOrResourceAdapterConfigOrJdbcConnectionPoolOrConnectorConnectionPool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomResourceOrExternalJndiResourceOrJdbcResourceOrMailResourceOrPersistenceManagerFactoryResourceOrAdminObjectResourceOrConnectorResourceOrResourceAdapterConfigOrJdbcConnectionPoolOrConnectorConnectionPool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomResource }
     * {@link ExternalJndiResource }
     * {@link JdbcResource }
     * {@link MailResource }
     * {@link PersistenceManagerFactoryResource }
     * {@link AdminObjectResource }
     * {@link ConnectorResource }
     * {@link ResourceAdapterConfig }
     * {@link JdbcConnectionPool }
     * {@link ConnectorConnectionPool }
     * 
     * 
     */
    public List<Object> getCustomResourceOrExternalJndiResourceOrJdbcResourceOrMailResourceOrPersistenceManagerFactoryResourceOrAdminObjectResourceOrConnectorResourceOrResourceAdapterConfigOrJdbcConnectionPoolOrConnectorConnectionPool() {
        if (customResourceOrExternalJndiResourceOrJdbcResourceOrMailResourceOrPersistenceManagerFactoryResourceOrAdminObjectResourceOrConnectorResourceOrResourceAdapterConfigOrJdbcConnectionPoolOrConnectorConnectionPool == null) {
            customResourceOrExternalJndiResourceOrJdbcResourceOrMailResourceOrPersistenceManagerFactoryResourceOrAdminObjectResourceOrConnectorResourceOrResourceAdapterConfigOrJdbcConnectionPoolOrConnectorConnectionPool = new ArrayList<Object>();
        }
        return this.customResourceOrExternalJndiResourceOrJdbcResourceOrMailResourceOrPersistenceManagerFactoryResourceOrAdminObjectResourceOrConnectorResourceOrResourceAdapterConfigOrJdbcConnectionPoolOrConnectorConnectionPool;
    }

}
