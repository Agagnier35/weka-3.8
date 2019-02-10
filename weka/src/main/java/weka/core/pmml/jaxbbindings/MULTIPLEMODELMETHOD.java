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
 * <p>Java class for MULTIPLE-MODEL-METHOD.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MULTIPLE-MODEL-METHOD">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="majorityVote"/>
 *     &lt;enumeration value="weightedMajorityVote"/>
 *     &lt;enumeration value="average"/>
 *     &lt;enumeration value="weightedAverage"/>
 *     &lt;enumeration value="median"/>
 *     &lt;enumeration value="max"/>
 *     &lt;enumeration value="sum"/>
 *     &lt;enumeration value="selectFirst"/>
 *     &lt;enumeration value="selectAll"/>
 *     &lt;enumeration value="modelChain"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlEnum
public enum MULTIPLEMODELMETHOD {

	@XmlEnumValue("average")
	AVERAGE("average"),
	@XmlEnumValue("majorityVote")
	MAJORITY_VOTE("majorityVote"),
	@XmlEnumValue("max")
	MAX("max"),
	@XmlEnumValue("median")
	MEDIAN("median"),
	@XmlEnumValue("modelChain")
	MODEL_CHAIN("modelChain"),
	@XmlEnumValue("selectAll")
	SELECT_ALL("selectAll"),
	@XmlEnumValue("selectFirst")
	SELECT_FIRST("selectFirst"),
	@XmlEnumValue("sum")
	SUM("sum"),
	@XmlEnumValue("weightedAverage")
	WEIGHTED_AVERAGE("weightedAverage"),
	@XmlEnumValue("weightedMajorityVote")
	WEIGHTED_MAJORITY_VOTE("weightedMajorityVote");
	private final String value;

	MULTIPLEMODELMETHOD(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static MULTIPLEMODELMETHOD fromValue(String v) {
		for (MULTIPLEMODELMETHOD c : MULTIPLEMODELMETHOD.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v.toString());
	}

}
