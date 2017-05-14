package BackEnd;

/**
 * Created by josh on 14/05/17.
 */
public class Player {
    char letter;
    int number;

    public Player(char letter, int number) {
        this.letter = letter;
        this.number = number;
    }

    public Player(){

    }

    public char getLetter() {
        return letter;
    }
}