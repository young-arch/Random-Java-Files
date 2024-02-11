import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");

        System.out.println("The ArrayList has " + nameList.size() + " objects stored in it. ");

        for (int index = 0; index < nameList.size(); index++) {
            System.out.println(nameList.get(index));
        }
    }
}