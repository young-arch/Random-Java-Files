public class Cube extends Rectangle {
    private double height;

    public Cube(double len, double w, double h) {

        super(len, w);
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public double getSurfaceArea() {
        return getArea() * 6;
    }

    public double getVolume() {
        return getArea() * height;
    }
}