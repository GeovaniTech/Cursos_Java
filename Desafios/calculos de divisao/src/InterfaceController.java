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
        System.out.println("Apenas testando");
    }

}
