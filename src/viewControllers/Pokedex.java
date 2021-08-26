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

import java.util.ArrayList;

public class Pokedex {

    @FXML
    private TextField replaceBelt;
    @FXML
    private TextField replaceBank;

    @FXML
    private TextField searchTextField;

    @FXML
    private Button replace;

    @FXML
    private Button searchButton;

    @FXML
    private Group thatOneIsAlreadYInBelt;

    @FXML
    private Button pokeAlreadyInBelt;

    @FXML
    private Group writeCorrectNumbersGroup;

    @FXML
    private Button positionBeltButton;



    @FXML
    private ImageView beltImg0;
    @FXML
    private ImageView beltImg1;
    @FXML
    private ImageView beltImg2;
    @FXML
    private ImageView beltImg3;
    @FXML
    private ImageView beltImg4;
    @FXML
    private ImageView beltImg5;

    @FXML
    private Label namePokemon0;
    @FXML
    private Label namePokemon1;
    @FXML
    private Label namePokemon2;
    @FXML
    private Label namePokemon3;
    @FXML
    private Label namePokemon4;
    @FXML
    private Label namePokemon5;


    @FXML
    private ImageView bankImg0;
    @FXML
    private ImageView bankImg1;
    @FXML
    private ImageView bankImg2;
    @FXML
    private ImageView bankImg3;
    @FXML
    private ImageView bankImg4;
    @FXML
    private ImageView bankImg5;
    @FXML
    private ImageView bankImg6;
    @FXML
    private ImageView bankImg7;
    @FXML
    private ImageView bankImg8;
    @FXML
    private ImageView bankImg9;
    @FXML
    private ImageView bankImg10;
    @FXML
    private ImageView bankImg11;
    @FXML
    private ImageView bankImg12;
    @FXML
    private ImageView bankImg13;
    @FXML
    private ImageView bankImg14;
    @FXML
    private ImageView bankImg15;
    @FXML
    private ImageView bankImg16;
    @FXML
    private ImageView bankImg17;
    @FXML
    private ImageView bankImg18;
    @FXML
    private ImageView bankImg19;
    @FXML
    private ImageView bankImg20;
    @FXML
    private ImageView bankImg21;
    @FXML
    private ImageView bankImg22;
    @FXML
    private ImageView bankImg23;
    @FXML
    private ImageView bankImg24;
    @FXML
    private ImageView bankImg25;
    @FXML
    private ImageView bankImg26;
    @FXML
    private ImageView bankImg27;
    @FXML
    private ImageView bankImg28;
    @FXML
    private ImageView bankImg29;
    @FXML
    private ImageView bankImg30;
    @FXML
    private ImageView bankImg31;
    @FXML
    private ImageView bankImg32;
    @FXML
    private ImageView bankImg33;
    @FXML
    private ImageView bankImg34;
    @FXML
    private ImageView bankImg35;
    @FXML
    private ImageView bankImg36;
    @FXML
    private ImageView bankImg37;
    @FXML
    private ImageView bankImg38;
    @FXML
    private ImageView bankImg39;
    @FXML
    private ImageView bankImg40;
    @FXML
    private ImageView bankImg41;
    @FXML
    private ImageView bankImg42;
    @FXML
    private ImageView bankImg43;
    @FXML
    private ImageView bankImg44;
    @FXML
    private ImageView bankImg45;
    @FXML
    private ImageView bankImg46;
    @FXML
    private ImageView bankImg47;
    @FXML
    private ImageView bankImg48;
    @FXML
    private ImageView bankImg49;
    @FXML
    private ImageView bankImg50;
    @FXML
    private ImageView bankImg51;
    @FXML
    private ImageView bankImg52;
    @FXML
    private ImageView bankImg53;
    @FXML
    private ImageView bankImg54;
    @FXML
    private ImageView bankImg55;
    @FXML
    private ImageView bankImg56;
    @FXML
    private ImageView bankImg57;
    @FXML
    private ImageView bankImg58;
    @FXML
    private ImageView bankImg59;
    @FXML
    private ImageView bankImg60;
    @FXML
    private ImageView bankImg61;
    @FXML
    private ImageView bankImg62;
    @FXML
    private ImageView bankImg63;
    @FXML
    private ImageView bankImg64;
    @FXML
    private ImageView bankImg65;
    @FXML
    private ImageView bankImg66;
    @FXML
    private ImageView bankImg67;
    @FXML
    private ImageView bankImg68;
    @FXML
    private ImageView bankImg69;
    @FXML
    private ImageView bankImg70;
    @FXML
    private ImageView bankImg71;
    @FXML
    private ImageView bankImg72;
    @FXML
    private ImageView bankImg73;
    @FXML
    private ImageView bankImg74;
    @FXML
    private ImageView bankImg75;
    @FXML
    private ImageView bankImg76;
    @FXML
    private ImageView bankImg77;
    @FXML
    private ImageView bankImg78;
    @FXML
    private ImageView bankImg79;
    @FXML
    private ImageView bankImg80;
    @FXML
    private ImageView bankImg81;
    @FXML
    private ImageView bankImg82;
    @FXML
    private ImageView bankImg83;
    @FXML
    private ImageView bankImg84;
    @FXML
    private ImageView bankImg85;
    @FXML
    private ImageView bankImg86;
    @FXML
    private ImageView bankImg87;
    @FXML
    private ImageView bankImg88;
    @FXML
    private ImageView bankImg89;
    @FXML
    private ImageView bankImg90;
    @FXML
    private ImageView bankImg91;
    @FXML
    private ImageView bankImg92;
    @FXML
    private ImageView bankImg93;
    @FXML
    private ImageView bankImg94;
    @FXML
    private ImageView bankImg95;
    @FXML
    private ImageView bankImg96;
    @FXML
    private ImageView bankImg97;
    @FXML
    private ImageView bankImg98;
    @FXML
    private ImageView bankImg99;
    @FXML
    private ImageView bankImg100;
    @FXML
    private ImageView bankImg101;
    @FXML
    private ImageView bankImg102;
    @FXML
    private ImageView bankImg103;
    @FXML
    private ImageView bankImg104;
    @FXML
    private ImageView bankImg105;
    @FXML
    private ImageView bankImg106;
    @FXML
    private ImageView bankImg107;
    @FXML
    private ImageView bankImg108;
    @FXML
    private ImageView bankImg109;
    @FXML
    private ImageView bankImg110;
    @FXML
    private ImageView bankImg111;
    @FXML
    private ImageView bankImg112;
    @FXML
    private ImageView bankImg113;
    @FXML
    private ImageView bankImg114;
    @FXML
    private ImageView bankImg115;
    @FXML
    private ImageView bankImg116;
    @FXML
    private ImageView bankImg117;
    @FXML
    private ImageView bankImg118;
    @FXML
    private ImageView bankImg119;
    @FXML
    private ImageView bankImg120;
    @FXML
    private ImageView bankImg121;
    @FXML
    private ImageView bankImg122;
    @FXML
    private ImageView bankImg123;
    @FXML
    private ImageView bankImg124;
    @FXML
    private ImageView bankImg125;
    @FXML
    private ImageView bankImg126;
    @FXML
    private ImageView bankImg127;
    @FXML
    private ImageView bankImg128;
    @FXML
    private ImageView bankImg129;
    @FXML
    private ImageView bankImg130;
    @FXML
    private ImageView bankImg131;
    @FXML
    private ImageView bankImg132;
    @FXML
    private ImageView bankImg133;
    @FXML
    private ImageView bankImg134;
    @FXML
    private ImageView bankImg135;
    @FXML
    private ImageView bankImg136;
    @FXML
    private ImageView bankImg137;
    @FXML
    private ImageView bankImg138;
    @FXML
    private ImageView bankImg139;
    @FXML
    private ImageView bankImg140;
    @FXML
    private ImageView bankImg141;
    @FXML
    private ImageView bankImg142;
    @FXML
    private ImageView bankImg143;
    @FXML
    private ImageView bankImg144;
    @FXML
    private ImageView bankImg145;
    @FXML
    private ImageView bankImg146;
    @FXML
    private ImageView bankImg147;
    @FXML
    private ImageView bankImg148;
    @FXML
    private ImageView bankImg149;
    @FXML
    private ImageView bankImg150;


