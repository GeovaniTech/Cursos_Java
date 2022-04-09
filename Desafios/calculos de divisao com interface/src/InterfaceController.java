import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class InterfaceController {

    @FXML
    private Button btnDividir;

    @FXML
    private Text lblResultDivisao;

    @FXML
    private Text lblResultResto;

    @FXML
    private TextField txtDenominador;

    @FXML
    private TextField txtNumerador;

    @FXML
    void clickDividir(ActionEvent event) {
        Integer numerador = Integer.parseInt(txtNumerador.getText());
        Integer denominador = Integer.parseInt(txtDenominador.getText());

        try {
            float divisao = numerador / denominador;
            lblResultDivisao.setText("" + divisao);

            float resto = numerador % denominador;
            lblResultResto.setText("" + resto);
        
        } catch (NumberFormatException e) {
            lblResultResto.setText("0");
            lblResultDivisao.setText("0");
            
            throw e;
        }

    }

}
