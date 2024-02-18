class Students{
    int marks;
    String name;
    int roll_no;

}

public class ArrayOfObjects{
    public static void main(String[] args){

        Students entity = new Students();
        Students entity2 = new Students();
        Students entity3 = new Students();

        entity.marks = 88;
        entity.name = "Maven";
        entity.roll_no = 1;

        entity2.marks = 98;
        entity2.name = "Binary";
        entity2.roll_no = 2;
        
        entity3.marks = 78;
        entity3.name = "Spring";
        entity3.roll_no = 3;


        Students student[] = new Students[3];
        student[0] = entity;
        student[1] = entity2;
        student[2] = entity3;


        for(int i=0; i<student.length; i++){
            System.out.println("Roll_num" + student[i].roll_no);
            System.out.println(student[i].name + " : " + student[i].marks);
            System.out.println();
        }

        System.out.println("Those are the students records");

    }    
}
