public class MyDemo {
    public static void main(String[] args) {

        System.out.println("Here is a short program: ");

        MyBuiltCar mades = new MyBuiltCar(MyCarCollection.AUDI, MyColorCollections.WHITE);

        System.out.println(mades);

        switch (mades.getMyCarType()) {

            case AUDI:
                System.out.println("Your car was made in Germany");
                break;

            case ROLLSROYCE:
                System.out.println("Your car was made in the U.K");
                break;

            case LEXUS:
                System.out.println("Your car was made in Korea");
                break;

            default:
                System.out.println("I am then not sure where it was made.");

        }
    }

}
