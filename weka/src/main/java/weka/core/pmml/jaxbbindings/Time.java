//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.20 at 12:48:21 PM GMT 
//

package weka.core.pmml.jaxbbindings;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

/**
 * <p>Java class for Time element declaration.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;element name="Time">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_1}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="max" type="{http://www.dmg.org/PMML-4_1}NUMBER" />
 *         &lt;attribute name="mean" type="{http://www.dmg.org/PMML-4_1}NUMBER" />
 *         &lt;attribute name="min" type="{http://www.dmg.org/PMML-4_1}NUMBER" />
 *         &lt;attribute name="standardDeviation" type="{http://www.dmg.org/PMML-4_1}NUMBER" />
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
		"extension"
})
@XmlRootElement(name = "Time")
public class Time {

	@XmlElement(name = "Extension", namespace = "http://www.dmg.org/PMML-4_1", required = true)
	protected List<Extension> extension;
	@XmlAttribute
	protected Double max;
	@XmlAttribute
	protected Double mean;
	@XmlAttribute
	protected Double min;
	@XmlAttribute
	protected Double standardDeviation;

	/**
	 * Gets the value of the extension property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the extension property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getExtension().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Extension }
	 *
	 *
	 */
	public List<Extension> getExtension() {
		if (extension == null) {
			extension = new ArrayList<Extension>();
		}
		return this.extension;
	}

	/**
	 * Gets the value of the max property.
	 *
	 * @return
	 *     possible object is
	 *     {@link Double }
	 *
	 */
	public Double getMax() {
		return max;
	}

	/**
	 * Sets the value of the max property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link Double }
	 *
	 */
	public void setMax(Double value) {
		this.max = value;
	}

	/**
	 * Gets the value of the mean property.
	 *
	 * @return
	 *     possible object is
	 *     {@link Double }
	 *
	 */
	public Double getMean() {
		return mean;
	}

	/**
	 * Sets the value of the mean property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link Double }
	 *
	 */
	public void setMean(Double value) {
		this.mean = value;
	}

	/**
	 * Gets the value of the min property.
	 *
	 * @return
	 *     possible object is
	 *     {@link Double }
	 *
	 */
	public Double getMin() {
		return min;
	}

	/**
	 * Sets the value of the min property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link Double }
	 *
	 */
	public void setMin(Double value) {
		this.min = value;
	}

	/**
	 * Gets the value of the standardDeviation property.
	 *
	 * @return
	 *     possible object is
	 *     {@link Double }
	 *
	 */
	public Double getStandardDeviation() {
		return standardDeviation;
	}

	/**
	 * Sets the value of the standardDeviation property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link Double }
	 *
	 */
	public void setStandardDeviation(Double value) {
		this.standardDeviation = value;
	}
}
