import java.util.Scanner;

public class WorkArea {
    public static void main(String[] args) {

        String str = " With God on my side everything is possible ";
        String search;
        int position;
        int pos;

        position = str.indexOf('o');
        System.out.println("The position of this letter is " + position);
        while (position != -1) {
            System.out.println(position);
            position = str.indexOf('r', position + 1);
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any word to see if we have that in our lib\n " + "");
        search = input.nextLine();

        if (search.startsWith("ever")) {
            System.out.println("Everything is possible indeed");
        } else {
            System.out.println("Sorry");
        }

        pos = search.indexOf("e");

        System.out.println(pos);

    }

}
