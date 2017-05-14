package BackEnd;

import GUI.Board;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by Josh on 13/05/2017.
 */
public class GameEngine extends Application{
    Board board;
    StateMachine stateMachine;
    char[][] boardArray;

    public GameEngine(){
        boardArray = new char[3][3];
        board = new Board(this);
        stateMachine = new StateMachine(this);
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        board.start();
    }

    public char[][] getBoardArray() {
        return boardArray;
    }

    @Override
    public String toString() {

        return "\n" + getBoardArray()[0][0] + getBoardArray()[1][0] + getBoardArray()[2][0] + "\n" +
                getBoardArray()[0][1] + getBoardArray()[1][1] + getBoardArray()[2][1] + "\n" +
                getBoardArray()[0][2] + getBoardArray()[1][2] + getBoardArray()[2][2];
    }

    public Board getBoard() {
        return board;
    }

    public StateMachine getStateMachine() {
        return stateMachine;
    }
}