    @FXML
    private Label nameBank0;
    @FXML
    private Label nameBank1;
    @FXML
    private Label nameBank2;
    @FXML
    private Label nameBank3;
    @FXML
    private Label nameBank4;
    @FXML
    private Label nameBank5;
    @FXML
    private Label nameBank6;
    @FXML
    private Label nameBank7;
    @FXML
    private Label nameBank8;
    @FXML
    private Label nameBank9;
    @FXML
    private Label nameBank10;
    @FXML
    private Label nameBank11;
    @FXML
    private Label nameBank12;
    @FXML
    private Label nameBank13;
    @FXML
    private Label nameBank14;
    @FXML
    private Label nameBank15;
    @FXML
    private Label nameBank16;
    @FXML
    private Label nameBank17;
    @FXML
    private Label nameBank18;
    @FXML
    private Label nameBank19;
    @FXML
    private Label nameBank20;
    @FXML
    private Label nameBank21;
    @FXML
    private Label nameBank22;
    @FXML
    private Label nameBank23;
    @FXML
    private Label nameBank24;
    @FXML
    private Label nameBank25;
    @FXML
    private Label nameBank26;
    @FXML
    private Label nameBank27;
    @FXML
    private Label nameBank28;
    @FXML
    private Label nameBank29;
    @FXML
    private Label nameBank30;
    @FXML
    private Label nameBank31;
    @FXML
    private Label nameBank32;
    @FXML
    private Label nameBank33;
    @FXML
    private Label nameBank34;
    @FXML
    private Label nameBank35;
    @FXML
    private Label nameBank36;
    @FXML
    private Label nameBank37;
    @FXML
    private Label nameBank38;
    @FXML
    private Label nameBank39;
    @FXML
    private Label nameBank40;
    @FXML
    private Label nameBank41;
    @FXML
    private Label nameBank42;
    @FXML
    private Label nameBank43;
    @FXML
    private Label nameBank44;
    @FXML
    private Label nameBank45;
    @FXML
    private Label nameBank46;
    @FXML
    private Label nameBank47;
    @FXML
    private Label nameBank48;
    @FXML
    private Label nameBank49;
    @FXML
    private Label nameBank50;
    @FXML
    private Label nameBank51;
    @FXML
    private Label nameBank52;
    @FXML
    private Label nameBank53;
    @FXML
    private Label nameBank54;
    @FXML
    private Label nameBank55;
    @FXML
    private Label nameBank56;
    @FXML
    private Label nameBank57;
    @FXML
    private Label nameBank58;
    @FXML
    private Label nameBank59;
    @FXML
    private Label nameBank60;
    @FXML
    private Label nameBank61;
    @FXML
    private Label nameBank62;
    @FXML
    private Label nameBank63;
    @FXML
    private Label nameBank64;
    @FXML
    private Label nameBank65;
    @FXML
    private Label nameBank66;
    @FXML
    private Label nameBank67;
    @FXML
    private Label nameBank68;
    @FXML
    private Label nameBank69;
    @FXML
    private Label nameBank70;
    @FXML
    private Label nameBank71;
    @FXML
    private Label nameBank72;
    @FXML
    private Label nameBank73;
    @FXML
    private Label nameBank74;
    @FXML
    private Label nameBank75;
    @FXML
    private Label nameBank76;
    @FXML
    private Label nameBank77;
    @FXML
    private Label nameBank78;
    @FXML
    private Label nameBank79;
    @FXML
    private Label nameBank80;
    @FXML
    private Label nameBank81;
    @FXML
    private Label nameBank82;
    @FXML
    private Label nameBank83;
    @FXML
    private Label nameBank84;
    @FXML
    private Label nameBank85;
    @FXML
    private Label nameBank86;
    @FXML
    private Label nameBank87;
    @FXML
    private Label nameBank88;
    @FXML
    private Label nameBank89;
    @FXML
    private Label nameBank90;
    @FXML
    private Label nameBank91;
    @FXML
    private Label nameBank92;
    @FXML
    private Label nameBank93;
    @FXML
    private Label nameBank94;
    @FXML
    private Label nameBank95;
    @FXML
    private Label nameBank96;
    @FXML
    private Label nameBank97;
    @FXML
    private Label nameBank98;
    @FXML
    private Label nameBank99;
    @FXML
    private Label nameBank100;
    @FXML
    private Label nameBank101;
    @FXML
    private Label nameBank102;
    @FXML
    private Label nameBank103;
    @FXML
    private Label nameBank104;
    @FXML
    private Label nameBank105;
    @FXML
    private Label nameBank106;
    @FXML
    private Label nameBank107;
    @FXML
    private Label nameBank108;
    @FXML
    private Label nameBank109;
    @FXML
    private Label nameBank110;
    @FXML
    private Label nameBank111;
    @FXML
    private Label nameBank112;
    @FXML
    private Label nameBank113;
    @FXML
    private Label nameBank114;
    @FXML
    private Label nameBank115;
    @FXML
    private Label nameBank116;
    @FXML
    private Label nameBank117;
    @FXML
    private Label nameBank118;
    @FXML
    private Label nameBank119;
    @FXML
    private Label nameBank120;
    @FXML
    private Label nameBank121;
    @FXML
    private Label nameBank122;
    @FXML
    private Label nameBank123;
    @FXML
    private Label nameBank124;
    @FXML
    private Label nameBank125;
    @FXML
    private Label nameBank126;
    @FXML
    private Label nameBank127;
    @FXML
    private Label nameBank128;
    @FXML
    private Label nameBank129;
    @FXML
    private Label nameBank130;
    @FXML
    private Label nameBank131;
    @FXML
    private Label nameBank132;
    @FXML
    private Label nameBank133;
    @FXML
    private Label nameBank134;
    @FXML
    private Label nameBank135;
    @FXML
    private Label nameBank136;
    @FXML
    private Label nameBank137;
    @FXML
    private Label nameBank138;
    @FXML
    private Label nameBank139;
    @FXML
    private Label nameBank140;
    @FXML
    private Label nameBank141;
    @FXML
    private Label nameBank142;
    @FXML
    private Label nameBank143;
    @FXML
    private Label nameBank144;
    @FXML
    private Label nameBank145;
    @FXML
    private Label nameBank146;
    @FXML
    private Label nameBank147;
    @FXML
    private Label nameBank148;
    @FXML
    private Label nameBank149;
    @FXML
    private Label nameBank150;


