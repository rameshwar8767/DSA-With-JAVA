import java.util.*;

class Cricketer{
    final String country = "India";  // cannot change
    int runs;
    String name;
    double avg;
}
// static -> Sharable varibles
public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer c1 =new Cricketer();
        // c1.cou ntry = "South Africa"; Error
        System.out.println(c1.country);
    }
}
