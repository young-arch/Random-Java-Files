public class SplitDemo {
    public static void main(String[] args) {
        // Create a String to tokenize
        String str = "joe@gaddisbooks.com";

        // Get the tokens, using the space delimiter.
        String[] tokens = str.split("[@.]");

        // Display the tokens
        for (String s : tokens) {
            System.out.println(s);
        }

    }
}