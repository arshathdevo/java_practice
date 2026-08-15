import java.util.Scanner;

public class Powercalculation {
    public static void main(String[] args) {
        Scanner kbrd =new Scanner(System.in);
        System.out.println("base :");
        int base = kbrd.nextInt();
        System.out.println("expo :");
        int expo = kbrd.nextInt();
       int res = calcpow(base,expo);
        System.out.println(res);

    }

    private static int calcpow(int base, int expo) {
        if(expo == 1 || base == 1){
            return base;

        }
        return calcpowHelper(base,expo,1);
    }

    private static int calcpowHelper(int base, int expo,int val) {
        if(expo == 0){
            return val;
        }
        return calcpowHelper(base,expo-1,val*base);
    }

}
