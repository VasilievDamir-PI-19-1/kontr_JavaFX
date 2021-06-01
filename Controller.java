mport javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField login;
    @FXML
    TextField password;
    @FXML
    Label TextLabel;

    @FXML
    public void click(ActionEvent Event){
        if (Login.getText().equals("Admin") && Password.getText().equals("Password")){
            TextLabel.setText("Hello Admin");
        }else{
            TextLabel.setText("Error Authorization");
        }
    }
    @FXML
    public void clickTwo(ActionEvent Event){
        Login.setText("");
        Password.setText("");
        TextLabel.setText("Type the login and password");
    }
}
