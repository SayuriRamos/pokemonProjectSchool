package viewControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import javax.swing.*;

public class StorePantalla {

    private Motor motor;
    private int hmPokeballsTobuy;
    private int monederoNow;
    private int pokeballsOwn;

    private int pokeballOwn;
    private int ultraBallsOwn;
    private int masterBallsOwn;
    private int greatBallsOwn;

    private int howMuchCoins;
    private String whatBall;
    private String whatPotion;
    private int totalOfPotions;
    private int moneyOfPokemons;
    private int costPotion;

    private int howMuchCoinsofPotions;
    private int hmPotionsTobuy;

    private int simplePotionOwn = 0;
    private int maxPotionOwn = 0;
    private int superPotionOwn = 0;



    @FXML
    private Button lessPokeballs;

    @FXML
    private Button morePokeballs;

    @FXML
    private Button checkOut;

    @FXML
    private TextField howManyPokeballs;

    @FXML
    private TextField howMuchMoney;

    @FXML
    private Group rectGroup;

    @FXML
    private Group pokeball;

    @FXML
    private Group pokeRect;

    @FXML
    private Group ultraRect;

    @FXML
    private Group greatRect;

    @FXML
    private Group masterRect;

    @FXML
    private Group dontHaveMoneyGroup;

    @FXML
    private Group noSelected;

    @FXML
    private Group orderComplete;

    @FXML
    private TextField monedero;

    @FXML
    private TextField pokeballs;

    @FXML
    private TextField greatballsH;

    @FXML
    private TextField ultraballsH;

    @FXML
    private TextField masterballsH;

    @FXML
    private TextField monederoFinal;

    @FXML
    private TextField pokeballsFinal;

    @FXML
    private Label dialogue;

    @FXML
    private ImageView typesBall;

    @FXML
    private ImageView potionsButton;

    @FXML
    private Group whiteBlockPotions;

    @FXML
    private Group buyPotionsInImg;

    @FXML
    private ImageView simplePotion;

    @FXML
    private ImageView superPotion;

    @FXML
    private ImageView maxPotion;

    @FXML
    private TextField howManyPotions;

    @FXML
    private TextField howMuchMoneyPotions;

    @FXML
    private Button morePotions;

    @FXML
    private Button lessPotions;

    @FXML
    private Button cheackOutPotions;

    @FXML
    private TextField simpleP;

    @FXML
    private TextField superP;

    @FXML
    private TextField maxP;

    @FXML
    private Group questionGroup;



    private Image greatBall = new Image("images/Great_Ball.png");
    private Image ultraBall = new Image("images/Ultra_Ball.png");
    private Image masterBall = new Image("images/Master_Ball.png");
    private Image pokeBall = new Image("images/pokeball.png");

    private Image simple = new Image("images/potionSimple.png");
    private Image superPo = new Image("images/SuperPotion.png");
    private Image max = new Image("images/maxPotion.png");


    public void buyPokeball(MouseEvent mouseEvent)
    {
        pokeball.setVisible(true);
        ultraRect.setVisible(false);
        masterRect.setVisible(false);
        greatRect.setVisible(false);
        pokeRect.setVisible(true);
        whatBall = "pokeball";

        hmPokeballsTobuy = 0;
        howMuchCoins = 0;
        howManyPokeballs.setText(Integer.toString(hmPokeballsTobuy));
        howMuchMoney.setText(Integer.toString(howMuchCoins));

    }

    public void buyUltraBall(MouseEvent mouseEvent)
    {
        ultraRect.setVisible(true);
        masterRect.setVisible(false);
        greatRect.setVisible(false);
        pokeRect.setVisible(false);
        whatBall = "ultraball";

        hmPokeballsTobuy = 0;
        howMuchCoins = 0;
        howManyPokeballs.setText(Integer.toString(hmPokeballsTobuy));
        howMuchMoney.setText(Integer.toString(howMuchCoins));
    }

    public void buyMasterBall(MouseEvent mouseEvent)
    {
        ultraRect.setVisible(false);
        masterRect.setVisible(true);
        greatRect.setVisible(false);
        pokeRect.setVisible(false);
        whatBall = "masterball";

        hmPokeballsTobuy = 0;
        howMuchCoins = 0;
        howManyPokeballs.setText(Integer.toString(hmPokeballsTobuy));
        howMuchMoney.setText(Integer.toString(howMuchCoins));

    }

