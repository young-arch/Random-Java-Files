public class RelatableExams {
    public static void main(String[] args) {
        // Exam #1 had 100 questions and the student missed 20 questions
        FinalExam3 exam1 = new FinalExam3(100, 20);

        // Exam #2had 100 questions and the student missed 30 questions
        FinalExam3 exam2 = new FinalExam3(100, 30);

        // Display the exam scores.
        System.out.println("Exam 1: " + exam1.getScore());
        System.out.println("Exam 2: " + exam2.getScore());

        // Compare the exam scores
        if (exam1.equals(exam2)) {
            System.out.println("The exam score are equal.");
        }

        if (exam1.isGreater(exam2)) {
            System.out.println("The Exam 1 score is the highest. ");
        }

        if (exam1.isLess(exam2)) {
            System.out.println("The Exam 1 score is the lowest. ");
        }

    }

}
