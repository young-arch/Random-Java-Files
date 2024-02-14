/**
 * This program passes an object as an argument.
 * The object is modified by the receiving method
 */

public class PassObject {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(12.0, 18.0);

        System.out.println("Contents of the box object: ");
        System.out.println("Length: " + box.getLength() + " Width: " + box.getWidth());

    }
}
