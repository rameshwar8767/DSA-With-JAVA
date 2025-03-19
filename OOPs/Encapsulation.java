public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2 = new Student("Ram");
        // Student s3 = new Student(123);
        s1.name="RAm";
        s1.roll=1;
        s1.marks[0]=100;
        s1.marks[1]=99;
        s1.marks[2]=56;
        Student s2 = new Student(s1);
        s2.password=12345;
        s1.marks[2]=100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
        // Student s4 = new Student("Ram", 1);
    }
}

class Student{
    String name;
    int roll;
    int password;
    int marks[];
    Student(){
        System.out.println("Constructor is called");
    }
    Student(String name){
        this.name=name;
    }

    // //shallow copy constructor 
    // Student(Student s1){
    //     this.name = s1.name;
    //     this.roll=s1.roll;
    // }

    //Deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i< marks.length; i++){
            this.marks[i]=s1.marks[i];
        }

    }

    Student(int roll){
        this.roll=roll;
    }
}
