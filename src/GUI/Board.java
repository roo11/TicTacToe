package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
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

        //Setting up Boxes
        VBox rows = new VBox();
        HBox turnInfo = new HBox();
        HBox row1 = new HBox();
        HBox row2 = new HBox();
        HBox row3 = new HBox();
        rows.getChildren().addAll(turnInfo,row1,row2,row3);

        //Label for the player info
        Label playerInfo = new Label("Dynamic player info will go here");
        turnInfo.getChildren().add(playerInfo);

        //Setting up Buttons for game
        for (int i = 0; i < 3; i++) {
            Button button = new Button();
            button.setPrefSize(128,128);
            button.setGraphic(new ImageView(new Image("Resources/Blank.png")));
            button.setOnAction(event -> {

            });
            row1.getChildren().add(button);
        }
        for (int i = 0; i < 3; i++) {
            Button button = new Button();
            button.setPrefSize(128,128);
            button.setGraphic(new ImageView(new Image("Resources/Blank.png")));
            row2.getChildren().add(button);
        }
        for (int i = 0; i < 3; i++) {
            Button button = new Button();
            button.setPrefSize(128,128);
            button.setGraphic(new ImageView(new Image("Resources/Blank.png")));
            row3.getChildren().add(button);
        }


        //Finalising and displaying the board
        boardStackPane.getChildren().addAll(rows);
        boardStage.show();
    }
}
