package viewControllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.media.MediaView;


/**
 * controller for the view if Pantalla Inicial
 */


public class PantallaStart {

    private Motor motor;

    @FXML
    private Button startButton;


    public void startGame(ActionEvent event)
    {
        motor.showPantallaInicial(event);
    }

    public void receiveMotorInstance(Motor m)
    {
        this.motor = m;
    }


}
