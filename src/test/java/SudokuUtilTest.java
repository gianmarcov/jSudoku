import org.junit.Assert;
import org.junit.jupiter.api.Test;
import schule.juventus.util.JAXBUtil;
import schule.juventus.util.SudokuUtil;
import schule.juventus.xml.FieldType;
import schule.juventus.xml.JsudokuType;

import java.io.File;

public class SudokuUtilTest {

    @Test
    public void checkSudokuTest() {
        /** Arrange **/
        final File file = new File(SudokuUtilTest.class.getClassLoader().getResource("jsudoku.test.0.xml").getFile());
        final JsudokuType JsudokuType = (schule.juventus.xml.JsudokuType) JAXBUtil.unmarshal(file, JsudokuType.class);

        /** Act **/
        final String result = SudokuUtil.checkSudoku(JsudokuType);

        /** Assert **/
        Assert.assertNotNull(result);
    }

    @Test
    public void checkFieldValueNotEqualTest() {
        /** Arrange **/
        final FieldType fieldTypeA = new FieldType() {};
        final FieldType fieldTypeB = new FieldType() {};
        fieldTypeA.getValue().setValue("0");
        fieldTypeB.getValue().setValue("1");

        /** Act **/
        final boolean result = SudokuUtil.checkFieldValueNotEqual(fieldTypeA, fieldTypeB);

        /** Assert **/
        Assert.assertTrue( result);
    }

    @Test
    public void checkFieldValueNotEqualNegativeTest() {
        /** Arrange **/
        final FieldType fieldTypeA = new FieldType() {};
        final FieldType fieldTypeB = new FieldType() {};
        fieldTypeA.getValue().setValue("");
        fieldTypeB.getValue().setValue("");

        /** Act **/
        final boolean result = SudokuUtil.checkFieldValueNotEqual(fieldTypeA, fieldTypeB);

        /** Assert **/
        Assert.assertFalse( result);
    }

    @Test
    public void checkFieldNotEqualTest() {
        /** Arrange **/
        final FieldType fieldTypeA = new FieldType() {};
        final FieldType fieldTypeB = new FieldType() {};
        final FieldType fieldTypeC = new FieldType() {};
        final FieldType fieldTypeD = new FieldType() {};
        fieldTypeA.getValue().setValue("0");
        fieldTypeB.getValue().setValue("1");
        fieldTypeC.getValue().setValue("2");
        fieldTypeD.getValue().setValue("3");

        /** Act **/
        final boolean result = SudokuUtil.checkFieldValueNotEqual(fieldTypeA, fieldTypeB, fieldTypeC, fieldTypeD);

        /** Assert **/
        Assert.assertTrue( result);
    }

    @Test
    public void checkFieldNotEqualNegativeTest() {
        /** Arrange **/
        final FieldType fieldTypeA = new FieldType() {};
        final FieldType fieldTypeB = new FieldType() {};
        final FieldType fieldTypeC = new FieldType() {};
        final FieldType fieldTypeD = new FieldType() {};
        fieldTypeA.getValue().setValue("0");
        fieldTypeB.getValue().setValue("0");
        fieldTypeB.getValue().setValue("0");
        fieldTypeB.getValue().setValue("0");

        /** Act **/
        final boolean result = SudokuUtil.checkFieldValueNotEqual(fieldTypeA, fieldTypeB, fieldTypeC, fieldTypeD);

        /** Assert **/
        Assert.assertFalse( result);
    }
}
