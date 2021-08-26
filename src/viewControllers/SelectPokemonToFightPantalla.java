package viewControllers;

import com.sun.deploy.security.SelectableSecurityManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;


public class SelectPokemonToFightPantalla
{

    private Motor motor;
    /*
    Pokemones que guarda los que se van a cambiar
     */
    private Pokemon savePokemon;
    private Pokemon savePokemon2;

    private ArrayList<Pokemon> beltPokemon = new ArrayList<>();


    @FXML
    private Label beltName1;

    @FXML
    private Label beltName2;

    @FXML
    private Label beltName3;

    @FXML
    private Label beltName4;

    @FXML
    private Label beltName5;

    @FXML
    private Label beltName6;

    @FXML
    private Button startButton;

    @FXML
    private Button replaceButton;

    @FXML
    private ImageView beltImage1;

    @FXML
    private ImageView beltImage2;

    @FXML
    private ImageView beltImage3;

    @FXML
    private ImageView beltImage4;

    @FXML
    private ImageView beltImage5;

    @FXML
    private ImageView beltImage6;

    @FXML
    private Group selectOneGroup;

    @FXML
    private TextField change;

    @FXML
    private TextField forWhat;

    /*
    Variables para saber saber de donde viene, si de la pantalla Gyms o desde el pokedex
     */
    private String gymsOareas = "";
    private String pokedexOpp;

    public void receiveMotorInstance(Motor m, String gymsOareas, String pokedexOpp)
    {
        selectOneGroup.setVisible(false);
        this.motor = m;
        this.gymsOareas = gymsOareas;
        this.pokedexOpp = pokedexOpp;

        if(pokedexOpp.equals("pokedex"))
        {
            startButton.setDisable(true);
        }
        else
        {
            startButton.setDisable(false);
        }

        beltPokemon = motor.getArrayListBeltPokemons();
        beltName1.setText("0. "+beltPokemon.get(0).getName());
        Image imgen1 = new Image("/images/imgPokemones/"+beltPokemon.get(0).getName()+".png");
        beltImage1.setImage(imgen1);


        try
        {
            beltName2.setText("1. "+beltPokemon.get(1).getName());
            Image imgen2 = new Image("/images/imgPokemones/"+beltPokemon.get(1).getName()+".png");
            beltImage2.setImage(imgen2);
        }
        catch(IndexOutOfBoundsException e)
        {
            beltName2.setDisable(true);
        }

        try
        {
            beltName3.setText("2. "+beltPokemon.get(2).getName());
            Image imgen3 = new Image("/images/imgPokemones/"+beltPokemon.get(2).getName()+".png");
            beltImage3.setImage(imgen3);
        }
        catch(IndexOutOfBoundsException e)
        {
            beltName3.setDisable(true);
        }

        try
        {
            beltName4.setText("3. "+beltPokemon.get(3).getName());
            Image imgen4 = new Image("/images/imgPokemones/"+beltPokemon.get(3).getName()+".png");
            beltImage4.setImage(imgen4);
        }
        catch(IndexOutOfBoundsException e)
        {
            beltName4.setDisable(true);
        }

        try
        {
            beltName5.setText("4. "+beltPokemon.get(4).getName());
            Image imgen5 = new Image("/images/imgPokemones/"+beltPokemon.get(4).getName()+".png");
            beltImage5.setImage(imgen5);
        }
        catch(IndexOutOfBoundsException e)
        {
            beltName5.setDisable(true);
        }

        try
        {
            beltName6.setText("5. "+beltPokemon.get(5).getName());
            Image imgen6 = new Image("/images/imgPokemones/"+beltPokemon.get(5).getName()+".png");
            beltImage6.setImage(imgen6);
        }
        catch(IndexOutOfBoundsException e)
        {
            beltName6.setDisable(true);
        }
    }

