package Multilevel_Inheritance;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int studentId;
    String department;

    Student(String name, int age, int studentId, String department) {
        super(name, age);
        this.studentId = studentId;
        this.department = department;
    }

    void displayStudentInfo() {
        displayPersonInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Department: " + department);
    }
}

class GraduateStudent extends Student {
    String thesisTitle;

    GraduateStudent(String name, int age, int studentId, String department, String thesisTitle) {
        super(name, age, studentId, department);
        this.thesisTitle = thesisTitle;
    }

    void displayGraduateStudentInfo() {
        displayStudentInfo();
        System.out.println("Thesis Title: " + thesisTitle);
    }
}

public class GraduateStudentDemo {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent(
                "Rahim",
                24,
                101,
                "CSE",
                "Artificial Intelligence in Education"
        );

        gs.displayGraduateStudentInfo();
    }
}