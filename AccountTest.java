import javax.swing.JOptionPane;

public class AccountTest {
    public static void main(String[] args) {
        String input;

        input = JOptionPane.showInputDialog("What is your is your start balance");

        BankAccount account = new BankAccount(input);

        input = JOptionPane.showInputDialog("How much were you paid this month?");

        account.deposit(input);

        JOptionPane.showMessageDialog(null, String.format("Your pay has been" +
                " deposited. Your current balance is $%,.2f", account.getBalance()));

        input = JOptionPane.showInputDialog("How mch would like to withdraw?");
        account.withdraw(input);

        JOptionPane.showMessageDialog(null, String.format("Now your balance is " +
                "$%,.2f", account.getBalance()));

        System.exit(0);
    }

}