    public void buyGreatBall(MouseEvent mouseEvent)
    {
        ultraRect.setVisible(false);
        masterRect.setVisible(false);
        greatRect.setVisible(true);
        pokeRect.setVisible(false);
        whatBall = "greatball";

        hmPokeballsTobuy = 0;
        howMuchCoins = 0;
        howManyPokeballs.setText(Integer.toString(hmPokeballsTobuy));
        howMuchMoney.setText(Integer.toString(howMuchCoins));

    }

    public void enterPokeballs(MouseEvent mouseEvent)
    {
        rectGroup.setVisible(true);

    }

    public void exitPokeballs(MouseEvent mouseEvent)
    {
        rectGroup.setVisible(false);

    }

    public void morePokeballs(ActionEvent actionEvent)
    {
        hmPokeballsTobuy++;

        if(whatBall.equals("pokeball"))
        {
            howMuchCoins = howMuchCoins+5;
        }
        else if(whatBall.equals("ultraball"))
        {
            howMuchCoins = howMuchCoins+15;

        }
        else if(whatBall.equals("greatball"))
        {
            howMuchCoins = howMuchCoins+10;

        }
        else if(whatBall.equals("masterball"))
        {
            howMuchCoins = howMuchCoins+30;
        }


        howManyPokeballs.setText(Integer.toString(hmPokeballsTobuy));
        howMuchMoney.setText(Integer.toString(howMuchCoins));

    }

    public void lessPokeballs(ActionEvent actionEvent)
    {
        if((hmPokeballsTobuy-1) <= 0)
        {
            hmPokeballsTobuy = 0;
            howMuchCoins = 0;
            howManyPokeballs.setText(Integer.toString(hmPokeballsTobuy));
            howMuchMoney.setText(Integer.toString(howMuchCoins));
        }
        else
        {
            hmPokeballsTobuy--;

            if(whatBall.equals("pokeball"))
            {
                howMuchCoins = howMuchCoins-5;
            }
            else if(whatBall.equals("ultraball"))
            {
                howMuchCoins = howMuchCoins-15;

            }
            else if(whatBall.equals("greatball"))
            {
                howMuchCoins = howMuchCoins-10;

            }
            else if(whatBall.equals("masterball"))
            {
                howMuchCoins = howMuchCoins-30;
            }

            howManyPokeballs.setText(Integer.toString(hmPokeballsTobuy));
            howMuchMoney.setText(Integer.toString(howMuchCoins));
        }
    }

    public void checkOut(ActionEvent actionEvent)
    {
        if(hmPokeballsTobuy <= 0)
        {
            noSelected.setVisible(true);
            pokeball.setDisable(true);


        }
        else if(monederoNow - howMuchCoins < 0)
        {
            dontHaveMoneyGroup.setVisible(true);
            pokeball.setDisable(true);
        }
        else
        {
            monederoNow = monederoNow - howMuchCoins;


            if(whatBall.equals("pokeball"))
            {
                pokeballsOwn = pokeballsOwn + hmPokeballsTobuy;
                pokeballsFinal.setText(Integer.toString(pokeballsOwn));
                pokeballs.setText(Integer.toString(pokeballsOwn));
                typesBall.setImage(pokeBall);
            }
            else if(whatBall.equals("ultraball"))
            {
                ultraBallsOwn = ultraBallsOwn + hmPokeballsTobuy;
                pokeballsFinal.setText(Integer.toString(ultraBallsOwn));
                ultraballsH.setText(Integer.toString(ultraBallsOwn));
                typesBall.setImage(ultraBall);

            }
            else if(whatBall.equals("greatball"))
            {
                greatBallsOwn = greatBallsOwn + hmPokeballsTobuy;
                pokeballsFinal.setText(Integer.toString(greatBallsOwn));
                greatballsH.setText(Integer.toString(greatBallsOwn));
                typesBall.setImage(greatBall);

            }
            else if(whatBall.equals("masterball"))
            {
                masterBallsOwn = masterBallsOwn + hmPokeballsTobuy;
                pokeballsFinal.setText(Integer.toString(masterBallsOwn));
                masterballsH.setText(Integer.toString(masterBallsOwn));
                typesBall.setImage(masterBall);
            }

            monedero.setText(Integer.toString(monederoNow));
            monederoFinal.setText(Integer.toString(monederoNow));

            motor.getDataFromShop(pokeballsOwn, monederoNow, ultraBallsOwn, masterBallsOwn, greatBallsOwn,simplePotionOwn,superPotionOwn,maxPotionOwn);
            pokeball.setVisible(false);
            orderComplete.setVisible(true);
            dialogue.setText("Thanks for Coming");

        }
    }

