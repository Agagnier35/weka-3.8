//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.20 at 12:48:21 PM GMT 
//

package weka.core.pmml.jaxbbindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * <p>Java class for BASELINE-TEST-STATISTIC.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BASELINE-TEST-STATISTIC">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="zValue"/>
 *     &lt;enumeration value="chiSquareIndependence"/>
 *     &lt;enumeration value="chiSquareDistribution"/>
 *     &lt;enumeration value="CUSUM"/>
 *     &lt;enumeration value="scalarProduct"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlEnum
public enum BASELINETESTSTATISTIC {

	@XmlEnumValue("chiSquareDistribution")
	CHI_SQUARE_DISTRIBUTION("chiSquareDistribution"),
	@XmlEnumValue("chiSquareIndependence")
	CHI_SQUARE_INDEPENDENCE("chiSquareIndependence"),
	CUSUM("CUSUM"),
	@XmlEnumValue("scalarProduct")
	SCALAR_PRODUCT("scalarProduct"),
	@XmlEnumValue("zValue")
	Z_VALUE("zValue");
	private final String value;

	BASELINETESTSTATISTIC(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static BASELINETESTSTATISTIC fromValue(String v) {
		for (BASELINETESTSTATISTIC c : BASELINETESTSTATISTIC.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v.toString());
	}

}
