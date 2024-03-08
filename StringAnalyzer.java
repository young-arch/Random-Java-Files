import javax.swing.JOptionPane;

public class StringAnalyzer {
    public static void main(String[] args) {

        String input;
        char[] array;
        int letters = 0;
        int digits = 0;
        int whiteSpaces = 0;

        input = JOptionPane.showInputDialog("Enter a String: ");
        array = input.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (Character.isLetter(array[i])) {
                letters++;
            } else if (Character.isDigit(array[i])) {
                digits++;
            } else if (Character.isWhitespace(array[i])) {
                whiteSpaces++;
            }
        }
        JOptionPane.showMessageDialog(null,
                "That String contains: " + letters + " letter\n " + digits + " digits\n " + whiteSpaces
                        + " whitespaces\n");

        System.exit(0);
    }
}
