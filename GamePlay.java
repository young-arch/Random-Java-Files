import java.util.Random;
import java.util.Scanner;

public class GamePlay {
    public static void main(String[] args) {
        playRockPaperScissors();
    }

    public static void playRockPaperScissors() {
        String userChoice = getUserChoice();
        String computerChoice = getComputerChoice();
        System.out.println("Computer's choice: " + computerChoice);
        String result = determineWinner(userChoice, computerChoice);
        System.out.println(result);
    }

    public static String getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        String choice = scanner.nextLine().toLowerCase();
        while (!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissors")) {
            System.out.print("Invalid choice. Please enter rock, paper, or scissors: ");
            choice = scanner.nextLine().toLowerCase();
        }
        return choice;
    }

    public static String getComputerChoice() {
        Random random = new Random();
        int choice = random.nextInt(3) + 1;
        if (choice == 1) {
            return "rock";
        } else if (choice == 2) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors"))
                || (userChoice.equals("scissors") && computerChoice.equals("paper"))
                || (userChoice.equals("paper") && computerChoice.equals("rock"))) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}
