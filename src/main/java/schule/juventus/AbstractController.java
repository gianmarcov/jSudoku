package schule.juventus;

import javafx.stage.Stage;

/**
 * abstract controller for javaFX Controller.
 */
public abstract class AbstractController {

    /**
     * The Stage.
     */
    Stage stage;

    /**
     * After initialize.
     *
     * @param stage the stage
     */
    public void afterInitialize(final Stage stage) {
        this.stage = stage;
    }

    /**
     * Gets stage.
     *
     * @return the stage
     */
    public Stage getStage() {
        return stage;
    }
}
