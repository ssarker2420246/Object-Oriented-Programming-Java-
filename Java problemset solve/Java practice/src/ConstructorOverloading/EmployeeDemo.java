package ConstructorOverloading;

class Employee {
    String name;
    int id;
    double salary;

    Employee() {
        name = "Unknown";
        id = 0;
        salary = 0.0;
    }

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.salary = 0.0;
    }

    void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Hasan", 201, 35000);
        Employee e3 = new Employee("Nila", 202);

        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
}