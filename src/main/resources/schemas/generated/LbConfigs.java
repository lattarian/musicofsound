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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lbConfig"
})
@XmlRootElement(name = "lb-configs")
public class LbConfigs {

    @XmlElement(name = "lb-config")
    protected List<LbConfig> lbConfig;

    /**
     * Gets the value of the lbConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lbConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLbConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LbConfig }
     * 
     * 
     */
    public List<LbConfig> getLbConfig() {
        if (lbConfig == null) {
            lbConfig = new ArrayList<LbConfig>();
        }
        return this.lbConfig;
    }

}