    private Motor motor;

    private String beltImgs= "beltImg";          //Variable usada para buscar con un método el imageView donde se tiene que poner la imagen del pokemon
    private String beltLabel= "namePokemon";    //Variable usada para buscar con un método el Label donde se tiene que poner

    private int textDeReplaceBelt= 0;      //El pokemonq que quieres remplazar del belt
    private int textDeReplaceBank= 0;      //El pokemonq que quieres remplazar del bank

    private String bankImg= "bankImg";
    private String bankName= "nameBank";

    private String pokedexOpp;

    private Pokemon pokeToChangeBelt;
    private Pokemon pokeToChangeBank;

    private Pokemon savePokemon1;
    private Pokemon savePokemon2;

    private ArrayList<Pokemon> beltPokemon = new ArrayList<Pokemon>();
    private ArrayList<Pokemon> bankPokemon = new ArrayList<Pokemon>();

    private ArrayList<ImageView> beltImg = new ArrayList<ImageView>();
    private ArrayList<Label> beltnames = new ArrayList<Label>();
    private ArrayList<Pokemon> allPokemons = new ArrayList<Pokemon>();

    private ArrayList<ImageView> bankImgs = new ArrayList<ImageView>();
    private ArrayList<Label> banknames = new ArrayList<Label>();

