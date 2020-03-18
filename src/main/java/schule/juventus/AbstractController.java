package schule.juventus;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public abstract class AbstractController {

    @FXML
    AnchorPane anchorPane;

    Stage stage;

    public void afterInitialize(final Stage stage) {
        this.stage = stage;
    }

    public Stage getStage() {
        return (Stage) anchorPane.getScene().getWindow();
    }

    public AnchorPane getAnchorPane() {
        return anchorPane;
    }
}
