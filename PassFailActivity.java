public class PassFailActivity extends GradeActivity {

    private double minPassingScore; // Minimum Passing Score

    /**
     * The constructor sets the minimum passing score
     */

    public PassFailActivity(double mps) {
        minPassingScore = mps;
    }

    @Override
    public char getGrade() {

        char letterGrade;
        if (super.getScore() >= minPassingScore) {
            letterGrade = 'P';
        }

        else {
            letterGrade = 'F';
        }

        return letterGrade;
    }
}
