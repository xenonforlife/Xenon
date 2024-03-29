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
import ae.javax.xml.bind.annotation.XmlSeeAlso;
import ae.javax.xml.bind.annotation.XmlType;



/**
 * <p>Java class for AbstractSourceT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractSourceT">
 *   &lt;complexContent>
 *     &lt;extension base="{http://fdi.org/2010/client}LayoutObjectExtT">
 *       &lt;sequence>
 *         &lt;element name="Emphasis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LineColor" type="{http://fdi.org/2010/client}ColorT" minOccurs="0"/>
 *         &lt;element name="LineType" type="{http://fdi.org/2010/client}LineTypeT" minOccurs="0"/>
 *         &lt;element name="VerticalAxis" type="{http://fdi.org/2010/client}AxisT"/>
 *         &lt;element name="InitActionList" type="{http://fdi.org/2010/client}ActionListT" minOccurs="0"/>
 *         &lt;element name="RefreshActionList" type="{http://fdi.org/2010/client}ActionListT" minOccurs="0"/>
 *         &lt;element name="ExitActionList" type="{http://fdi.org/2010/client}ActionListT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractSourceT", propOrder = {
    "emphasis",
    "lineColor",
    "lineType",
    "verticalAxis",
    "initActionList",
    "refreshActionList",
    "exitActionList"
})
@XmlSeeAlso({
    SourceT.class,
    WaveformT.class
})
public abstract class AbstractSourceT
    extends LayoutObjectExtT
{

    @XmlElement(name = "Emphasis")
    protected Boolean emphasis;
    @XmlElement(name = "LineColor")
    protected String lineColor;
    @XmlElement(name = "LineType")
    protected LineTypeT lineType;
    @XmlElement(name = "VerticalAxis", required = true)
    protected AxisT verticalAxis;
    @XmlElement(name = "InitActionList")
    protected ActionListT initActionList;
    @XmlElement(name = "RefreshActionList")
    protected ActionListT refreshActionList;
    @XmlElement(name = "ExitActionList")
    protected ActionListT exitActionList;

    /**
     * Gets the value of the emphasis property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmphasis() {
        return emphasis;
    }

    /**
     * Sets the value of the emphasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmphasis(Boolean value) {
        this.emphasis = value;
    }

    /**
     * Gets the value of the lineColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineColor() {
        return lineColor;
    }

    /**
     * Sets the value of the lineColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineColor(String value) {
        this.lineColor = value;
    }

    /**
     * Gets the value of the lineType property.
     * 
     * @return
     *     possible object is
     *     {@link LineTypeT }
     *     
     */
    public LineTypeT getLineType() {
        return lineType;
    }

    /**
     * Sets the value of the lineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineTypeT }
     *     
     */
    public void setLineType(LineTypeT value) {
        this.lineType = value;
    }

    /**
     * Gets the value of the verticalAxis property.
     * 
     * @return
     *     possible object is
     *     {@link AxisT }
     *     
     */
    public AxisT getVerticalAxis() {
        return verticalAxis;
    }

    /**
     * Sets the value of the verticalAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link AxisT }
     *     
     */
    public void setVerticalAxis(AxisT value) {
        this.verticalAxis = value;
    }

    /**
     * Gets the value of the initActionList property.
     * 
     * @return
     *     possible object is
     *     {@link ActionListT }
     *     
     */
    public ActionListT getInitActionList() {
        return initActionList;
    }

    /**
     * Sets the value of the initActionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionListT }
     *     
     */
    public void setInitActionList(ActionListT value) {
        this.initActionList = value;
    }

    /**
     * Gets the value of the refreshActionList property.
     * 
     * @return
     *     possible object is
     *     {@link ActionListT }
     *     
     */
    public ActionListT getRefreshActionList() {
        return refreshActionList;
    }

    /**
     * Sets the value of the refreshActionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionListT }
     *     
     */
    public void setRefreshActionList(ActionListT value) {
        this.refreshActionList = value;
    }

    /**
     * Gets the value of the exitActionList property.
     * 
     * @return
     *     possible object is
     *     {@link ActionListT }
     *     
     */
    public ActionListT getExitActionList() {
        return exitActionList;
    }

    /**
     * Sets the value of the exitActionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionListT }
     *     
     */
    public void setExitActionList(ActionListT value) {
        this.exitActionList = value;
    }

}
