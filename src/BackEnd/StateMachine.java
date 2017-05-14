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
        this.action(this.logic());
    }

    public void switchPlayer() {
        if (currentPlayer == player1) {
            this.setCurrentPlayer(player2);
        } else {
            this.setCurrentPlayer(player1);
        }
    }

    boolean checkBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (String.valueOf(this.getGameEngine().getBoardArray()[i][j]) == "") {
                    return true;
                }
            }
        }
        return false;
    }

    public int logic() {

        if (checkBoard()) {
            return 1;

        } else if (this.getGameEngine().getBoardArray()[0][0] == 'X' && this.getGameEngine().getBoardArray()[0][1] == 'X' && this.getGameEngine().getBoardArray()[0][2] == 'X'
                || this.getGameEngine().getBoardArray()[1][0] == 'X' && this.getGameEngine().getBoardArray()[1][1] == 'X' && this.getGameEngine().getBoardArray()[1][2] == 'X'
                || this.getGameEngine().getBoardArray()[2][0] == 'X' && this.getGameEngine().getBoardArray()[2][1] == 'X' && this.getGameEngine().getBoardArray()[2][2] == 'X'

                || this.getGameEngine().getBoardArray()[0][0] == 'X' && this.getGameEngine().getBoardArray()[1][0] == 'X' && this.getGameEngine().getBoardArray()[2][0] == 'X'
                || this.getGameEngine().getBoardArray()[0][1] == 'X' && this.getGameEngine().getBoardArray()[1][1] == 'X' && this.getGameEngine().getBoardArray()[2][1] == 'X'
                || this.getGameEngine().getBoardArray()[0][2] == 'X' && this.getGameEngine().getBoardArray()[1][2] == 'X' && this.getGameEngine().getBoardArray()[2][2] == 'X'

                || this.getGameEngine().getBoardArray()[0][0] == 'X' && this.getGameEngine().getBoardArray()[1][1] == 'X' && this.getGameEngine().getBoardArray()[2][2] == 'X'
                || this.getGameEngine().getBoardArray()[0][2] == 'X' && this.getGameEngine().getBoardArray()[1][1] == 'X' && this.getGameEngine().getBoardArray()[2][0] == 'X') {
            System.out.print("X is winner");

            return 2;
        } else if (this.getGameEngine().getBoardArray()[0][0] == 'O' && this.getGameEngine().getBoardArray()[0][1] == 'O' && this.getGameEngine().getBoardArray()[0][2] == 'O'
                || this.getGameEngine().getBoardArray()[1][0] == 'O' && this.getGameEngine().getBoardArray()[1][1] == 'O' && this.getGameEngine().getBoardArray()[1][2] == 'O'
                || this.getGameEngine().getBoardArray()[2][0] == 'O' && this.getGameEngine().getBoardArray()[2][1] == 'O' && this.getGameEngine().getBoardArray()[2][2] == 'O'

                || this.getGameEngine().getBoardArray()[0][0] == 'O' && this.getGameEngine().getBoardArray()[1][0] == 'O' && this.getGameEngine().getBoardArray()[2][0] == 'O'
                || this.getGameEngine().getBoardArray()[0][1] == 'O' && this.getGameEngine().getBoardArray()[1][1] == 'O' && this.getGameEngine().getBoardArray()[2][1] == 'O'
                || this.getGameEngine().getBoardArray()[0][2] == 'O' && this.getGameEngine().getBoardArray()[1][2] == 'O' && this.getGameEngine().getBoardArray()[2][2] == 'O'

                || this.getGameEngine().getBoardArray()[0][0] == 'O' && this.getGameEngine().getBoardArray()[1][1] == 'O' && this.getGameEngine().getBoardArray()[2][2] == 'O'
                || this.getGameEngine().getBoardArray()[0][2] == 'O' && this.getGameEngine().getBoardArray()[1][1] == 'O' && this.getGameEngine().getBoardArray()[2][0] == 'O') {
            System.out.print("O is winner");

            return 3;
        } else {
            return 4;
        }
    }

    public void action(int stateNumber) {
        switch (stateNumber) {
            case 1:
                this.switchPlayer();
            case 2:
                WinnerX();
            case 3:
                WinnerO();
            case 4:
                Draw();

        }
    }

    void WinnerX() {

    }

    void WinnerO() {

    }

    void Draw() {

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

    public void setGameEngine(GameEngine gameEngine) {
        this.gameEngine = gameEngine;
    }
}