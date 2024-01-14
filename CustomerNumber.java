import javax.swing.JOptionPane;

public class CustomerNumber {
    public static void main(String[] args) {
        String input;
        input = JOptionPane
                .showInputDialog("Enter a customer number in the form LLLNNNN\n (LLL = letters and NNN = numbers)");

        if (isValid(input)) {
            JOptionPane.showMessageDialog(null, "That's a valid customer number.");
        } else {
            JOptionPane.showMessageDialog(null,
                    "That's not the proper format of a customer number.\n Here is an example: ABC1234");
        }
        System.exit(0);
    }

    private static boolean isValid(String custNumber) {
        boolean goodSoFar = true;
        int i = 0;

        if (custNumber.length() != 7) {
            goodSoFar = false;
        }

        while (goodSoFar && i < 3) {
            if (!Character.isLetter(custNumber.charAt(i))) {
                goodSoFar = false;
                i++;
            }
        }

        while (goodSoFar && i < 7) {
            if (!Character.isDigit(custNumber.charAt(i))) {
                goodSoFar = false;
                i++;
            }
        }
        return goodSoFar;
    }
}