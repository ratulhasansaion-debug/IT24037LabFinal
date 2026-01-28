class Employee {
    void calculateSalary() {
        System.out.println("Calculating employee salary...");
    }
}

class FullTimeEmployee extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Full-Time Salary: Fixed monthly salary + Benefits.");
    }
}

class PartTimeEmployee extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Part-Time Salary: Calculated based on hourly wages.");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp;

        emp = new FullTimeEmployee();
        emp.calculateSalary();

        emp = new PartTimeEmployee();
        emp.calculateSalary();
    }
}
