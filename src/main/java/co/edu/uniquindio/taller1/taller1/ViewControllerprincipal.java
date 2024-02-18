package co.edu.uniquindio.taller1.taller1;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewControllerprincipal {
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
    void eliminarCLientes(ActionEvent event) {

    }

    @FXML
    void eliminarProductos(ActionEvent event) {

    }

    @FXML
    void registrarClientes(ActionEvent event) {

    }

    @FXML
    void registrarProductos(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("InterRegistroProducto.fxml"));
        Stage stage = (Stage) BtnRegistroProd.getScene().getWindow();
        stage.setTitle("Interfaz 2");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
