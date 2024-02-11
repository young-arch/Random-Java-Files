import java.util.*;

public class DriversLicenseExam {
    private char[] examsAnswers = { 'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D',
            'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A' };

    private char[] stuAnswers = new char[20];

    public DriversLicenseExam(char[] answers) {

        for (int index = 0; index < examsAnswers.length; index++) {
            answers[index] = examsAnswers[index];
        }
    }

    public char[] stuAn(char[] stuAnswers) {
        Scanner input = new Scanner(System.in);
        for (int index = 0; index < stuAnswers.length; index++) {
            System.out.println("Enter the the correct answer to Question " + (index + 1) + ": ");
            String key = input.nextLine();
            stuAnswers[index] = key.charAt(0);
        }

        return stuAnswers;
    }

    public boolean examsStatus(char[] stuAnswers, char[] examsAnswers) {

        int total = 0;
        boolean pass = false;

        for (int index = 0; index < examsAnswers.length; index++) {

            if (stuAnswers[index] == examsAnswers[index]) {
                System.out.println("Correct");
                total += 1;
            } else {
                System.out.println("Wrong");
            }
        }

        if (total >= 15) {
            pass = true;
        } else {
            pass = false;
        }
        return pass;
    }

    public int totalCorrect(char[] stuAnswers, char[] examsAnswers) {
        int total;
        total = 0;

        for (int index = 0; index < examsAnswers.length; index++) {
            if (stuAnswers[index] == examsAnswers[index]) {
                total += 1;
            }
        }
        return total;
    }

    public int totalIncorrect(char[] stuAnswers, char[] examsAnswers) {
        int total;
        total = 20;

        for (int index = 0; index < examsAnswers.length; index++) {
            if (stuAnswers[index] == examsAnswers[index]) {
                total -= 1;

            }

        }
        return total;
    }

    public int[] missedQuestions(int[] missedQuest) {

        for (int index = 0; index < examsAnswers.length; index++) {
            if (stuAnswers[index] != examsAnswers[index]) {
                missedQuest[index] = examsAnswers[index];
            }
        }
        return missedQuest;
    }

    public void wronQuestions(int[] wrong) {

        for (int val : wrong) {
            System.out.println(wrong + " ");
        }
    }
}
