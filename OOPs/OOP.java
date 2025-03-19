public class OOP {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue"); 
        // System.out.println(p1.color);
        p1.setTip(5);
        p1.getColor();
        // System.out.println(p1.tip);
        // p1.color = "Yellow";
        // p1.tip = 10;

        BankAccount BA = new BankAccount();
        BA.username = "Ram";
        // BA.password = "177899";
        BA.setPassword("123456");
        System.out.println(BA.username);
    }
}
class Pen{
    private String color ;
    private int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        color = newColor;
    }


    void setTip (int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword (String pwd){
        password = pwd;
    }
}