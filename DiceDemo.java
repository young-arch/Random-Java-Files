public class DiceDemo {
    public static void main(String[] args) {

        final int DIE1_SIDES = 6;
        final int DIE2_SIDES = 12;
        final int MAX_ROLLS = 5;
 
        Die die1 = new Die(DIE1_SIDES);GU
        Die die2 = new Die(DIE2_SIDES);

        System.out.println("This simulates the rollig of a " +
                DIE1_SIDES + " sided eye a " + DIE2_SIDES + "sided die");

        System.out.println("Initial value of the dice: ");
        System.out.println(die1.getValue() + " " + die2.getValue());

        System.out.println("Rolling the dice " + MAX_ROLLS + " times");

        for (int i = 0; i < MAX_ROLLS; i++) {
            die1.roll();
            die2.roll();

            System.out.println(die1.getValue() + " " + die2.getValue());
        }

    }

}
