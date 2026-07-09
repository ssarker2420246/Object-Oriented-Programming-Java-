package ClassAndObject;

class Student {
    String name;
    int id;
    String department;
    double cgpa;

    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println();
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahim";
        s1.id = 101;
        s1.department = "CSE";
        s1.cgpa = 3.75;

        Student s2 = new Student();
        s2.name = "Karim";
        s2.id = 102;
        s2.department = "EEE";
        s2.cgpa = 3.60;

        s1.displayInfo();
        s2.displayInfo();
    }
}