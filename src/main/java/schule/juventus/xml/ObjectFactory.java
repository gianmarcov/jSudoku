
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
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Jsudoku_QNAME = new QName("", "jsudoku");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: schule.juventus.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JsudokuType }
     * 
     */
    public JsudokuType createJsudokuType() {
        return new JsudokuType();
    }

    /**
     * Create an instance of {@link Field4Type }
     * 
     */
    public Field4Type createField4Type() {
        return new Field4Type();
    }

    /**
     * Create an instance of {@link Group5Type }
     * 
     */
    public Group5Type createGroup5Type() {
        return new Group5Type();
    }

    /**
     * Create an instance of {@link Group2Type }
     * 
     */
    public Group2Type createGroup2Type() {
        return new Group2Type();
    }

    /**
     * Create an instance of {@link Field6Type }
     * 
     */
    public Field6Type createField6Type() {
        return new Field6Type();
    }

    /**
     * Create an instance of {@link Group0Type }
     * 
     */
    public Group0Type createGroup0Type() {
        return new Group0Type();
    }

    /**
     * Create an instance of {@link Field7Type }
     * 
     */
    public Field7Type createField7Type() {
        return new Field7Type();
    }

    /**
     * Create an instance of {@link Group4Type }
     * 
     */
    public Group4Type createGroup4Type() {
        return new Group4Type();
    }

    /**
     * Create an instance of {@link Field2Type }
     * 
     */
    public Field2Type createField2Type() {
        return new Field2Type();
    }

    /**
     * Create an instance of {@link Field0Type }
     * 
     */
    public Field0Type createField0Type() {
        return new Field0Type();
    }

    /**
     * Create an instance of {@link Group8Type }
     * 
     */
    public Group8Type createGroup8Type() {
        return new Group8Type();
    }

    /**
     * Create an instance of {@link Group6Type }
     * 
     */
    public Group6Type createGroup6Type() {
        return new Group6Type();
    }

    /**
     * Create an instance of {@link Field3Type }
     * 
     */
    public Field3Type createField3Type() {
        return new Field3Type();
    }

    /**
     * Create an instance of {@link Field5Type }
     * 
     */
    public Field5Type createField5Type() {
        return new Field5Type();
    }

    /**
     * Create an instance of {@link Field8Type }
     * 
     */
    public Field8Type createField8Type() {
        return new Field8Type();
    }

    /**
     * Create an instance of {@link Group1Type }
     * 
     */
    public Group1Type createGroup1Type() {
        return new Group1Type();
    }

    /**
     * Create an instance of {@link Group3Type }
     * 
     */
    public Group3Type createGroup3Type() {
        return new Group3Type();
    }

    /**
     * Create an instance of {@link Field1Type }
     * 
     */
    public Field1Type createField1Type() {
        return new Field1Type();
    }

    /**
     * Create an instance of {@link Group7Type }
     * 
     */
    public Group7Type createGroup7Type() {
        return new Group7Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JsudokuType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "jsudoku")
    public JAXBElement<JsudokuType> createJsudoku(JsudokuType value) {
        return new JAXBElement<JsudokuType>(_Jsudoku_QNAME, JsudokuType.class, null, value);
    }

}
