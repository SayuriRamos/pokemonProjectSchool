package viewControllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class Area1Pantalla {

    private Motor motor;
    private String nombreOpponent;

    @FXML
    private Label userName;

    @FXML
    private Label nameOpponent;

    @FXML
    private ImageView avatarImage;

    @FXML
    private ImageView RandomPokemonImageView;

    @FXML
    private Group showDataPoke;

    @FXML
    private Button atacarbutton;

    @FXML
    private Button newPokemonButton;

    @FXML
    private Label namePokemon;

    @FXML
    private Label type;

    @FXML
    private Label size;

    @FXML
    private Label life;

    @FXML
    private ImageView imgEvolution;

    @FXML
    private Label nameEvolution;

    @FXML
    private ListView<String> abilitiesListView;

    @FXML
    private Group pressAgainGroup;

    @FXML
    private ImageView showPokemonData;

    @FXML
    private Label notHaveEvolution;

    private ArrayList<Pokemon> beltPokemon = new ArrayList<Pokemon>();
    private ArrayList<Pokemon> bankPokemon = new ArrayList<Pokemon>();
    private int var = 0;

    //Método para recibir la instancia del motor
    public void receiveMotorInstance(Motor m, ArrayList belt, ArrayList bank)
    {
        beltPokemon = belt;
        bankPokemon = bank;

        atacarbutton.setDisable(true);
        showPokemonData.setDisable(true);
        notHaveEvolution.setVisible(false);
        this.motor = m;

    }

    //Método para recibir los datos del motor, el género y el nombre de usuario apra usarlos
    public void receiveInitialData(String gender, String userName)
    {
        Image genderAvatar = new Image("/images/"+gender+"userAttack.png");
        avatarImage.setImage(genderAvatar);

        showDataPoke.setVisible(false);
        pressAgainGroup.setVisible(false);

        this.userName.setText(userName+",");
    }

    //Método para que aparezca un nuevo pokemon
    public void newPokemon(ActionEvent event)
    {

        nombreOpponent = motor.getRandomPokemonBeach().getName();

        //Los For que siguen quieren decir que solo se puede tener un pokemon por cada tipo, es decir sólo un Bulbasaur,
        //Al igual que verifica que no aparezcaa la evolución que sigue de los pokemon que se estan en el belt si alguno tiene nivel 9 y , para prevenir
        //que no se tengan dos del mismo tipo

        for(int i = 0; i<=bankPokemon.size(); i++)
        {

            if(i == bankPokemon.size())
            {
                break;
            }
            if(nombreOpponent.equals(bankPokemon.get(i).getName()))
            {
                i =-1;
                nombreOpponent = motor.getRandomPokemonBeach().getName();
            }

        }

        for(int i = 0; i<=beltPokemon.size(); i++)
        {

            if(i == beltPokemon.size())
            {
                break;
            }

            try
            {
                if(nombreOpponent.equals(beltPokemon.get(i).getEvolucion().getName()) && beltPokemon.get(i).getNivel() >= 9 && beltPokemon.get(i).getPuntos() == 20)
                {
                    i =-1;
                    nombreOpponent = motor.getRandomPokemonBeach().getName();
                }
            }
            catch(Exception e)
            {

            }

        }

        Image genderAvatar = new Image("/images/imgPokemones/"+nombreOpponent+".png");
        RandomPokemonImageView.setImage(genderAvatar);

        atacarbutton.setDisable(false);
        showPokemonData.setDisable(false);

        nameOpponent.setText(nombreOpponent);

        type.setText(motor.getPokemonByName(nombreOpponent).getTipo());
        size.setText(motor.getPokemonByName(nombreOpponent).getTamano());
        life.setText(String.valueOf(motor.getPokemonByName(nombreOpponent).getVida()));
        namePokemon.setText(nombreOpponent);

        try
        {
            Image poke = new Image("/images/imgPokemones/"+motor.getPokemonByName(nombreOpponent).getEvolucion().getName()+".png");
            imgEvolution.setImage(poke);
            nameEvolution.setText(motor.getPokemonByName(nombreOpponent).getEvolucion().getName());
            notHaveEvolution.setVisible(false);
        }
        catch (Exception e)
        {
            imgEvolution.setImage(null);
            nameEvolution.setText("");
            notHaveEvolution.setVisible(true);

        }

        ObservableList<String> abilities = FXCollections.observableArrayList();

        for (int a = 0; a < motor.getPokemonByName(nombreOpponent).getHabilidades().size(); a++)
        {
            abilities.add(motor.getPokemonByName(nombreOpponent).getHabilidades().get(a).getNombre());

        }
        abilitiesListView.setItems(abilities);
    }

    //Método para pasar el nombre del oponente al motor y que se muestre la pantalla fight
    public void atacarbutton(ActionEvent event)
    {
        motor.setdataaFotFight(nombreOpponent);
        motor.showfightPokemonPantalla(event);

    }

    //Método para volver a la pantalla principal
    public void goBack(javafx.scene.input.MouseEvent mouseEvent)
    {
        motor.showTodasAreasPantalla1(mouseEvent);
    }

    //Método para mostrar la info del nuevo pokemon que apareció cuando se le da clic a la showPokemonData
    public void questionImgAction(MouseEvent mouseEvent)
    {
        if(showDataPoke.isVisible())
        {
            showDataPoke.setVisible(false);
            pressAgainGroup.setVisible(false);

        }
        else if(showDataPoke.isVisible() == false)
        {
            showDataPoke.setVisible(true);

            if ( var == 0)
            {
                pressAgainGroup.setVisible(true);
                var++;
            }
            else
            {
                pressAgainGroup.setVisible(false);
            }
        }
    }
}
