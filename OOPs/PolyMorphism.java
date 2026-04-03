import java.util.*;

public class PolyMorphism {

    // Parent class
    static class Animal {
        void speak() {
            System.out.println("Animal speaks");
        }
    }

    // Child classes
    static class Dog extends Animal {
        @Override
        void speak() {
            System.out.println("Bhau Bhau...!");
        }
    }

    static class Cat extends Animal {
        @Override
        void speak() {
            System.out.println("Meow Meow...!");
        }
    }

    static class Lion extends Animal {
        @Override
        void speak() {
            System.out.println("GRRRR...!");
        }
    }

    static class Human extends Animal {
        @Override
        void speak() {
            System.out.println("Hello..!");
        }
    }

    public static void main(String[] args) {

        // Polymorphism 
        Animal sheru = new Dog();
        Animal mani = new Cat();
        Animal sonu = new Lion();
        Animal tommy = new Human();

        sonu.speak();
        mani.speak();
        sheru.speak();
        tommy.speak();
    }
}