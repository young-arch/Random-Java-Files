public class BankVaragsDemo {
    public static void main(String[] args) {
        double total;

        BankAccount account1 = new BankAccount(100);

        BankAccount account2 = new BankAccount(200);

        BankAccount account3 = new BankAccount(800);

        total = totalBalance(account1);
        System.out.println("Total: $" + total);

        total = totalBalance(account1, account2);
        System.out.println("Total: $" + total);

        total = totalBalance(account1, account2, account3);
        System.out.println("Total: $" + total);
    }

    public static double totalBalance(BankAccount... accounts) {
        double total = 0.0;

        for (BankAccount acctObject : accounts) {
            total += acctObject.getBalance();

        }
        return total;
    }

}
