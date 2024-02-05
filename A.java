import java.util.Scanner;

public class A {

    public class RockPaperScissors {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Let's play Rock-Paper-Scissors!");

            while (true) {
                System.out.print("Player 1, enter your choice (rock, paper, or scissors): ");
                String player1Choice = scanner.nextLine().toLowerCase();
                System.out.print("Player 2, enter your choice (rock, paper, or scissors): ");
                String player2Choice = scanner.nextLine().toLowerCase();

                if (!isValidChoice(player1Choice) || !isValidChoice(player2Choice)) {
                    System.out.println("Invalid choice. Please try again.");
                    continue;
                }

                if (player1Choice.equals(player2Choice)) {
                    System.out.println("It's a tie! Let's play again.");
                    continue;
                }

                String winner = determineWinner(player1Choice, player2Choice);
                System.out.println("The winner is: " + winner);
                break;
            }

            scanner.close();
        }

        private static boolean isValidChoice(String choice) {
            return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
        }

        private static String determineWinner(String player1Choice, String player2Choice) {
            if (player1Choice.equals("rock")) {
                if (player2Choice.equals("scissors"))
                    return "Player 1";
                else
                    return "Player 2";
            } else if (player1Choice.equals("scissors")) {
                if (player2Choice.equals("paper"))
                    return "Player 1";
                else
                    return "Player 2";
            } else {
                if (player2Choice.equals("rock"))
                    return "Player 1";
                else
                    return "Player 2";
            }
        }
    }

}
