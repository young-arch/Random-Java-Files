public class Zinstructor {
    private String lastName;
    private String firstName;
    private String officeNumber;

    public Zinstructor(String lname, String fname, String office) {
        lastName = lname;
        firstName = fname;
        officeNumber = office;
    }

    public Zinstructor(Zinstructor object2) {
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
        String str = "Last Name: " + lastName + "\nFirst Name: " + firstName + "\nOffice Number: " + officeNumber;
        return str;

    }

}
