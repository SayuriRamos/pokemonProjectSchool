package viewControllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


import java.util.ArrayList;

public class SearchPokePantalla {


    @FXML
    private ImageView imgPokemon;

    @FXML
    private Group dontOwn;

    @FXML
    private Label namePokemon;

    @FXML
    private Label own;

    @FXML
    private Label noEvolution;

    @FXML
    private ProgressBar levelProgress;

    @FXML
    private ListView<String> abilitiesListView;

    @FXML
    private Label size;

    @FXML
    private Label type;

    @FXML
    private Label level;

    @FXML
    private Label life;

    @FXML
    private Label nameEvolution;

    @FXML
    private ImageView ImgBack;

    @FXML
    private ImageView evolution;

    ObservableList<String> abilities = FXCollections.observableArrayList();

    private Motor motor;

    public void receiveMotorInstance(Motor m, ArrayList bankPokemon, Pokemon searchPokemon)
    {
        this.motor = m;

        own.setVisible(false);
        dontOwn.setVisible(false);
        noEvolution.setVisible(false);

        for(int a = 0; a <= bankPokemon.size(); a++)
        {
            if(a == bankPokemon.size())
            {
                dontOwn.setVisible(true);
            }
            else if(bankPokemon.get(a) == searchPokemon)
            {
                own.setVisible(true);
                break;
            }
        }

        Image imgen1 = new Image("/images/imgPokemones/" + searchPokemon.getName() + ".png");
        imgPokemon.setImage(imgen1);
        namePokemon.setText(searchPokemon.getName());

        size.setText(searchPokemon.getTamano());
        type.setText(searchPokemon.getTipo());
        life.setText(String.valueOf(searchPokemon.getVida()));


        double puntosT = 25;
        double puntosQueTengo = searchPokemon.getPuntos();
        levelProgress.setProgress((1*puntosQueTengo)/puntosT);

        level.setText("LEVEL "+searchPokemon.getNivel());



        for (int i = 0; i < searchPokemon.getHabilidades().size(); i++)
        {
            abilities.add(searchPokemon.getHabilidades().get(i).getNombre());
        }

        abilitiesListView.setItems(abilities);


        try
        {
            Image imgen2 = new Image("/images/imgPokemones/" + searchPokemon.getEvolucion().getName() + ".png");
            evolution.setImage(imgen2);
            nameEvolution.setText(searchPokemon.getEvolucion().getName());
        }
        catch(Exception e)
        {
            noEvolution.setVisible(true);

        }
    }

    public void goBack(MouseEvent mouseEvent)
    {
        motor.showPokedex2(mouseEvent);
    }

    public void okButton(ActionEvent actionEvent)
    {
        dontOwn.setVisible(false);

    }
}
