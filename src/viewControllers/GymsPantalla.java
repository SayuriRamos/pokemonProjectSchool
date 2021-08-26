package viewControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class GymsPantalla {


    @FXML
    private ImageView imgEntrenador;

    @FXML
    private ImageView imgMe;

    @FXML
    private ImageView imgOpponentPokemon;

    @FXML
    private ImageView imgMyPokemon;

    @FXML
    private Label nameOpponent;

    @FXML
    private Label meNameTextField;

    @FXML
    private ProgressBar lifeBarMe;

    @FXML
    private ProgressBar lifeBarOpponent;

    @FXML
    private TextField meNomAtaqueTextField;

    @FXML
    private TextField nomAtaqueTextField;

    @FXML
    private TextField avatarExperience;

    @FXML
    private TextField howMuchCoins;

    @FXML
    private TextField nameBadge;

    @FXML
    private TextField namePokemonUsed;

    @FXML
    private Group winGroup;

    @FXML
    private Group lostGroup;

    @FXML
    private Button okLostButton;

    @FXML
    private Button attackButton;

    @FXML
    private ImageView imgBadge;

    @FXML
    private ImageView imageNewLevelPoekmon;

    @FXML
    private TextField newLevelNamePokemon;

    @FXML
    private TextField newLevelLevelPokemon;

    @FXML
    private Group newLevelGroup;

    @FXML
    private ImageView oldImagePokemon;

    @FXML
    private ImageView imgNewPokemonEvolution;

    @FXML
    private Label nameOldPokemon;

    @FXML
    private TextField oldNameEvolution;

    @FXML
    private TextField newNameEvolution;

    @FXML
    private ImageView imgEntrenador1;

    @FXML
    private Label nameEntrenadorMe;

    @FXML
    private TextField newLevenEntrenador;

    @FXML
    private Button awesomeButtonToNewLevelEntrenador;

    @FXML
    private Group newEvolution;

    @FXML
    private Group newLevelEntrenador;

    @FXML
    private Group whitneyNormal;

    @FXML
    private Group brockDesierto;

    @FXML
    private Group pryceWater;

    @FXML
    private Group erikaForest;

    @FXML
    private Group kogaJungle;

    @FXML
    private Group surgeJungle;

    @FXML
    private Group blaineDesert;


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





    private Motor motor;
    private String entrenadorChose = "";   //Nombre del entrenador que escogió
    private String myPokemonName = "";     //Nombre del pokemon que esta usando para pelear en el momento
    private String name = "";              //Nombre del usuario
    private String oponentName = "";      //Nombre del pokemon contrincante que esta usando el entrenador para pelear en el momento
    private int vidaMe = 0;               //Variable que almacena la vida del pokemon que estas usando para pelear en ese momento
    private int vidaOponent = 0;           //Variable que almacena la vida del pokemon contra el que estas peleando en ese momento
    private int monedas = 0;               //Monedas que tiene el usuario
    private int experience;               //Experiencia que tiene el usuario
    private int level;                   //nivel que tiene el usuario

    private Pokemon varEvolutio; //Es para ver si tiene evolucion o no

    private int simplePotionOwn = 0;  //cantidad de SimplePotion que tiene el usuario
    private int maxPotionOwn = 0;  //cantidad de maxPotion que tiene el usuario
    private int superPotionOwn = 0;    //cantidad de superPotion que tiene el usuario

    private String potion;     //Variable que guarda qué tipo de pocion le quizo usar

    private int meAtaque = 0;     //Variable que almacena la cantidad de daño del ataque que se escogió random
    private int oponentAtaque = 0;    //Variable que almacena la cantidad de daño del ataque  del contrincante que se escogió random

    private int varMe = 0;          //Variable que se usa para saber cuantos pokemones del belt se han usado
    private int varOpponent = 0;   //Variable que se usa para saber cuantos pokemones ha usado el oponente

    private ArrayList<Pokemon> beltPokemon = new ArrayList<Pokemon>();   //ArrayList que almacena los pokemon del belt pokemon
    private ArrayList<Pokemon> bankPokemon = new ArrayList<Pokemon>();    //ArrayList que almacena los pokemon del bank pokemon
    private ArrayList<String> pokemonUsedByOpponent = new ArrayList<String>();   //ArrayList que almacena el nombre de los pokemones que ya usó el entrenador oponente

    Entrenadores entrenador= new Entrenadores();   //Variable que se iguala al entrenador que entra

    //Método para recibir informacion necesaria del motor y establecer las estadísticas iniciales
    public void receiveMotorInstance(Motor m, ArrayList<Pokemon> beltPokemon, ArrayList<Pokemon> bankPokemon, Entrenadores entrenador, String gender, String name, int monedas, String StarterPokemon, int experience, int nivel, String entrenadorChose,  int simplePotionOwn, int superPotionOwn, int maxPotionOwn)
    {
        this.motor = m;
        this.beltPokemon = beltPokemon;
        this.entrenador = entrenador;
        myPokemonName = StarterPokemon;
        this.monedas = monedas;
        this.experience = experience;
        level = nivel;
        this.entrenadorChose = entrenadorChose;
        this.bankPokemon = bankPokemon;
        this.name = name;

        this.simplePotionOwn = simplePotionOwn;
        this.superPotionOwn = superPotionOwn;
        this.maxPotionOwn = maxPotionOwn;

        potionsGroup.setVisible(false);
        donthavePotions.setVisible(false);
        readyToevolve.setVisible(false);

        System.out.println("Simple "+this.simplePotionOwn);
        System.out.println("Super "+this.superPotionOwn);
        System.out.println("max "+this.maxPotionOwn);


        System.out.println("el nivel es " +level);
        System.out.println("el experiencia es " +experience);

        simpleImg.setOpacity(1);
        superImg.setOpacity(.5);
        maxImg.setOpacity(.5);

        potion = "simple";


        attackButton.setDisable(false);
        lostGroup.setVisible(false);
        winGroup.setVisible(false);
        newLevelGroup.setVisible(false);
        whitneyNormal.setVisible(false);
        brockDesierto.setVisible(false);
        pryceWater.setVisible(false);
        erikaForest.setVisible(false);
        kogaJungle.setVisible(false);
        surgeJungle.setVisible(false);
        blaineDesert.setVisible(false);
        newEvolution.setVisible(false);


        Image genderAvatar = new Image("/images/Entrenadores/"+this.entrenador.getName()+".png");
        imgEntrenador.setImage(genderAvatar);

        newLevelNamePokemon.setText(myPokemonName);
        newLevelLevelPokemon.setText(String.valueOf(level));

        Image AgenderAvatar = new Image("/images/"+gender+"User.png");
        imgMe.setImage(AgenderAvatar);
        imgEntrenador1.setImage(AgenderAvatar);

        Image meImgPokemon = new Image("/images/imgPokemones/"+myPokemonName+".png");
        imgMyPokemon.setImage(meImgPokemon);
        imageNewLevelPoekmon.setImage(meImgPokemon);

        oponentName= entrenador.getRandomPokemon().getName();
        pokemonUsedByOpponent.add(oponentName);

        Image opponentImgPokemon = new Image("/images/imgPokemones/"+oponentName+".png");
        imgOpponentPokemon.setImage(opponentImgPokemon);

        Image badge = new Image("/images/Entrenadores/"+entrenador.getBadge()+"_Badge.png");
        imgBadge.setImage(badge);

        meNameTextField.setText(myPokemonName);

        nameOpponent.setText(oponentName);

        lifeBarOpponent.setProgress(1);
        lifeBarMe.setRotate(1);

        vidaMe = motor.getPokemonFromBelt(myPokemonName).getVida();
        vidaOponent = motor.getPokemonFromEntrenador(this.entrenador, oponentName).getVida();


        if(entrenadorChose == "Whitney")
        {
            whitneyNormal.setVisible(true);
            attackButton.setBackground(new Background(new BackgroundFill(Color.TOMATO, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(entrenadorChose == "Brock")
        {
            brockDesierto.setVisible(true);
            attackButton.setBackground(new Background(new BackgroundFill(Color.SADDLEBROWN, CornerRadii.EMPTY, Insets.EMPTY)));

        }
        else if(entrenadorChose == "Pryce")
        {
            pryceWater.setVisible(true);
            attackButton.setBackground(new Background(new BackgroundFill(Color.LIGHTSEAGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(entrenadorChose == "Erika")
        {
            erikaForest.setVisible(true);
            attackButton.setBackground(new Background(new BackgroundFill(Color.GREENYELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(entrenadorChose == "Koga")
        {
            kogaJungle.setVisible(true);
            attackButton.setBackground(new Background(new BackgroundFill(Color.SEAGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(entrenadorChose == "Surge")
        {
            surgeJungle.setVisible(true);
            attackButton.setBackground(new Background(new BackgroundFill(Color.GOLD, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(entrenadorChose == "Blaine")
        {
            blaineDesert.setVisible(true);
            attackButton.setBackground(new Background(new BackgroundFill(Color.CRIMSON, CornerRadii.EMPTY, Insets.EMPTY)));

        }



    }


    //Método donde al darle clic al botón atacar, tu atacas primero, y despues te regresa el golpe
    /*
        contiene:
        Para que se baje la vida de cualquiera de los dos cuando atacamos
        Qué pasa si ganas: te aparece un Group
        Qué pasa si pierdes: te aparece un mensaje de ya te desmayaste
     */
    public void attack(ActionEvent actionEvent)
    {
        meNomAtaqueTextField.setText(motor.getPokemonFromBelt(myPokemonName).getRandomHabilidad().getNombre()+" -"+motor.getPokemonFromBelt(myPokemonName).getRandomHabilidad().getDaño());
        meAtaque = motor.getPokemonFromBelt(myPokemonName).getRandomHabilidad().getDaño();

        vidaOponent =  vidaOponent-meAtaque;

        double vidaOponentDouble = motor.getPokemonFromEntrenador(this.entrenador, oponentName).getVida();
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

            varOpponent++;

            if (varOpponent == entrenador.getPokemones().size())
            {
                lifeBarOpponent.setProgress(0);
                System.out.println("gane");
                experience = experience + 20;
                monedas = monedas+100;
                namePokemonUsed.setText(myPokemonName);
                howMuchCoins.setText(String.valueOf(monedas));

                nameBadge.setText("You Got The "+entrenador.getBadge()+"Badge");
                attackButton.setDisable(true);
                winGroup.setVisible(true);
                usePotionButton.setDisable(true);

                motor.getPokemonFromBelt(myPokemonName).setSumaPuntos(5);


                if(motor.getPokemonFromBelt(myPokemonName).getPuntos() >= 25) //Que pasa si sube de nivel y evoluciona el pokemon, si sube de nivel se le agrega 2 a la vida y 1 al daño de las habilidades
                {
                    beltPokemon.get(varMe).setPuntos(beltPokemon.get(varMe).getPuntos()-25);
                    beltPokemon.get(varMe).setNivel(beltPokemon.get(varMe).getNivel()+1);
                    beltPokemon.get(varMe).setVida(beltPokemon.get(varMe).getVida()+2);
                    newLevelGroup.setVisible(true);
                    winGroup.setDisable(true);

                    newLevelNamePokemon.setText(beltPokemon.get(varMe).getName());
                    newLevelLevelPokemon.setText(String.valueOf(beltPokemon.get(varMe).getNivel()));
                    Image mePokemon = new Image("/images/imgPokemones/"+myPokemonName+".png");
                    imageNewLevelPoekmon.setImage(mePokemon);



                    System.out.println("La nueva vida de "+ beltPokemon.get(varMe).getName()+" es "+beltPokemon.get(varMe).getVida());


                    for(int a = 0; a < beltPokemon.get(varMe).getHabilidades().size(); a++)
                    {
                        beltPokemon.get(varMe).getHabilidades().get(a).setDaño(beltPokemon.get(varMe).getHabilidades().get(a).getDaño()+1);
                        System.out.println("El nuevo daño de "+ beltPokemon.get(varMe).getHabilidades().get(a).getNombre()+" es "+beltPokemon.get(varMe).getHabilidades().get(a).getDaño());
                    }

                    try  //Tratar de cambiar el pokemon que ya estaba por su evolucion
                    {
                        if(beltPokemon.get(varMe).getNivel() >= 10)
                        {
                            varEvolutio = beltPokemon.get(varMe).getEvolucion().getEvolucion();

                            for(int a = 0; a <= bankPokemon.size(); a++)
                            {
                                if (a == bankPokemon.size())
                                {

                                    newEvolution.setVisible(true);
                                    oldImagePokemon.setImage(mePokemon);
                                    oldNameEvolution.setText(myPokemonName);
                                    nameOldPokemon.setText(myPokemonName);

                                    beltPokemon.get(varMe).setNivel(0);
                                    System.out.println("El nuevo nivel de "+ beltPokemon.get(varMe).getName()+" es "+beltPokemon.get(varMe).getNivel());

                                    Pokemon copyEvolucion = new Pokemon();
                                    copyEvolucion.setName(beltPokemon.get(varMe).getEvolucion().getName());
                                    copyEvolucion.setVida(beltPokemon.get(varMe).getEvolucion().getVida()+5);  //Si evolucionas empiezas con vida que tiene como si lo hubieras atrapado solo + 5
                                    copyEvolucion.setTamano(beltPokemon.get(varMe).getEvolucion().getTamano());
                                    copyEvolucion.setTipo(beltPokemon.get(varMe).getEvolucion().getTipo());
                                    copyEvolucion.setNivel(beltPokemon.get(varMe).getEvolucion().getNivel()+5);  //Si evolucionas empiezas ennivel 5
                                    copyEvolucion.setPuntos(beltPokemon.get(varMe).getEvolucion().getPuntos());
                                    copyEvolucion.setEvolucion(beltPokemon.get(varMe).getEvolucion().getEvolucion());

                                    Image newEvolution = new Image("/images/imgPokemones/"+copyEvolucion.getName()+".png");
                                    imgNewPokemonEvolution.setImage(newEvolution);
                                    newNameEvolution.setText(copyEvolucion.getName());


                                    for(int o = 0; o< beltPokemon.get(varMe).getEvolucion().getHabilidades().size(); o++) {
                                        habilidades copyHabilidades = new habilidades();
                                        copyHabilidades.setNombre(beltPokemon.get(varMe).getEvolucion().getHabilidades().get(o).getNombre());
                                        copyHabilidades.setDaño(beltPokemon.get(varMe).getEvolucion().getHabilidades().get(o).getDaño() + 5); //El 5 es porque empieza en el nivel 5

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

                                    beltPokemon.remove(varMe);
                                    beltPokemon.add(varMe, copyEvolucion);

                                    System.out.println("La nueva evolución del belt es "+beltPokemon.get(varMe).getName()+"   " +beltPokemon.get(varMe));

                                    myPokemonName = beltPokemon.get(0).getName();

                                }
                                if(beltPokemon.get(varMe).getEvolucion().getName().equals(bankPokemon.get(a).getName()))
                                {

                                    readyToevolve.setVisible(true);
                                    winGroup.setDisable(true);
                                    newLevelGroup.setDisable(true);
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
                    level = level + 1;
                    experience = experience - 30;
                    System.out.println(level);

                    nameEntrenadorMe.setText(name+",");
                    newLevenEntrenador.setText(String.valueOf(level));
                    avatarExperience.setText(String.valueOf(experience));

                    newLevelEntrenador.setVisible(true);
                    winGroup.setDisable(true);
                }

                avatarExperience.setText(String.valueOf(experience));
            }
            else
            {
                    String name = entrenador.getRandomPokemon().getName();

                    for(int i = 0; i <= pokemonUsedByOpponent.size(); i++)
                    {
                        if(i == pokemonUsedByOpponent.size())
                        {
                            oponentName = name;
                            break;
                        }
                        if(name == pokemonUsedByOpponent.get(i))
                        {
                            i = -1;
                            name = entrenador.getRandomPokemon().getName();
                        }
                    }

                pokemonUsedByOpponent.add(name);


                Image genderAvatar = new Image("/images/imgPokemones/"+oponentName+".png");
                imgOpponentPokemon.setImage(genderAvatar);


                meNomAtaqueTextField.setText(motor.getPokemonFromEntrenador(entrenador,oponentName).getRandomHabilidad().getNombre());
                meAtaque = motor.getPokemonFromEntrenador(entrenador,oponentName).getRandomHabilidad().getDaño();
                vidaOponent = motor.getPokemonFromEntrenador(entrenador,oponentName).getVida();

                double vidaDouble2 = motor.getPokemonFromEntrenador(entrenador,oponentName).getVida();
                double vidaQueQueda2 = vidaOponent;

                nameOpponent.setText(oponentName);
                lifeBarOpponent.setProgress((1*vidaQueQueda2)/vidaDouble2);

            }

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
                varMe++;

                if (varMe == beltPokemon.size())
                {
                    lifeBarMe.setProgress(0);
                    System.out.println("perdi");
                    lostGroup.setVisible(true);
                    attackButton.setDisable(true);
                    usePotionButton.setDisable(true);

                }
                else
                {
                    myPokemonName = beltPokemon.get(varMe).getName();
                    Image genderAvatar = new Image("/images/imgPokemones/"+myPokemonName+".png");
                    imgMyPokemon.setImage(genderAvatar);
                    imageNewLevelPoekmon.setImage(genderAvatar);
                    newLevelNamePokemon.setText(myPokemonName);

                    meNomAtaqueTextField.setText(motor.getPokemonFromBelt(myPokemonName).getRandomHabilidad().getNombre());
                    meAtaque = motor.getPokemonFromBelt(myPokemonName).getRandomHabilidad().getDaño();
                    vidaMe = motor.getPokemonFromBelt(myPokemonName).getVida();

                    double vidaMeDouble2 = motor.getPokemonFromBelt(myPokemonName).getVida();
                    double vidaMeQueQueda2 = vidaMe;

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

    //Método cuando se da clic al boton de Ok caundo se pierde, se va a las pantallas de gym
    public void okLostButton(ActionEvent actionEvent)
    {
        motor.showSelectGymEntrenadorPantalla(actionEvent);
    }

    //En este método se va a donde estan los gyms y envía toda la informacion al motor.
    public void goToGymsButton(ActionEvent actionEvent)
    {
        motor.getDataFromGym(beltPokemon,bankPokemon,monedas,experience,level,entrenadorChose,simplePotionOwn,superPotionOwn,maxPotionOwn, myPokemonName);
        motor.showSelectGymEntrenadorPantalla(actionEvent);
        System.out.println("el nivel es " +level);
        System.out.println("La experiencia es " +experience);

    }

    //En este método se va a la pantalla principal y envía toda la informacion al motor.
    public void goMainWindow(ActionEvent actionEvent)
    {
        motor.getDataFromGym(beltPokemon,bankPokemon,monedas,experience,level,entrenadorChose,simplePotionOwn,superPotionOwn,maxPotionOwn, myPokemonName);
        motor.showPantallaPrincipal(actionEvent);
        System.out.println("el nivel es " +level);
        System.out.println("La experiencia es " +experience);

    }

    //boton de OK, cuando evoluciona el pokemon con el que lo mataste
    public void greatButtonAction(ActionEvent actionEvent)
    {
        newEvolution.setVisible(false);
        newLevelGroup.setVisible(false);
        winGroup.setDisable(false);
    }

    //boton de OK, cuando avanza de nivel el usuario
    public void awesomeButtonToNewLevelEntrenador(ActionEvent actionEvent)
    {
        winGroup.setDisable(false);
        newLevelEntrenador.setVisible(false);
    }

    //accion con el que muestra las pociones para usar
    public void usePotionAction(ActionEvent actionEvent)
    {
        potionsGroup.setVisible(true);
        attackButton.setDisable(true);
    }

    /*
    Métodos para cuando se selecciona una pocion
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

    //Acion cuando ya se eligió la pocion y se le da mas vida al pokemon que estas usando
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

                attackButton.setDisable(false);

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

                attackButton.setDisable(false);

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

                attackButton.setDisable(false);

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

    //Caundo se presiona el boton OK del grupo que aparece cuando no se tienen pociones suficientes
    public void okForDontHavePotions(ActionEvent actionEvent)
    {
        useButton.setDisable(false);
        donthavePotions.setVisible(false);
        potionsGroup.setVisible(false);
        attackButton.setDisable(false);
    }

    public void readyToevolveOkButtonAction(ActionEvent actionEvent)
    {
        winGroup.setDisable(false);
        newLevelGroup.setDisable(false);
        readyToevolve.setVisible(false);
    }
}
