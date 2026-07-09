package FinalKeyword;

class University {
    final String universityName = "ABC University";

    final void displayUniversity() {
        System.out.println("University Name: " + universityName);
    }
}

class Department extends University {
    void displayDepartment() {
        System.out.println("Department: Computer Science");
    }

    /*
    This will cause an error because final methods cannot be overridden.

    void displayUniversity() {
        System.out.println("Trying to override final method.");
    }
    */
}

public class FinalDemo {
    public static void main(String[] args) {
        Department dept = new Department();

        dept.displayUniversity();
        dept.displayDepartment();

        /*
        This will cause an error because final variables cannot be changed.

        dept.universityName = "XYZ University";
        */
    }
}