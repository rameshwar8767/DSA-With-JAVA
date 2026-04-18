// Encapsulation.java

class Student {
    // Private data members
    private String name;
    private int age;
    private double marks;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age!");
        }
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks!");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Setting values using setter methods
        s1.setName("Rameshwar");
        s1.setAge(21);
        s1.setMarks(85.5);

        // Getting values using getter methods
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Marks: " + s1.getMarks());
    }
}