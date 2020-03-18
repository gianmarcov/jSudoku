
package schule.juventus.xml;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for jsudokuType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="jsudokuType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="group0" type="{}group0Type"/>
 *         &lt;element name="group1" type="{}group1Type"/>
 *         &lt;element name="group2" type="{}group2Type"/>
 *         &lt;element name="group3" type="{}group3Type"/>
 *         &lt;element name="group4" type="{}group4Type"/>
 *         &lt;element name="group5" type="{}group5Type"/>
 *         &lt;element name="group6" type="{}group6Type"/>
 *         &lt;element name="group7" type="{}group7Type"/>
 *         &lt;element name="group8" type="{}group8Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement(name="jsudoku")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jsudoku", propOrder = {
    "group0",
    "group1",
    "group2",
    "group3",
    "group4",
    "group5",
    "group6",
    "group7",
    "group8"
})
public class JsudokuType {

    /**
     * The Group 0.
     */
    @XmlElement(required = true)
    protected Group0Type group0;
    /**
     * The Group 1.
     */
    @XmlElement(required = true)
    protected Group1Type group1;
    /**
     * The Group 2.
     */
    @XmlElement(required = true)
    protected Group2Type group2;
    /**
     * The Group 3.
     */
    @XmlElement(required = true)
    protected Group3Type group3;
    /**
     * The Group 4.
     */
    @XmlElement(required = true)
    protected Group4Type group4;
    /**
     * The Group 5.
     */
    @XmlElement(required = true)
    protected Group5Type group5;
    /**
     * The Group 6.
     */
    @XmlElement(required = true)
    protected Group6Type group6;
    /**
     * The Group 7.
     */
    @XmlElement(required = true)
    protected Group7Type group7;
    /**
     * The Group 8.
     */
    @XmlElement(required = true)
    protected Group8Type group8;

    /**
     * Gets the value of the group0 property.
     *
     * @return possible      object is     {@link Group0Type }
     */
    public Group0Type getGroup0() {
        return group0;
    }

    /**
     * Sets the value of the group0 property.
     *
     * @param value allowed object is     {@link Group0Type }
     */
    public void setGroup0(Group0Type value) {
        this.group0 = value;
    }

    /**
     * Gets the value of the group1 property.
     *
     * @return possible      object is     {@link Group1Type }
     */
    public Group1Type getGroup1() {
        return group1;
    }

    /**
     * Sets the value of the group1 property.
     *
     * @param value allowed object is     {@link Group1Type }
     */
    public void setGroup1(Group1Type value) {
        this.group1 = value;
    }

    /**
     * Gets the value of the group2 property.
     *
     * @return possible      object is     {@link Group2Type }
     */
    public Group2Type getGroup2() {
        return group2;
    }

    /**
     * Sets the value of the group2 property.
     *
     * @param value allowed object is     {@link Group2Type }
     */
    public void setGroup2(Group2Type value) {
        this.group2 = value;
    }

    /**
     * Gets the value of the group3 property.
     *
     * @return possible      object is     {@link Group3Type }
     */
    public Group3Type getGroup3() {
        return group3;
    }

    /**
     * Sets the value of the group3 property.
     *
     * @param value allowed object is     {@link Group3Type }
     */
    public void setGroup3(Group3Type value) {
        this.group3 = value;
    }

    /**
     * Gets the value of the group4 property.
     *
     * @return possible      object is     {@link Group4Type }
     */
    public Group4Type getGroup4() {
        return group4;
    }

    /**
     * Sets the value of the group4 property.
     *
     * @param value allowed object is     {@link Group4Type }
     */
    public void setGroup4(Group4Type value) {
        this.group4 = value;
    }

    /**
     * Gets the value of the group5 property.
     *
     * @return possible      object is     {@link Group5Type }
     */
    public Group5Type getGroup5() {
        return group5;
    }

    /**
     * Sets the value of the group5 property.
     *
     * @param value allowed object is     {@link Group5Type }
     */
    public void setGroup5(Group5Type value) {
        this.group5 = value;
    }

    /**
     * Gets the value of the group6 property.
     *
     * @return possible      object is     {@link Group6Type }
     */
    public Group6Type getGroup6() {
        return group6;
    }

    /**
     * Sets the value of the group6 property.
     *
     * @param value allowed object is     {@link Group6Type }
     */
    public void setGroup6(Group6Type value) {
        this.group6 = value;
    }

    /**
     * Gets the value of the group7 property.
     *
     * @return possible      object is     {@link Group7Type }
     */
    public Group7Type getGroup7() {
        return group7;
    }

    /**
     * Sets the value of the group7 property.
     *
     * @param value allowed object is     {@link Group7Type }
     */
    public void setGroup7(Group7Type value) {
        this.group7 = value;
    }

    /**
     * Gets the value of the group8 property.
     *
     * @return possible      object is     {@link Group8Type }
     */
    public Group8Type getGroup8() {
        return group8;
    }

    /**
     * Sets the value of the group8 property.
     *
     * @param value allowed object is     {@link Group8Type }
     */
    public void setGroup8(Group8Type value) {
        this.group8 = value;
    }

}
