/**
 * Created by josh on 13/05/17.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Board extends Application {

    StackPane boardStackPane = new StackPane();
    Scene boardScene = new Scene(boardStackPane);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //Sets up the board
        Stage boardStage = new Stage();
        boardStage.setScene(boardScene);


        //Finalising and displaying the board
        boardStage.show();
    }
}
