import javax.swing.JOptionPane;

public class GradeAProtectedDemo {
    public static void main(String[] args) {

        String input;
        int questions;
        int missed;

        // Get the num of the of questions
        input = JOptionPane.showInputDialog("How many questions are on the final exam?");
        questions = Integer.parseInt(input);

        // Get the num of questions the students missed
        input = JOptionPane.showInputDialog("How many questions did the student miss?");
        missed = Integer.parseInt(input);

        // Create a FinalExam object
        GradeAFinalExam examm = new GradeAFinalExam(questions, missed);

        // Display the test results
        JOptionPane.showMessageDialog(null, "Each question counts " + examm.getPointsEach() +
                " pointss.\n The exam score is " + examm.getScore() + "\nThe exam grade is " + examm.getGrade());

        System.exit(0);

    }

}
