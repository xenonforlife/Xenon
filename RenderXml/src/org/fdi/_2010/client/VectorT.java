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
import ae.javax.xml.bind.annotation.XmlType;


/**
 * This type specifies the content of a row or column in a grid.
 * 
 * <p>Java class for VectorT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VectorT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Heading" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Items">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;choice>
 *                     &lt;element name="Parameter" type="{http://fdi.org/2010/client}ParameterT"/>
 *                     &lt;element name="Value" type="{http://fdi.org/2010/client}VariantT"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VectorT", propOrder = {
    "heading",
    "items"
})
public class VectorT {

    @XmlElement(name = "Heading", required = true)
    protected String heading;
    @XmlElement(name = "Items", required = true)
    protected VectorT.Items items;

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeading(String value) {
        this.heading = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link VectorT.Items }
     *     
     */
    public VectorT.Items getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link VectorT.Items }
     *     
     */
    public void setItems(VectorT.Items value) {
        this.items = value;
    }


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
     *           &lt;element name="Parameter" type="{http://fdi.org/2010/client}ParameterT"/>
     *           &lt;element name="Value" type="{http://fdi.org/2010/client}VariantT"/>
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
        "parameterOrValue"
    })
    public static class Items {

        @XmlElements({
            @XmlElement(name = "Value", type = VariantT.class),
            @XmlElement(name = "Parameter", type = ParameterT.class)
        })
        protected List<Object> parameterOrValue;

        /**
         * Gets the value of the parameterOrValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameterOrValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParameterOrValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VariantT }
         * {@link ParameterT }
         * 
         * 
         */
        public List<Object> getParameterOrValue() {
            if (parameterOrValue == null) {
                parameterOrValue = new ArrayList<Object>();
            }
            return this.parameterOrValue;
        }

    }

}