    /*
    Método donde se reciben los datos necesarios del motor, igualmente se colocan las imágenes en el belt y en el bank, estas se bajan de opacidad si no las posees todavía
     */
    public void receiveMotorInstance(Motor m, ArrayList<Pokemon> beltPokemon, ArrayList<Pokemon> bankPokemon, ArrayList<Pokemon> allPokemons,String pokedexOpp)
    {
        this.motor = m;
        this.beltPokemon = beltPokemon;
        this.bankPokemon = bankPokemon;
        this.allPokemons = allPokemons;
        this.pokedexOpp  = pokedexOpp;

        thatOneIsAlreadYInBelt.setVisible(false);
        writeCorrectNumbersGroup.setVisible(false);

        addImgAndLabels();


        //Para poner las fotos en el belt
        for(int i = 0; i < 6; i++)
        {
            String a  = beltImgs + i;
            String b = beltLabel+i;

            try
            {
                String name = beltPokemon.get(i).getName();
                Image pokemon = new Image("/images/imgPokemones/"+name+".png");

                searchImageViewById(a).setImage(pokemon);

                searchLabelById(b).setText(name);
            }
            catch(Exception e)
            {
                searchImageViewById(a).setDisable(true);
                searchLabelById(b).setDisable(true);

            }

        }

        int u = 0;

        //Para poner las fotos en el bank
        for(int i = 0; i < 151; i++)
        {
            String a  = bankImg + i;
            String b = bankName+i;

            String name = allPokemons.get(i).getName();
            Image pokemon = new Image("/images/imgPokemones/"+name+".png");

            searchImageViewByIdBANK(a).setImage(pokemon);
            searchLabelByIdBANK(b).setText(name);

            for(int w = 0 ; w <= bankPokemon.size(); w++)
            {

                if(w == bankPokemon.size())
                {
                    searchImageViewByIdBANK(a).setDisable(true);
                    searchImageViewByIdBANK(a).setOpacity(.4);
                    searchLabelByIdBANK(b).setDisable(true);
                }
                else if(bankPokemon.get(w).getName().equals(allPokemons.get(i).getName()))
                {
                    searchImageViewByIdBANK(a).setOpacity(1);
                    break;
                }
            }

        }
    }

    //Buscar un ImageView por su Id, devuelve el ImageView con ese nombre
    public ImageView searchImageViewById(String nameImage )
    {
        int q = 0;

        for(int i = 0; q < beltImg.size(); q++)
        {
            if(beltImg.get(q).getId().equals(nameImage))
            {

                return beltImg.get(q);
            }
        }

        return beltImg.get(q-1);

    }

    //Buscar un Label por su Id, devuelve el Label con ese nombre

    public Label searchLabelById(String nameLabel )
    {
        int q  = 0;
        for(int a = 0; q < beltnames.size(); q++)
        {
            if(beltnames.get(q).getId().equals(nameLabel) )
            {
                return beltnames.get(q);
            }
        }
        return beltnames.get(q-1);
    }

