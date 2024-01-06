import java.util.*;

public class CurvedActivityDemo {
    public static void main(String[] args) {

        double score;
        double curvePercent;

        // Create a Scanner object to read Keyboard input.
        Scanner input = new Scanner(System.in);

        // Get the unadjusted exam score
        System.out.print("Enter the students raw numeric score: ");
        score = input.nextDouble();

        // Get the curve percentage
        System.out.println("Enter the curve percentage: ");
        curvePercent = input.nextDouble();

        // Create a curvedActivity object.
        CurvedActivity curvedExam = new CurvedActivity(curvePercent);

        // Set the exam score.
        curvedExam.setScore(score);

        // Display the raw score
        System.out.println("The raw Score for the exams " + curvedExam.getRawScore());

        // Display the curved score
        System.out.println("The curved score is " + curvedExam.getScore());

        // Display the grade
        System.out.println("The grade for the paper is: " + curvedExam.getGrade());

    }

}
