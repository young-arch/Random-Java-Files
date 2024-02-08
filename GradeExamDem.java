import javax.swing.JOptionPane;

public class GradeExamDem {
    public static void main(String[] args) {
        String input;
        int questions;
        int missed;

        input = JOptionPane.showInputDialog(null, "How many questions are on the final exam? ");
        questions = Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null, "How many questions did the student miss?");
        missed = Integer.parseInt(input);

        // Create a FinalExam object.
        GradeFinalExam exa = new GradeFinalExam(questions, missed);

        // Display the test results.
        JOptionPane.showMessageDialog(null,
                "Each question counts " + exa.getPointseach() + " points.\n The exam score is " +
                        exa.getScore() + "\nThe exam grade is " + exa.getGrade());

        System.exit(0);

    }

}
