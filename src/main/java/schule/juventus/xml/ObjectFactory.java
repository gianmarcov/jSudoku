
package schule.juventus.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the schule.juventus.xml package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Jsudoku_QNAME = new QName("", "jsudoku");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: schule.juventus.xml
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JsudokuType }
     *
     * @return the jsudoku type
     */
    public JsudokuType createJsudokuType() {
        return new JsudokuType();
    }

    /**
     * Create an instance of {@link Field4Type }
     *
     * @return the field 4 type
     */
    public Field4Type createField4Type() {
        return new Field4Type();
    }

    /**
     * Create an instance of {@link Group5Type }
     *
     * @return the group 5 type
     */
    public Group5Type createGroup5Type() {
        return new Group5Type();
    }

    /**
     * Create an instance of {@link Group2Type }
     *
     * @return the group 2 type
     */
    public Group2Type createGroup2Type() {
        return new Group2Type();
    }

    /**
     * Create an instance of {@link Field6Type }
     *
     * @return the field 6 type
     */
    public Field6Type createField6Type() {
        return new Field6Type();
    }

    /**
     * Create an instance of {@link Group0Type }
     *
     * @return the group 0 type
     */
    public Group0Type createGroup0Type() {
        return new Group0Type();
    }

    /**
     * Create an instance of {@link Field7Type }
     *
     * @return the field 7 type
     */
    public Field7Type createField7Type() {
        return new Field7Type();
    }

    /**
     * Create an instance of {@link Group4Type }
     *
     * @return the group 4 type
     */
    public Group4Type createGroup4Type() {
        return new Group4Type();
    }

    /**
     * Create an instance of {@link Field2Type }
     *
     * @return the field 2 type
     */
    public Field2Type createField2Type() {
        return new Field2Type();
    }

    /**
     * Create an instance of {@link Field0Type }
     *
     * @return the field 0 type
     */
    public Field0Type createField0Type() {
        return new Field0Type();
    }

    /**
     * Create an instance of {@link Group8Type }
     *
     * @return the group 8 type
     */
    public Group8Type createGroup8Type() {
        return new Group8Type();
    }

    /**
     * Create an instance of {@link Group6Type }
     *
     * @return the group 6 type
     */
    public Group6Type createGroup6Type() {
        return new Group6Type();
    }

    /**
     * Create an instance of {@link Field3Type }
     *
     * @return the field 3 type
     */
    public Field3Type createField3Type() {
        return new Field3Type();
    }

    /**
     * Create an instance of {@link Field5Type }
     *
     * @return the field 5 type
     */
    public Field5Type createField5Type() {
        return new Field5Type();
    }

    /**
     * Create an instance of {@link Field8Type }
     *
     * @return the field 8 type
     */
    public Field8Type createField8Type() {
        return new Field8Type();
    }

    /**
     * Create an instance of {@link Group1Type }
     *
     * @return the group 1 type
     */
    public Group1Type createGroup1Type() {
        return new Group1Type();
    }

    /**
     * Create an instance of {@link Group3Type }
     *
     * @return the group 3 type
     */
    public Group3Type createGroup3Type() {
        return new Group3Type();
    }

    /**
     * Create an instance of {@link Field1Type }
     *
     * @return the field 1 type
     */
    public Field1Type createField1Type() {
        return new Field1Type();
    }

    /**
     * Create an instance of {@link Group7Type }
     *
     * @return the group 7 type
     */
    public Group7Type createGroup7Type() {
        return new Group7Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JsudokuType }{@code >}}
     *
     * @param value the value
     * @return the jaxb element
     */
    @XmlElementDecl(namespace = "", name = "jsudoku")
    public JAXBElement<JsudokuType> createJsudoku(JsudokuType value) {
        return new JAXBElement<JsudokuType>(_Jsudoku_QNAME, JsudokuType.class, null, value);
    }

}
