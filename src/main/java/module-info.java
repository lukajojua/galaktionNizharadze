module com.example.java_gaga_nijharadze {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.java_galaktion_nizharadze to javafx.fxml;
    exports com.example.java_galaktion_nizharadze;
}