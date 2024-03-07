public class Subsstrings {
    public static void main(String[] args) {
        String fullname = "Cynthia Susan Lee";

        String lastName = fullname.substring(14);

        String middleName = fullname.substring(8, 13);

        char[] nameArray = new char[5];
        fullname.getChars(8, 13, nameArray, 0);

        System.out.println("The full name is " + fullname);
        System.out.println("The last name is " + lastName);
        System.out.println("The middle name is " + middleName);
        System.out.println("The values in the array are: ");
        for (int i = 0; i < nameArray.length; i++) {
            System.out.print(nameArray[i] + " ");
        }

    }
}
