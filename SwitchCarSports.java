public class SwitchCarSports {
    public static void main(String[] args) {
        CarSports yourNewCar = new CarSports(CarType.FERRARI, CarColor.BLACK, 8000000);

        switch (yourNewCar.getMake()) {
            case PORSCHE:
                System.out.println("Your car was made in Germany");
                break;

            case FERRARI:
                System.out.println("Your car was made in Italy.");
                break;

            case JAGUAR:
                System.out.println("Your car was made in England");
                break;

            default:
                System.out.println("I'm not sure where that car was made.");
        }

    }

}
