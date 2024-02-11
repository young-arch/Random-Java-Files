public class GradeAFinalExam extends GradeASecond {

    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public GradeAFinalExam(int questions, int missed) {

        double numericScore;

        numQuestions = questions;
        numMissed = missed;

        pointsEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointsEach);

        setScore(numericScore);

        adjustScore();

    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }

    private void adjustScore() {
        double fraction;

        fraction = score - (int) score;

        if (fraction >= 0.5) {
            score = score + (1.0 - fraction);
        }
    }

}
