import java.util.Calendar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class InterfaceController {

    @FXML
    private Button btnCalcular;

    @FXML
    private Text lblResult;

    @FXML
    private TextField txtData;

    @FXML
    void clickCalcular(ActionEvent event) {
        Calendar cal = Calendar.getInstance();

        int year = cal.get(cal.YEAR);

        Integer data_nascimento = Integer.parseInt(txtData.getText());

        lblResult.setText("" + (year - data_nascimento));
    }

}
