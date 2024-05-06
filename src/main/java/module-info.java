module com.example.test__fp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test__fp to javafx.fxml;
    exports com.example.test__fp;
}