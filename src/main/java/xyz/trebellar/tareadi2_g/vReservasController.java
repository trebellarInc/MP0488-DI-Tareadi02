package xyz.trebellar.tareadi2_g;

import java.io.IOException;
import java.time.LocalDate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.InputMethodEvent;

public class vReservasController {

    @FXML
    private Button bltAceptar;
    @FXML
    private Button btnCancelar;
    @FXML
    private ComboBox<String> cbbTipo;
    @FXML
    private Label lblLey;
    @FXML
    private ComboBox<String> cbbTipoCocina;
    @FXML
    private CheckBox cbxFumador;
    @FXML
    private RadioButton rbAlojamiento;
    @FXML
    private RadioButton rbMedia;
    @FXML
    private RadioButton rbComleta;
    @FXML
    private Label lblCliente;
    @FXML
    private Label lblNombre;
    @FXML
    private TextField txfNombre;
    @FXML
    private Label lblApellidos;
    @FXML
    private TextField txfApellidos;
    @FXML
    private Label lblLocalidad;
    @FXML
    private TextField txfLocalidad;
    @FXML
    private Label lblProvincia;
    @FXML
    private TextField txfProvincia;
    @FXML
    private Label lblDni;
    @FXML
    private TextField txfDni;
    @FXML
    private Label lblReserva;
    @FXML
    private DatePicker dpLlegada;
    @FXML
    private DatePicker dpSalida;
    @FXML
    private Label lblLlegada;
    @FXML
    private Label lblSalida;
    @FXML
    private Label lblNumHabitaciones;
    @FXML
    private TextField txfNumHabitaciones;
    @FXML
    private Label lblTipoComida;
    @FXML
    private Label lblRegimen;
    @FXML
    private Label lblHabitaciones;
    @FXML
    private Label lblTipoCocina;

    public void initialize() {
        cbbTipo.getItems().addAll("Banquete", "Jornada", "Congreso");
        cbbTipoCocina.getItems().addAll("Buffet", "Carta", "Pedir cita con el chef", "No precisa");
        cbbTipoCocina.setValue("No precisa");

        cbbTipo.setValue("Banquete");
        lblLey.setVisible(false);

        ToggleGroup grupo = new ToggleGroup();
        rbAlojamiento.setToggleGroup(grupo);
        rbMedia.setToggleGroup(grupo);
        rbComleta.setToggleGroup(grupo);

        dpLlegada.setValue(LocalDate.now());
    }

    private void clickReservas(ActionEvent event) throws IOException {
        App.setRoot("vPrincipal");

    }

    @FXML
    private void clickCancelar(ActionEvent event) throws IOException {
        App.setRoot("vPrincipal");
    }

    @FXML
    private void checkFumador(ActionEvent event) {
        if (cbxFumador.isSelected()) {
            lblLey.setVisible(true);
        } else {
            lblLey.setVisible(false);
        }
    }


    @FXML
    private void clickReservar(ActionEvent event) {

        if (dpSalida.getValue() != null && dpLlegada != null) {
            if (dpSalida.getValue().isBefore(dpLlegada.getValue())) {
                System.out.println("Fecha de salida no valida.");
                        dpSalida.setStyle("-fx-border-color: red;");

            }else{                        dpSalida.setStyle("-fx-border-color: null;");

            }
        }

    }
}
