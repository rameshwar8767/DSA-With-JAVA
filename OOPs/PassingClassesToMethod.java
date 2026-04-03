import java.util.*;

public class PassingClassesToMethod {

    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        int torque;

        void print(){
            System.out.println(seats+" "+ name+" "+ length+" ");
        }
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.length = 4.5;
        c.name = "Tata Punch";
        c.seats = 7;
        c.torque = 220;
        c.type = "SUV";

        change(c);
        System.out.println(c.seats);
        c.print();
    }
    
    private static void change(Car c){  // vahi wala object gaya hai pass by reference
        c.seats = 4;
    }
}
