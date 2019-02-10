//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.20 at 12:48:21 PM GMT 
//

package weka.core.pmml.jaxbbindings;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

/**
 * <p>Java class for TimeAnchor element declaration.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;element name="TimeAnchor">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_1}TimeCycle" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_1}TimeException" maxOccurs="2" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *         &lt;attribute name="offset" type="{http://www.dmg.org/PMML-4_1}INT-NUMBER" />
 *         &lt;attribute name="stepsize" type="{http://www.dmg.org/PMML-4_1}INT-NUMBER" />
 *         &lt;attribute name="type" type="{http://www.dmg.org/PMML-4_1}TIME-ANCHOR" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"timeCycle",
		"timeException"
})
@XmlRootElement(name = "TimeAnchor")
public class TimeAnchor {

	@XmlElement(name = "TimeCycle", namespace = "http://www.dmg.org/PMML-4_1", required = true)
	protected List<TimeCycle> timeCycle;
	@XmlElement(name = "TimeException", namespace = "http://www.dmg.org/PMML-4_1", required = true)
	protected List<TimeException> timeException;
	@XmlAttribute
	protected String displayName;
	@XmlAttribute
	protected BigInteger offset;
	@XmlAttribute
	protected BigInteger stepsize;
	@XmlAttribute
	protected TIMEANCHOR2 type;

	/**
	 * Gets the value of the timeCycle property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the timeCycle property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getTimeCycle().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link TimeCycle }
	 *
	 *
	 */
	public List<TimeCycle> getTimeCycle() {
		if (timeCycle == null) {
			timeCycle = new ArrayList<TimeCycle>();
		}
		return this.timeCycle;
	}

	/**
	 * Gets the value of the timeException property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the timeException property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getTimeException().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link TimeException }
	 *
	 *
	 */
	public List<TimeException> getTimeException() {
		if (timeException == null) {
			timeException = new ArrayList<TimeException>();
		}
		return this.timeException;
	}

	/**
	 * Gets the value of the displayName property.
	 *
	 * @return
	 *     possible object is
	 *     {@link String }
	 *
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Sets the value of the displayName property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *
	 */
	public void setDisplayName(String value) {
		this.displayName = value;
	}

	/**
	 * Gets the value of the offset property.
	 *
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *
	 */
	public BigInteger getOffset() {
		return offset;
	}

	/**
	 * Sets the value of the offset property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *
	 */
	public void setOffset(BigInteger value) {
		this.offset = value;
	}

	/**
	 * Gets the value of the stepsize property.
	 *
	 * @return
	 *     possible object is
	 *     {@link BigInteger }
	 *
	 */
	public BigInteger getStepsize() {
		return stepsize;
	}

	/**
	 * Sets the value of the stepsize property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link BigInteger }
	 *
	 */
	public void setStepsize(BigInteger value) {
		this.stepsize = value;
	}

	/**
	 * Gets the value of the type property.
	 *
	 * @return
	 *     possible object is
	 *     {@link TIMEANCHOR }
	 *
	 */
	public TIMEANCHOR2 getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link TIMEANCHOR }
	 *
	 */
	public void setType(TIMEANCHOR2 value) {
		this.type = value;
	}
}
