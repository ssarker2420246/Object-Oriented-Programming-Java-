package Composition;

class Engine {
    String engineType;
    int horsePower;

    Engine(String engineType, int horsePower) {
        this.engineType = engineType;
        this.horsePower = horsePower;
    }

    void displayEngineInfo() {
        System.out.println("Engine Type: " + engineType);
        System.out.println("Horse Power: " + horsePower);
    }
}

class Car {
    String brand;
    String model;
    Engine engine;

    Car(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    void displayCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        engine.displayEngineInfo();
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Engine engine = new Engine("Petrol", 150);
        Car car = new Car("Toyota", "Corolla", engine);

        car.displayCarInfo();
    }
}