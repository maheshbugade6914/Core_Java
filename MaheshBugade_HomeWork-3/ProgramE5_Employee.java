class Employee {
    int employeeId;
    String employeeName;
    double monthlySalary;
}

public class ProgramE5_Employee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.monthlySalary = 30000;
        double annualSalary = employee.monthlySalary * 12;
        System.out.println(annualSalary);
    }
}