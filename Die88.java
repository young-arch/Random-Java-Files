import java.util.Random;

public class Die88 {

    private final int MIN_SIDES = 4;
    private int sides;
    private int value;

    public Die88(int numSides) {
        // Validate the number of the sides
        if (numSides < MIN_SIDES) {
            throw new IllegalArgumentException("The die must have at least " + MIN_SIDES + " sides.");
        }
        sides = numSides;
        roll();
    }

    public void roll() {
        // Create a Random object.
        Random rand = new Random();

        // Get a random value for the die.
        value = rand.nextInt(sides) + 1;
    }

    public int getSides() {
        return sides;
    }

    public int getValue() {
        return value;
    }

}
