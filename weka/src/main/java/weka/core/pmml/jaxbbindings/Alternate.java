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
 * <p>Java class for Alternate element declaration.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;element name="Alternate">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;choice>
 *           &lt;group ref="{http://www.dmg.org/PMML-4_1}CONTINUOUS-DISTRIBUTION-TYPES"/>
 *         &lt;/choice>
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
		"anyDistribution",
		"gaussianDistribution",
		"poissonDistribution",
		"uniformDistribution",
		"extension"
})
@XmlRootElement(name = "Alternate")
public class Alternate {

	@XmlElement(name = "AnyDistribution", namespace = "http://www.dmg.org/PMML-4_1")
	protected AnyDistribution anyDistribution;
	@XmlElement(name = "GaussianDistribution", namespace = "http://www.dmg.org/PMML-4_1")
	protected GaussianDistribution gaussianDistribution;
	@XmlElement(name = "PoissonDistribution", namespace = "http://www.dmg.org/PMML-4_1")
	protected PoissonDistribution poissonDistribution;
	@XmlElement(name = "UniformDistribution", namespace = "http://www.dmg.org/PMML-4_1")
	protected UniformDistribution uniformDistribution;
	@XmlElement(name = "Extension", namespace = "http://www.dmg.org/PMML-4_1", required = true)
	protected List<Extension> extension;

	/**
	 * Gets the value of the anyDistribution property.
	 *
	 * @return
	 *     possible object is
	 *     {@link AnyDistribution }
	 *
	 */
	public AnyDistribution getAnyDistribution() {
		return anyDistribution;
	}

	/**
	 * Sets the value of the anyDistribution property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link AnyDistribution }
	 *
	 */
	public void setAnyDistribution(AnyDistribution value) {
		this.anyDistribution = value;
	}

	/**
	 * Gets the value of the gaussianDistribution property.
	 *
	 * @return
	 *     possible object is
	 *     {@link GaussianDistribution }
	 *
	 */
	public GaussianDistribution getGaussianDistribution() {
		return gaussianDistribution;
	}

	/**
	 * Sets the value of the gaussianDistribution property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link GaussianDistribution }
	 *
	 */
	public void setGaussianDistribution(GaussianDistribution value) {
		this.gaussianDistribution = value;
	}

	/**
	 * Gets the value of the poissonDistribution property.
	 *
	 * @return
	 *     possible object is
	 *     {@link PoissonDistribution }
	 *
	 */
	public PoissonDistribution getPoissonDistribution() {
		return poissonDistribution;
	}

	/**
	 * Sets the value of the poissonDistribution property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link PoissonDistribution }
	 *
	 */
	public void setPoissonDistribution(PoissonDistribution value) {
		this.poissonDistribution = value;
	}

	/**
	 * Gets the value of the uniformDistribution property.
	 *
	 * @return
	 *     possible object is
	 *     {@link UniformDistribution }
	 *
	 */
	public UniformDistribution getUniformDistribution() {
		return uniformDistribution;
	}

	/**
	 * Sets the value of the uniformDistribution property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link UniformDistribution }
	 *
	 */
	public void setUniformDistribution(UniformDistribution value) {
		this.uniformDistribution = value;
	}

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
}
