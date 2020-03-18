package schule.juventus;

import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.log4j.Logger;
import schule.juventus.util.FXUtil;

/**
 * Main controller.
 */
public class MainController extends AbstractController {
    final static Logger logger = Logger.getLogger(MainController.class);


    /**
     * Initialize.
     */
    public void initialize() {
        logger.info(this.getClass().getName()+" initialized");
    }

    /**
     * Start.
     */
    public void start() {
        logger.info("navigate to Sudoku");
        final Scene sudokuScene = FXUtil.getSceneFromFXML("sudoku", getStage());
        final Stage stage = getStage();

        stage.setMinHeight(sudokuScene.getHeight());
        stage.setMinWidth(sudokuScene.getWidth());
        stage.setScene(sudokuScene);
    }

    /**
     * Exit.
     */
    public void exit() {
        System.exit(0);
    }
}
