public class DieExceptionDemo {
    public static void main(String[] args) {

        final int DIE_SIDES = 2; // Number of Sides

        // Create an instance of the Die class
        Die88 die = new Die88(DIE_SIDES);

        System.out.println("Initial value of the die: ");
        System.out.println(die.getValue());
        System.out.println(die.getSides());
    }

}
