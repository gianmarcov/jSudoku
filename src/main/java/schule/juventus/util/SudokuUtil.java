package schule.juventus.util;

import schule.juventus.xml.*;

public class SudokuUtil {

    public static String checkSudoku(final JsudokuType jsudoku) {
        final StringBuilder stringBuilder = new StringBuilder();
        if(!SudokuUtil.validateGroup(jsudoku.getGroup0())) {
            stringBuilder.append("Group 1: invalid\n");
        }
        if(!SudokuUtil.validateGroup(jsudoku.getGroup1())) {
            stringBuilder.append("Group 2: invalid\n");
        }
        if(!SudokuUtil.validateGroup(jsudoku.getGroup2())) {
            stringBuilder.append("Group 3: invalid\n");
        }
        if(!SudokuUtil.validateGroup(jsudoku.getGroup3())) {
            stringBuilder.append("Group 4: invalid\n");
        }
        if(!SudokuUtil.validateGroup(jsudoku.getGroup4())) {
            stringBuilder.append("Group 5: invalid\n");
        }
        if(!SudokuUtil.validateGroup(jsudoku.getGroup5())) {
            stringBuilder.append("Group 6: invalid\n");
        }
        if(!SudokuUtil.validateGroup(jsudoku.getGroup6())) {
            stringBuilder.append("Group 7: invalid\n");
        }
        if(!SudokuUtil.validateGroup(jsudoku.getGroup7())) {
            stringBuilder.append("Group 8: invalid\n");
        }
        if(!SudokuUtil.validateGroup(jsudoku.getGroup8())) {
            stringBuilder.append("Group 9: invalid\n");
        }
        if(!SudokuUtil.validateVerticalFirstLine(jsudoku.getGroup0(), jsudoku.getGroup1(), jsudoku.getGroup2())) {
            stringBuilder.append("Vertical 1: invalid\n");
        }
        if(!SudokuUtil.validateVerticalSecoundLine(jsudoku.getGroup0(), jsudoku.getGroup1(), jsudoku.getGroup2())) {
            stringBuilder.append("Vertical 2: invalid\n");
        }
        if(!SudokuUtil.validateVerticalThirdLine(jsudoku.getGroup0(), jsudoku.getGroup1(), jsudoku.getGroup2())) {
            stringBuilder.append("Vertical 3: invalid\n");
        }
        if(!SudokuUtil.validateVerticalFirstLine(jsudoku.getGroup3(), jsudoku.getGroup4(), jsudoku.getGroup5())) {
            stringBuilder.append("Vertical 4: invalid\n");
        }
        if(!SudokuUtil.validateVerticalSecoundLine(jsudoku.getGroup3(), jsudoku.getGroup4(), jsudoku.getGroup5())) {
            stringBuilder.append("Vertical 5: invalid\n");
        }
        if(!SudokuUtil.validateVerticalThirdLine(jsudoku.getGroup3(), jsudoku.getGroup4(), jsudoku.getGroup5())) {
            stringBuilder.append("Vertical 6: invalid\n");
        }
        if(!SudokuUtil.validateVerticalFirstLine(jsudoku.getGroup6(), jsudoku.getGroup7(), jsudoku.getGroup8())) {
            stringBuilder.append("Vertical 7: invalid\n");
        }
        if(!SudokuUtil.validateVerticalSecoundLine(jsudoku.getGroup6(), jsudoku.getGroup7(), jsudoku.getGroup8())) {
            stringBuilder.append("Vertical 8: invalid\n");
        }
        if(!SudokuUtil.validateVerticalThirdLine(jsudoku.getGroup6(), jsudoku.getGroup7(), jsudoku.getGroup8())) {
            stringBuilder.append("Vertical 9: invalid\n");
        }
        if(!SudokuUtil.validateHorizontalFirstLine(jsudoku.getGroup0(), jsudoku.getGroup3(), jsudoku.getGroup6())) {
            stringBuilder.append("Horizontal 1: invalid\n");
        }
        if(!SudokuUtil.validateHorizontalSecoundLine(jsudoku.getGroup0(), jsudoku.getGroup3(), jsudoku.getGroup6())) {
            stringBuilder.append("Horizontal 2: invalid\n");
        }
        if(!SudokuUtil.validateHorizontalThirdLine(jsudoku.getGroup0(), jsudoku.getGroup3(), jsudoku.getGroup6())) {
            stringBuilder.append("Horizontal 3: invalid\n");
        }
        if(!SudokuUtil.validateHorizontalFirstLine(jsudoku.getGroup1(), jsudoku.getGroup4(), jsudoku.getGroup7())) {
            stringBuilder.append("Horizontal 4: invalid\n");
        }
        if(!SudokuUtil.validateHorizontalSecoundLine(jsudoku.getGroup1(), jsudoku.getGroup4(), jsudoku.getGroup7())) {
            stringBuilder.append("Horizontal 5: invalid\n");
        }
        if(!SudokuUtil.validateHorizontalThirdLine(jsudoku.getGroup1(), jsudoku.getGroup4(), jsudoku.getGroup7())) {
            stringBuilder.append("Horizontal 6: invalid\n");
        }
        if(!SudokuUtil.validateHorizontalFirstLine(jsudoku.getGroup2(), jsudoku.getGroup5(), jsudoku.getGroup8())) {
            stringBuilder.append("Horizontal 7: invalid\n");
        }
        if(!SudokuUtil.validateHorizontalSecoundLine(jsudoku.getGroup2(), jsudoku.getGroup5(), jsudoku.getGroup8())) {
            stringBuilder.append("Horizontal 8: invalid\n");
        }
        if(!SudokuUtil.validateHorizontalThirdLine(jsudoku.getGroup2(), jsudoku.getGroup5(), jsudoku.getGroup8())) {
            stringBuilder.append("Horizontal 9: invalid\n");
        }

        if (stringBuilder.length() == 0) {
            stringBuilder.append("Sudoku: valid, congrats!\n");
        }

        return stringBuilder.toString();
    }

