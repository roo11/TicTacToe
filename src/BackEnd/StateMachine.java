package BackEnd;

/**
 * Created by Robert on 13/05/2017.
 */

public class StateMachine {

    private Player player1 = new Player('X', 1);
    private Player player2 = new Player('O', 2);
    private Player currentPlayer = new Player();
    private GameEngine gameEngine;

    public StateMachine(GameEngine gameEngine) {
        this.setCurrentPlayer(player1);
        this.gameEngine = gameEngine;
    }

    public void turn() {
        this.logic();
    }

    public void switchPlayer() {
        if (currentPlayer == player1) {
            this.setCurrentPlayer(player2);
        } else {
            this.setCurrentPlayer(player1);
        }this.getGameEngine().getBoard().getPlayer().textProperty().set(String.valueOf(currentPlayer.getLetter()));
    }

    boolean checkBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.getGameEngine().getBoardArray()[i][j] == ' ') {
                    return true;
                }
            }
        }
        return false;
    }

    public void logic() {

        if (checkBoard()) {
            this.switchPlayer();

        } else if (this.getGameEngine().getBoardArray()[0][0] == 'X' && this.getGameEngine().getBoardArray()[0][1] == 'X' && this.getGameEngine().getBoardArray()[0][2] == 'X'
                || this.getGameEngine().getBoardArray()[1][0] == 'X' && this.getGameEngine().getBoardArray()[1][1] == 'X' && this.getGameEngine().getBoardArray()[1][2] == 'X'
                || this.getGameEngine().getBoardArray()[2][0] == 'X' && this.getGameEngine().getBoardArray()[2][1] == 'X' && this.getGameEngine().getBoardArray()[2][2] == 'X'

                || this.getGameEngine().getBoardArray()[0][0] == 'X' && this.getGameEngine().getBoardArray()[1][0] == 'X' && this.getGameEngine().getBoardArray()[2][0] == 'X'
                || this.getGameEngine().getBoardArray()[0][1] == 'X' && this.getGameEngine().getBoardArray()[1][1] == 'X' && this.getGameEngine().getBoardArray()[2][1] == 'X'
                || this.getGameEngine().getBoardArray()[0][2] == 'X' && this.getGameEngine().getBoardArray()[1][2] == 'X' && this.getGameEngine().getBoardArray()[2][2] == 'X'

                || this.getGameEngine().getBoardArray()[0][0] == 'X' && this.getGameEngine().getBoardArray()[1][1] == 'X' && this.getGameEngine().getBoardArray()[2][2] == 'X'
                || this.getGameEngine().getBoardArray()[0][2] == 'X' && this.getGameEngine().getBoardArray()[1][1] == 'X' && this.getGameEngine().getBoardArray()[2][0] == 'X') {
            winner(player1);
        } else if (this.getGameEngine().getBoardArray()[0][0] == 'O' && this.getGameEngine().getBoardArray()[0][1] == 'O' && this.getGameEngine().getBoardArray()[0][2] == 'O'
                || this.getGameEngine().getBoardArray()[1][0] == 'O' && this.getGameEngine().getBoardArray()[1][1] == 'O' && this.getGameEngine().getBoardArray()[1][2] == 'O'
                || this.getGameEngine().getBoardArray()[2][0] == 'O' && this.getGameEngine().getBoardArray()[2][1] == 'O' && this.getGameEngine().getBoardArray()[2][2] == 'O'

                || this.getGameEngine().getBoardArray()[0][0] == 'O' && this.getGameEngine().getBoardArray()[1][0] == 'O' && this.getGameEngine().getBoardArray()[2][0] == 'O'
                || this.getGameEngine().getBoardArray()[0][1] == 'O' && this.getGameEngine().getBoardArray()[1][1] == 'O' && this.getGameEngine().getBoardArray()[2][1] == 'O'
                || this.getGameEngine().getBoardArray()[0][2] == 'O' && this.getGameEngine().getBoardArray()[1][2] == 'O' && this.getGameEngine().getBoardArray()[2][2] == 'O'

                || this.getGameEngine().getBoardArray()[0][0] == 'O' && this.getGameEngine().getBoardArray()[1][1] == 'O' && this.getGameEngine().getBoardArray()[2][2] == 'O'
                || this.getGameEngine().getBoardArray()[0][2] == 'O' && this.getGameEngine().getBoardArray()[1][1] == 'O' && this.getGameEngine().getBoardArray()[2][0] == 'O') {
            winner(player2);
        } else {
            draw();
        }
    }

    private void winner(Player player){
        System.out.print(this.currentPlayer.getLetter() + " is winner");
        this.getGameEngine().getBoard().restart();
    }


    void draw() {
        System.out.print(" Nobody Won");
        this.getGameEngine().getBoard().restart();
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public GameEngine getGameEngine() {
        return gameEngine;
    }
}