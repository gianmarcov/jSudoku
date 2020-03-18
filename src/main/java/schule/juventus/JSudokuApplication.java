package schule.juventus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.log4j.Logger;
import schule.juventus.util.FXUtil;
import java.io.IOException;

public class JSudokuApplication extends Application {
    final static Logger logger = Logger.getLogger(JSudokuApplication.class);

    @Override public void init() {
    }

    @Override public void start(Stage primaryStage) throws IOException {
        final Scene scene = FXUtil.getSceneFromFXML("main", primaryStage);
        primaryStage.setTitle("jSudoku");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override public void stop() {
    }



    public static void main(String[] parameters) {
        launch(parameters);
    }
}