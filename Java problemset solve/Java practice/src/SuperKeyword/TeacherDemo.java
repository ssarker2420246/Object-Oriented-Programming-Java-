package SuperKeyword;

class Teacher {
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void displayInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

class MathTeacher extends Teacher {
    String level;

    MathTeacher(String name, String subject, String level) {
        super(name, subject);
        this.level = level;
    }

    void displayMathTeacherInfo() {
        displayInfo();
        System.out.println("Level: " + level);
    }
}

public class TeacherDemo {
    public static void main(String[] args) {
        MathTeacher mt = new MathTeacher("Mr. Hasan", "Mathematics", "Class 10");
        mt.displayMathTeacherInfo();
    }
}