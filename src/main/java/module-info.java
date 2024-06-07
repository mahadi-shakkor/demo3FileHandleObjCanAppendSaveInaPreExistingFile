module com.oop.mahadi.demo3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mahadi.demo3 to javafx.fxml;
    exports com.oop.mahadi.demo3;
}