    //Buscar un ImageView por su Id, devuelve el ImageView con ese nombre
    public ImageView searchImageViewByIdBANK(String nameImage )
    {
        int q = 0;


        for(int i = 0; q < bankImgs.size(); q++)
        {

            if(bankImgs.get(q).getId().equals(nameImage))
            {
                return bankImgs.get(q);
            }
        }
        return bankImgs.get(q-1);

    }

    //Buscar un Label por su Id, devuelve el Label con ese nombre
    public Label searchLabelByIdBANK(String nameLabel )
    {
        int q  = 0;
        for(int a = 0; q < banknames.size(); q++)
        {
            if(banknames.get(q).getId().equals(nameLabel) )
            {
                return banknames.get(q);
            }
        }
        return banknames.get(q-1);
    }

    //Accion cuando se quiere volver a la pantalla principal
    public void goBackAction(MouseEvent mouseEvent)
    {
        motor.getBeltFromPokedex(beltPokemon);
        motor.showPantallaPrincipal(mouseEvent);
    }

    //Método donde se agregan todas las ImageViews y Labels a arrayLists
    public void addImgAndLabels()
    {

        beltImg.add(beltImg0);
        beltImg.add(beltImg1);
        beltImg.add(beltImg2);
        beltImg.add(beltImg3);
        beltImg.add(beltImg4);
        beltImg.add(beltImg5);

        beltnames.add(namePokemon0);
        beltnames.add(namePokemon1);
        beltnames.add(namePokemon2);
        beltnames.add(namePokemon3);
        beltnames.add(namePokemon4);
        beltnames.add(namePokemon5);

        bankImgs.add(bankImg0);
        bankImgs.add(bankImg1);
        bankImgs.add(bankImg2);
        bankImgs.add(bankImg3);
        bankImgs.add(bankImg4);
        bankImgs.add(bankImg5);
        bankImgs.add(bankImg6);
        bankImgs.add(bankImg7);
        bankImgs.add(bankImg8);
        bankImgs.add(bankImg9);
        bankImgs.add(bankImg10);
        bankImgs.add(bankImg11);
        bankImgs.add(bankImg12);
        bankImgs.add(bankImg13);
        bankImgs.add(bankImg13);
        bankImgs.add(bankImg14);
        bankImgs.add(bankImg15);
        bankImgs.add(bankImg16);
        bankImgs.add(bankImg17);
        bankImgs.add(bankImg18);
        bankImgs.add(bankImg19);
        bankImgs.add(bankImg20);
        bankImgs.add(bankImg21);
        bankImgs.add(bankImg22);
        bankImgs.add(bankImg23);
        bankImgs.add(bankImg24);
        bankImgs.add(bankImg25);
        bankImgs.add(bankImg26);
        bankImgs.add(bankImg27);
        bankImgs.add(bankImg28);
        bankImgs.add(bankImg29);
        bankImgs.add(bankImg30);
        bankImgs.add(bankImg31);
        bankImgs.add(bankImg32);
        bankImgs.add(bankImg33);
        bankImgs.add(bankImg34);
        bankImgs.add(bankImg35);
        bankImgs.add(bankImg36);
        bankImgs.add(bankImg37);
        bankImgs.add(bankImg38);
        bankImgs.add(bankImg39);
        bankImgs.add(bankImg40);
        bankImgs.add(bankImg41);
        bankImgs.add(bankImg42);
        bankImgs.add(bankImg43);
        bankImgs.add(bankImg44);
        bankImgs.add(bankImg45);
        bankImgs.add(bankImg46);
        bankImgs.add(bankImg47);
        bankImgs.add(bankImg48);
        bankImgs.add(bankImg49);
        bankImgs.add(bankImg50);
        bankImgs.add(bankImg51);
        bankImgs.add(bankImg52);
        bankImgs.add(bankImg53);
        bankImgs.add(bankImg54);
        bankImgs.add(bankImg55);
        bankImgs.add(bankImg56);
        bankImgs.add(bankImg57);
        bankImgs.add(bankImg58);
        bankImgs.add(bankImg59);
        bankImgs.add(bankImg60);
        bankImgs.add(bankImg61);
        bankImgs.add(bankImg62);
        bankImgs.add(bankImg63);
        bankImgs.add(bankImg64);
        bankImgs.add(bankImg65);
        bankImgs.add(bankImg66);
        bankImgs.add(bankImg67);
        bankImgs.add(bankImg68);
        bankImgs.add(bankImg69);
        bankImgs.add(bankImg70);
        bankImgs.add(bankImg71);
        bankImgs.add(bankImg72);
        bankImgs.add(bankImg73);
        bankImgs.add(bankImg74);
        bankImgs.add(bankImg75);
        bankImgs.add(bankImg76);
        bankImgs.add(bankImg77);
        bankImgs.add(bankImg78);
        bankImgs.add(bankImg79);
        bankImgs.add(bankImg80);
        bankImgs.add(bankImg81);
        bankImgs.add(bankImg82);
        bankImgs.add(bankImg83);
        bankImgs.add(bankImg84);
        bankImgs.add(bankImg85);
        bankImgs.add(bankImg86);
        bankImgs.add(bankImg87);
        bankImgs.add(bankImg88);
        bankImgs.add(bankImg89);
        bankImgs.add(bankImg90);
        bankImgs.add(bankImg91);
        bankImgs.add(bankImg92);
        bankImgs.add(bankImg93);
        bankImgs.add(bankImg94);
        bankImgs.add(bankImg95);
        bankImgs.add(bankImg96);
        bankImgs.add(bankImg97);
        bankImgs.add(bankImg98);
        bankImgs.add(bankImg99);
        bankImgs.add(bankImg100);
        bankImgs.add(bankImg101);
        bankImgs.add(bankImg102);
        bankImgs.add(bankImg103);
        bankImgs.add(bankImg104);
        bankImgs.add(bankImg105);
        bankImgs.add(bankImg106);
        bankImgs.add(bankImg107);
        bankImgs.add(bankImg108);
        bankImgs.add(bankImg109);
        bankImgs.add(bankImg110);
        bankImgs.add(bankImg111);
        bankImgs.add(bankImg112);
        bankImgs.add(bankImg113);
        bankImgs.add(bankImg114);
        bankImgs.add(bankImg115);
        bankImgs.add(bankImg116);
        bankImgs.add(bankImg117);
        bankImgs.add(bankImg118);
        bankImgs.add(bankImg119);
        bankImgs.add(bankImg120);
        bankImgs.add(bankImg121);
        bankImgs.add(bankImg122);
        bankImgs.add(bankImg123);
        bankImgs.add(bankImg124);
        bankImgs.add(bankImg125);
        bankImgs.add(bankImg126);
        bankImgs.add(bankImg127);
        bankImgs.add(bankImg128);
        bankImgs.add(bankImg129);
        bankImgs.add(bankImg130);
        bankImgs.add(bankImg131);
        bankImgs.add(bankImg132);
        bankImgs.add(bankImg133);
        bankImgs.add(bankImg134);
        bankImgs.add(bankImg135);
        bankImgs.add(bankImg136);
        bankImgs.add(bankImg137);
        bankImgs.add(bankImg138);
        bankImgs.add(bankImg139);
        bankImgs.add(bankImg140);
        bankImgs.add(bankImg141);
        bankImgs.add(bankImg142);
        bankImgs.add(bankImg143);
        bankImgs.add(bankImg144);
        bankImgs.add(bankImg145);
        bankImgs.add(bankImg146);
        bankImgs.add(bankImg147);
        bankImgs.add(bankImg148);
        bankImgs.add(bankImg149);
        bankImgs.add(bankImg150);


        banknames.add(nameBank0);
        banknames.add(nameBank1);
        banknames.add(nameBank2);
        banknames.add(nameBank3);
        banknames.add(nameBank4);
        banknames.add(nameBank5);
        banknames.add(nameBank6);
        banknames.add(nameBank7);
        banknames.add(nameBank8);
        banknames.add(nameBank9);
        banknames.add(nameBank10);
        banknames.add(nameBank11);
        banknames.add(nameBank12);
        banknames.add(nameBank13);
        banknames.add(nameBank14);
        banknames.add(nameBank15);
        banknames.add(nameBank16);
        banknames.add(nameBank17);
        banknames.add(nameBank18);
        banknames.add(nameBank19);
        banknames.add(nameBank20);
        banknames.add(nameBank21);
        banknames.add(nameBank22);
        banknames.add(nameBank23);
        banknames.add(nameBank24);
        banknames.add(nameBank25);
        banknames.add(nameBank26);
        banknames.add(nameBank27);
        banknames.add(nameBank28);
        banknames.add(nameBank29);
        banknames.add(nameBank30);
        banknames.add(nameBank31);
        banknames.add(nameBank32);
        banknames.add(nameBank33);
        banknames.add(nameBank34);
        banknames.add(nameBank35);
        banknames.add(nameBank36);
        banknames.add(nameBank37);
        banknames.add(nameBank38);
        banknames.add(nameBank39);
        banknames.add(nameBank40);
        banknames.add(nameBank41);
        banknames.add(nameBank42);
        banknames.add(nameBank43);
        banknames.add(nameBank44);
        banknames.add(nameBank45);
        banknames.add(nameBank46);
        banknames.add(nameBank47);
        banknames.add(nameBank48);
        banknames.add(nameBank49);
        banknames.add(nameBank50);
        banknames.add(nameBank51);
        banknames.add(nameBank52);
        banknames.add(nameBank53);
        banknames.add(nameBank54);
        banknames.add(nameBank55);
        banknames.add(nameBank56);
        banknames.add(nameBank57);
        banknames.add(nameBank58);
        banknames.add(nameBank59);
        banknames.add(nameBank60);
        banknames.add(nameBank61);
        banknames.add(nameBank62);
        banknames.add(nameBank63);
        banknames.add(nameBank64);
        banknames.add(nameBank65);
        banknames.add(nameBank66);
        banknames.add(nameBank67);
        banknames.add(nameBank68);
        banknames.add(nameBank69);
        banknames.add(nameBank70);
        banknames.add(nameBank71);
        banknames.add(nameBank72);
        banknames.add(nameBank73);
        banknames.add(nameBank74);
        banknames.add(nameBank75);
        banknames.add(nameBank76);
        banknames.add(nameBank77);
        banknames.add(nameBank78);
        banknames.add(nameBank79);
        banknames.add(nameBank80);
        banknames.add(nameBank81);
        banknames.add(nameBank82);
        banknames.add(nameBank83);
        banknames.add(nameBank84);
        banknames.add(nameBank85);
        banknames.add(nameBank86);
        banknames.add(nameBank87);
        banknames.add(nameBank88);
        banknames.add(nameBank89);
        banknames.add(nameBank90);
        banknames.add(nameBank91);
        banknames.add(nameBank92);
        banknames.add(nameBank93);
        banknames.add(nameBank94);
        banknames.add(nameBank95);
        banknames.add(nameBank96);
        banknames.add(nameBank97);
        banknames.add(nameBank98);
        banknames.add(nameBank99);
        banknames.add(nameBank100);
        banknames.add(nameBank101);
        banknames.add(nameBank102);
        banknames.add(nameBank103);
        banknames.add(nameBank104);
        banknames.add(nameBank105);
        banknames.add(nameBank106);
        banknames.add(nameBank107);
        banknames.add(nameBank108);
        banknames.add(nameBank109);
        banknames.add(nameBank110);
        banknames.add(nameBank111);
        banknames.add(nameBank112);
        banknames.add(nameBank113);
        banknames.add(nameBank114);
        banknames.add(nameBank115);
        banknames.add(nameBank116);
        banknames.add(nameBank117);
        banknames.add(nameBank118);
        banknames.add(nameBank119);
        banknames.add(nameBank120);
        banknames.add(nameBank121);
        banknames.add(nameBank122);
        banknames.add(nameBank123);
        banknames.add(nameBank124);
        banknames.add(nameBank125);
        banknames.add(nameBank126);
        banknames.add(nameBank127);
        banknames.add(nameBank128);
        banknames.add(nameBank129);
        banknames.add(nameBank130);
        banknames.add(nameBank131);
        banknames.add(nameBank132);
        banknames.add(nameBank133);
        banknames.add(nameBank134);
        banknames.add(nameBank135);
        banknames.add(nameBank136);
        banknames.add(nameBank137);
        banknames.add(nameBank138);
        banknames.add(nameBank139);
        banknames.add(nameBank140);
        banknames.add(nameBank141);
        banknames.add(nameBank142);
        banknames.add(nameBank143);
        banknames.add(nameBank144);
        banknames.add(nameBank145);
        banknames.add(nameBank146);
        banknames.add(nameBank147);
        banknames.add(nameBank148);
        banknames.add(nameBank149);
        banknames.add(nameBank150);




    }

