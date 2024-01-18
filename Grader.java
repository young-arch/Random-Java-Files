public class Grader {
    private double[] testScores;

    public Grader(double[] scoreArray) {

        testScores = scoreArray;
    }

    public double getLowestScore() {

        double lowest;

        lowest = testScores[0];

        for (int index = 1; index < testScores.length; index++) {
            if (testScores[index] < lowest) {
                lowest = testScores[index];
            }
        }
        return lowest;
    }

    public double getAverage() {
        double total = 0;
        double lowest;
        double average;

        if (testScores.length < 2) {
            System.out.println("ERROR: You must have at least two test scores!");
            average = 0;
        } else {
            for (double score : testScores){
                total += score;
            }
            lowest = getLowestScore();

            total -= lowest;
            average = total / (testScores.length - 1);

        }
        return average;
    }
}
