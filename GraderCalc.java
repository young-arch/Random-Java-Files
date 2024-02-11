import java.util.Scanner;

public class GraderCalc {
    public static void main(String[] args) {

        int numScores;
        Scanner input = new Scanner(System.in);

        System.out.print("How many test scores do you have? ");
        numScores = input.nextInt();

        double[] scores = new double[numScores];

        for (int index = 0; index < numScores; index++) {
            System.out.println("Enter score #" + (index + 1) + ": ");
            scores[index] = input.nextDouble();
        }

        Grader myGrader = new Grader(scores);

        System.out.println("Your adjusted average is " + myGrader.getAverage());

        System.out.println("Your lowest test score was " + myGrader.getLowestScore());

    }
}