module com.example.milionar {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.milionar to javafx.fxml;
    exports com.example.milionar;
}