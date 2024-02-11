import javax.swing.JOptionPane;

/**
 * This program demonstrates how a method can return
 * a reference to an object.
 */
public class BankReturnObject {
    public static void main(String[] args) {
        BankAccount account;

        // Get a reference to a BankAccount object
        account = getAccount();

        JOptionPane.showMessageDialog(null, "The account has a balance of $" +
                account.getBalance());

        System.exit(0);
    }

    public static BankAccount getAccount() {
        String input;
        double balance;

        input = JOptionPane.showInputDialog("Enter the account balance. ");
        balance = Double.parseDouble(input);

        return new BankAccount(balance);
    }

}
