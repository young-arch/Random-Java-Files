public class FullName {
    private String lastName;
    private String firstName;
    private String middleName;

    public void setLastName(String str) {
        lastName = str;

    }

    public void setFirstName(String str) {
        firstName = str;

    }

    public void setMiddleName(String str) {
        middleName = str;
    }

    public int getLength() {

        int len = 0;

        if (lastName != null) {
            len += lastName.length();
        }
        if (middleName != null) {
            len += middleName.length();
        }
        if (firstName != null) {
            len += firstName.length();
        }

        return len;

    }

    public String toString() {
        return firstName + " " + middleName + " " + lastName;
    }

}
