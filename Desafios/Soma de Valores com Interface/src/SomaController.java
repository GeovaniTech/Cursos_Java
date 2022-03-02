import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class SomaController {

    @FXML
    private Button btnSoma;

    @FXML
    private TextField textN1;

    @FXML
    private TextField txtN2;

    @FXML
    private Text txtResult;

    @FXML
    private Text txtResult1;

    @FXML
    void clickSoma(ActionEvent event) {
        int n1 = Integer.parseInt(textN1.getText());
        int n2 = Integer.parseInt(txtN2.getText());

        int soma = n1 + n2;

        txtResult.setText("" + soma);


    }

}
