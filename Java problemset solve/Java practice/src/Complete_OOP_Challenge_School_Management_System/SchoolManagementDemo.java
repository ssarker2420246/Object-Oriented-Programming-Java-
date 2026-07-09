package Complete_OOP_Challenge_School_Management_System;

import java.util.ArrayList;

abstract class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    abstract void displayInfo();
}

class Student extends Person {
    private int studentId;
    private ArrayList<Course> courses = new ArrayList<>();

    Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    void enrollCourse(Course course) {
        courses.add(course);
    }

    @Override
    void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + studentId);
        System.out.println("Enrolled Courses:");

        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

class Teacher extends Person {
    private int teacherId;
    private String subject;

    Teacher(String name, int age, int teacherId, String subject) {
        super(name, age);
        this.teacherId = teacherId;
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        System.out.println("Teacher Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Subject: " + subject);
    }
}

class Course {
    private String courseCode;
    private String courseName;
    private Teacher teacher;

    Course(String courseCode, String courseName, Teacher teacher) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.teacher = teacher;
    }

    String getCourseName() {
        return courseName;
    }

    void displayCourseInfo() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Teacher: " + teacher.getName());
    }
}

class Department {
    private String departmentName;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();

    Department(String departmentName) {
        this.departmentName = departmentName;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    void addCourse(Course course) {
        courses.add(course);
    }

    void displayDepartmentInfo() {
        System.out.println("Department: " + departmentName);

        System.out.println("\nStudents:");
        for (Student student : students) {
            student.displayInfo();
            System.out.println();
        }

        System.out.println("Teachers:");
        for (Teacher teacher : teachers) {
            teacher.displayInfo();
            System.out.println();
        }

        System.out.println("Courses:");
        for (Course course : courses) {
            course.displayCourseInfo();
            System.out.println();
        }
    }
}

public class SchoolManagementDemo {
    public static void main(String[] args) {
        Department department = new Department("Computer Science");

        Teacher teacher1 = new Teacher("Mr. Hasan", 40, 201, "Java");
        Teacher teacher2 = new Teacher("Ms. Nila", 35, 202, "Database");

        Course course1 = new Course("CSE101", "Java Programming", teacher1);
        Course course2 = new Course("CSE102", "Database Management", teacher2);

        Student student1 = new Student("Rahim", 20, 101);
        Student student2 = new Student("Karim", 21, 102);

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);

        student2.enrollCourse(course1);

        department.addTeacher(teacher1);
        department.addTeacher(teacher2);

        department.addCourse(course1);
        department.addCourse(course2);

        department.addStudent(student1);
        department.addStudent(student2);

        department.displayDepartmentInfo();
    }
}