module com.example.tutorial1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.tutorial1 to javafx.fxml;
    exports com.example.tutorial1;
}