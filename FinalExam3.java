public class FinalExam3 extends GradeActivity implements Relatable {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam3(int questions, int missed) {
        double numericScore;

        // Set the numQuestions and numMissed fields.
        numQuestions = questions;
        numMissed = missed;

        // Calculate the points for each question and the numeric score for this exam
        pointsEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointsEach);

        // Call the inherited setScore method to set the numeric score
        setScore(numericScore);
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }

    public boolean equals(GradeActivity g) {
        boolean status;

        if (this.getScore() == g.getScore()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    public boolean isGreater(GradeActivity g) {
        boolean status;

        if (this.getScore() > g.getScore()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    public boolean isLess(GradeActivity g) {
        boolean status;

        if (this.getScore() < g.getScore()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

}
