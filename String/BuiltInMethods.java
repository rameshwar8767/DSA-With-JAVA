public class BuiltInMethods {
    public static void main(String[] args) {
        String s = "Rameshwar mane";
        // System.out.println(s.indexOf('m'));
        // System.out.println(s.lastIndexOf('y'));

        // System.out.println(s.contains("shw"));

        System.out.println(s.startsWith("Ram"));

        // System.out.println(s.endsWith("Ram"));

        //lexoGraphically comparision of two string


        // 1. lexographically smaller
        // ram ,seeta -> ram < seeta like dictionary

        String str1 = "ABC";
        String str2 = "Raj";

        System.out.println((str2.compareTo(str1)));

        System.out.println();
    }
}
