import java.util.Scanner;

public class SwitchState{

    public static void main(String args[]){

        System.out.println("Welcome to a Switch");

        String month;


        System.out.println("Enter the best month in the year");
        
        Scanner input = new Scanner(System.in);

        month = input.nextLine();

        switch (month) {
            case "January":
                System.out.println("This is the first month");
                break;
            case "February":
                System.out.println("This is the second month");
                break;
            case "March":
                System.out.println("This is the third month");
                break;
            case "April":
                System.out.println("This is the month we looking for");
                break;
            default:
                System.out.println("We don't care about the rest");
                break;
        }

    }
    
}
