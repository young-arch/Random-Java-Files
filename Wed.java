import EnumDemo.Day;

public class Wed {
    public static void main(String[] args) {

        enum Days {
            Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        }
        ;

        Days specific = Days.Friday;

        System.out.println("Today is " + specific);

        if (Days.Friday.equals(specific)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not the same");
        }
    }
}
