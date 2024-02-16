module co.edu.uniquindio.taller1.taller1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens co.edu.uniquindio.taller1.taller1 to javafx.fxml;
    exports co.edu.uniquindio.taller1.taller1;
}