import java.util.ArrayList;

public class Dothis {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Gabriel");
        names.add("Mawule");
        names.add("Koomson");
        names.add("Sowah");
        names.add("Arthur");
        names.add("Dei");
        names.add("Inkoom");
        names.add("Markwei");

        System.out.println("Here the names of the students in the Astronomy class: ");

        for (String val : names) {

            System.out.println("The names of the students in the Astronomy class are: " + val);
        }

        names.remove(0);

        for (int index = 0; index < names.size(); index++) {
            System.out.println("The names of the students in the astronomy class are " + names.get(index));

        }

    }

}
