package GUI;

/**
 * Created by Robert on 13/05/2017.
 */

public class StateMachine {

    char[][] board = new char[3][3];


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

        } else if (board[0][0] == 'x' && board[0][1] == 'x' && board[0][2] == 'x'
                || board[1][0] == 'x' && board[1][1] == 'x' && board[1][2] == 'x'
                || board[2][0] == 'x' && board[2][1] == 'x' && board[2][2] == 'x'

                || board[0][0] == 'x' && board[1][0] == 'x' && board[2][0] == 'x'
                || board[0][1] == 'x' && board[1][1] == 'x' && board[2][1] == 'x'
                || board[0][2] == 'x' && board[1][2] == 'x' && board[2][2] == 'x'

                || board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x'
                || board[0][2] == 'x' && board[1][1] == 'x' && board[2][0] == 'x') {
            System.out.print(" x is winner");

            return 2;
        } else if (board[0][0] == '0' && board[0][1] == '0' && board[0][2] == '0'
                || board[1][0] == '0' && board[1][1] == '0' && board[1][2] == '0'
                || board[2][0] == '0' && board[2][1] == '0' && board[2][2] == '0'

                || board[0][0] == '0' && board[1][0] == '0' && board[2][0] == '0'
                || board[0][1] == '0' && board[1][1] == '0' && board[2][1] == '0'
                || board[0][2] == '0' && board[1][2] == '0' && board[2][2] == '0'

                || board[0][0] == '0' && board[1][1] == '0' && board[2][2] == '0'
                || board[0][2] == '0' && board[1][1] == '0' && board[2][0] == '0') {
            System.out.print(" O is winner");

            return 3;
        } else {
            return 4;
        }
    }

    public void Action(int stateNumber) {
        switch (stateNumber) {
            case 2:
                WinnerX();
            case 3:

                WinnerO();
            case 4:
                Draw();
            case 1:
                notWonYet();

        }
    }

    void WinnerX() {


    }

    void WinnerO() {

    }

    void Draw() {

    }

    void notWonYet() {

    }


    public void Start() {
        Action(logic(board));
    }
}