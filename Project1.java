public class Project1 {
    public static void main(String[] args) {

        Area(20.8, 8);
        Area(7.2, 9, 7);
        Area(20, 80);

    }

    public static double Area(double pi, int radius) {

        System.out.print("Calculating Area of  circle: ");

        double area = pi * radius * radius;
        System.out.println(area);
        return area;
    }

    public static int Area(int width, int length) {

        System.out.print("Calculating Area of Rectangle: ");

        int area = width * length;
        System.out.println(area);

        return area;

    }

    public static double Area(double pii, int radius, int height) {

        System.out.print("Calculating Area of a Cylinder: ");

        double area = radius * radius * pii * height;
        System.out.println(area);
        return area;

    }

}
