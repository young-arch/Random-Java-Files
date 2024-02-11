public class CompSciStudent extends Student {
    // Required Hours
    private final int MATH_HOURS = 20;
    private final int CS_HOURS = 40;
    private final int GEN_ED_HOURS = 60;

    // Hours taken
    private int mathHours;
    private int csHours;
    private int genEdHours;

    public CompSciStudent(String n, String id, int year) {
        super(n, id, year);
    }

    public void setMathHours(int math) {
        mathHours = math;
    }

    public void setCsHours(int cs) {
        csHours = cs;
    }

    public void setGenEdHours(int genEd) {
        genEdHours = genEd;
    }

    @Override
    public int getRemainingHours() {
        int reqHours;
        int remainingHours;

        // Calculate the required hours
        reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;

        // Calculate the remainining hours
        remainingHours = reqHours - (mathHours + csHours + genEdHours);
        return remainingHours;
    }

    @Override
    public String toString() {
        String str;

        str = super.toString() + "\nMajor: Computer Science " +
                "\nComputer Science Hours Taken: " + csHours +
                "\nGeneral Ed hours taken: " + genEdHours +
                "\nMaths Hours taken: " + mathHours;

        return str;

    }

}
