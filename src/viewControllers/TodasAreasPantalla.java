package viewControllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;


public class TodasAreasPantalla
{


    private Motor motor;

    @FXML
    private ImageView jungleImage;

    @FXML
    private ImageView beachImage;

    @FXML
    private ImageView forestImage;

    @FXML
    private ImageView desertImage;

    @FXML
    private Group haveAllGroup;

    private ArrayList<Pokemon> area1 = new ArrayList<>();
    private ArrayList<Pokemon> area2 = new ArrayList<>();
    private ArrayList<Pokemon> area3 = new ArrayList<>();
    private ArrayList<Pokemon> area4 = new ArrayList<>();
    private ArrayList<Pokemon> bankPokemon = new ArrayList<>();



    public void receiveMotorInstance(Motor m, ArrayList<Pokemon> area1, ArrayList<Pokemon> area2, ArrayList<Pokemon> area3, ArrayList<Pokemon> area4,ArrayList<Pokemon> bankPokemon )
    {

        this.motor = m;
        jungleImage.setOpacity(.5);
        this.area1 = area1;
        this.area2 = area2;
        this.area3 = area3;
        this.area4 = area4;
        this.bankPokemon = bankPokemon;
        haveAllGroup.setVisible(false);

    }

    public void goToBeachButton(javafx.scene.input.MouseEvent mouseEvent)
    {
        int a = 0;
        for(int o = 0; o < bankPokemon.size(); o++ )
        {
            for(int p = 0; p < area1.size(); p++ )
            {
                if(bankPokemon.get(o).getName().equals(area1.get(p).getName()))
                {
                    a++;
                }
            }
        }

        if(a == area1.size())
        {
            haveAllGroup.setVisible(true);
        }
        else
        {
            motor.showArea1Pantalla(mouseEvent);
        }
    }

    public void goToDesertButton(MouseEvent mouseEvent)
    {
        int a = 0;
        for(int o = 0; o < bankPokemon.size(); o++ )
        {
            for(int p = 0; p < area3.size(); p++ )
            {
                if(bankPokemon.get(o).getName().equals(area3.get(p).getName()))
                {
                    a++;
                }
            }
        }

        if(a == area3.size())
        {
            haveAllGroup.setVisible(true);
        }
        else
        {
            motor.showArea3Pantalla1(mouseEvent);
        }

    }

    public void goToForestButton(MouseEvent mouseEvent)
    {
        int a = 0;
        for(int o = 0; o < bankPokemon.size(); o++ )
        {
            for(int p = 0; p < area4.size(); p++ )
            {
                if(bankPokemon.get(o).getName().equals(area4.get(p).getName()))
                {
                    a++;
                }
            }
        }

        if(a == area4.size())
        {
            haveAllGroup.setVisible(true);
        }
        else
        {
            motor.showArea4Pantalla1(mouseEvent);
        }

    }

    public void goBack(MouseEvent mouseEvent)
    {
        motor.showPantallaPrincipal(mouseEvent);

    }

    public void jungleEnterGroup(MouseEvent mouseEvent)
    {
        jungleImage.setOpacity(1);
    }

    public void jungleExitGroup(MouseEvent mouseEvent)
    {
        jungleImage.setOpacity(.5);
    }

    public void forestEnterGroup(MouseEvent mouseEvent)
    {
        forestImage.setOpacity(1);
    }

    public void forestExitGroup(MouseEvent mouseEvent)
    {
        forestImage.setOpacity(.5);
    }

    public void beachEnterGroup(MouseEvent mouseEvent)
    {
        beachImage.setOpacity(1);
    }

    public void beachExitGroup(MouseEvent mouseEvent)
    {
        beachImage.setOpacity(.5);
    }

    public void desertEnterGroup(MouseEvent mouseEvent)
    {
        desertImage.setOpacity(1);
    }

    public void desertExitGroup(MouseEvent mouseEvent)
    {
        desertImage.setOpacity(.5);
    }

    public void goToJungleButton(MouseEvent mouseEvent)
    {

        int a = 0;
        for(int o = 0; o < bankPokemon.size(); o++ )
        {
            for(int p = 0; p < area2.size(); p++ )
            {
                if(bankPokemon.get(o).getName().equals(area2.get(p).getName()))
                {
                    a++;
                }
            }
        }

        if(a == area2.size())
        {
            haveAllGroup.setVisible(true);
        }
        else
        {
            motor.showArea2Pantalla1(mouseEvent);
        }

    }

    public void okForHaveAll(ActionEvent actionEvent)
    {
        haveAllGroup.setVisible(false);
    }
}
