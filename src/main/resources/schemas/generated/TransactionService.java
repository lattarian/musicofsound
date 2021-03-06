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
@XmlRootElement(name = "transaction-service")
public class TransactionService {

    @XmlAttribute(name = "automatic-recovery")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String automaticRecovery;
    @XmlAttribute(name = "timeout-in-seconds")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String timeoutInSeconds;
    @XmlAttribute(name = "tx-log-dir")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String txLogDir;
    @XmlAttribute(name = "heuristic-decision")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String heuristicDecision;
    @XmlAttribute(name = "retry-timeout-in-seconds")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String retryTimeoutInSeconds;
    @XmlAttribute(name = "keypoint-interval")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String keypointInterval;
    protected List<Property> property;

    /**
     * Gets the value of the automaticRecovery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticRecovery() {
        if (automaticRecovery == null) {
            return "false";
        } else {
            return automaticRecovery;
        }
    }

    /**
     * Sets the value of the automaticRecovery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticRecovery(String value) {
        this.automaticRecovery = value;
    }

    /**
     * Gets the value of the timeoutInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeoutInSeconds() {
        if (timeoutInSeconds == null) {
            return "0";
        } else {
            return timeoutInSeconds;
        }
    }

    /**
     * Sets the value of the timeoutInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeoutInSeconds(String value) {
        this.timeoutInSeconds = value;
    }

    /**
     * Gets the value of the txLogDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxLogDir() {
        return txLogDir;
    }

    /**
     * Sets the value of the txLogDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxLogDir(String value) {
        this.txLogDir = value;
    }

    /**
     * Gets the value of the heuristicDecision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeuristicDecision() {
        if (heuristicDecision == null) {
            return "rollback";
        } else {
            return heuristicDecision;
        }
    }

    /**
     * Sets the value of the heuristicDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeuristicDecision(String value) {
        this.heuristicDecision = value;
    }

    /**
     * Gets the value of the retryTimeoutInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetryTimeoutInSeconds() {
        if (retryTimeoutInSeconds == null) {
            return "600";
        } else {
            return retryTimeoutInSeconds;
        }
    }

    /**
     * Sets the value of the retryTimeoutInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetryTimeoutInSeconds(String value) {
        this.retryTimeoutInSeconds = value;
    }

    /**
     * Gets the value of the keypointInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeypointInterval() {
        if (keypointInterval == null) {
            return "2048";
        } else {
            return keypointInterval;
        }
    }

    /**
     * Sets the value of the keypointInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeypointInterval(String value) {
        this.keypointInterval = value;
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
