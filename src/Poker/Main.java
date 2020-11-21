package Poker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
            launch(args); //Esta línea corre el GUI fxml que se instancía en el override
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ViewdeCard.fxml")); //Esta es la GUI
        Scene scene = new Scene(root);

        primaryStage.setTitle("Cartas");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
