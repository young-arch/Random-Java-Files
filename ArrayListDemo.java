import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args){

        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("Emmanuel Macron");
        nameList.add("George Bush");
        nameList.add("Gabriel Mawule");

        for(int index=0; index<nameList.size(); index++){
            System.out.println("Index: "+ index + " Name: " + nameList.get(index));

        }

        nameList.remove(1);

        System.out.println("The name at index 1 is removed. "+ " Here are the items now. ");

        for(int index=0; index<nameList.size(); index++){
            System.out.println("Index: " + index + " Name: " + nameList.get(index));
        }


    }

}
