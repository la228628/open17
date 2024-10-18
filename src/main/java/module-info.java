module org.example.testopen17 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;

    opens org.example.testopen17 to javafx.fxml;
    exports org.example.testopen17;
}