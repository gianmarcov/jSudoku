package schule.juventus.xml;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * The type Field type.
 */
public abstract class FieldType {
    /**
     * The Value.
     */
    @XmlValue
    @XmlJavaTypeAdapter(StringPropertyAdapter.class)
    protected StringProperty value;
    /**
     * The Predefined.
     */
    @XmlAttribute(name = "predefined", required = true)
    @XmlJavaTypeAdapter(StringPropertyAdapter.class)
    protected StringProperty predefined;
    /**
     * The Constant.
     */
    @XmlAttribute(name = "constant", required = true)
    @XmlJavaTypeAdapter(StringPropertyAdapter.class)
    protected StringProperty constant;

    /**
     * Gets the value of the value property.
     *
     * @return possible      object is     {@link String }
     */
    public StringProperty getValue() {
        if(value == null) {
            value = new SimpleStringProperty();
        }
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is     {@link String }
     */
    public void setValue(String value) {
        this.value.setValue(value);
    }

    /**
     * Gets the value of the predefined property.
     *
     * @return possible      object is     {@link String }
     */
    public StringProperty getPredefined() {
        if(predefined == null) {
            predefined = new SimpleStringProperty();
        }
        return predefined;
    }

    /**
     * Sets the value of the predefined property.
     *
     * @param value allowed object is     {@link String }
     */
    public void setPredefined(String value) {
        this.predefined.setValue(value);
    }

    /**
     * Gets the value of the constant property.
     *
     * @return possible      object is     {@link String }
     */
    public StringProperty getConstant() {
        if(constant == null) {
            constant = new SimpleStringProperty();
        }
        return constant;
    }

    /**
     * Sets the value of the constant property.
     *
     * @param value allowed object is     {@link String }
     */
    public void setConstant(String value) {
        this.constant.setValue(value);
    }
}
