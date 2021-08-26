package viewControllers;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;

/**
 * controller for the view of Pantalla Inicial
 */
public class PantallaInicial {

    private Image bulbasaurImage  = new Image("/images/imgPokemones/bulbasaur.png" );
    private Image charmanderImage  = new Image("/images/imgPokemones/charmander.png" );
    private Image squirtleImage  = new Image("/images/imgPokemones/squirtle.png" );

    private Image bulbasaurGif  = new Image("/images/imgPokemones/bulbasaur.gif" );
    private Image charmanderGif  = new Image("/images/imgPokemones/charmander.gif" );
    private Image squirtleGif  = new Image("/images/imgPokemones/squirtle.gif" );

    private Motor motor;
    @FXML
    private ImageView userImageView;

    @FXML
    private RadioButton maleGenderRadioButton;

    @FXML
    private RadioButton femaleGenderRadioButton;

    @FXML
    private RadioButton bulbasaurRadioButton;

    @FXML
    private RadioButton charmanderRadioButton;

    @FXML
    private RadioButton squirtleRadioButton;

    @FXML
    private TextField userNameTextField;

    @FXML
    private ImageView bulbasaur;

    @FXML
    private ImageView charmander;

    @FXML
    private ImageView squirtle;

    @FXML
    private Group writeName;

    @FXML
    private Button startButton;

    @FXML
    private Group bulbasaurGroup;

    @FXML
    private Group charmanderGroup;

    @FXML
    private Group squirtleGroup;




    //Cuando se selecciona male
    public void maleUserImage(ActionEvent event)
    {
        Image male  = new Image( "/images/maleUser.png" );
        userImageView.setImage(male);
        femaleGenderRadioButton.setSelected(false);
    }

    //Cuando se selecciona Female
    public void femaleUserImage(ActionEvent event)
    {
        Image female  = new Image("/images/femaleUser.png" );
        userImageView.setImage(female);
        maleGenderRadioButton.setSelected(false);
    }


    /*
    Cuando se selecciona el pokemon con el que se quiere iniciar
     */
    public void selectBulbasaurRadioButton(ActionEvent event)
    {

        bulbasaur.setImage(bulbasaurGif);
        squirtle.setImage(squirtleImage);
        charmander.setImage(charmanderImage);

        squirtleRadioButton.setSelected(false);
        charmanderRadioButton.setSelected(false);
    }

    public void selectSquirtleRadioButton(ActionEvent event)
    {
        bulbasaur.setImage(bulbasaurImage);
        squirtle.setImage(squirtleGif);
        charmander.setImage(charmanderImage);

        bulbasaurRadioButton.setSelected(false);
        charmanderRadioButton.setSelected(false);
    }

    public void selectCharmanderRadioButton(ActionEvent event)
    {
        bulbasaur.setImage(bulbasaurImage);
        squirtle.setImage(squirtleImage);
        charmander.setImage(charmanderGif);

        squirtleRadioButton.setSelected(false);
        bulbasaurRadioButton.setSelected(false);
    }

    //Método cuando se da click a StartGame, donde se le manda la initial data al motor
    public void startGameButton(ActionEvent event)
    {
        String userName = userNameTextField.getText();
        String gender = "";

        if(maleGenderRadioButton.isSelected())
        {
                  gender = "male";
        }
        else
        {
            gender = "female";
        }

        String starterPokemon = "";

        if(bulbasaurRadioButton.isSelected())
        {
            starterPokemon = "Bulbasaur";
        }
        else if(charmanderRadioButton.isSelected())
        {
            starterPokemon = "Charmander";
        }
        else if(squirtleRadioButton.isSelected())
        {
            starterPokemon = "Squirtle";
        }

        if(squirtleRadioButton.isSelected() == false && charmanderRadioButton.isSelected() == false&&  bulbasaurRadioButton.isSelected() == false|| userName.equals("") || maleGenderRadioButton.isSelected() == false && femaleGenderRadioButton.isSelected() == false)
        {
            writeName.setVisible(true);
            startButton.setDisable(true);
        }
        else
        {
            motor.setStartingData(userName, gender, starterPokemon);
            motor.showPantallaPrincipal(event);
        }

    }

    //Método donde se recibe la instancia del motor
    public void receiveMotorInstance(Motor m)
    {
        this.motor = m;
        bulbasaur.setImage(bulbasaurGif);
        writeName.setVisible(false);
        bulbasaurGroup.setVisible(false);
        charmanderGroup.setVisible(false);
        squirtleGroup.setVisible(false);

    }

    //Accion cuando se presiona el Botón OK cuando no se pone ningun nombre o no se selecciona algun radio button
    public void okForWriteName(ActionEvent actionEvent)
    {
        writeName.setVisible(false);
        startButton.setDisable(false);
    }

    /*
    Métodos cuando el mouse se coloca sobre una img con ? para ver la info de Bulbasaur
     */
    public void enterBulbasaur(MouseEvent mouseEvent)
    {
        bulbasaurGroup.setVisible(true);
    }

    public void exitBulbasaur(MouseEvent mouseEvent)
    {
        bulbasaurGroup.setVisible(false);
    }


    /*
    Métodos cuando el mouse se coloca sobre una img con ? para ver la info de Charmander
     */
    public void enterCharmander(MouseEvent mouseEvent)
    {
        charmanderGroup.setVisible(true);
    }

    public void exitCharmander(MouseEvent mouseEvent)
    {
        charmanderGroup.setVisible(false);
    }


    /*
    Métodos cuando el mouse se coloca sobre una img con ? para ver la info de Squirtle
     */
    public void enterSquirtle(MouseEvent mouseEvent)
    {
        squirtleGroup.setVisible(true);
    }

    public void exitSquirtle(MouseEvent mouseEvent)
    {
        squirtleGroup.setVisible(false);
    }
}