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
 * <p>Java class for MiningSchema element declaration.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;element name="MiningSchema">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_1}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_1}MiningField" maxOccurs="unbounded"/>
 *         &lt;/sequence>
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
		"extension",
		"miningField"
})
@XmlRootElement(name = "MiningSchema")
public class MiningSchema {

	@XmlElement(name = "Extension", namespace = "http://www.dmg.org/PMML-4_1", required = true)
	protected List<Extension> extension;
	@XmlElement(name = "MiningField", namespace = "http://www.dmg.org/PMML-4_1", required = true)
	protected List<MiningField> miningField;

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
	 * Gets the value of the miningField property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the miningField property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getMiningField().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link MiningField }
	 *
	 *
	 */
	public List<MiningField> getMiningFields() {
		if (miningField == null) {
			miningField = new ArrayList<MiningField>();
		}
		return this.miningField;
	}

	public void addMiningFields(MiningField field) {
		if (miningField == null) {
			miningField = new ArrayList<MiningField>();
		}
		this.miningField.add(field);
	}
}
