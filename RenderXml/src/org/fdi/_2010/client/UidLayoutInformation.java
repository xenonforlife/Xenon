//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.19 at 03:00:30 PM MEZ 
//


package org.fdi._2010.client;

import java.util.ArrayList;
import java.util.List;
import ae.javax.xml.bind.annotation.XmlAccessType;
import ae.javax.xml.bind.annotation.XmlAccessorType;
import ae.javax.xml.bind.annotation.XmlElement;
import ae.javax.xml.bind.annotation.XmlElements;
import ae.javax.xml.bind.annotation.XmlRootElement;
import ae.javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;choice>
 *           &lt;element name="Menu" type="{http://fdi.org/2010/client}MenuT"/>
 *           &lt;element name="Page" type="{http://fdi.org/2010/client}PageT"/>
 *           &lt;element name="Group" type="{http://fdi.org/2010/client}GroupT"/>
 *           &lt;element name="Dialog" type="{http://fdi.org/2010/client}DialogT"/>
 *           &lt;element name="Table" type="{http://fdi.org/2010/client}TableT"/>
 *           &lt;element name="Window" type="{http://fdi.org/2010/client}WindowT"/>
 *           &lt;element name="ActionRequest" type="{http://fdi.org/2010/client}ActionRequestT"/>
 *           &lt;element name="ActionResponse" type="{http://fdi.org/2010/client}ActionResponseT"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "menuOrPageOrGroup"
})
@XmlRootElement(name = "UidLayoutInformation")
public class UidLayoutInformation {

    @XmlElements({
        @XmlElement(name = "ActionRequest", type = ActionRequestT.class),
        @XmlElement(name = "Menu", type = MenuT.class),
        @XmlElement(name = "ActionResponse", type = ActionResponseT.class),
        @XmlElement(name = "Page", type = PageT.class),
        @XmlElement(name = "Dialog", type = DialogT.class),
        @XmlElement(name = "Window", type = WindowT.class),
        @XmlElement(name = "Group", type = GroupT.class),
        @XmlElement(name = "Table", type = TableT.class)
    })
    protected List<Object> menuOrPageOrGroup;

    /**
     * Gets the value of the menuOrPageOrGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the menuOrPageOrGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMenuOrPageOrGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionRequestT }
     * {@link MenuT }
     * {@link ActionResponseT }
     * {@link PageT }
     * {@link DialogT }
     * {@link WindowT }
     * {@link GroupT }
     * {@link TableT }
     * 
     * 
     */
    public List<Object> getMenuOrPageOrGroup() {
        if (menuOrPageOrGroup == null) {
            menuOrPageOrGroup = new ArrayList<Object>();
        }
        return this.menuOrPageOrGroup;
    }

}