    public static boolean validateGroup(final GroupType group) {
        return checkFieldValueNotEqual(group.getField0(), group.getField1(), group.getField2(), group.getField3(), group.getField4(), group.getField5(), group.getField6(), group.getField7(), group.getField8());
    }

    public static boolean validateVerticalFirstLine(final GroupType groupA, final GroupType groupB, final GroupType groupC) {
        return checkFieldValueNotEqual(
                groupA.getField0(), groupA.getField1(), groupA.getField2(),
                groupB.getField0(), groupB.getField1(), groupB.getField2(),
                groupC.getField0(), groupC.getField1(), groupC.getField2());
    }

    public static boolean validateVerticalSecoundLine(final GroupType groupA, final GroupType groupB, final GroupType groupC) {
        return checkFieldValueNotEqual(
                groupA.getField3(), groupA.getField4(), groupA.getField5(),
                groupB.getField3(), groupB.getField4(), groupB.getField5(),
                groupC.getField3(), groupC.getField4(), groupC.getField5());
    }

    public static boolean validateVerticalThirdLine(final GroupType groupA, final GroupType groupB, final GroupType groupC) {
        return checkFieldValueNotEqual(
                groupA.getField6(), groupA.getField7(), groupA.getField8(),
                groupB.getField6(), groupB.getField7(), groupB.getField8(),
                groupC.getField6(), groupC.getField7(), groupC.getField8());
    }

    public static boolean validateHorizontalFirstLine(final GroupType groupA, final GroupType groupB, final GroupType groupC) {
        return checkFieldValueNotEqual(
                groupA.getField0(), groupA.getField3(), groupA.getField6(),
                groupB.getField0(), groupB.getField3(), groupB.getField6(),
                groupC.getField0(), groupC.getField3(), groupC.getField6());
    }

    public static boolean validateHorizontalSecoundLine(final GroupType groupA, final GroupType groupB, final GroupType groupC) {
        return checkFieldValueNotEqual(
                groupA.getField1(), groupA.getField4(), groupA.getField7(),
                groupB.getField1(), groupB.getField4(), groupB.getField7(),
                groupC.getField1(), groupC.getField4(), groupC.getField7());
    }

    public static boolean validateHorizontalThirdLine(final GroupType groupA, final GroupType groupB, final GroupType groupC) {
        return checkFieldValueNotEqual(
                groupA.getField2(), groupA.getField5(), groupA.getField8(),
                groupB.getField2(), groupB.getField5(), groupB.getField8(),
                groupC.getField2(), groupC.getField5(), groupC.getField8());
    }

    public static boolean checkFieldValueNotEqual(final FieldType... fields) {
        for(final FieldType fieldOfFieldsToValidate : fields) {
            for (final FieldType fieldOfFields : fields) {
                if(fieldOfFieldsToValidate == fieldOfFields) {
                    continue;
                }

                if(checkFieldValueNotEqual(fieldOfFieldsToValidate, fieldOfFields)) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean checkFieldValueNotEqual(final FieldType fieldA, final FieldType fieldB) {
        return !fieldA.getValue().get().equals(fieldB.getValue().get());
    }
}
