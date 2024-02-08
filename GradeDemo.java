import javax.swing.JOptionPane;

public class GradeDemo {
    public static void main(String[] args) {

        String input;
        double testscore;

        GradeActivity grade = new GradeActivity();

        input = JOptionPane.showInputDialog("Enter a numeric test score. ");
        testscore = Double.parseDouble(input);
        grade.setScore(testscore);

        JOptionPane.showMessageDialog(null, "The grade for that test is " +
                grade.getGrade());

        System.exit(0);

    }

}
