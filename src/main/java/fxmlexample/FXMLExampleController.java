package fxmlexample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import nodeExample.ColorfulCircles;
import onswich.Second;

import java.io.IOException;

public class FXMLExampleController {
    @FXML
    private Text actiontarget;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
        try {
            FXMLExample.onSwitch();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
