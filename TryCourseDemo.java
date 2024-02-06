import java.util.Scanner;

public class TryCourseDemo {
    public static void main(String[] args) {
        // Create an Instructor object
        TryInstructor instructor = new TryInstructor("Gabriel", "Mawule", "RH3010");

        // Create a TextBook object
        TryTextBook textbook = new TryTextBook("Starting out with Java", "Gaddis", "Pearson");

        // Create a Course object
        TryCourse myCourse = new TryCourse("Intro to Java", instructor, textbook);

        System.out.println(myCourse);

        Scanner keyboard = new Scanner(System.in);
        int age;

        System.out.println("Enter your age: ");
        age = keyboard.nextInt();

        System.out.print(age);

    }

}
