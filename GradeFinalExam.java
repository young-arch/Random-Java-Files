public class GradeFinalExam extends GradeActivity {

    private int numQuestions; // Number of Questions
    private double pointsEach; // Points for each question
    private int numMissed; // Questions missed

    public GradeFinalExam(int questions, int missed) {
        double numericScore;// To hold the numeric score

        // set the numQuestions and numMissed fields
        numQuestions = questions;
        numMissed = missed;

        // Calculate the points for each questions and
        // the numeric score for this exam
        pointsEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointsEach);

        setScore(numericScore);
    }

    public double getPointseach() {
        return pointsEach;
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public int getNumMissed() {
        return numMissed;
    }

}
