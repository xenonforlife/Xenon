//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.19 at 03:00:30 PM MEZ 
//


package org.fdi._2010.client;

import ae.javax.xml.bind.annotation.XmlEnum;
import ae.javax.xml.bind.annotation.XmlEnumValue;
import ae.javax.xml.bind.annotation.XmlType;



/**
 * <p>Java class for ColorNameT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ColorNameT">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Agua"/>
 *     &lt;enumeration value="Black"/>
 *     &lt;enumeration value="Blue"/>
 *     &lt;enumeration value="Fuchsia"/>
 *     &lt;enumeration value="Gray"/>
 *     &lt;enumeration value="Green"/>
 *     &lt;enumeration value="Lime"/>
 *     &lt;enumeration value="Maroon"/>
 *     &lt;enumeration value="Navy"/>
 *     &lt;enumeration value="Olive"/>
 *     &lt;enumeration value="Purple"/>
 *     &lt;enumeration value="Red"/>
 *     &lt;enumeration value="Silver"/>
 *     &lt;enumeration value="Teal"/>
 *     &lt;enumeration value="White"/>
 *     &lt;enumeration value="Yellow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ColorNameT")
@XmlEnum
public enum ColorNameT {


    /**
     * RGB value #00FFFF.
     * 
     */
    @XmlEnumValue("Agua")
    AGUA("Agua"),

    /**
     * RGB value #000000.
     * 
     */
    @XmlEnumValue("Black")
    BLACK("Black"),

    /**
     * RGB value #0000FF.
     * 
     */
    @XmlEnumValue("Blue")
    BLUE("Blue"),

    /**
     * RGB value #FF00FF.
     * 
     */
    @XmlEnumValue("Fuchsia")
    FUCHSIA("Fuchsia"),

    /**
     * RGB value #808080.
     * 
     */
    @XmlEnumValue("Gray")
    GRAY("Gray"),

    /**
     * RGB value #008000.
     * 
     */
    @XmlEnumValue("Green")
    GREEN("Green"),

    /**
     * RGB value #00FF00.
     * 
     */
    @XmlEnumValue("Lime")
    LIME("Lime"),

    /**
     * RGB value #800000.
     * 
     */
    @XmlEnumValue("Maroon")
    MAROON("Maroon"),

    /**
     * RGB value #000080.
     * 
     */
    @XmlEnumValue("Navy")
    NAVY("Navy"),

    /**
     * RGB value #808000.
     * 
     */
    @XmlEnumValue("Olive")
    OLIVE("Olive"),

    /**
     * RGB value #800080.
     * 
     */
    @XmlEnumValue("Purple")
    PURPLE("Purple"),

    /**
     * RGB value #FF0000.
     * 
     */
    @XmlEnumValue("Red")
    RED("Red"),

    /**
     * RGB value #C0C0C0.
     * 
     */
    @XmlEnumValue("Silver")
    SILVER("Silver"),

    /**
     * RGB value #008080.
     * 
     */
    @XmlEnumValue("Teal")
    TEAL("Teal"),

    /**
     * RGB value #FFFFFF.
     * 
     */
    @XmlEnumValue("White")
    WHITE("White"),

    /**
     * RGB value #FFFF00.
     * 
     */
    @XmlEnumValue("Yellow")
    YELLOW("Yellow");
    private final String value;

    ColorNameT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ColorNameT fromValue(String v) {
        for (ColorNameT c: ColorNameT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}