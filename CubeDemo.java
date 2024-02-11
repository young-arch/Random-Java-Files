import java.util.Scanner;

public class CubeDemo {
    public static void main(String[] args) {

        double length;
        double width;
        double height;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the following dimensions of a cube: ");
        System.out.print("Length: ");
        length = input.nextDouble();

        System.out.print("Width: ");
        width = input.nextDouble();

        System.out.print("Height: ");
        height = input.nextDouble();

        // Create a cube object and pass the dimensions to the constructor.
        Cube myCube = new Cube(length, width, height);

        // Display the Cube's properties.
        System.out.println("Here are the cube's properties ");

        System.out.println("Length: " + myCube.getLength());

        System.out.println("Width " + myCube.getWidth());

        System.out.println("Height " + myCube.getSurfaceArea());

        System.out.println("Volume: " + myCube.getVolume());
    }
}