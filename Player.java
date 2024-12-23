import java.util.Random;

public class Player {
    private String name;
    private String guess;
    private int points;

    public Player(String playerName) {
        name = playerName;
        guess = " ";
        points = 0;

    }

    public void makeGuess() {
        Random rand = new Random();
        int guessNumber = rand.nextInt(2);

        if (guessNumber == 0) {
            guess = "Cho (even)";
        } else {
            guess = "Han (odd)";
        }

    }

    public void addPoints(int newPoints) {
        points += newPoints;

    }

    public String getName() {
        return name;
    }

    public String getGuess() {
        return guess;
    }

    public int getPoints() {
        return points;
    }

}
