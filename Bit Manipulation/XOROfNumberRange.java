public class XOROfNumberRange {

    // GFG
    public static int xor(int n) {
        if (n % 4 == 0) return n;
        else if (n % 4 == 1) return 1;
        else if (n % 4 == 2) return n + 1;
        else return 0;
    }

    public static int findXOR(int l, int r) {
        return xor(l - 1) ^ xor(r);
    }

    public static void main(String[] args) {
        int l = 4;
        int r = 8;

        int result = findXOR(l, r);

        System.out.println("Left Range : " + l);
        System.out.println("Right Range: " + r);
        System.out.println("XOR from " + l + " to " + r + " = " + result);
    }
}