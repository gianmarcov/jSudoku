package schule.juventus.util;

import schule.juventus.xml.*;

public class SudokuUtil {

    public boolean validateGroup(final GroupType group) {
        return checkfieldValueNotEqual(group.getField0(), group.getField1(), group.getField2(), group.getField3(), group.getField4(), group.getField5(), group.getField6(), group.getField7(), group.getField8());
    }

    public boolean validateVerticalFirstLine(final GroupType groupA, final GroupType groupB, final GroupType groupC) {
        return checkfieldValueNotEqual(
                groupA.getField0(), groupA.getField1(), groupA.getField2(),
                groupB.getField0(), groupB.getField1(), groupB.getField2(),
                groupC.getField0(), groupC.getField1(), groupC.getField2());
    }

    public boolean validateVerticalSecoundLine(final GroupType groupA, final GroupType groupB, final GroupType groupC) {
        return checkfieldValueNotEqual(
                groupA.getField3(), groupA.getField4(), groupA.getField5(),
                groupB.getField3(), groupB.getField4(), groupB.getField5(),
                groupC.getField3(), groupC.getField4(), groupC.getField5());
    }

    public boolean validateVerticalThirdLine(final GroupType groupA, final GroupType groupB, final GroupType groupC) {
        return checkfieldValueNotEqual(
                groupA.getField6(), groupA.getField7(), groupA.getField8(),
                groupB.getField6(), groupB.getField7(), groupB.getField8(),
                groupC.getField6(), groupC.getField7(), groupC.getField8());
    }

    public boolean validateHorizontalFirstLine(final GroupType groupA, final GroupType groupB, final GroupType groupC) {
        return checkfieldValueNotEqual(
                groupA.getField0(), groupA.getField3(), groupA.getField6(),
                groupB.getField0(), groupB.getField3(), groupB.getField6(),
                groupC.getField0(), groupC.getField3(), groupC.getField6());
    }

    public boolean validateHorizontalSecoundLine(final GroupType groupA, final GroupType groupB, final GroupType groupC) {
        return checkfieldValueNotEqual(
                groupA.getField1(), groupA.getField4(), groupA.getField7(),
                groupB.getField1(), groupB.getField4(), groupB.getField7(),
                groupC.getField1(), groupC.getField4(), groupC.getField7());
    }

    public boolean validateHorizontalThirdLine(final GroupType groupA, final GroupType groupB, final GroupType groupC) {
        return checkfieldValueNotEqual(
                groupA.getField2(), groupA.getField5(), groupA.getField8(),
                groupB.getField2(), groupB.getField5(), groupB.getField8(),
                groupC.getField2(), groupC.getField5(), groupC.getField8());
    }

    public boolean checkfieldValueNotEqual(final FieldType... fields) {
        boolean valid = true;
        for(final FieldType fieldOfFieldsToValidate : fields) {
            for (final FieldType fieldOfFields : fields) {
                if(fieldOfFieldsToValidate == fieldOfFields) {
                    continue;
                }
                valid = valid && fieldValueNotEqual(fieldOfFieldsToValidate, fieldOfFields);
            }
        }

        return valid;
    }

    public boolean checkfieldValueNotEqual(final FieldType fieldA, final FieldType fieldB) {
        return fieldA.getValue().get().equals(fieldB.getValue().get());
    }
}
