package schule.juventus.xml;

import javafx.beans.property.StringProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

public abstract class FieldType {
    @XmlValue
    @XmlJavaTypeAdapter(StringPropertyAdapter.class)
    protected StringProperty value;
    @XmlAttribute(name = "predefined", required = true)
    @XmlJavaTypeAdapter(StringPropertyAdapter.class)
    protected StringProperty predefined;
    @XmlAttribute(name = "constant", required = true)
    @XmlJavaTypeAdapter(StringPropertyAdapter.class)
    protected StringProperty constant;

    /**
     * Gets the value of the value property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public StringProperty getValue() {
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
        this.value.setValue(value);
    }

    /**
     * Gets the value of the predefined property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public StringProperty getPredefined() {
        return predefined;
    }

    /**
     * Sets the value of the predefined property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPredefined(String value) {
        this.predefined.setValue(value);
    }

    /**
     * Gets the value of the constant property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public StringProperty getConstant() {
        return constant;
    }

    /**
     * Sets the value of the constant property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setConstant(String value) {
        this.constant.setValue(value);
    }
}
