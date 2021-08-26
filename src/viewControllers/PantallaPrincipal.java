package viewControllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class PantallaPrincipal
{

    private Motor motor;

    @FXML
    private Label userName;

    @FXML
    private Button areasButton;

    @FXML
    private Button gymsButton;

    @FXML
    private Button storeButton;

    @FXML
    private Button pokemonsButton;

    @FXML
    private ImageView avatarImage;

    @FXML
    private TextField monedero;

    @FXML
    private TextField pokeballs;

    @FXML
    private Label level;

    @FXML
    private TextField ultraballs;

    @FXML
    private TextField masterballs;

    @FXML
    private TextField greatballs;

    @FXML
    private Group showBalls;

    @FXML
    private Group medalsGroup;

    @FXML
    private ImageView plainBadge;

    @FXML
    private ImageView brockBadge;

    @FXML
    private ImageView pryceBadge;

    @FXML
    private ImageView erikaBadge;

    @FXML
    private ImageView kogaBadge;

    @FXML
    private ImageView surgeBadge;

    @FXML
    private ImageView blaineBadge;

    @FXML
    private ProgressBar levelBar;

    @FXML
    private Group changeName;

    @FXML
    private TextField nameTextField;

    @FXML
    private Button changeNameButton;

    @FXML
    private Button changeButton;

    @FXML
    private Group writeName;

    @FXML
    private Label cancel;

    @FXML
    private TextField superPotion;

    @FXML
    private TextField maxPotion;

    @FXML
    private TextField simplePotion;

    @FXML
    private Group potionsGroup;

    @FXML
    private Group winGame;

    @FXML
    private Group winAllBadgesGroup;

    @FXML
    private Group areasQuestion;

    @FXML
    private Group gymQuestion;

    @FXML
    private Group storeeQuestion;
    @FXML
    private Group pokedexQuestion;


    private String gymsOareas = "";
    private ArrayList<Integer> medallasSiYaSeTienen = new ArrayList<>();
    private String pokedexOpp;


    //Estas variables se usan cuando se quiere saber si ya se consiguieron todas las medallas
    private int coins;
    private int var2;



    //Accion cuando se quiere ir a las areas para pelear
    public void goToAreasButton(ActionEvent event)
    {
        gymsOareas = "area";
        pokedexOpp = "principal";
        motor.receiveAreaOgym(gymsOareas, pokedexOpp);

        motor.showSelectPokemonToFightPantalla(event);
    }

    //Accion cuando se quiere ir al gym para pelear
    public void goToGymButton(ActionEvent event)
    {
        gymsOareas = "gym";
        pokedexOpp = "principal";
        motor.receiveAreaOgym(gymsOareas, pokedexOpp);

        motor.showSelectPokemonToFightPantalla(event);


    }

    //Accion cuando se quiere ir a comprar pociones o bolas
    public void goToStoreButton(ActionEvent event)
    {
        motor.showStorePantalla(event);
    }

    //Accion cuando se quiere ir a ver todos los pokemones que se tienen
    public void goToPokemonsButton(ActionEvent event)
    {
        pokedexOpp = "pokedex";
        motor.receivepokedexOpp(pokedexOpp);
        motor.showPokedex(event);
    }

    //Recibir la instancia del motor
    public void receiveMotorInstance(Motor m)
    {
        this.motor = m;
    }

    //recibir la info del motor
    public void receiveInitialData(String StarterPokemon, String gender, String userName, int experiencia, int pokeballs, int monedero, int medals, int masterBalls, int greatBalls, int ultraBalls, int level, ArrayList<Integer> medallasSiYaSeTienen,  int simplePotionOwn, int superPotionOwn, int maxPotionOwn, String pokedexOpp, ArrayList<Pokemon> bankPokemon, int var2)
    {
        Image genderAvatar = new Image("/images/"+gender+"user.png");
        avatarImage.setImage(genderAvatar);

        this.userName.setText(userName);
        this.pokedexOpp = pokedexOpp;
        nameTextField.setText("");

        showBalls.setVisible(false);
        medalsGroup.setVisible(false);
        changeName.setVisible(false);
        writeName.setVisible(false);
        potionsGroup.setVisible(false);
        winGame.setVisible(false);
        winAllBadgesGroup.setVisible(false);
        areasQuestion.setVisible(false);
        gymQuestion.setVisible(false);
        storeeQuestion.setVisible(false);
        pokedexQuestion.setVisible(false);

        coins = monedero;
        this.var2 = var2;

        this.pokeballs.setText(Integer.toString(pokeballs));
        this.monedero.setText(Integer.toString(monedero));
        this.masterballs.setText(Integer.toString(masterBalls));
        this.greatballs.setText(Integer.toString(greatBalls));
        this.ultraballs.setText(Integer.toString(ultraBalls));
        this.level.setText("Level "+level);
        this.medallasSiYaSeTienen = medallasSiYaSeTienen;
        superPotion.setText(Integer.toString(superPotionOwn));
        simplePotion.setText(Integer.toString(simplePotionOwn));
        maxPotion.setText(Integer.toString(maxPotionOwn));

        double puntosT = 30;
        double puntosQueTengo = experiencia;

        levelBar.setProgress((1*puntosQueTengo)/puntosT);

        medalsGroup.setVisible(false);
        plainBadge.setOpacity(.4);
        brockBadge.setOpacity(.4);
        pryceBadge.setOpacity(.4);
        erikaBadge.setOpacity(.4);
        kogaBadge.setOpacity(.4);
        surgeBadge.setOpacity(.4);
        blaineBadge.setOpacity(.4);

        System.out.println("El tamaño de bank es "+ bankPokemon.size());

       if(this.medallasSiYaSeTienen.get(0) == 1)
       {
           plainBadge.setOpacity(1);
       }

       if(medallasSiYaSeTienen.get(1) == 1)
       {
           brockBadge.setOpacity(1);
       }
       if(medallasSiYaSeTienen.get(2) == 1)
       {
           pryceBadge.setOpacity(1);
       }
       if(medallasSiYaSeTienen.get(3) == 1)
       {
           erikaBadge.setOpacity(1);
       }
       if(medallasSiYaSeTienen.get(4) == 1)
       {
           kogaBadge.setOpacity(1);

       }
       if(medallasSiYaSeTienen.get(5) == 1)
       {
           surgeBadge.setOpacity(1);

       }
       if(medallasSiYaSeTienen.get(6) == 1)
       {
           blaineBadge.setOpacity(1);
       }


       if(medallasSiYaSeTienen.get(6) == 1 && medallasSiYaSeTienen.get(5) == 1 && medallasSiYaSeTienen.get(4) == 1 && medallasSiYaSeTienen.get(3) == 1 && medallasSiYaSeTienen.get(2) == 1 && medallasSiYaSeTienen.get(1) == 1 && medallasSiYaSeTienen.get(0) == 1)
       {
           if(this.var2 == 0)
           {
               winAllBadgesGroup.setVisible(true);
               this.var2 = 3;
               motor.receiveCoins(monedero,this.var2);
           }
       }

        if(medallasSiYaSeTienen.get(6) == 1 && medallasSiYaSeTienen.get(5) == 1 && medallasSiYaSeTienen.get(4) == 1 && medallasSiYaSeTienen.get(3) == 1 && medallasSiYaSeTienen.get(2) == 1 && medallasSiYaSeTienen.get(1) == 1 && medallasSiYaSeTienen.get(0) == 1 && bankPokemon.size() == 151)
        {
            winGame.setVisible(true);
        }



    }

    /*
    Métodos cuando se entra o sale en una imagen se hace algo determinado, como mostrar un grupo etc.
     */
    public void enterPokeballs(MouseEvent mouseEvent)
    {

        showBalls.setVisible(true);
    }

    public void exitPokeballs(MouseEvent mouseEvent)
    {

        showBalls.setVisible(false);
    }

    public void medalsGroupEnter(MouseEvent mouseEvent)
    {

        medalsGroup.setVisible(true);
    }

    public void medalsGroupExit(MouseEvent mouseEvent)
    {

        medalsGroup.setVisible(false);
    }

    public void enterPotions(MouseEvent mouseEvent)
    {
        potionsGroup.setVisible(true);
    }

    public void exitPotions(MouseEvent mouseEvent)
    {
        potionsGroup.setVisible(false);
    }


    //Método cuando se quiere cambar el nombre de usuario
    public void changeNameButton(ActionEvent actionEvent)
    {
        changeNameButton.setDisable(true);
        changeName.setVisible(true);
    }

    //Método cuando ya se escribió el nombre y se queire cambiar
    public void changeButton(ActionEvent actionEvent)
    {
        if(nameTextField.getText().equals(""))
        {
            writeName.setVisible(true);
            changeButton.setDisable(true);
            cancel.setDisable(true);

        }
        else
        {
            userName.setText(nameTextField.getText());
            motor.receiveNameUser(nameTextField.getText());
            changeName.setVisible(false);
            changeNameButton.setDisable(false);
            nameTextField.setText("");
        }

    }

    //Cuando se quiere cancelar cambiar el nombre
    public void cancelAction(MouseEvent mouseEvent)
    {
        changeName.setVisible(false);
        changeNameButton.setDisable(false);
        nameTextField.setText("");
    }

    //Accion de OK, cuando se quiere cambiar el nombre pero no se escribió nada
    public void okForWriteName(ActionEvent actionEvent)
    {
        changeButton.setDisable(false);
        cancel.setDisable(false);
        writeName.setVisible(false);
    }

    //Cuando se quiere salir del juego
    public void exitAction(ActionEvent actionEvent)
    {
        System. exit(0);
    }

    //Cuando ya se ganó el juego
    public void exitGameWin(ActionEvent actionEvent)
    {
        System. exit(0);
    }

    //Cuando ya se ganaron todas las medallas y se le da al usuario 1000 monedas
    public void winAllBadgesOkButton(ActionEvent actionEvent)
    {
        winAllBadgesGroup.setVisible(false);
        coins = coins + 1000;
        monedero.setText(Integer.toString(coins));
        motor.receiveCoins(coins,var2);
    }

    public void enterAreaquestionImg(MouseEvent mouseEvent)
    {
        areasQuestion.setVisible(true);
    }

    public void exitAreaquestionImg(MouseEvent mouseEvent)
    {
        areasQuestion.setVisible(false);
    }

    public void enterGymquestionImg(MouseEvent mouseEvent)
    {
        gymQuestion.setVisible(true);
    }

    public void exitGymquestionImg(MouseEvent mouseEvent)
    {
        gymQuestion.setVisible(false);
    }

    public void enterStorequestionImg(MouseEvent mouseEvent)
    {
        storeeQuestion.setVisible(true);
    }

    public void exitStorequestionImg(MouseEvent mouseEvent)
    {
        storeeQuestion.setVisible(false);
    }

    public void enterpokedexGroup(MouseEvent mouseEvent)
    {
        pokedexQuestion.setVisible(true);
    }

    public void exitPokedecGroup(MouseEvent mouseEvent)
    {
        pokedexQuestion.setVisible(false);
    }
}
