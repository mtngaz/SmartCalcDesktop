module edu.school.smartcalc.smartcalc {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.school.smartcalc to javafx.fxml;
    exports edu.school.smartcalc;
    exports edu.school.smartcalc.view;
    opens edu.school.smartcalc.view to javafx.fxml;
    exports edu.school.smartcalc.model;
    opens edu.school.smartcalc.model to javafx.fxml;
}