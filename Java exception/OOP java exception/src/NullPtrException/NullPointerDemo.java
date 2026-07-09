package NullPtrException;

class Person {
    String name;
    int age;

    void printAge() {
        System.out.println("Age: " + age);
    }
}

public class NullPointerDemo {
    public static void main(String[] args) {
        Person person = null;   // Object not initialized

        try {
            person.printAge();  // This will cause NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: Person object is not initialized.");
        }
    }
}