public class ReplaceBit {
    public static int replaceBit(int N, int k){
        int totalBits = Integer.toBinaryString(N).length();
        int pos = totalBits - k;
        if((N & (1 << pos)) != 0){
            N = N & ~(1 << pos);
        }
        return N;
    }
    public static void main(String[] args) {
        System.out.println(replaceBit(13, 6));
    }
}
