import java.util.*;

public class Constructor {

    public static class Car {
        int seats;
        String name;
        double length;

        // Default constructor (constructor chaining)
        Car() {
            this(0, "Unknown", 0.0);
        }

        // Parameterized constructor
        Car(int seats, String name, double length) {
            this.seats = seats;
            this.name = name;
            this.length = length;
        }

        void print() {
            System.out.println(seats + " " + name + " " + length);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(7, "Audi", 3.9);
        Car c2 = new Car();

        c1.print();
        c2.print();
    }
}