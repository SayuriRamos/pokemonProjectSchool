package viewControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class SelectGymEntrenadorPantalla {
    private Motor motor;
    public void receiveMotorInstance(Motor m, ArrayList<Integer> Medallas)
    {
        this.motor = m;
        entrenadorChose = "Whitney";
        alreadyHave.setVisible(false);

        gyms.add(whitneyPlain);
        gyms.add(brockBoulder);
        gyms.add(pryceGlacier);
        gyms.add(erikaRainbow);
        gyms.add(kogaSoul);
        gyms.add(surgeThunder);
        gyms.add(blaineVolcano);

        gyms.get(0).setVisible(true);
        gyms.get(1).setVisible(false);
        gyms.get(2).setVisible(false);
        gyms.get(3).setVisible(false);
        gyms.get(4).setVisible(false);
        gyms.get(5).setVisible(false);
        gyms.get(6).setVisible(false);

        medallasSiYaSeTienen = Medallas;

        for (int i = 0; i < medallasSiYaSeTienen.size(); i++)
        {
            if(medallasSiYaSeTienen.get(i).equals(1))
            {
                gyms.get(i).setDisable(true);
                gyms.get(i).setOpacity(.5);
            }
        }

    }

    @FXML
    private Group whitneyPlain;

    @FXML
    private Group brockBoulder;

    @FXML
    private Group pryceGlacier;

    @FXML
    private Group erikaRainbow;

    @FXML
    private Group kogaSoul;

    @FXML
    private Group surgeThunder;

    @FXML
    private Group blaineVolcano;

    @FXML
    private Group alreadyHave;

    @FXML
    private Button afterButton;

    @FXML
    private Button goToFightButton;

    @FXML
    private Button beforeButton;

    ArrayList<Group> gyms = new ArrayList<Group>();
    private int numEntrenador = 0;
    private ArrayList<Integer> medallasSiYaSeTienen = new ArrayList<>();
    private String entrenadorChose = "";

    public void beforeButtonAction(ActionEvent actionEvent)
    {
        if(numEntrenador == 0)
        {
            numEntrenador = 6;
            gyms.get(0).setVisible(false);
            gyms.get(1).setVisible(false);
            gyms.get(2).setVisible(false);
            gyms.get(3).setVisible(false);
            gyms.get(4).setVisible(false);
            gyms.get(5).setVisible(false);
            gyms.get(6).setVisible(true);
        }
        else if(numEntrenador == 1)
        {
            numEntrenador = 0;
            gyms.get(0).setVisible(true);
            gyms.get(1).setVisible(false);
            gyms.get(2).setVisible(false);
            gyms.get(3).setVisible(false);
            gyms.get(4).setVisible(false);
            gyms.get(5).setVisible(false);
            gyms.get(6).setVisible(false);

        }

        else if(numEntrenador == 6)
        {
            numEntrenador = 5;
            gyms.get(0).setVisible(false);
            gyms.get(1).setVisible(false);
            gyms.get(2).setVisible(false);
            gyms.get(3).setVisible(false);
            gyms.get(4).setVisible(false);
            gyms.get(5).setVisible(true);
            gyms.get(6).setVisible(false);

        }

        else if(numEntrenador == 5)
        {
            numEntrenador = 4;
            gyms.get(0).setVisible(false);
            gyms.get(1).setVisible(false);
            gyms.get(2).setVisible(false);
            gyms.get(3).setVisible(false);
            gyms.get(4).setVisible(true);
            gyms.get(5).setVisible(false);
            gyms.get(6).setVisible(false);

        }

        else if(numEntrenador == 4)
        {
            numEntrenador = 3;
            gyms.get(0).setVisible(false);
            gyms.get(1).setVisible(false);
            gyms.get(2).setVisible(false);
            gyms.get(3).setVisible(true);
            gyms.get(4).setVisible(false);
            gyms.get(5).setVisible(false);
            gyms.get(6).setVisible(false);

        }

        else if(numEntrenador == 3)
        {
            numEntrenador = 2;
            gyms.get(0).setVisible(false);
            gyms.get(1).setVisible(false);
            gyms.get(2).setVisible(true);
            gyms.get(3).setVisible(false);
            gyms.get(4).setVisible(false);
            gyms.get(5).setVisible(false);
            gyms.get(6).setVisible(false);

        }
        else if(numEntrenador == 2)
        {
            numEntrenador = 1;
            gyms.get(0).setVisible(false);
            gyms.get(1).setVisible(true);
            gyms.get(2).setVisible(false);
            gyms.get(3).setVisible(false);
            gyms.get(4).setVisible(false);
            gyms.get(5).setVisible(false);
            gyms.get(6).setVisible(false);

        }



        if(whitneyPlain.isVisible() && whitneyPlain.isDisable() == false)
        {
            entrenadorChose = "Whitney";
        }
        else if(brockBoulder.isVisible() && brockBoulder.isDisable() == false)
        {
            entrenadorChose = "Brock";
        }
        else if(pryceGlacier.isVisible() && pryceGlacier.isDisable() == false)
        {
            entrenadorChose = "Pryce";
        }
        else if(erikaRainbow.isVisible() && erikaRainbow.isDisable() == false)
        {
            entrenadorChose = "Erika";
        }
        else if(kogaSoul.isVisible() && kogaSoul.isDisable() == false)
        {
            entrenadorChose = "Koga";
        }
        else if(surgeThunder.isVisible() && surgeThunder.isDisable() == false)
        {
            entrenadorChose = "Surge";
        }
        else if(blaineVolcano.isVisible() && blaineVolcano.isDisable() == false)
        {
            entrenadorChose = "Blaine";
        }

    }

    public void afterButtonAction(ActionEvent actionEvent)
    {

        if(numEntrenador == 6)
        {
            numEntrenador = 0;
            gyms.get(0).setVisible(true);
            gyms.get(1).setVisible(false);
            gyms.get(2).setVisible(false);
            gyms.get(3).setVisible(false);
            gyms.get(4).setVisible(false);
            gyms.get(5).setVisible(false);
            gyms.get(6).setVisible(false);
        }
        else if(numEntrenador == 5)
        {
            numEntrenador = 6;
            gyms.get(0).setVisible(false);
            gyms.get(1).setVisible(false);
            gyms.get(2).setVisible(false);
            gyms.get(3).setVisible(false);
            gyms.get(4).setVisible(false);
            gyms.get(5).setVisible(false);
            gyms.get(6).setVisible(true);

        }

        else if(numEntrenador == 4)
        {
            numEntrenador = 5;
            gyms.get(0).setVisible(false);
            gyms.get(1).setVisible(false);
            gyms.get(2).setVisible(false);
            gyms.get(3).setVisible(false);
            gyms.get(4).setVisible(false);
            gyms.get(5).setVisible(true);
            gyms.get(6).setVisible(false);

        }

        else if(numEntrenador == 3)
        {
            numEntrenador = 4;
            gyms.get(0).setVisible(false);
            gyms.get(1).setVisible(false);
            gyms.get(2).setVisible(false);
            gyms.get(3).setVisible(false);
            gyms.get(4).setVisible(true);
            gyms.get(5).setVisible(false);
            gyms.get(6).setVisible(false);

        }

        else if(numEntrenador == 2)
        {
            numEntrenador = 3;
            gyms.get(0).setVisible(false);
            gyms.get(1).setVisible(false);
            gyms.get(2).setVisible(false);
            gyms.get(3).setVisible(true);
            gyms.get(4).setVisible(false);
            gyms.get(5).setVisible(false);
            gyms.get(6).setVisible(false);

        }

        else if(numEntrenador == 1)
        {
            numEntrenador = 2;
            gyms.get(0).setVisible(false);
            gyms.get(1).setVisible(false);
            gyms.get(2).setVisible(true);
            gyms.get(3).setVisible(false);
            gyms.get(4).setVisible(false);
            gyms.get(5).setVisible(false);
            gyms.get(6).setVisible(false);

        }
        else if(numEntrenador == 0)
        {
            numEntrenador = 1;
            gyms.get(0).setVisible(false);
            gyms.get(1).setVisible(true);
            gyms.get(2).setVisible(false);
            gyms.get(3).setVisible(false);
            gyms.get(4).setVisible(false);
            gyms.get(5).setVisible(false);
            gyms.get(6).setVisible(false);

        }

        if(whitneyPlain.isVisible() && whitneyPlain.isDisable() == false)
        {
            entrenadorChose = "Whitney";
        }
        else if(brockBoulder.isVisible() && brockBoulder.isDisable() == false)
        {
            entrenadorChose = "Brock";
        }
        else if(pryceGlacier.isVisible() && pryceGlacier.isDisable() == false)
        {
            entrenadorChose = "Pryce";
        }
        else if(erikaRainbow.isVisible() && erikaRainbow.isDisable() == false)
        {
            entrenadorChose = "Erika";
        }
        else if(kogaSoul.isVisible() && kogaSoul.isDisable() == false)
        {
            entrenadorChose = "Koga";
        }
        else if(surgeThunder.isVisible() && surgeThunder.isDisable() == false)
        {
            entrenadorChose = "Surge";
        }
        else if(blaineVolcano.isVisible() && blaineVolcano.isDisable() == false)
        {
            entrenadorChose = "Blaine";
        }



    }

    public void goToFight(ActionEvent actionEvent)
    {
        if(gyms.get(numEntrenador).isDisable())
        {
            alreadyHave.setVisible(true);
            afterButton.setDisable(true);
            beforeButton.setDisable(true);
            goToFightButton.setDisable(true);

        }
        else
        {
            System.out.println(entrenadorChose);
            motor.getInfoFromSelectionOfGym(entrenadorChose);
            motor.showGymsPantalla(actionEvent);
        }

        System.out.println(entrenadorChose);

    }

    public void bactToPrincipal(MouseEvent mouseEvent)
    {
        motor.showPantallaPrincipal(mouseEvent);
    }

    public void okButtonForAlreadyHave(ActionEvent actionEvent)
    {
        alreadyHave.setVisible(false);
        afterButton.setDisable(false);
        beforeButton.setDisable(false);
        goToFightButton.setDisable(false);

    }
}