    public void goBack(MouseEvent mouseEvent)
    {
        motor.showPantallaPrincipal(mouseEvent);

    }

    public void receiveMotorInstance(Motor m)
    {
        this.motor = m;
        pokeball.setVisible(false);
       ultraRect.setVisible(false);
       masterRect.setVisible(false);
       greatRect.setVisible(false);
       pokeRect.setVisible(false);
        rectGroup.setVisible(false);
        dontHaveMoneyGroup.setVisible(false);
        noSelected.setVisible(false);
        orderComplete.setVisible(false);
        whiteBlockPotions.setVisible(false);
        buyPotionsInImg.setVisible(false);
        buyPotionsInImg.setVisible(false);
        questionGroup.setVisible(false);

    }


    public void okButton(ActionEvent actionEvent)
    {
        pokeball.setDisable(false);
        noSelected.setVisible(false);
        dontHaveMoneyGroup.setVisible(false);

        cheackOutPotions.setDisable(false);
        lessPotions.setDisable(false);
        morePotions.setDisable(false);
    }

    public void ThanksButton(ActionEvent actionEvent)
    {
        orderComplete.setVisible(false);
    }

    public void receiveInitialData(int monedero, int pokeballs, int masterBallsOwn, int ultraBallsOwn, int greatBallsOwn, int simplePotionOwn, int superPotionOwn, int maxPotionOwn)
    {
        this.pokeballsOwn = pokeballs;
        this.masterBallsOwn = masterBallsOwn;
        this.ultraBallsOwn  = ultraBallsOwn;
        this.greatBallsOwn = greatBallsOwn;
        this.monederoNow = monedero;
        this.simplePotionOwn = simplePotionOwn;
        this.superPotionOwn = superPotionOwn;
        this.maxPotionOwn = maxPotionOwn;

        whatPotion = "simplePotion";
        simplePotion.setOpacity(1);
        superPotion.setOpacity(.5);
        maxPotion.setOpacity(.5);

        this.monedero.setText(Integer.toString(monederoNow));
        this.pokeballs.setText(Integer.toString(pokeballsOwn));
        ultraballsH.setText(Integer.toString(ultraBallsOwn));
        masterballsH.setText(Integer.toString(masterBallsOwn));
        greatballsH.setText(Integer.toString(greatBallsOwn));
        simpleP.setText(Integer.toString(simplePotionOwn));
        superP.setText(Integer.toString(superPotionOwn));
        maxP.setText(Integer.toString(maxPotionOwn));

        dialogue.setText("Welcome to the Store");
    }


    public void potionsActionBuy(MouseEvent mouseEvent)
    {
        buyPotionsInImg.setVisible(true);
    }

    public void enterPotions(MouseEvent mouseEvent)
    {
        whiteBlockPotions.setVisible(true);
    }

    public void exitPotions(MouseEvent mouseEvent)
    {
        whiteBlockPotions.setVisible(false);
    }


    public void morePotions(ActionEvent actionEvent)
    {

            hmPotionsTobuy++;

            if (whatPotion.equals("simplePotion"))
            {
                howMuchCoinsofPotions = howMuchCoinsofPotions + 10;
            }

            else if (whatPotion.equals("superPotion"))
            {
                howMuchCoinsofPotions = howMuchCoinsofPotions + 15;

            }

            else if (whatPotion.equals("maxPotion"))
            {
                howMuchCoinsofPotions = howMuchCoinsofPotions + 20;

            }

            howManyPotions.setText(Integer.toString(hmPotionsTobuy));
            howMuchMoneyPotions.setText(Integer.toString(howMuchCoinsofPotions));
    }

    public void lessPotions(ActionEvent actionEvent)
    {
            if ((hmPotionsTobuy - 1) <= 0) {
                hmPotionsTobuy = 0;
                howMuchCoinsofPotions = 0;
                howManyPotions.setText(Integer.toString(hmPotionsTobuy));
                howMuchMoneyPotions.setText(Integer.toString(howMuchCoinsofPotions));
            } else {
                hmPotionsTobuy--;

                if (whatPotion.equals("simplePotion")) {
                    howMuchCoinsofPotions = howMuchCoinsofPotions - 10;
                } else if (whatPotion.equals("maxPotion")) {
                    howMuchCoinsofPotions = howMuchCoinsofPotions - 20;

                } else if (whatPotion.equals("superPotion")) {
                    howMuchCoinsofPotions = howMuchCoinsofPotions - 15;

                }

                howManyPotions.setText(Integer.toString(hmPotionsTobuy));
                howMuchMoneyPotions.setText(Integer.toString(howMuchCoinsofPotions));
            }
    }

