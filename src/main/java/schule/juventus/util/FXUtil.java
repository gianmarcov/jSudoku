package schule.juventus.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import schule.juventus.AbstractController;

import java.io.IOException;

public class FXUtil {

    public static Scene getSceneFromFXML(final String name, final Stage primaryStage) {
        Parent parent = new Pane();
        try {
            FXMLLoader loader = new FXMLLoader(FXUtil.class.getClassLoader().getResource("fxml/"+name+".fxml"));
            parent = loader.load();
            ((AbstractController)loader.getController()).afterInitialize(primaryStage);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Scene(parent);
    }
}
