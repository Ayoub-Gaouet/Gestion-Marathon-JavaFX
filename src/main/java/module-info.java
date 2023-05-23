module com.ayoub.marathons {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ayoub.marathons to javafx.fxml;
    exports com.ayoub.marathons;
}