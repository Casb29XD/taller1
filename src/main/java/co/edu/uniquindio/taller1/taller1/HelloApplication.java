package co.edu.uniquindio.taller1.taller1;

import co.edu.uniquindio.taller1.taller1.controladores.ViewControllerprincipal;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InterPrincipalCRUD.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        ViewControllerprincipal controllerprincipal = fxmlLoader.getController();
        controllerprincipal.setStage(stage);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}