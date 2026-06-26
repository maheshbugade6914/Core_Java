
class Student {
    String name;
    int rollNumber;
    int age;
    int marks;
}

public class ProgramE1_Student {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Ruhi";
        student.rollNumber = 101;
        student.age = 10;
        student.marks = 95;

        System.out.println("Name: " + student.name);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Age: " + student.age);
        System.out.println("Marks: " + student.marks);
    }
}
