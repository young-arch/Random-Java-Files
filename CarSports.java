public class CarSports {
    private CarType make;
    private CarColor color;
    private double price;

    public CarSports(CarType amake, CarColor acolor, double aprice) {
        make = amake;
        color = acolor;
        price = aprice;
    }

    public CarType getMake() {
        return make;
    }

    public CarColor getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        String str = String.format("Make: %s\nColor: %s\nPrice: $%,.2f", make, color, price);
        return str;
    }

}
