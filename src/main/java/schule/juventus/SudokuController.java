package schule.juventus;

import com.sun.javafx.scene.traversal.Direction;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.apache.log4j.Logger;
import schule.juventus.util.FXUtil;
import schule.juventus.util.JAXBUtil;
import schule.juventus.util.SudokuUtil;
import schule.juventus.xml.FieldType;
import schule.juventus.xml.JsudokuType;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class SudokuController extends AbstractController {
    final static String TRUE = "true";
    final static String BINDED_FIELD = "BINDED_FIELD";
    final static String ROW_INDEX = "ROW_INDEX";
    final static String COLUMN_INDEX = "COLUMN_INDEX";
    final static String CONSTANT_FIELD = "CONSTANT_FIELD";
    final static Logger logger = Logger.getLogger(SudokuController.class);

    @FXML
    private Label labelOfGroup0Field0;
    @FXML
    private Label labelOfGroup0Field1;
    @FXML
    private Label labelOfGroup0Field2;
    @FXML
    private Label labelOfGroup0Field3;
    @FXML
    private Label labelOfGroup0Field4;
    @FXML
    private Label labelOfGroup0Field5;
    @FXML
    private Label labelOfGroup0Field6;
    @FXML
    private Label labelOfGroup0Field7;
    @FXML
    private Label labelOfGroup0Field8;

    @FXML
    private Label labelOfGroup1Field0;
    @FXML
    private Label labelOfGroup1Field1;
    @FXML
    private Label labelOfGroup1Field2;
    @FXML
    private Label labelOfGroup1Field3;
    @FXML
    private Label labelOfGroup1Field4;
    @FXML
    private Label labelOfGroup1Field5;
    @FXML
    private Label labelOfGroup1Field6;
    @FXML
    private Label labelOfGroup1Field7;
    @FXML
    private Label labelOfGroup1Field8;

    @FXML
    private Label labelOfGroup2Field0;
    @FXML
    private Label labelOfGroup2Field1;
    @FXML
    private Label labelOfGroup2Field2;
    @FXML
    private Label labelOfGroup2Field3;
    @FXML
    private Label labelOfGroup2Field4;
    @FXML
    private Label labelOfGroup2Field5;
    @FXML
    private Label labelOfGroup2Field6;
    @FXML
    private Label labelOfGroup2Field7;
    @FXML
    private Label labelOfGroup2Field8;

    @FXML
    private Label labelOfGroup3Field0;
    @FXML
    private Label labelOfGroup3Field1;
    @FXML
    private Label labelOfGroup3Field2;
    @FXML
    private Label labelOfGroup3Field3;
    @FXML
    private Label labelOfGroup3Field4;
    @FXML
    private Label labelOfGroup3Field5;
    @FXML
    private Label labelOfGroup3Field6;
    @FXML
    private Label labelOfGroup3Field7;
    @FXML
    private Label labelOfGroup3Field8;

    @FXML
    private Label labelOfGroup4Field0;
    @FXML
    private Label labelOfGroup4Field1;
    @FXML
    private Label labelOfGroup4Field2;
    @FXML
    private Label labelOfGroup4Field3;
    @FXML
    private Label labelOfGroup4Field4;
    @FXML
    private Label labelOfGroup4Field5;
    @FXML
    private Label labelOfGroup4Field6;
    @FXML
    private Label labelOfGroup4Field7;
    @FXML
    private Label labelOfGroup4Field8;

    @FXML
    private Label labelOfGroup5Field0;
    @FXML
    private Label labelOfGroup5Field1;
    @FXML
    private Label labelOfGroup5Field2;
    @FXML
    private Label labelOfGroup5Field3;
    @FXML
    private Label labelOfGroup5Field4;
    @FXML
    private Label labelOfGroup5Field5;
    @FXML
    private Label labelOfGroup5Field6;
    @FXML
    private Label labelOfGroup5Field7;
    @FXML
    private Label labelOfGroup5Field8;

    @FXML
    private Label labelOfGroup6Field0;
    @FXML
    private Label labelOfGroup6Field1;
    @FXML
    private Label labelOfGroup6Field2;
    @FXML
    private Label labelOfGroup6Field3;
    @FXML
    private Label labelOfGroup6Field4;
    @FXML
    private Label labelOfGroup6Field5;
    @FXML
    private Label labelOfGroup6Field6;
    @FXML
    private Label labelOfGroup6Field7;
    @FXML
    private Label labelOfGroup6Field8;

    @FXML
    private Label labelOfGroup7Field0;
    @FXML
    private Label labelOfGroup7Field1;
    @FXML
    private Label labelOfGroup7Field2;
    @FXML
    private Label labelOfGroup7Field3;
    @FXML
    private Label labelOfGroup7Field4;
    @FXML
    private Label labelOfGroup7Field5;
    @FXML
    private Label labelOfGroup7Field6;
    @FXML
    private Label labelOfGroup7Field7;
    @FXML
    private Label labelOfGroup7Field8;

    @FXML
    private Label labelOfGroup8Field0;
    @FXML
    private Label labelOfGroup8Field1;
    @FXML
    private Label labelOfGroup8Field2;
    @FXML
    private Label labelOfGroup8Field3;
    @FXML
    private Label labelOfGroup8Field4;
    @FXML
    private Label labelOfGroup8Field5;
    @FXML
    private Label labelOfGroup8Field6;
    @FXML
    private Label labelOfGroup8Field7;
    @FXML
    private Label labelOfGroup8Field8;

    private List<Label> labels;

    private Label selectedLabel;

    private JsudokuType jsudoku;

    private int[][] table = {
            {0, 1, 2, 9, 10, 11, 18, 19, 20},
            {3, 4, 5, 12, 13, 14, 21, 22, 23},
            {6, 7, 8, 15, 16, 17, 24, 25, 26},
            {27, 28, 29, 36, 37, 38, 45, 46, 47},
            {30, 31, 32, 39, 40, 41, 48, 49, 50},
            {33, 34, 35, 42, 43, 44, 51, 52, 53},
            {54, 55, 56, 63, 64, 65, 72, 73, 74},
            {57, 58, 59, 66, 67, 68, 75, 76, 77},
            {60, 61, 62, 69, 70, 71, 78, 79, 80}
    };

    public void initialize() {
    }

    @Override
    public void afterInitialize(Stage stage) {
        super.afterInitialize(stage);

        this.labels = new ArrayList<>();
        this.jsudoku = chooseFile();
        bind();

        logger.info(this.getClass().getName() + " initialized");


        stage.addEventHandler(KeyEvent.KEY_PRESSED, keyEvent -> {
            if (selectedLabel != null) {
                if (keyEvent.getCode() == KeyCode.ESCAPE) {
                    resetBackgroundOfAllFields();
                } else if (keyEvent.getCode() == KeyCode.DELETE) {
                    selectedLabel.setText("");
                } else if (keyEvent.getCode() == KeyCode.UP ||
                        keyEvent.getCode() == KeyCode.DOWN ||
                        keyEvent.getCode() == KeyCode.LEFT ||
                        keyEvent.getCode() == KeyCode.RIGHT) {
                    select(keyEvent.getCode());
                }
            }
        });

        stage.addEventHandler(KeyEvent.KEY_TYPED, keyEvent -> {
            final char key = keyEvent.getCharacter().charAt(0);
            if (Character.isDigit(key) && selectedLabel != null) {
                selectedLabel.setText(key + "");
            }
        });
    }

    private void bind(final Label label, final FieldType fieldType, final int row, final int column) {
        final boolean isConstant = fieldType.getPredefined().get().equalsIgnoreCase(TRUE);

        if (isConstant) {
            label.textProperty().bind(fieldType.getConstant());
            label.setStyle("-fx-font-weight: bold;  -fx-font-size: 14; -fx-background-color: #C0C0C0;");
            label.getProperties().put(CONSTANT_FIELD, true);
            fieldType.getValue().setValue(fieldType.getConstant().getValue());
        } else {
            label.textProperty().bindBidirectional(fieldType.getValue());
            label.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
                select(label);
            });
            label.getProperties().put(CONSTANT_FIELD, false);
        }

        label.getProperties().put(BINDED_FIELD, fieldType);
        label.getProperties().put(ROW_INDEX, row);
        label.getProperties().put(COLUMN_INDEX, column);
        this.labels.add(label);
    }

    private void resetBackgroundOfAllFields() {
        for (final Label label : this.labels) {
            if ((boolean) label.getProperties().get(CONSTANT_FIELD)) {
                continue;
            }
            label.setStyle("");
        }
    }

    public void main() {
        final Stage stage = getStage();
        final Scene mainScene = FXUtil.getSceneFromFXML("main", stage);

        stage.setMinHeight(mainScene.getHeight());
        stage.setMinWidth(mainScene.getWidth());
        stage.setScene(mainScene);
    }

    public void solve() {
        for (final Label label : this.labels) {
            if ((boolean) label.getProperties().get(CONSTANT_FIELD)) {
                continue;
            }
            final FieldType fieldType = (FieldType) label.getProperties().get(BINDED_FIELD);
            label.setText(fieldType.getConstant().get());
        }
    }

    public void clear() {
        for (final Label label : this.labels) {
            if ((boolean) label.getProperties().get(CONSTANT_FIELD)) {
                continue;
            }
            label.setText("");
        }
    }

    public void check() {
        final Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Check");
        alert.setHeaderText("Results:");
        alert.setContentText(SudokuUtil.checkSudoku(jsudoku));
        alert.showAndWait();
    }

    public void save() {
        final FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save jSudoku to File");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("XML Files", "*.xml"));

        File file = fileChooser.showSaveDialog(stage);
        if (file != null) {
            if (!file.getName().contains(".")) {
                file = new File(file.getAbsolutePath() + ".xml");
            }
            JAXBUtil.marshal(file, JsudokuType.class, jsudoku);
        }
    }

    private JsudokuType chooseFile() {
        JsudokuType jsudokuType;
        for (; ; ) {
            final FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select jSudoku File to open");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("XML Files", "*.xml")
            );
            final File xmlFile = fileChooser.showOpenDialog(stage);

            jsudokuType = (JsudokuType) JAXBUtil.unmarshal(xmlFile, JsudokuType.class);
            if (jsudokuType != null) {
                return jsudokuType;
            } else {
                final Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Cannot read file:");
                alert.setContentText("The selected file is not a valid jSudoku xml");
                alert.showAndWait();
            }
        }
    }

    private void select(final KeyCode keyCode) {
        final Label label = next(keyCode);

        if (label != null) {
            select(label);
        }
    }

    private void select(final Label label) {
        selectedLabel = label;
        resetBackgroundOfAllFields();
        label.setStyle("-fx-background-color: blue;");
    }

    private Label next(final KeyCode keyCode) {
        int row = (int) selectedLabel.getProperties().get(ROW_INDEX);
        int column = (int) selectedLabel.getProperties().get(COLUMN_INDEX);

        for (; ; ) {
            Label label = null;
            if (KeyCode.UP == keyCode) {
                if (row - 1 >= 0) {
                    label = labels.get(table[--row][column]);
                } else {
                    return null;
                }
            } else if (KeyCode.DOWN == keyCode) {
                if (row + 1 <= 8) {
                    label = labels.get(table[++row][column]);
                } else {
                    return null;
                }
            } else if (KeyCode.LEFT == keyCode) {
                if (column - 1 >= 0) {
                    label = labels.get(table[row][--column]);
                } else {
                    return null;
                }
            } else if (KeyCode.RIGHT == keyCode) {
                if (column + 1 <= 8) {
                    label = labels.get(table[row][++column]);
                } else {
                    return null;
                }
            }

            if ((boolean) label.getProperties().get(CONSTANT_FIELD)) {
                continue;
            } else {
                return label;
            }
        }
    }

    private void bind() {
        bind(labelOfGroup0Field0, jsudoku.getGroup0().getField0(), 0, 0);
        bind(labelOfGroup0Field1, jsudoku.getGroup0().getField1(), 0, 1);
        bind(labelOfGroup0Field2, jsudoku.getGroup0().getField2(), 0, 2);
        bind(labelOfGroup0Field3, jsudoku.getGroup0().getField3(), 1, 0);
        bind(labelOfGroup0Field4, jsudoku.getGroup0().getField4(), 1, 1);
        bind(labelOfGroup0Field5, jsudoku.getGroup0().getField5(), 1, 2);
        bind(labelOfGroup0Field6, jsudoku.getGroup0().getField6(), 2, 0);
        bind(labelOfGroup0Field7, jsudoku.getGroup0().getField7(), 2, 1);
        bind(labelOfGroup0Field8, jsudoku.getGroup0().getField8(), 2, 2);

        bind(labelOfGroup1Field0, jsudoku.getGroup1().getField0(), 0, 3);
        bind(labelOfGroup1Field1, jsudoku.getGroup1().getField1(), 0, 4);
        bind(labelOfGroup1Field2, jsudoku.getGroup1().getField2(), 0, 5);
        bind(labelOfGroup1Field3, jsudoku.getGroup1().getField3(), 1, 3);
        bind(labelOfGroup1Field4, jsudoku.getGroup1().getField4(), 1, 4);
        bind(labelOfGroup1Field5, jsudoku.getGroup1().getField5(), 1, 5);
        bind(labelOfGroup1Field6, jsudoku.getGroup1().getField6(), 2, 3);
        bind(labelOfGroup1Field7, jsudoku.getGroup1().getField7(), 2, 4);
        bind(labelOfGroup1Field8, jsudoku.getGroup1().getField8(), 2, 5);

        bind(labelOfGroup2Field0, jsudoku.getGroup2().getField0(), 0, 6);
        bind(labelOfGroup2Field1, jsudoku.getGroup2().getField1(), 0, 7);
        bind(labelOfGroup2Field2, jsudoku.getGroup2().getField2(), 0, 8);
        bind(labelOfGroup2Field3, jsudoku.getGroup2().getField3(), 1, 6);
        bind(labelOfGroup2Field4, jsudoku.getGroup2().getField4(), 1, 7);
        bind(labelOfGroup2Field5, jsudoku.getGroup2().getField5(), 1, 8);
        bind(labelOfGroup2Field6, jsudoku.getGroup2().getField6(), 2, 6);
        bind(labelOfGroup2Field7, jsudoku.getGroup2().getField7(), 2, 7);
        bind(labelOfGroup2Field8, jsudoku.getGroup2().getField8(), 2, 8);

        bind(labelOfGroup3Field0, jsudoku.getGroup3().getField0(), 3, 0);
        bind(labelOfGroup3Field1, jsudoku.getGroup3().getField1(), 3, 1);
        bind(labelOfGroup3Field2, jsudoku.getGroup3().getField2(), 3, 2);
        bind(labelOfGroup3Field3, jsudoku.getGroup3().getField3(), 4, 0);
        bind(labelOfGroup3Field4, jsudoku.getGroup3().getField4(), 4, 1);
        bind(labelOfGroup3Field5, jsudoku.getGroup3().getField5(), 4, 2);
        bind(labelOfGroup3Field6, jsudoku.getGroup3().getField6(), 5, 0);
        bind(labelOfGroup3Field7, jsudoku.getGroup3().getField7(), 5, 1);
        bind(labelOfGroup3Field8, jsudoku.getGroup3().getField8(), 5, 2);

        bind(labelOfGroup4Field0, jsudoku.getGroup4().getField0(), 3, 3);
        bind(labelOfGroup4Field1, jsudoku.getGroup4().getField1(), 3, 4);
        bind(labelOfGroup4Field2, jsudoku.getGroup4().getField2(), 3, 5);
        bind(labelOfGroup4Field3, jsudoku.getGroup4().getField3(), 4, 3);
        bind(labelOfGroup4Field4, jsudoku.getGroup4().getField4(), 4, 4);
        bind(labelOfGroup4Field5, jsudoku.getGroup4().getField5(), 4, 5);
        bind(labelOfGroup4Field6, jsudoku.getGroup4().getField6(), 5, 3);
        bind(labelOfGroup4Field7, jsudoku.getGroup4().getField7(), 5, 4);
        bind(labelOfGroup4Field8, jsudoku.getGroup4().getField8(), 5, 5);

        bind(labelOfGroup5Field0, jsudoku.getGroup5().getField0(), 3, 6);
        bind(labelOfGroup5Field1, jsudoku.getGroup5().getField1(), 3, 7);
        bind(labelOfGroup5Field2, jsudoku.getGroup5().getField2(), 3, 8);
        bind(labelOfGroup5Field3, jsudoku.getGroup5().getField3(), 4, 6);
        bind(labelOfGroup5Field4, jsudoku.getGroup5().getField4(), 4, 7);
        bind(labelOfGroup5Field5, jsudoku.getGroup5().getField5(), 4, 8);
        bind(labelOfGroup5Field6, jsudoku.getGroup5().getField6(), 5, 6);
        bind(labelOfGroup5Field7, jsudoku.getGroup5().getField7(), 5, 7);
        bind(labelOfGroup5Field8, jsudoku.getGroup5().getField8(), 5, 8);

        bind(labelOfGroup6Field0, jsudoku.getGroup6().getField0(), 6, 0);
        bind(labelOfGroup6Field1, jsudoku.getGroup6().getField1(), 6, 1);
        bind(labelOfGroup6Field2, jsudoku.getGroup6().getField2(), 6, 2);
        bind(labelOfGroup6Field3, jsudoku.getGroup6().getField3(), 7, 0);
        bind(labelOfGroup6Field4, jsudoku.getGroup6().getField4(), 7, 1);
        bind(labelOfGroup6Field5, jsudoku.getGroup6().getField5(), 7, 2);
        bind(labelOfGroup6Field6, jsudoku.getGroup6().getField6(), 8, 0);
        bind(labelOfGroup6Field7, jsudoku.getGroup6().getField7(), 8, 1);
        bind(labelOfGroup6Field8, jsudoku.getGroup6().getField8(), 8, 2);

        bind(labelOfGroup7Field0, jsudoku.getGroup7().getField0(), 6, 3);
        bind(labelOfGroup7Field1, jsudoku.getGroup7().getField1(), 6, 4);
        bind(labelOfGroup7Field2, jsudoku.getGroup7().getField2(), 6, 5);
        bind(labelOfGroup7Field3, jsudoku.getGroup7().getField3(), 7, 3);
        bind(labelOfGroup7Field4, jsudoku.getGroup7().getField4(), 7, 4);
        bind(labelOfGroup7Field5, jsudoku.getGroup7().getField5(), 7, 5);
        bind(labelOfGroup7Field6, jsudoku.getGroup7().getField6(), 8, 3);
        bind(labelOfGroup7Field7, jsudoku.getGroup7().getField7(), 8, 4);
        bind(labelOfGroup7Field8, jsudoku.getGroup7().getField8(), 8, 5);

        bind(labelOfGroup8Field0, jsudoku.getGroup8().getField0(), 6, 6);
        bind(labelOfGroup8Field1, jsudoku.getGroup8().getField1(), 6, 7);
        bind(labelOfGroup8Field2, jsudoku.getGroup8().getField2(), 6, 8);
        bind(labelOfGroup8Field3, jsudoku.getGroup8().getField3(), 7, 6);
        bind(labelOfGroup8Field4, jsudoku.getGroup8().getField4(), 7, 7);
        bind(labelOfGroup8Field5, jsudoku.getGroup8().getField5(), 7, 8);
        bind(labelOfGroup8Field6, jsudoku.getGroup8().getField6(), 8, 6);
        bind(labelOfGroup8Field7, jsudoku.getGroup8().getField7(), 8, 7);
        bind(labelOfGroup8Field8, jsudoku.getGroup8().getField8(), 8, 8);
    }
}
