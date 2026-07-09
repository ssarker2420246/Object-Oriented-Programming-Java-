package University_Management_Mini_Problem;

import java.util.ArrayList;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int studentId;

    Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    void displayStudent() {
        displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}

class Teacher extends Person {
    String designation;

    Teacher(String name, int age, String designation) {
        super(name, age);
        this.designation = designation;
    }

    void displayTeacher() {
        displayInfo();
        System.out.println("Designation: " + designation);
    }
}

class Course {
    String courseName;
    Teacher teacher;
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName, Teacher teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
    }

    void enrollStudent(Student student) {
        students.add(student);
    }

    void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Teacher: " + teacher.name);
        System.out.println("Enrolled Students:");

        for (Student student : students) {
            System.out.println("- " + student.name);
        }
    }
}

public class UniversityManagementDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Karim", 40, "Lecturer");

        Student s1 = new Student("Rahim", 20, 101);
        Student s2 = new Student("Nila", 21, 102);

        Course course = new Course("Java Programming", teacher);

        course.enrollStudent(s1);
        course.enrollStudent(s2);

        course.displayCourseInfo();
    }
}