    //Accion cuando se escribe el # entre el banco y el belt que se quiere intercambiar
    public void replace(ActionEvent actionEvent)
    {

        int p = 0;
        try {

            if (replaceBank.getText().equals("") || replaceBelt.getText().equals("") || Integer.valueOf(replaceBelt.getText()) < 0 || Integer.valueOf(replaceBelt.getText()) >= beltPokemon.size() || Integer.valueOf(replaceBank.getText()) < 0 || Integer.valueOf(replaceBank.getText()) >= allPokemons.size())
            {
                writeCorrectNumbersGroup.setVisible(true);
                replace.setDisable(true);
                searchButton.setDisable(true);
            }
            else
                {

                textDeReplaceBank = Integer.valueOf(replaceBank.getText());
                textDeReplaceBelt = Integer.valueOf(replaceBelt.getText());

                pokeToChangeBank = allPokemons.get(textDeReplaceBank);

                pokeToChangeBelt = beltPokemon.get(textDeReplaceBelt);


                for(int w = 0; w <= bankPokemon.size(); w++ )
                {
                    if(w == bankPokemon.size())
                    {
                        writeCorrectNumbersGroup.setVisible(true);
                        replace.setDisable(true);
                        searchButton.setDisable(true);
                    }

                    else if(bankPokemon.get(w).getName().equals(pokeToChangeBank.getName()))
                    {
                        pokeToChangeBank = bankPokemon.get(w);
                        p = w;
                        break;
                    }

                }

                for (int i = 0; i <= beltPokemon.size(); i++)
                {

                    if (i == beltPokemon.size())
                    {
                        savePokemon1 = bankPokemon.get(p);

                        savePokemon2 = pokeToChangeBelt;
                        beltPokemon.remove(Integer.valueOf(textDeReplaceBelt));

                        beltPokemon.set(Integer.valueOf(textDeReplaceBelt), savePokemon1);

                        if (textDeReplaceBelt == 0)
                        {

                            Image imgen1 = new Image("/images/imgPokemones/" + bankPokemon.get(p).getName() + ".png");
                            beltImg0.setImage(imgen1);
                            namePokemon0.setText(bankPokemon.get(p).getName());

                        }
                        else if (textDeReplaceBelt == 1)
                        {

                            Image imgen1 = new Image("/images/imgPokemones/" + bankPokemon.get(p).getName() + ".png");
                            beltImg1.setImage(imgen1);
                            namePokemon1.setText(bankPokemon.get(p).getName());
                        }
                        else if (textDeReplaceBelt == 2)
                        {

                            Image imgen1 = new Image("/images/imgPokemones/" + bankPokemon.get(p).getName() + ".png");
                            beltImg2.setImage(imgen1);
                            namePokemon2.setText(bankPokemon.get(p).getName());

                        }
                        else if (textDeReplaceBelt == 3)
                        {
                            Image imgen1 = new Image("/images/imgPokemones/" + bankPokemon.get(p).getName() + ".png");
                            beltImg3.setImage(imgen1);
                            namePokemon3.setText(bankPokemon.get(p).getName());

                        }
                        else if (textDeReplaceBelt == 4)
                        {
                            Image imgen1 = new Image("/images/imgPokemones/" + bankPokemon.get(p).getName() + ".png");
                            beltImg4.setImage(imgen1);
                            namePokemon4.setText(bankPokemon.get(p).getName());
                        }
                        else if (textDeReplaceBelt == 5)
                        {
                            Image imgen1 = new Image("/images/imgPokemones/" + bankPokemon.get(p).getName() + ".png");
                            beltImg5.setImage(imgen1);
                            namePokemon5.setText(bankPokemon.get(p).getName());
                        }

                        for (int a = 0; a < beltPokemon.size(); a++)
                        {
                            System.out.println("Pokemones del belt");
                            System.out.println(beltPokemon.get(a).getName());
                        }

                        break;

                    }
                    else if (pokeToChangeBank == beltPokemon.get(i))
                    {
                        thatOneIsAlreadYInBelt.setVisible(true);
                        break;
                    }
                }
            }
        }
        catch(Exception e)
        {
            writeCorrectNumbersGroup.setVisible(true);
            replace.setDisable(true);
            searchButton.setDisable(true);
        }
    }

