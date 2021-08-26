package viewControllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    private Motor motor = new Motor();

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader((getClass().getResource("PantallaStart.fxml")));
        Parent root = loader.load();
        PantallaStart controller = loader.<PantallaStart>getController();
        controller.receiveMotorInstance(motor);



        primaryStage.setTitle("Pokemon Proyecto Final");
        primaryStage.setScene(new Scene(root,800, 560));
        primaryStage.show();

        motor.createAllPokemone();
        motor.createEntrenadores();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
