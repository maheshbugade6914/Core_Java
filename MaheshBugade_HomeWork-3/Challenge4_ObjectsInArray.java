class Student {
    String name;
    int marks;
}

public class Challenge4_ObjectsInArray {

    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();

        students[0].name = "MB";
        students[0].marks = 75;

        students[1].name = "Amala";
        students[1].marks = 70;

        students[2].name = "Parth";
        students[2].marks = 95;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " " + students[i].marks);
        }
    }
}
