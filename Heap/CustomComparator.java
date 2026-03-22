import java.util.*;
public class CustomComparator {

    static class Student implements Comparable<Student>{
        String name;
        int rollNo;
        double cgpa;

        Student(String name,int rollNo,double cgpa){
            this.name = name;
            this.rollNo = rollNo;
            this.cgpa  = cgpa;
        }
        public int compareTo(Student s){
            return Double.compare(this.cgpa, s.cgpa);
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("Ram", 2, 8.45);
        Student s2 = new Student("Vishal", 3, 6.34);
        Student s3 = new Student("Aditya", 5, 9.64);
        Student s4 = new Student("Om", 1, 9.34);
        Student s5 = new Student("Satish", 8, 7.65);

        Student[] arr = {s1,s2,s3,s4,s5};
        Arrays.sort(arr);

        for (Student student : arr) {
            System.out.println(student.name+ " " + student.rollNo + " "+student.cgpa );
        }
    }
}