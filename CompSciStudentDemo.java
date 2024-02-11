public class CompSciStudentDemo {
    public static void main(String[] args) {

        // Create a Computer Science Student Object
        CompSciStudent csStudent = new CompSciStudent("Gabriel Mawule", "167W98337", 2015);

        csStudent.setMathHours(12);
        csStudent.setCsHours(20);
        csStudent.setGenEdHours(40);

        // Display the student's data
        System.out.println(csStudent);

        // Display the number of remaining hours
        System.out.println("Hours remaining: " + csStudent.getRemainingHours());

    }

}
