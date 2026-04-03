import java.util.*;


class USerDefinedDataType {

    // class is a blueprint
    // object is real life entity

    public static class Student{ // Khudka ek data type banaya hai
        String name;
        int rollNo;
        double cgpa; 
    }
    public static void main(String[] args) {
        Student s1 = new Student(); // declaration
        s1.name = "Ram";
        s1.rollNo = 30;
        s1.cgpa=8.86;
        
        Student s2 = new Student(); // declaration
        s2.name = "Payal";
        s2.rollNo = 24;
        s2.cgpa=9.89;

        System.out.println(s2.name+" " + s2.rollNo + " " + s2.cgpa);
    }
}