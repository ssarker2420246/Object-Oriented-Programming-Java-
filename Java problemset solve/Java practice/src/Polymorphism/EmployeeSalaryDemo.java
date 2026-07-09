package Polymorphism;

class Employee {
    void calculateSalary() {
        System.out.println("Salary calculation for employee.");
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Full Time Salary: " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    void calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Part Time Salary: " + salary);
    }
}

class ContractEmployee extends Employee {
    double contractAmount;

    ContractEmployee(double contractAmount) {
        this.contractAmount = contractAmount;
    }

    @Override
    void calculateSalary() {
        System.out.println("Contract Employee Salary: " + contractAmount);
    }
}

public class EmployeeSalaryDemo {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(40000);
        Employee e2 = new PartTimeEmployee(500, 40);
        Employee e3 = new ContractEmployee(30000);

        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();
    }
}