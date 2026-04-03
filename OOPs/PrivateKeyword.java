import java.util.*;

class Students {
    String name;
    private int rollNo;
    double cgpa;

    void print() {
        System.out.println("Roll No: " + rollNo);
    }

    int getRollNo() { // getter
        return rollNo;
    }

    void setRollNo(int n) {  // setter
        if (n > 0) {
            rollNo = n;
        } else {
            System.out.println("Invalid Roll Number");
        }
    }
}

public class PrivateKeyword {
    public static void main(String[] args) {
        Students s1 = new Students();

        s1.name = "Raj";
        s1.cgpa = 9.8;
        s1.setRollNo(5);

        s1.print();
        System.out.println("Getter: " + s1.getRollNo());
    }
}