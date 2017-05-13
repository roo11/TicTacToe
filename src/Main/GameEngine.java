package Main;

import GUI.Board;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by Josh on 13/05/2017.
 */
public class GameEngine extends Application{
    Board board;
    char[][] boardArray;

    public GameEngine(){
        boardArray = new char[3][3];
        board = new Board(this);
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        board.start();
    }
}