    public void cheackOutPotions(ActionEvent actionEvent)
    {

        if(hmPotionsTobuy <= 0)
        {
            noSelected.setVisible(true);
            cheackOutPotions.setDisable(true);
            morePotions.setDisable(true);
            lessPotions.setDisable(true);

        }
        else if(monederoNow - howMuchCoinsofPotions < 0)
        {
            dontHaveMoneyGroup.setVisible(true);
            pokeball.setDisable(true);

            cheackOutPotions.setDisable(true);
            morePotions.setDisable(true);
            lessPotions.setDisable(true);

        }
        else
        {
            monederoNow = monederoNow - howMuchCoinsofPotions;


            if(whatPotion.equals("superPotion"))
            {
                superPotionOwn = superPotionOwn + hmPotionsTobuy;
                pokeballsFinal.setText(Integer.toString(superPotionOwn));
                superP.setText(Integer.toString(superPotionOwn));
                typesBall.setImage(superPo);
            }
            else if(whatPotion.equals("maxPotion"))
            {
                maxPotionOwn = maxPotionOwn + hmPotionsTobuy;
                pokeballsFinal.setText(Integer.toString(maxPotionOwn));
                maxP.setText(Integer.toString(maxPotionOwn));
                typesBall.setImage(max);

            }
            else if(whatPotion.equals("simplePotion"))
            {
                simplePotionOwn = simplePotionOwn + hmPotionsTobuy;
                pokeballsFinal.setText(Integer.toString(simplePotionOwn));
                simpleP.setText(Integer.toString(simplePotionOwn));
                typesBall.setImage(simple);

            }

            monedero.setText(Integer.toString(monederoNow));
            monederoFinal.setText(Integer.toString(monederoNow));

            motor.getDataFromShop(pokeballsOwn, monederoNow, ultraBallsOwn, masterBallsOwn, greatBallsOwn,simplePotionOwn,superPotionOwn,maxPotionOwn);
            pokeball.setVisible(false);
            orderComplete.setVisible(true);
            buyPotionsInImg.setVisible(false);
            dialogue.setText("Thanks for Coming");

            hmPotionsTobuy = 0;
            howMuchCoinsofPotions = 0;
            howManyPotions.setText(Integer.toString(hmPotionsTobuy));
            howMuchMoneyPotions.setText(Integer.toString(howMuchCoinsofPotions));

        }

    }

    public void superPotionAction(MouseEvent mouseEvent)
    {
        superPotion.setOpacity(1);
        maxPotion.setOpacity(.5);
        simplePotion.setOpacity(.5);
        whatPotion = "superPotion";

        costPotion = 15;

        hmPotionsTobuy = 0;
        howMuchCoinsofPotions = 0;

        howManyPotions.setText(Integer.toString(hmPotionsTobuy));
        howMuchMoneyPotions.setText(Integer.toString(howMuchCoinsofPotions));
    }

    public void maxPotionAction(MouseEvent mouseEvent)
    {
        superPotion.setOpacity(.5);
        maxPotion.setOpacity(1);
        simplePotion.setOpacity(.5);
        whatPotion = "maxPotion";

        hmPotionsTobuy = 0;
        howMuchCoinsofPotions = 0;

        howManyPotions.setText(Integer.toString(hmPotionsTobuy));
        howMuchMoneyPotions.setText(Integer.toString(howMuchCoinsofPotions));
    }

    public void simplePotionAction(MouseEvent mouseEvent)
    {
        superPotion.setOpacity(.5);
        maxPotion.setOpacity(.5);
        simplePotion.setOpacity(1);
        whatPotion = "simplePotion";

        hmPotionsTobuy = 0;
        howMuchCoinsofPotions = 0;

        howManyPotions.setText(Integer.toString(hmPotionsTobuy));
        howMuchMoneyPotions.setText(Integer.toString(howMuchCoinsofPotions));
    }

    public void xAction(MouseEvent mouseEvent)
    {
        pokeball.setVisible(false);
        buyPotionsInImg.setVisible(false);
        hmPotionsTobuy = 0;
        howMuchCoinsofPotions = 0;
        howManyPotions.setText(Integer.toString(hmPotionsTobuy));
        howMuchMoneyPotions.setText(Integer.toString(howMuchCoinsofPotions));
    }

    public void enterQuestion(MouseEvent mouseEvent)
    {
        questionGroup.setVisible(true);
    }

    public void exitQuestion(MouseEvent mouseEvent)
    {
        questionGroup.setVisible(false);
    }
}
