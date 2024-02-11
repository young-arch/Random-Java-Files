import java.util.ArrayList;

public class ArrEnhanList {
    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("Gabriel");
        nameList.add("Rebecca");
        nameList.add("Elijah");

        System.out.println("There are " + nameList.size() + " objeects stored in it.");

        for (String name : nameList) {
            System.out.println(name);
        }

    }

}
