class Student {
    String name;
    int marks;
}

public class Challenge1_StoreMultipleStudents {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.name = "Varun";
        student1.marks = 65;

        student2.name = "Amrutha";
        student2.marks = 55;

        student3.name = "Mrunal";
        student3.marks = 80;

        Student topper = student1;

        if (student2.marks > topper.marks) {
            topper = student2;
        }

        if (student3.marks > topper.marks) {
            topper = student3;
        }

        System.out.println("Topper: " + topper.name);
        System.out.println("Marks: " + topper.marks);
    }
}
