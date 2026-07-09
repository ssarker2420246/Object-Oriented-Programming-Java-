package MethodOverloading;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos.");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        dog.sound();
        cat.sound();
        cow.sound();
    }
}