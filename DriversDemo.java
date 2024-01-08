public class DriversDemo {
    public static void main(String[] args) {
        final int QUESTIONS = 20;

        char[] examAnswers = new char[QUESTIONS];

        char[] studAnswers = new char[QUESTIONS];

        int[] missquestion = new int[QUESTIONS];

        DriversLicenseExam test = new DriversLicenseExam(examAnswers);

        test.stuAn(studAnswers);

        boolean status = test.examsStatus(studAnswers, examAnswers);
        while (!status) {
            if (status) {
                System.out.println("You passed the exams ");
                break;
            } else {
                System.out.println("You failed the exams ");
                break;
            }
        }

        int value = test.totalCorrect(studAnswers, examAnswers);
        System.out.println("You had " + value + " questions correct in the exams");

        value = test.totalIncorrect(studAnswers, examAnswers);
        System.out.println("You had " + value + " questions incorrect in the exams");

        System.out.println("The question numbers you missed are: ");
        test.missedQuestions(missquestion);
        test.wronQuestions(missquestion);

    }

}
