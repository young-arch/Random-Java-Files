import java.util.*;

public class ChargeAccountValidation {
    public static void main(String[] args){
        int[] accountNumbers = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 
                                8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
                                1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
        
        int accountNum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an account number to check whether it exists");
        int value = input.nextInt();

        accountNum = sequenSearch(accountNumbers, value);

        if(accountNum == -1){
            System.out.println("The account you entered does not exist in our system ");
        }
        else{
            System.out.println("This account is an active account and is working");
        }

    



    }

    public static int sequenSearch(int[] account_num, int value) {

        int element;
        int index;
        boolean found;

        element = -1;
        index = 0;
        found = false;

        while (!found && index < account_num.length) {

            if (value == account_num[index]) {
                found = true;
                element = index;
            }
            index++;
        }

        return element;
    }

}
