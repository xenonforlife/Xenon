//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.19 at 03:00:30 PM MEZ 
//


package org.fdi._2010.client;

import ae.javax.xml.bind.annotation.XmlAccessType;
import ae.javax.xml.bind.annotation.XmlAccessorType;
import ae.javax.xml.bind.annotation.XmlElement;
import ae.javax.xml.bind.annotation.XmlType;



/**
 * This type specifies the type of an integer or floating point value.
 * 
 * <p>Java class for NumericT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumericT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataType" type="{http://fdi.org/2010/client}NumericDataT"/>
 *         &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EditFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RangeList" type="{http://fdi.org/2010/client}RangeListT" minOccurs="0"/>
 *         &lt;element name="PresetValueList" type="{http://fdi.org/2010/client}PresetValueListT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumericT", propOrder = {
    "dataType",
    "units",
    "displayFormat",
    "editFormat",
    "rangeList",
    "presetValueList"
})
public class NumericT {

    @XmlElement(name = "DataType", required = true)
    protected NumericDataT dataType;
    @XmlElement(name = "Units")
    protected String units;
    @XmlElement(name = "DisplayFormat")
    protected String displayFormat;
    @XmlElement(name = "EditFormat")
    protected String editFormat;
    @XmlElement(name = "RangeList")
    protected RangeListT rangeList;
    @XmlElement(name = "PresetValueList")
    protected PresetValueListT presetValueList;

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link NumericDataT }
     *     
     */
    public NumericDataT getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericDataT }
     *     
     */
    public void setDataType(NumericDataT value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    /**
     * Gets the value of the displayFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayFormat() {
        return displayFormat;
    }

    /**
     * Sets the value of the displayFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayFormat(String value) {
        this.displayFormat = value;
    }

    /**
     * Gets the value of the editFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditFormat() {
        return editFormat;
    }

    /**
     * Sets the value of the editFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditFormat(String value) {
        this.editFormat = value;
    }

    /**
     * Gets the value of the rangeList property.
     * 
     * @return
     *     possible object is
     *     {@link RangeListT }
     *     
     */
    public RangeListT getRangeList() {
        return rangeList;
    }

    /**
     * Sets the value of the rangeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeListT }
     *     
     */
    public void setRangeList(RangeListT value) {
        this.rangeList = value;
    }

    /**
     * Gets the value of the presetValueList property.
     * 
     * @return
     *     possible object is
     *     {@link PresetValueListT }
     *     
     */
    public PresetValueListT getPresetValueList() {
        return presetValueList;
    }

    /**
     * Sets the value of the presetValueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresetValueListT }
     *     
     */
    public void setPresetValueList(PresetValueListT value) {
        this.presetValueList = value;
    }

}
