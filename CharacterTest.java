import javax.swing.JOptionPane;

public class CharacterTest {
    public static void main(String[] args) {
        String input;
        char ch;

        input = JOptionPane.showInputDialog("Enter any single character. ");
        ch = input.charAt(0);

        if (Character.isLetter(ch)) {
            JOptionPane.showMessageDialog(null, "That is a letter.");
        }
        if (Character.isDigit(ch)) {
            JOptionPane.showMessageDialog(null, "That is a digit.");
        }
        if (Character.isUpperCase(ch)) {
            JOptionPane.showMessageDialog(null, "That is an uppercase letter.");
        }
        if (Character.isSpaceChar(ch)) {
            JOptionPane.showMessageDialog(null, "That is a space.");
        }
        if (Character.isWhitespace(ch)) {
            JOptionPane.showMessageDialog(null, "That is a whiteSpacce character.");
        }
        System.exit(0);
    }
}
