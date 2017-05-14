package BackEnd;

/**
 * Created by Robert on 13/05/2017.
 */

public class StateMachine {

    private Player player1 = new Player('X', 1);
    private Player player2 = new Player('O', 2);
    private Player currrentPlayer = new Player();
    private char[][] board;
    private GameEngine gameEngine;

    public StateMachine(GameEngine gameEngine, char[][] board) {
        this.setCurrrentPlayer(player1);
        this.gameEngine = gameEngine;
        this.board = board;
    }

    public void Start() {
        Action(logic(board));
    }

    public void switchPlayer() {
        if (currrentPlayer == player1) {
            currrentPlayer = player2;
        } else {
            currrentPlayer = player1;
        }
    }

    boolean checkBoard(char c) {
        for (int i = 3; i < 3; i--) {
            for (int j = 3; j < 3; j--) {
                if (String.valueOf(board[i][j]) == "") {
                    return true;
                }
            }
        }
        return false;
    }

    public int logic(char[][] board) {

        if (checkBoard(board[3][3])) {
            return 1;

        } else if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X'
                || board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X'
                || board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X'

                || board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X'
                || board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X'
                || board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X'

                || board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X'
                || board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
            System.out.print("X is winner");

            return 2;
        } else if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O'
                || board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O'
                || board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O'

                || board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O'
                || board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O'
                || board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O'

                || board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'
                || board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
            System.out.print("O is winner");

            return 3;
        } else {
            return 4;
        }
    }

    public void Action(int stateNumber) {
        switch (stateNumber) {
            case 1:
                notWonYet();
            case 2:
                WinnerX();
            case 3:
                WinnerO();
            case 4:
                Draw();

        }
    }


    void notWonYet() {

    }

    void WinnerX() {

    }

    void WinnerO() {

    }

    void Draw() {

    }

    public Player getCurrrentPlayer() {
        return currrentPlayer;
    }

    public void setCurrrentPlayer(Player currrentPlayer) {
        this.currrentPlayer = currrentPlayer;
    }
}