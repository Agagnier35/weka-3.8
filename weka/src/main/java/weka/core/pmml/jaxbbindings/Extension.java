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

import org.w3c.dom.Element;

/**
 * <p>Java class for Extension element declaration.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;element name="Extension">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;any/>
 *         &lt;/sequence>
 *         &lt;attribute name="extender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
		"content"
})
@XmlRootElement(name = "Extension")
public class Extension {

	@XmlMixed
	@XmlAnyElement
	protected List<Object> content;
	@XmlAttribute
	protected String extender;
	@XmlAttribute
	protected String name;
	@XmlAttribute
	protected String value;

	/**
	 * Gets the value of the content property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the content property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getContent().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Element }
	 * {@link String }
	 *
	 *
	 */
	public List<Object> getContent() {
		if (content == null) {
			content = new ArrayList<Object>();
		}
		return this.content;
	}

	/**
	 * Gets the value of the extender property.
	 *
	 * @return
	 *     possible object is
	 *     {@link String }
	 *
	 */
	public String getExtender() {
		return extender;
	}

	/**
	 * Sets the value of the extender property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *
	 */
	public void setExtender(String value) {
		this.extender = value;
	}

	/**
	 * Gets the value of the name property.
	 *
	 * @return
	 *     possible object is
	 *     {@link String }
	 *
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 *
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *
	 */
	public void setName(String value) {
		this.name = value;
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
