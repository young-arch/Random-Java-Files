public class NegativeStartingBlance extends Exception{

    /**
     * This constructor uses a generic error message.
     */

     public NegativeStartingBlance(){
        super("Error: Negative starting balance");

     }

     public NegativeStartingBlance(double amount){
        super("Error: Negative starting balance: " + amount);
     }
}