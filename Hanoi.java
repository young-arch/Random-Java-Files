public class Hanoi {

    // Number of Discs
    private int numDiscs;

    /*
     * Constructor
     */

    public Hanoi(int n) {
        // Assign the number of discs.
        numDiscs = n;

        // Move the number of discs from peg1 to peg3 using peg2 as a temporary storage
        // location
        moveDiscs(numDiscs, 1, 3, 2);

    }

    private void moveDiscs(int num, int fromPeg, int toPeg, int temPeg) {

        if (num > 0) {
            moveDiscs(num - 1, fromPeg, temPeg, toPeg);
            System.out.println("Move a disc from peg " + fromPeg + " to peg " + toPeg);

            moveDiscs(num - 1, temPeg, toPeg, fromPeg);
            //
        }
    }
}