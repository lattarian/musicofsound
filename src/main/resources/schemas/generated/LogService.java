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
    "moduleLogLevels",
    "property"
})
@XmlRootElement(name = "log-service")
public class LogService {

    @XmlAttribute
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String file;
    @XmlAttribute(name = "use-system-logging")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String useSystemLogging;
    @XmlAttribute(name = "log-handler")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String logHandler;
    @XmlAttribute(name = "log-filter")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String logFilter;
    @XmlAttribute(name = "log-to-console")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String logToConsole;
    @XmlAttribute(name = "log-rotation-limit-in-bytes")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String logRotationLimitInBytes;
    @XmlAttribute(name = "log-rotation-timelimit-in-minutes")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String logRotationTimelimitInMinutes;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String alarms;
    @XmlAttribute(name = "retain-error-statistics-for-hours")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String retainErrorStatisticsForHours;
    @XmlElement(name = "module-log-levels")
    protected ModuleLogLevels moduleLogLevels;
    protected List<Property> property;

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
    }

    /**
     * Gets the value of the useSystemLogging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseSystemLogging() {
        if (useSystemLogging == null) {
            return "false";
        } else {
            return useSystemLogging;
        }
    }

    /**
     * Sets the value of the useSystemLogging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseSystemLogging(String value) {
        this.useSystemLogging = value;
    }

    /**
     * Gets the value of the logHandler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogHandler() {
        return logHandler;
    }

    /**
     * Sets the value of the logHandler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogHandler(String value) {
        this.logHandler = value;
    }

    /**
     * Gets the value of the logFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogFilter() {
        return logFilter;
    }

    /**
     * Sets the value of the logFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogFilter(String value) {
        this.logFilter = value;
    }

    /**
     * Gets the value of the logToConsole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogToConsole() {
        if (logToConsole == null) {
            return "false";
        } else {
            return logToConsole;
        }
    }

    /**
     * Sets the value of the logToConsole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogToConsole(String value) {
        this.logToConsole = value;
    }

    /**
     * Gets the value of the logRotationLimitInBytes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogRotationLimitInBytes() {
        if (logRotationLimitInBytes == null) {
            return "500000";
        } else {
            return logRotationLimitInBytes;
        }
    }

    /**
     * Sets the value of the logRotationLimitInBytes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogRotationLimitInBytes(String value) {
        this.logRotationLimitInBytes = value;
    }

    /**
     * Gets the value of the logRotationTimelimitInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogRotationTimelimitInMinutes() {
        if (logRotationTimelimitInMinutes == null) {
            return "0";
        } else {
            return logRotationTimelimitInMinutes;
        }
    }

    /**
     * Sets the value of the logRotationTimelimitInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogRotationTimelimitInMinutes(String value) {
        this.logRotationTimelimitInMinutes = value;
    }

    /**
     * Gets the value of the alarms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlarms() {
        if (alarms == null) {
            return "false";
        } else {
            return alarms;
        }
    }

    /**
     * Sets the value of the alarms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlarms(String value) {
        this.alarms = value;
    }

    /**
     * Gets the value of the retainErrorStatisticsForHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetainErrorStatisticsForHours() {
        if (retainErrorStatisticsForHours == null) {
            return "5";
        } else {
            return retainErrorStatisticsForHours;
        }
    }

    /**
     * Sets the value of the retainErrorStatisticsForHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetainErrorStatisticsForHours(String value) {
        this.retainErrorStatisticsForHours = value;
    }

    /**
     * Gets the value of the moduleLogLevels property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleLogLevels }
     *     
     */
    public ModuleLogLevels getModuleLogLevels() {
        return moduleLogLevels;
    }

    /**
     * Sets the value of the moduleLogLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleLogLevels }
     *     
     */
    public void setModuleLogLevels(ModuleLogLevels value) {
        this.moduleLogLevels = value;
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