    public void goToAreasButton(ActionEvent actionEvent)
    {
        if(gymsOareas == "area")
        {
            motor.getNamePokemonToUseForFight(beltPokemon.get(0).getName(), beltPokemon);
            motor.showTodasAreasPantalla(actionEvent);

        }
        else if(gymsOareas == "gym")
        {
            motor.getNamePokemonToUseForFight(beltPokemon.get(0).getName(), beltPokemon);
            motor.showSelectGymEntrenadorPantalla(actionEvent);
        }
    }

    public void okButton(ActionEvent actionEvent)
    {
        if(pokedexOpp.equals("pokedex"))
        {
            selectOneGroup.setVisible(false);
        }
        else
        {
            selectOneGroup.setVisible(false);
            startButton.setDisable(false);
        }

    }

    public void goback(MouseEvent mouseEvent)
    {
        if(pokedexOpp.equals("principal"))
        {
            motor.showPantallaPrincipal(mouseEvent);
        }
        else if(pokedexOpp.equals("pokedex"))
        {
            motor.showPokedex2(mouseEvent);
        }

    }

    public void replace(ActionEvent actionEvent)
    {
        try
        {
            if(change.getText() == "" || forWhat.getText() == ""  || Integer.valueOf(change.getText()) >= beltPokemon.size() || Integer.valueOf(forWhat.getText()) >= beltPokemon.size())
            {
                selectOneGroup.setVisible(true);
                startButton.setDisable(true);
            }
            else
            {
                savePokemon = beltPokemon.get(Integer.valueOf(change.getText()));
                beltPokemon.remove(Integer.valueOf(change.getText()));

                savePokemon2 = beltPokemon.get(Integer.valueOf(forWhat.getText()));
                beltPokemon.remove(Integer.valueOf(forWhat.getText()));

                beltPokemon.set(Integer.valueOf(forWhat.getText()), savePokemon);
                beltPokemon.set(Integer.valueOf(change.getText()), savePokemon2);

                beltPokemon = motor.getArrayListBeltPokemons();
                beltName1.setText("0. "+beltPokemon.get(0).getName());
                Image imgen1 = new Image("/images/imgPokemones/"+beltPokemon.get(0).getName()+".png");
                beltImage1.setImage(imgen1);

                try
                {
                    beltName2.setText("1. "+beltPokemon.get(1).getName());
                    Image imgen2 = new Image("/images/imgPokemones/"+beltPokemon.get(1).getName()+".png");
                    beltImage2.setImage(imgen2);
                }
                catch(IndexOutOfBoundsException e)
                {
                    beltName2.setDisable(true);
                }

                try
                {
                    beltName3.setText("2. "+beltPokemon.get(2).getName());
                    Image imgen3 = new Image("/images/imgPokemones/"+beltPokemon.get(2).getName()+".png");
                    beltImage3.setImage(imgen3);
                }
                catch(IndexOutOfBoundsException e)
                {
                    beltName3.setDisable(true);
                }


                try
                {
                    beltName4.setText("3. "+beltPokemon.get(3).getName());
                    Image imgen4 = new Image("/images/imgPokemones/"+beltPokemon.get(3).getName()+".png");
                    beltImage4.setImage(imgen4);
                }
                catch(IndexOutOfBoundsException e)
                {
                    beltName4.setDisable(true);
                }


                try
                {
                    beltName5.setText("4. "+beltPokemon.get(4).getName());
                    Image imgen5 = new Image("/images/imgPokemones/"+beltPokemon.get(4).getName()+".png");
                    beltImage5.setImage(imgen5);
                }
                catch(IndexOutOfBoundsException e)
                {
                    beltName5.setDisable(true);
                }


                try
                {
                    beltName6.setText("5. "+beltPokemon.get(5).getName());
                    Image imgen6 = new Image("/images/imgPokemones/"+beltPokemon.get(5).getName()+".png");
                    beltImage6.setImage(imgen6);
                }
                catch(IndexOutOfBoundsException e)
                {
                    beltName6.setDisable(true);
                }

            }

        }
        catch(Exception e)
        {
            selectOneGroup.setVisible(true);
            startButton.setDisable(true);
        }
    }
}
