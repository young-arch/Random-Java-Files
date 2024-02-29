import java.util.Scanner;

import java.util.Random;

public class RockPaper {

    public static void main(String[] args) {

        System.out.println("Welcome to Rock Paper Scissors game ");
        computer();
        user_choice();
        determineWinner(computer(), user_choice());
        System.out.println("We are done ");

    }

    public static String computer() {

        int num;
        Random rand = new Random();
        num = rand.nextInt(3) + 1;

        if (num == 1) {
            return "rock";
        } else if (num == 2) {
            return "paper";
        } else {
            return "Scissors";
        }

    }

    public static String user_choice() {
        String choice;
        System.out.println("Choose either 'rock', 'paper', and 'Scissors': ");

        Scanner input = new Scanner(System.in);
        choice = input.nextLine();

        System.out.println("This is the user's choice " + user_choice());
        return choice;

    }

    public static void determineWinner(String a, String b) {

        if (a.equals("rock") && b.equals("scissor")) {
            System.out.println("You win with the rock");
        }

        else if (a.equals("rock") && b.equals("scissor")) {
            System.out.println("Computer wins with the rock");
        } else if (a.equals("scissor") && b.equals("paper")) {
            System.out.println("You win with the scissor");
        } else if (a.equals("paper") && b.equals("scissor")) {
            System.out.println("The computer wins with the scissor");
        } else if (a.equals("paper") && b.equals("rock")) {
            System.out.println("You win with paper");
        } else if (a.equals("rock") && b.equals("paper")) {
            System.out.println("The computer wins with paper");

        } else {
            System.out.println("The choice are the same you need to replay");

        }

    }

}