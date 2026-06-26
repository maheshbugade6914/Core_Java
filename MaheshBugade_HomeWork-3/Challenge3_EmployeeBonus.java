class Employee {
    String name;
    double salary;
    int experience;
}

public class Challenge3_EmployeeBonus {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.name = "Vikarm";
        employee.salary = 100000;
        employee.experience = 3;

        if (employee.experience >= 5) {
            employee.salary = employee.salary + (employee.salary * 10 / 100);
        }

        System.out.println("Final Salary: " + employee.salary);
    }
}
