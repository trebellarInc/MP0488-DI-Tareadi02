module xyz.trebellar.tareadi2_g {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens xyz.trebellar.tareadi2_g to javafx.fxml;
    exports xyz.trebellar.tareadi2_g;
}
