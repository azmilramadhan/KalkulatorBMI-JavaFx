package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.CalculatorBMI2;

public class KalkulatorBMIController implements Initializable {

    @FXML
    private Label hasillabel;
    @FXML
    private TextField beratField;
    @FXML
    private TextField tinggiField;

    private CalculatorBMI2 kal = new CalculatorBMI2();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void hitung(ActionEvent event) {
        try {
            if (tinggiField.getText().trim().isEmpty() || beratField.getText().trim().isEmpty()) {
                throw new IllegalArgumentException("Kolom input tidak boleh kosong!");
            }

            float tinggiInput = Float.parseFloat(tinggiField.getText().trim());
            float beratInput = Float.parseFloat(beratField.getText().trim());

            if (tinggiInput <= 0 || beratInput <= 0) {
                throw new IllegalArgumentException("Nilai harus lebih besar dari 0!");
            }

            kal.setTinggi(tinggiInput);
            kal.setBerat(beratInput);
            kal.hitung();

            String angkaHasil = String.format("%.2f", kal.getHasil());
            String statusKategori = kal.getKategori();

            hasillabel.setText(angkaHasil + " - " + statusKategori);

        } catch (NumberFormatException e) {
            hasillabel.setText("Masukkan angka yang valid!");
        } catch (IllegalArgumentException e) {
            hasillabel.setText(e.getMessage());
        }
    }
} 