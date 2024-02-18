package co.edu.uniquindio.taller1.taller1.controladores;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewControllerprincipal {
    private  Stage stage;
    @FXML
    private Button BtnEliminarClient;

    @FXML
    private Button BtnEliminarProducto;

    @FXML
    private Button BtnInicio;

    @FXML
    private Button BtnRegistrarClient;

    @FXML
    private Button BtnRegistroProd;

    @FXML
    void iniciButton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InterInicio.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        ViewControlerInicio controlerInicio = fxmlLoader.getController();
        controlerInicio.setStage(stage);
        stage.show();
    }

    public void setStage(Stage stage) {
        stage = stage;
    }
}
