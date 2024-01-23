public class TryInstructor {

    private String lastName;
    private String firstName;
    private String officeNumber;

    public TryInstructor(String lname, String fname, String office) {

        lastName = lname;
        firstName = fname;
        officeNumber = office;
    }

    public TryInstructor(TryInstructor object2) {

        lastName = object2.lastName;
        firstName = object2.firstName;
        officeNumber = object2.officeNumber;
    }

    public void set(String lname, String fname, String office) {
        lastName = lname;
        firstName = fname;
        officeNumber = office;
    }

    public String toString() {
        String str = "Last Name: " + lastName + "\nFirstName: " + firstName + "\noffice Number: " + officeNumber;
        return str;
    }

}
