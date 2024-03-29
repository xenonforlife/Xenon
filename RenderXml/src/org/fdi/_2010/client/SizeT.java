//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.19 at 03:00:30 PM MEZ 
//


package org.fdi._2010.client;

import ae.javax.xml.bind.annotation.XmlEnum;
import ae.javax.xml.bind.annotation.XmlType;



/**
 * <p>Java class for SizeT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SizeT">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="XX_SMALL"/>
 *     &lt;enumeration value="X_SMALL"/>
 *     &lt;enumeration value="SMALL"/>
 *     &lt;enumeration value="MEDIUM"/>
 *     &lt;enumeration value="LARGE"/>
 *     &lt;enumeration value="X_LARGE"/>
 *     &lt;enumeration value="XX_LARGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SizeT")
@XmlEnum
public enum SizeT {


    /**
     * Extra extra small.
     * 
     */
    XX_SMALL,

    /**
     * Extra small.
     * 
     */
    X_SMALL,

    /**
     * Small.
     * 
     */
    SMALL,

    /**
     * Medium.
     * 
     */
    MEDIUM,

    /**
     * Large.
     * 
     */
    LARGE,

    /**
     * Extra large.
     * 
     */
    X_LARGE,

    /**
     * Extra extra large.
     * 
     */
    XX_LARGE;

    public String value() {
        return name();
    }

    public static SizeT fromValue(String v) {
        return valueOf(v);
    }

}
