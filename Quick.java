public class Quick {
    public static void main(String[] args) {

        String fullname = "Sakyi Gabriel Mawule";
        char[] getAllchars = new char[7];

        System.out.println("The fullname of this person is " + fullname);
        System.out.println("The characters in the name are: ");

        fullname.getChars(6, 13, getAllchars, 0);

        for (int i = 0; i < getAllchars.length; i++) {
            System.out.print(getAllchars[i] + " ");
        }

        char[] cArray = { '2', '0', ' ' };
        StringBuilder str = new StringBuilder("In July we sold cars");
        str.insert(16, cArray);

        System.out.println(str);
    }

}
