package xyz.trebellar.tareadi2_g;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class vPrincipalController {

    @FXML
    private Button btnReservas;

    @FXML
    private void clickReservas(ActionEvent event) throws IOException {
        App.setRoot("vReservas");
    }
}
