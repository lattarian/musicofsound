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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "connection-pool")
public class ConnectionPool {

    @XmlAttribute(name = "queue-size-in-bytes")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String queueSizeInBytes;
    @XmlAttribute(name = "max-pending-count")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String maxPendingCount;
    @XmlAttribute(name = "receive-buffer-size-in-bytes")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String receiveBufferSizeInBytes;
    @XmlAttribute(name = "send-buffer-size-in-bytes")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sendBufferSizeInBytes;

    /**
     * Gets the value of the queueSizeInBytes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueSizeInBytes() {
        if (queueSizeInBytes == null) {
            return "4096";
        } else {
            return queueSizeInBytes;
        }
    }

    /**
     * Sets the value of the queueSizeInBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueSizeInBytes(String value) {
        this.queueSizeInBytes = value;
    }

    /**
     * Gets the value of the maxPendingCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPendingCount() {
        if (maxPendingCount == null) {
            return "4096";
        } else {
            return maxPendingCount;
        }
    }

    /**
     * Sets the value of the maxPendingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPendingCount(String value) {
        this.maxPendingCount = value;
    }

    /**
     * Gets the value of the receiveBufferSizeInBytes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveBufferSizeInBytes() {
        if (receiveBufferSizeInBytes == null) {
            return "4096";
        } else {
            return receiveBufferSizeInBytes;
        }
    }

    /**
     * Sets the value of the receiveBufferSizeInBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveBufferSizeInBytes(String value) {
        this.receiveBufferSizeInBytes = value;
    }

    /**
     * Gets the value of the sendBufferSizeInBytes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendBufferSizeInBytes() {
        if (sendBufferSizeInBytes == null) {
            return "8192";
        } else {
            return sendBufferSizeInBytes;
        }
    }

    /**
     * Sets the value of the sendBufferSizeInBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendBufferSizeInBytes(String value) {
        this.sendBufferSizeInBytes = value;
    }

}
