package viewControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class FightPantalla {

    //Variables globales
    private int vidaMe;   //Variable que almacena la vida del pokemon que estas usando para pelear en ese momento
    private int vidaOponent;      //Variable que almacena la vida del pokemon contra el que estas peleando en ese momento
    private String myPokemonName;    //Variable que almacena el nombre del pokemon con el que se esta peleando
    private String oponentName;       //Variable que almacena el nombre del pokemon contra el que se esta peleando
    private int meAtaque;        //Variable que almacena la cantidad de daño del ataque que se escogió random
    private int monedero;        //Variable que guarda las monedas que se tienen, se utiliza cuando gana una pelea, pues se le suma
    private int oponentAtaque;    //Variable que almacena la cantidad de daño del ataque  del contrincante que se escogió random
    private int pokeballs;         //Variable que guarda la cantidad de pokebolas que le quedan
    private int experience;        //Variable que guarda la experiencia del usuario
    private int nivel;             //Guarda el nivel del usuario
    private String area;           //Variable que dice cual area se escogió
    private String typeBall;       //Variable que guarda qué tipo de pokebola le quizo lanzar

    private String gender;     //Género del usuario
    private String name;       //Nombre del usuario
    private int simplePotionOwn = 0;   //Cantidad de simplePotion que tiene el usuario
    private int maxPotionOwn = 0;      //Cantidad de maxPotion que tiene el usuario
    private int superPotionOwn = 0;     //Cantidad de superPotion que tiene el usuario

    private String potion;        //Variable que guarda qué tipo de pocion le quizo usar

    private int var2 = 0;   //Variable para ver cuantos pokemons del belt he usado.


    private ArrayList<Pokemon> beltPokemon = new ArrayList<Pokemon>();   //ArrayList que almacena los pokemon del belt pokemon
    private ArrayList<Pokemon> bankPokemon = new ArrayList<Pokemon>();   //ArrayList que almacena los pokemon del bank pokemon


    private int ultraBallsOwn = 0;      //Cantidad de ultraBalls que tiene el usuario
    private int masterBallsOwn = 0;     //Cantidad de masterBalls que tiene el usuario
    private int greatBallsOwn = 0;     //Cantidad de greatBalls que tiene el usuario
    private Pokemon varEvolutio; //Es para ver si tiene evolucion o no


    private Motor motor;
    public void receiveMotorInstance(Motor m)
    {
        this.motor = m;
    }

    @FXML
    private Button atacarButton;

    @FXML
    private Group winGroup;

    @FXML
    private Group lostGroup;

    @FXML
    private Group tieGroup;

    @FXML
    private Group didntGotPokemonGroup;

    @FXML
    private Button huirButton;

    @FXML
    private Button okButton2;

    @FXML
    private Button trowPokeballMain;

    @FXML
    private TextField meVidaTextField;

    @FXML
    private TextField oponentVidaTextField;

    @FXML
    private TextField meNomAtaqueTextField;

    @FXML
    private TextField nomAtaqueTextField;
    @FXML
    private ImageView meViewImage;

    @FXML
    private ImageView oponentViewImage;

    @FXML
    private AnchorPane AnchorPane;

    @FXML
    private Button throwPokeballButton;

    @FXML
    private Button goMainWindowButton;

    @FXML
    private Button okWinButton;

    @FXML
    private Button trowBallR;

    @FXML
    private Group gotPokemonGroup;

    @FXML
    private Group didntGetPokemonMain;

    @FXML
    private Group noSuficientesPokebolas;

    @FXML
    private Group notificationGroup;

    @FXML
    private TextField howManyPokeballs;

    @FXML
    private TextField meName;

    @FXML
    private TextField howMuchCoins;

    @FXML
    private TextField avatarExperience;

    @FXML
    private Label meNameTextField;

    @FXML
    private Label nameOpponent;

    @FXML
    private ProgressBar lifeBarMe;

    @FXML
    private ProgressBar lifeBarOpponent;

    @FXML
    private ImageView imageHouse;

    @FXML
    private Group noSuficientesPokebolas2;

    @FXML
    private Group beachBackG;

    @FXML
    private Group forestBackG;

    @FXML
    private Group jungleBackG;

    @FXML
    private Group dessertBackG;

    @FXML
    private Group chooseBallGroup;

    @FXML
    private Group chooseBallGroup2;


    @FXML
    private Group noSuficientesPokebolas1;

    @FXML
    private Group showBalls;

    @FXML
    private Group select1;

    @FXML
    private TextField ultraballs;

    @FXML
    private TextField greatballs;

    @FXML
    private TextField masterballs;

    @FXML
    private ImageView imgPokeball;

    @FXML
    private ImageView imgMasterball;

    @FXML
    private ImageView imgGreatball;

    @FXML
    private ImageView imgUltraball;
    @FXML
    private ImageView imgPokeball1;

    @FXML
    private ImageView imgMasterball1;

    @FXML
    private ImageView imgGreatball1;

    @FXML
    private ImageView imgUltraball1;


    @FXML
    private TextField newLevelNamePokemon;

    @FXML
    private TextField newLevelLevelPokemon;

    @FXML
    private ImageView imageNewLevelPoekmon;

    @FXML
    private Group newLevelGroup;


    @FXML
    private TextField oldNameEvolution;

    @FXML
    private TextField newNameEvolution;

    @FXML
    private ImageView imgNewPokemonEvolution;

    @FXML
    private ImageView oldImagePokemon;

    @FXML
    private Group newEvolution;

    @FXML
    private Label nameOldPokemon;


    @FXML
    private Group newLevelEntrenador;

    @FXML
    private Label nameEntrenadorMe;

    @FXML
    private ImageView imgEntrenador;

    @FXML
    private TextField newLevenEntrenador;

    @FXML
    private ImageView simpleImg;

    @FXML
    private ImageView superImg;

    @FXML
    private ImageView maxImg;

    @FXML
    private Group potionsGroup;

    @FXML
    private Button useButton;

    @FXML
    private Group donthavePotions;

    @FXML
    private Button usePotionButton;

    @FXML
    private Group readyToevolve;




    //Método para que se regrese a area de donde vino, para escoger pelear con otro pokemon
    public void huirButton(ActionEvent event)
    {
        motor.getDataFromFight(pokeballs,experience,nivel,monedero, ultraBallsOwn, masterBallsOwn, greatBallsOwn,beltPokemon, bankPokemon,simplePotionOwn,superPotionOwn,maxPotionOwn, myPokemonName);

        if (area.equals("jungle"))
        {
            motor.showArea2Pantalla(event);
        }
        else if(area.equals("beach"))
        {
            motor.showArea1Pantalla1(event);
        }
        else if(area.equals("forest"))
        {
            motor.showArea4Pantalla(event);
        }
        else if(area.equals("desert"))
        {
            motor.showArea3Pantalla(event);
        }


    }


    //Método donde al darle clic al botón atacar, tu atacas primero, y despues te regresa el golpe
    /*
        contiene:
        Para que se baje la vida de cualquiera de los dos cuando atacamos
        Qué pasa si ganas: te aparece un Group
        Qué pasa si pierdes: te aparece un mensaje de ya te desmayaste y se va a la pantalla de area
     */
    public void atacarButton(ActionEvent event) throws InterruptedException
    {
        meNomAtaqueTextField.setText(motor.getPokemonFromBelt(myPokemonName).getRandomHabilidad().getNombre()+" -"+motor.getPokemonFromBelt(myPokemonName).getRandomHabilidad().getDaño());
        meAtaque = motor.getPokemonFromBelt(myPokemonName).getRandomHabilidad().getDaño();

        vidaOponent =  vidaOponent-meAtaque;

        double vidaOponentDouble = motor.getPokemonByName(oponentName).getVida();
        double vidaqueQueda = vidaOponent;

        if(vidaOponent <= 0)
        {
            lifeBarOpponent.setProgress(0);
        }
        else
        {

            lifeBarOpponent.setProgress((1*vidaqueQueda)/vidaOponentDouble);

        }

        if(vidaOponent <=0)
        {
            atacarButton.setDisable(true);
            huirButton.setDisable(true);
            trowPokeballMain.setDisable(true);
            experience = experience +10;
            winGroup.setDisable(false);
            winGroup.setVisible(true);
            monedero = monedero + 5;
            usePotionButton.setDisable(true);
            howMuchCoins.setText(Integer.toString(monedero));

            beltPokemon.get(var2).setSumaPuntos(5); //Hay un método que automáticamente suma los puntos que se tienen más los puntos nuevos

            if(beltPokemon.get(var2).getPuntos() >= 25) //Que pasa si sube de nivel y evoluciona el pokemon, si sube de nivel se le agrega 2 a la vida y 1 al daño de las habilidades
            {
                beltPokemon.get(var2).setPuntos(beltPokemon.get(var2).getPuntos()-25);
                beltPokemon.get(var2).setNivel(beltPokemon.get(var2).getNivel()+1);
                beltPokemon.get(var2).setVida(beltPokemon.get(var2).getVida()+2);
                newLevelGroup.setVisible(true);
                winGroup.setDisable(true);

                newLevelNamePokemon.setText(beltPokemon.get(var2).getName());
                newLevelLevelPokemon.setText(String.valueOf(beltPokemon.get(var2).getNivel()));
                Image mePokemon = new Image("/images/imgPokemones/"+myPokemonName+".png");
                imageNewLevelPoekmon.setImage(mePokemon);



                System.out.println("La nueva vida de "+ beltPokemon.get(var2).getName()+" es "+beltPokemon.get(var2).getVida());



                for(int a = 0; a < beltPokemon.get(var2).getHabilidades().size(); a++)
                {
                    beltPokemon.get(var2).getHabilidades().get(a).setDaño(beltPokemon.get(var2).getHabilidades().get(a).getDaño()+1);
                    System.out.println("El nuevo daño de "+ beltPokemon.get(var2).getHabilidades().get(a).getNombre()+" es "+beltPokemon.get(var2).getHabilidades().get(a).getDaño());
                }

                try  //Tratar de cambiar el pokemon que ya estaba por su evolucion
                {
                    if(beltPokemon.get(var2).getNivel() >= 10)
                    {

                        varEvolutio = beltPokemon.get(var2).getEvolucion();

                        for(int a = 0; a <= bankPokemon.size(); a++)
                        {
                            if( a == bankPokemon.size())
                            {

                                newEvolution.setVisible(true);
                                oldImagePokemon.setImage(mePokemon);
                                oldNameEvolution.setText(myPokemonName);
                                nameOldPokemon.setText(myPokemonName);

                                beltPokemon.get(var2).setNivel(0);
                                System.out.println("El nuevo nivel de "+ beltPokemon.get(var2).getName()+" es "+beltPokemon.get(var2).getNivel());

                                Pokemon copyEvolucion = new Pokemon();
                                copyEvolucion.setName(beltPokemon.get(var2).getEvolucion().getName());
                                copyEvolucion.setVida(beltPokemon.get(var2).getEvolucion().getVida()+5);  //Si evolucionas empiezas con vida que tiene como si lo hubieras atrapado + 5
                                copyEvolucion.setTamano(beltPokemon.get(var2).getEvolucion().getTamano());
                                copyEvolucion.setTipo(beltPokemon.get(var2).getEvolucion().getTipo());
                                copyEvolucion.setNivel(beltPokemon.get(var2).getEvolucion().getNivel()+5);  //Si evolucionas empiezas ennivel 5
                                copyEvolucion.setPuntos(beltPokemon.get(var2).getEvolucion().getPuntos());

                                try
                                {
                                    copyEvolucion.setEvolucion(beltPokemon.get(var2).getEvolucion().getEvolucion());

                                }
                                catch(Exception e)
                                {

                                }

                                Image newEvolution = new Image("/images/imgPokemones/"+copyEvolucion.getName()+".png");
                                imgNewPokemonEvolution.setImage(newEvolution);
                                newNameEvolution.setText(copyEvolucion.getName());


                                for(int o = 0; o< beltPokemon.get(var2).getEvolucion().getHabilidades().size(); o++)
                                {
                                    habilidades copyHabilidades = new habilidades();
                                    copyHabilidades.setNombre(beltPokemon.get(var2).getEvolucion().getHabilidades().get(o).getNombre());
                                    copyHabilidades.setDaño(beltPokemon.get(var2).getEvolucion().getHabilidades().get(o).getDaño()+5); //El 5 es porque empieza en el nivel 5

                                    copyEvolucion.addArrayHabildiades(copyHabilidades);
                                }

                                for(int i = 0; i < bankPokemon.size(); i++)
                                {

                                    if(bankPokemon.get(i).getName().equals(myPokemonName))
                                    {
                                        bankPokemon.remove(i);
                                        bankPokemon.add(i, copyEvolucion);
                                        System.out.println("La nueva evolución del banco es "+bankPokemon.get(i).getName()+ "    "+bankPokemon.get(i));
                                        break;
                                    }
                                }

                                beltPokemon.remove(var2);
                                beltPokemon.add(var2, copyEvolucion);

                                System.out.println("La nueva evolución del belt es "+beltPokemon.get(var2).getName()+"   " +beltPokemon.get(var2));

                                myPokemonName = beltPokemon.get(0).getName();

                                break;

                            }
                            if(beltPokemon.get(var2).getEvolucion().getName().equals(bankPokemon.get(a).getName()))
                            {
                                readyToevolve.setVisible(true);
                                winGroup.setDisable(true);
                                break;

                            }
                        }
                    }

                }
                catch (Exception e)
                {
                    //Si llega aqui significa que algo falló de arriba o ya no tiene evoluciones
                    System.out.println("El pokemon ya no tiene evoluciones");
                }

            }

            if(experience >= 30)
            {
                nivel++;
                experience = experience -30;
                System.out.println(nivel);

                nameEntrenadorMe.setText(name+",");
                newLevenEntrenador.setText(String.valueOf(nivel));
                avatarExperience.setText(String.valueOf(experience));


                newLevelEntrenador.setVisible(true);
                winGroup.setDisable(true);
            }
            avatarExperience.setText(String.valueOf(experience));

        }
        else
        {

            nomAtaqueTextField.setText(motor.getPokemonByName(oponentName).getRandomHabilidad().getNombre()+"  -"+motor.getPokemonByName(oponentName).getRandomHabilidad().getDaño());
            oponentAtaque = motor.getPokemonByName(oponentName).getRandomHabilidad().getDaño();
            vidaMe =  vidaMe-oponentAtaque;

            double vidaMeDouble = motor.getPokemonFromBelt(myPokemonName).getVida();
            double vidaMeQueQueda = vidaMe;


            if(vidaMe <= 0)
            {
                var2++;

                if (var2 == beltPokemon.size())
                {
                    lifeBarMe.setProgress(0);
                    atacarButton.setDisable(true);
                    huirButton.setDisable(true);
                    trowPokeballMain.setDisable(true);
                    lostGroup.setVisible(true);
                    usePotionButton.setDisable(true);

                }
                else
                {
                    myPokemonName = beltPokemon.get(var2).getName();
                    Image genderAvatar = new Image("/images/imgPokemones/"+myPokemonName+".png");
                    meViewImage.setImage(genderAvatar);
                    imageNewLevelPoekmon.setImage(genderAvatar);
                    newLevelNamePokemon.setText(myPokemonName);

                    meNomAtaqueTextField.setText(motor.getPokemonFromBelt(myPokemonName).getRandomHabilidad().getNombre());
                    meAtaque = motor.getPokemonFromBelt(myPokemonName).getRandomHabilidad().getDaño();
                    vidaMe = motor.getPokemonFromBelt(myPokemonName).getVida();
                    nivel = motor.getPokemonFromBelt(myPokemonName).getNivel();

                    double vidaMeDouble2 = motor.getPokemonFromBelt(myPokemonName).getVida();
                    double vidaMeQueQueda2 = vidaMe;

                    meName.setText(myPokemonName);
                    meNameTextField.setText(myPokemonName);
                    lifeBarMe.setProgress((1*vidaMeQueQueda2)/vidaMeDouble2);

                }

            }
            else
            {
                lifeBarMe.setProgress((1*vidaMeQueQueda)/vidaMeDouble);
            }

        }


    }

    //Método para recibir informacion necesaria del motor y establecer las estadísticas iniciales
    public void receiveInitialDataForFights(String StarterPokemon, String nombreRPokemon, int pokeballs, int experience, int nivel, int monedero, String area, int masterBallsOwn, int greatBallsOwn, int ultraBallsOwn, ArrayList<Pokemon> beltPokemon,  ArrayList<Pokemon> bankPokemon, String gender, String name, int simplePotionOwn, int superPotionOwn, int maxPotionOwn)
    {
        Image genderAvatar = new Image("/images/imgPokemones/"+StarterPokemon+".png");
        meViewImage.setImage(genderAvatar);

        Image AgenderAvatar = new Image("/images/imgPokemones/"+nombreRPokemon+".png");
        oponentViewImage.setImage(AgenderAvatar);

        myPokemonName  = StarterPokemon;
        oponentName = nombreRPokemon;
        this.pokeballs = pokeballs;
        this.experience = experience;
        this.nivel = nivel;
        this.monedero = monedero;
        this.area = area;
        this.ultraBallsOwn = ultraBallsOwn;
        this.masterBallsOwn = masterBallsOwn;
        this.greatBallsOwn = greatBallsOwn;
        this.beltPokemon = beltPokemon;
        this.bankPokemon = bankPokemon;
        this.gender = gender;
        this.name = name;
        this.simplePotionOwn = simplePotionOwn;
        this.superPotionOwn = superPotionOwn;
        this.maxPotionOwn = maxPotionOwn;

        System.out.println("Simple "+this.simplePotionOwn);
        System.out.println("Super "+this.superPotionOwn);
        System.out.println("max "+this.maxPotionOwn);

        jungleBackG.setVisible(false);
        beachBackG.setVisible(false);
        forestBackG.setVisible(false);
        dessertBackG.setVisible(false);
        chooseBallGroup.setVisible(false);
        showBalls.setVisible(false);
        newLevelGroup.setVisible(false);
        newEvolution.setVisible(false);
        newLevelEntrenador.setVisible(false);
        potionsGroup.setVisible(false);
        donthavePotions.setVisible(false);
        readyToevolve.setVisible(false);

        simpleImg.setOpacity(1);
        superImg.setOpacity(.5);
        maxImg.setOpacity(.5);

        potion = "simple";

        imgMasterball.setOpacity(.5);
        imgPokeball.setOpacity(1);
        imgGreatball.setOpacity(.5);
        imgUltraball.setOpacity(.5);

        imgMasterball1.setOpacity(.5);
        imgPokeball1.setOpacity(1);
        imgGreatball1.setOpacity(.5);
        imgUltraball1.setOpacity(.5);

        typeBall = "pokeball";

        if (area.equals("jungle"))
        {
            jungleBackG.setVisible(true);
        }
        else if(area.equals("beach"))
        {
            beachBackG.setVisible(true);
        }
        else if(area.equals("forest"))
        {
            forestBackG.setVisible(true);
        }
        else if(area.equals("desert"))
        {
            dessertBackG.setVisible(true);
        }

        gotPokemonGroup.setVisible(false);
        didntGotPokemonGroup.setVisible(false);
        noSuficientesPokebolas.setVisible(false);
        notificationGroup.setVisible(false);
        lostGroup.setVisible(false);
        tieGroup.setVisible(false);
        winGroup.setVisible(false);
        didntGetPokemonMain.setVisible(false);
        chooseBallGroup2.setVisible(false);
        chooseBallGroup.setVisible(false);

        trowPokeballMain.setDisable(false);

        howManyPokeballs.setText(String.valueOf(pokeballs));
        masterballs.setText(String.valueOf(masterBallsOwn));
        ultraballs.setText(String.valueOf(ultraBallsOwn));
        greatballs.setText(String.valueOf(greatBallsOwn));

        meName.setText(myPokemonName);
        meNameTextField.setText(myPokemonName);

        nameOpponent.setText(oponentName);

        lifeBarOpponent.setProgress(1);
        lifeBarMe.setRotate(1);

        System.out.println(myPokemonName);

        vidaMe = motor.getPokemonFromBelt(myPokemonName).getVida();
        vidaOponent = motor.getPokemonByName(oponentName).getVida();

        Image imgGenderEntrenador = new Image("/images/"+gender+"User.png");
        imgEntrenador.setImage(imgGenderEntrenador);
    }



    /*

    WinGroup (métodos relacionados cuando derrotas al pokémon)

     */

    //Método que hace un cuadro visible para escoger qué pokebola quieres lanzarle
    public void throwPokeball(ActionEvent event)
    {
        chooseBallGroup2.setVisible(true);

    }

    //Método que ocurre cuando te aparece el mensaje que no tienes suficientes pokebolas y le das clic al botón ok
    public void okButtonForPokeballs(ActionEvent actionEvent)
    {
        noSuficientesPokebolas.setVisible(false);
        winGroup.setDisable(false);

    }

    //Método donde dependiendo de la Ball que escogiste, es la probabilidad de atraparlo, tambien dependiendo la vida del oponente
    public void trowBall2(ActionEvent actionEvent)
    {
            chooseBallGroup2.setVisible(false);
            if (typeBall == "pokeball")
            {
                if(pokeballs == 0)
                {
                    noSuficientesPokebolas.setVisible(true);
                    winGroup.setDisable(true);
                }
                else
                {
                    pokeballs = pokeballs - 1;

                    Random rand = new Random();
                    int upperbound = 2;
                    int numRandomPokemon = rand.nextInt(upperbound);

                    if(numRandomPokemon == 0)
                    {
                        gotPokemonGroup.setVisible(true);
                        motor.addPokemonFromFight(oponentName);
                        winGroup.setVisible(false);
                    }
                    else
                    {
                        didntGotPokemonGroup.setVisible(true);
                        winGroup.setVisible(false);
                    }

                }
            }
            else if(typeBall == "master")
            {
                if(masterBallsOwn == 0)
                {
                    noSuficientesPokebolas.setVisible(true);
                    winGroup.setDisable(true);
                }
                else
                {
                    masterBallsOwn = masterBallsOwn - 1;

                    gotPokemonGroup.setVisible(true);
                    motor.addPokemonFromFight(oponentName);
                    winGroup.setVisible(false);
                }

            }

            else if(typeBall == "great")
            {
                if(greatBallsOwn == 0)
                {
                    noSuficientesPokebolas.setVisible(true);
                    winGroup.setDisable(true);
                }
                else
                {
                    greatBallsOwn = greatBallsOwn - 1;

                    Random rand = new Random();
                    int upperbound = 2;
                    int numRandomPokemon = rand.nextInt(upperbound);

                    if(numRandomPokemon == 0)
                    {
                        gotPokemonGroup.setVisible(true);
                        motor.addPokemonFromFight(oponentName);
                        winGroup.setVisible(false);
                    }
                    else
                    {
                        didntGotPokemonGroup.setVisible(true);
                        winGroup.setVisible(false);
                    }

                }

            }

            else if(typeBall == "ultra")
            {
                if(ultraBallsOwn == 0)
                {
                    noSuficientesPokebolas.setVisible(true);
                    winGroup.setDisable(true);
                }
                else
                {
                    ultraBallsOwn = ultraBallsOwn - 1;

                    gotPokemonGroup.setVisible(true);
                    motor.addPokemonFromFight(oponentName);
                    winGroup.setVisible(false);

                }
            }

            howManyPokeballs.setText(String.valueOf(pokeballs));
            masterballs.setText(String.valueOf(masterBallsOwn));
            ultraballs.setText(String.valueOf(ultraBallsOwn));
            greatballs.setText(String.valueOf(greatBallsOwn));
    }

    //Método para ir a la pantalla principal
    public void goMainWindow(ActionEvent event)
    {
        motor.getDataFromFight(pokeballs,experience,nivel,monedero, ultraBallsOwn, masterBallsOwn, greatBallsOwn, beltPokemon, bankPokemon,simplePotionOwn,superPotionOwn,maxPotionOwn, myPokemonName);
        motor.showPantallaPrincipal(event);
    }

    //Método usado para que aparezca un cuadro con el número de Ball de cada tipo que tienes al pasar sobre una imagen
    public void enterPokeballs(MouseEvent mouseEvent)
    {
        showBalls.setVisible(true);
    }

    //Método usado para que desaparezca un cuadro con el número de Ball de cada tipo que tienes al dejar de estar sobre una imagen
    public void exitPokeballs(MouseEvent mouseEvent)
    {
        showBalls.setVisible(false);
    }

    //Cuando ya no quiere agarrar pokeballs, manda todas las variables usadas al motor y aparece la pantalla principal
    public void noThanksButton(ActionEvent actionEvent)
    {
        motor.getDataFromFight(pokeballs,experience,nivel, monedero,ultraBallsOwn, masterBallsOwn, greatBallsOwn, beltPokemon, bankPokemon,simplePotionOwn,superPotionOwn,maxPotionOwn,myPokemonName);
        motor.showPantallaPrincipal(actionEvent);

    }

    public void okButton(ActionEvent actionEvent)
    {
        motor.getDataFromFight(pokeballs,experience,nivel,monedero, ultraBallsOwn, masterBallsOwn, greatBallsOwn, beltPokemon, bankPokemon,simplePotionOwn,superPotionOwn,maxPotionOwn,myPokemonName);

        if (area.equals("jungle"))
        {
            motor.showArea2Pantalla(actionEvent);
        }
        else if(area.equals("beach"))
        {
            motor.showArea1Pantalla1(actionEvent);
        }
        else if(area.equals("forest"))
        {
            motor.showArea4Pantalla(actionEvent);
        }
        else if(area.equals("desert"))
        {
            motor.showArea3Pantalla(actionEvent);
        }

    }


    //Cuando no se atrapó el pokemon con una pokebola y se quiere tratar de nuevo
    public void tryAgain(ActionEvent event)
    {
        didntGotPokemonGroup.setVisible(false);
        winGroup.setVisible(true);
    }

    //Cuando se obtuvo el pokemon
    public void goToNotification(ActionEvent actionEvent)
    {
        notificationGroup.setVisible(true);
        gotPokemonGroup.setVisible(false);

    }

    //Método que manda todas el valor de las variables usadas al motor y despues de mouestra la pantalla principal
    public void goHome(MouseEvent mouseEvent)
    {
        motor.getDataFromFight(pokeballs,experience,nivel,monedero, ultraBallsOwn, masterBallsOwn, greatBallsOwn, beltPokemon, bankPokemon,simplePotionOwn,superPotionOwn,maxPotionOwn,myPokemonName);
        motor.showPantallaPrincipal(mouseEvent);
    }

    //  Metodos cuando se seleccionan la ball que se quiere usar
    public void selectMasterball(MouseEvent mouseEvent)
    {
        imgMasterball.setOpacity(1);
        imgPokeball.setOpacity(.5);
        imgGreatball.setOpacity(.5);
        imgUltraball.setOpacity(.5);

        imgMasterball1.setOpacity(1);
        imgPokeball1.setOpacity(.5);
        imgGreatball1.setOpacity(.5);
        imgUltraball1.setOpacity(.5);

        typeBall = "master";
    }

    public void selectGreatball(MouseEvent mouseEvent)
    {
        imgMasterball.setOpacity(.5);
        imgPokeball.setOpacity(.5);
        imgGreatball.setOpacity(1);
        imgUltraball.setOpacity(.5);

        imgMasterball1.setOpacity(.5);
        imgPokeball1.setOpacity(.5);
        imgGreatball1.setOpacity(1);
        imgUltraball1.setOpacity(.5);

        typeBall = "great";
    }

    public void selectPokeballl(MouseEvent mouseEvent)
    {
        imgMasterball.setOpacity(.5);
        imgPokeball.setOpacity(1);
        imgGreatball.setOpacity(.5);
        imgUltraball.setOpacity(.5);

        imgMasterball1.setOpacity(.5);
        imgPokeball1.setOpacity(1);
        imgGreatball1.setOpacity(.5);
        imgUltraball1.setOpacity(.5);

        typeBall = "pokeball";
    }

    public void selectUltraball(MouseEvent mouseEvent)
    {
        imgMasterball.setOpacity(.5);
        imgPokeball.setOpacity(.5);
        imgGreatball.setOpacity(.5);
        imgUltraball.setOpacity(1);

        imgMasterball1.setOpacity(.5);
        imgPokeball1.setOpacity(.5);
        imgGreatball1.setOpacity(.5);
        imgUltraball1.setOpacity(1);

        typeBall = "ultra";
    }


    //Trow pokeball from main button
    public void trowPokeball(ActionEvent actionEvent)
    {
        chooseBallGroup.setVisible(true);
        huirButton.setDisable(true);
        atacarButton.setDisable(true);
        trowPokeballMain.setDisable(true);
    }

    //Cuando no se tienen pokebolas suficientes entra en este método
    public void okButtonForPokeballs1(ActionEvent actionEvent)
    {
        chooseBallGroup.setVisible(false);
        noSuficientesPokebolas1.setVisible(false);
        atacarButton.setDisable(false);
        huirButton.setDisable(false);
        trowPokeballMain.setDisable(false);
        trowPokeballMain.setDisable(false);
    }

    //Cuando escoges cual pokebola quieres usar y presionas el boton de trow
    public void trowBall(ActionEvent actionEvent)
    {
        chooseBallGroup.setVisible(false);
        atacarButton.setDisable(true);
        huirButton.setDisable(true);
        trowPokeballMain.setDisable(true);

        if (typeBall == "pokeball")
        {
            if(pokeballs == 0)
            {
                noSuficientesPokebolas1.setVisible(true);
            }
            else
            {
                Random rand = new Random();
                int upperbound = 0;
                int random = 0;

                double vidaODouble = motor.getPokemonByName(oponentName).getVida();
                double vidaOQueQueda = vidaOponent;

                double var = (1 * vidaOQueQueda) / vidaODouble;

                if (var >= .5)
                {
                    huirButton.setDisable(true);
                    atacarButton.setDisable(true);
                    upperbound = 5;

                    random = rand.nextInt(upperbound);

                    if (random == 4)
                    {

                        gotPokemonGroup.setVisible(true);
                        motor.addPokemonFromFight(oponentName);

                        pokeballs = pokeballs - 1;
                    }
                    else
                    {
                        pokeballs = pokeballs - 1;
                        didntGetPokemonMain.setVisible(true);
                    }
                }

                else if (var >= .3 && var < .5)
                {
                    upperbound = 4;
                    random = rand.nextInt(upperbound);

                    if (random == 1)
                    {
                        gotPokemonGroup.setVisible(true);
                        motor.addPokemonFromFight(oponentName);

                        pokeballs = pokeballs - 1;
                    }
                    else
                    {
                        pokeballs = pokeballs - 1;
                        didntGetPokemonMain.setVisible(true);
                    }
                }

                else
                {
                    upperbound = 3;
                    random = rand.nextInt(upperbound);

                    if (random == 1)
                    {
                        gotPokemonGroup.setVisible(true);
                        motor.addPokemonFromFight(oponentName);

                        pokeballs = pokeballs - 1;
                    }
                    else
                    {
                        pokeballs = pokeballs - 1;
                        didntGetPokemonMain.setVisible(true);
                    }

                }
            }
        }
        else if(typeBall == "master")
        {
            if(masterBallsOwn == 0)
            {
                noSuficientesPokebolas1.setVisible(true);

            }
            else
            {
                gotPokemonGroup.setVisible(true);
                motor.addPokemonFromFight(oponentName);

                masterBallsOwn = masterBallsOwn - 1;
            }

        }

        else if(typeBall == "great")
        {

            if(greatBallsOwn == 0)
            {
                noSuficientesPokebolas1.setVisible(true);
            }
            else
            {
                Random rand = new Random();
                int upperbound = 0;
                int random = 0;

                double vidaODouble = motor.getPokemonByName(oponentName).getVida();
                double vidaOQueQueda = vidaOponent;

                double var = (1 * vidaOQueQueda) / vidaODouble;

                if (var >= .5)
                {
                    huirButton.setDisable(true);
                    atacarButton.setDisable(true);
                    upperbound = 4;

                    random = rand.nextInt(upperbound);

                    if (random == 3)
                    {

                        gotPokemonGroup.setVisible(true);
                        motor.addPokemonFromFight(oponentName);

                        greatBallsOwn = greatBallsOwn - 1;
                    }
                    else
                    {
                        greatBallsOwn = greatBallsOwn - 1;
                        didntGetPokemonMain.setVisible(true);
                    }
                }

                else if (var >= .3 && var < .5)
                {
                    upperbound = 3;
                    random = rand.nextInt(upperbound);

                    if (random == 1)
                    {
                        gotPokemonGroup.setVisible(true);
                        motor.addPokemonFromFight(oponentName);

                        greatBallsOwn = greatBallsOwn - 1;

                    }
                    else
                    {
                        greatBallsOwn = greatBallsOwn - 1;
                        didntGetPokemonMain.setVisible(true);
                    }
                }

                else
                {
                    upperbound = 2;
                    random = rand.nextInt(upperbound);

                    if (random == 1)
                    {

                        gotPokemonGroup.setVisible(true);
                        motor.addPokemonFromFight(oponentName);

                        greatBallsOwn = greatBallsOwn - 1;

                    }
                    else
                    {
                        greatBallsOwn = greatBallsOwn - 1;
                        didntGetPokemonMain.setVisible(true);
                    }

                }
            }

        }

        else if(typeBall == "ultra")
        {
            if(ultraBallsOwn == 0)
            {
                noSuficientesPokebolas1.setVisible(true);
            }
            else
            {
                Random rand = new Random();
                int upperbound = 0;
                int random = 0;

                double vidaODouble = motor.getPokemonByName(oponentName).getVida();
                double vidaOQueQueda = vidaOponent;

                double var = (1 * vidaOQueQueda) / vidaODouble;

                if (var >= .5)
                {
                    huirButton.setDisable(true);
                    atacarButton.setDisable(true);
                    upperbound = 3;

                    random = rand.nextInt(upperbound);

                    if (random == 2)
                    {

                        gotPokemonGroup.setVisible(true);
                        motor.addPokemonFromFight(oponentName);

                        ultraBallsOwn = ultraBallsOwn - 1;
                    }
                    else
                    {
                        ultraBallsOwn = ultraBallsOwn - 1;
                        didntGetPokemonMain.setVisible(true);
                    }
                }

                else
                {
                    upperbound = 2;
                    random = rand.nextInt(upperbound);

                    if (random == 0)
                    {
                        gotPokemonGroup.setVisible(true);
                        motor.addPokemonFromFight(oponentName);

                        ultraBallsOwn = ultraBallsOwn - 1;
                    }
                    else
                    {
                        ultraBallsOwn = ultraBallsOwn - 1;
                        didntGetPokemonMain.setVisible(true);
                    }

                }
            }
        }

        howManyPokeballs.setText(String.valueOf(pokeballs));
        masterballs.setText(String.valueOf(masterBallsOwn));
        ultraballs.setText(String.valueOf(ultraBallsOwn));
        greatballs.setText(String.valueOf(greatBallsOwn));

    }

    //Cuando no se obtiene el pokemon cuando le tiras una pokebola
    public void okButtonforNotGettingPK(ActionEvent actionEvent)
    {
        huirButton.setDisable(false);
        atacarButton.setDisable(false);
        trowPokeballMain.setDisable(false);
        didntGetPokemonMain.setVisible(false);

    }

    //el Ok button de cuando ganas el pokemon por medio de una pokebola
    public void greatButtonAction(ActionEvent actionEvent)
    {
        winGroup.setVisible(true);
        winGroup.setDisable(false);
        newLevelGroup.setVisible(false);
        newEvolution.setVisible(false);
    }

    //el OK button cuando se pone la notificación que evolucionó el pokemon
    public void awesomeButtonToNewLevelEntrenador(ActionEvent actionEvent)
    {
        winGroup.setVisible(true);
        winGroup.setDisable(false);
        newLevelEntrenador.setVisible(false);
    }

    public void usePotionAction(ActionEvent actionEvent)
    {
        potionsGroup.setVisible(true);
        atacarButton.setDisable(true);
        huirButton.setDisable(true);
        trowPokeballMain.setDisable(true);

    }


    /*
    Métodos cuando se selecciona una pocion
     */
    public void selectMaxPotion(MouseEvent mouseEvent)
    {
        simpleImg.setOpacity(.5);
        superImg.setOpacity(.5);
        maxImg.setOpacity(1);

        potion = "max";

    }

    public void selectSimplePotion(MouseEvent mouseEvent)
    {

        simpleImg.setOpacity(1);
        superImg.setOpacity(.5);
        maxImg.setOpacity(.5);

        potion = "simple";

    }

    public void selectSuperPotion(MouseEvent mouseEvent)
    {

        simpleImg.setOpacity(.5);
        superImg.setOpacity(1);
        maxImg.setOpacity(.5);

        potion = "super";
    }


    //Método que se utiliza cuando se presiona el boton de usar pocion
    public void useButtonAction(ActionEvent actionEvent)
    {
        if(potion.equals("simple"))
        {
            if(simplePotionOwn == 0)
            {
                donthavePotions.setVisible(true);
                useButton.setDisable(true);
            }
            else
            {
                simplePotionOwn = simplePotionOwn -1;

                atacarButton.setDisable(false);
                huirButton.setDisable(false);
                trowPokeballMain.setDisable(false);

                vidaMe = vidaMe + 5;
                double vidaMeDouble = motor.getPokemonFromBelt(myPokemonName).getVida();
                double vidaMeQueQueda = vidaMe;

                if((1*vidaMeQueQueda)/vidaMeDouble > 1)
                {
                   vidaMe = motor.getPokemonFromBelt(myPokemonName).getVida();
                    lifeBarMe.setProgress((1*vidaMeQueQueda)/vidaMeDouble);

                }
                else
                {
                    lifeBarMe.setProgress((1*vidaMeQueQueda)/vidaMeDouble);
                }

                potionsGroup.setVisible(false);
            }
        }

        else if(potion.equals("super"))
        {
            if(superPotionOwn == 0)
            {
                donthavePotions.setVisible(true);
                useButton.setDisable(true);
            }
            else
            {

                superPotionOwn = superPotionOwn -1;

                atacarButton.setDisable(false);
                huirButton.setDisable(false);
                trowPokeballMain.setDisable(false);

                vidaMe = vidaMe + 7;
                double vidaMeDouble = motor.getPokemonFromBelt(myPokemonName).getVida();
                double vidaMeQueQueda = vidaMe;

                if((1*vidaMeQueQueda)/vidaMeDouble > 1)
                {
                    vidaMe = motor.getPokemonFromBelt(myPokemonName).getVida();
                    lifeBarMe.setProgress((1*vidaMeQueQueda)/vidaMeDouble);

                }
                else
                {
                    lifeBarMe.setProgress((1*vidaMeQueQueda)/vidaMeDouble);
                }

                potionsGroup.setVisible(false);

            }

        }

        else if(potion.equals("max"))
        {

            if(maxPotionOwn == 0)
            {
                donthavePotions.setVisible(true);
                useButton.setDisable(true);
            }
            else
            {
                maxPotionOwn = maxPotionOwn -1;

                atacarButton.setDisable(false);
                huirButton.setDisable(false);
                trowPokeballMain.setDisable(false);

                vidaMe = vidaMe + 10;
                double vidaMeDouble = motor.getPokemonFromBelt(myPokemonName).getVida();
                double vidaMeQueQueda = vidaMe;

                if((1*vidaMeQueQueda)/vidaMeDouble > 1)
                {
                    vidaMe = motor.getPokemonFromBelt(myPokemonName).getVida();
                    lifeBarMe.setProgress((1*vidaMeQueQueda)/vidaMeDouble);

                }
                else
                {
                    lifeBarMe.setProgress((1*vidaMeQueQueda)/vidaMeDouble);
                }
                potionsGroup.setVisible(false);
            }

        }
        System.out.println("Simple "+this.simplePotionOwn);
        System.out.println("Super "+this.superPotionOwn);
        System.out.println("max "+this.maxPotionOwn);
    }

    //Entra aquí cuando no se tiene una pocion que se quiere usar
    public void okForDontHavePotions(ActionEvent actionEvent)
    {
        useButton.setDisable(false);
        donthavePotions.setVisible(false);
        potionsGroup.setVisible(false);
        atacarButton.setDisable(false);
        huirButton.setDisable(false);
        trowPokeballMain.setDisable(false);
    }

    public void readyToevolveOkButtonAction(ActionEvent actionEvent)
    {
        winGroup.setDisable(false);
        readyToevolve.setVisible(false);
    }
}
