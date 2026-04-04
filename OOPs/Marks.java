import java.util.*;

public class Marks {

    public static class StudentData {
        String name;
        int rollNo;
        int noOfSub;
        int[] marks;

        // Constructor 1
        StudentData(int noOfSub) {
            this.noOfSub = noOfSub;
            this.marks = new int[noOfSub];
        }

        // Constructor 2 (array input)
        StudentData(int[] marks) {
            this.noOfSub = marks.length;
            this.marks = Arrays.copyOf(marks, marks.length);
        }
    }

    public static void main(String[] args) {
        int[] arr = {45, 87, 99, 67};

        StudentData s2 = new StudentData(arr);
        StudentData s1 = new StudentData(4);

        System.out.println(arr[0]); // 45

        s1.marks[0] = 88;
        s1.marks[1] = 67;
        s1.marks[2] = 89;
        s1.marks[3] = 99;
    }
}