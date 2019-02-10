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
 * <p>Java class for PPCell element declaration.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;element name="PPCell">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_1}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="parameterName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="predictorName" use="required" type="{http://www.dmg.org/PMML-4_1}FIELD-NAME" />
 *         &lt;attribute name="targetCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "PPCell")
public class PPCell {

	@XmlElement(name = "Extension", namespace = "http://www.dmg.org/PMML-4_1", required = true)
	protected List<Extension> extension;
	@XmlAttribute(required = true)
	protected String parameterName;
	@XmlAttribute(required = true)
	protected String predictorName;
	@XmlAttribute
	protected String targetCategory;
	@XmlAttribute(required = true)
	protected String value;

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
	 * Gets the value of the parameterName property.
	 *
	 * @return
	 *     possible object is
	 *     {@link String }
	 *
	 */
	public String getParameterName() {
		return parameterName;
	}

	/**
	 * Sets the value of the parameterName property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *
	 */
	public void setParameterName(String value) {
		this.parameterName = value;
	}

	/**
	 * Gets the value of the predictorName property.
	 *
	 * @return
	 *     possible object is
	 *     {@link String }
	 *
	 */
	public String getPredictorName() {
		return predictorName;
	}

	/**
	 * Sets the value of the predictorName property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *
	 */
	public void setPredictorName(String value) {
		this.predictorName = value;
	}

	/**
	 * Gets the value of the targetCategory property.
	 *
	 * @return
	 *     possible object is
	 *     {@link String }
	 *
	 */
	public String getTargetCategory() {
		return targetCategory;
	}

	/**
	 * Sets the value of the targetCategory property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *
	 */
	public void setTargetCategory(String value) {
		this.targetCategory = value;
	}

	/**
	 * Gets the value of the value property.
	 *
	 * @return
	 *     possible object is
	 *     {@link String }
	 *
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *
	 */
	public void setValue(String value) {
		this.value = value;
	}
}
