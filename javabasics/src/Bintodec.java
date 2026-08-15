public class Bintodec {
    public static void main(String[] args) {
        int b = 11101;
        int deci = 0;
        int pow = 1;
        while(b != 0) {
            deci += (b % 10) * pow;
            pow *= 2;
            b /= 10;
        }

        System.out.println(deci);
    }
}
