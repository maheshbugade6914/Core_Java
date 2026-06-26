
class Student {
    String name;
    int rollNumber;
    int marks;
}

public class ProgramE2_TwoStudents {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Rahul";
        student1.rollNumber = 101;
        student1.marks = 90;

        student2.name = "Aman";
        student2.rollNumber = 102;
        student2.marks = 85;

        System.out.println(student1.name + " " + student1.rollNumber + " " + student1.marks);
        System.out.println(student2.name + " " + student2.rollNumber + " " + student2.marks);
    }
}