    //Es el OK button cuando se quiere remplazar un pokemon que ya esta en el belt
    public void pokeAlreadyInBeltButtton(ActionEvent actionEvent)
    {
        thatOneIsAlreadYInBelt.setVisible(false);
        writeCorrectNumbersGroup.setVisible(false);
        replace.setDisable(false);
        searchButton.setDisable(false);

    }

    //Accion cuadno se escribe el numero del banco que se quiere ver su info
    public void searchButtonAction(ActionEvent actionEvent)
    {
        int numPoke = 0;
        try
        {
            numPoke = Integer.valueOf(searchTextField.getText());

            if(numPoke < 0 || numPoke >= allPokemons.size())
            {
                writeCorrectNumbersGroup.setVisible(true);
                replace.setDisable(true);
                searchButton.setDisable(true);
            }
            else
            {
               for(int a = 0; a <= bankPokemon.size(); a++)
               {
                   if(a == bankPokemon.size())
                   {
                       motor.receiveSearchPoke(allPokemons.get(Integer.valueOf(numPoke)));
                       motor.showSearchPokePantalla(actionEvent);
                   }
                   if(bankPokemon.get(a).getName().equals(allPokemons.get(Integer.valueOf(numPoke)).getName()))
                   {
                       motor.receiveSearchPoke(motor.getPokemonFromBank(allPokemons.get(Integer.valueOf(numPoke)).getName()));
                       motor.showSearchPokePantalla(actionEvent);
                       break;
                   }

               }
            }

        }
        catch (Exception e)
        {
            writeCorrectNumbersGroup.setVisible(true);
            replace.setDisable(true);
            searchButton.setDisable(true);
        }

    }

    //Cuando se quiere cambiar el orden de los pokemon del belt
    public void positionBeltButton(ActionEvent actionEvent)
    {
        pokedexOpp = "pokedex";
        motor.receivepokedexOpp(pokedexOpp);
        motor.showSelectPokemonToFightPantalla(actionEvent);
    }
}