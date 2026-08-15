import java.util.Scanner;

public class Productwithoutstar {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        int res =product(kbrd.nextInt(),kbrd.nextInt());
        System.out.println(res);
    }

    private static int product(int num1, int num2) {
        if(num1 == 0 || num2 ==0){
            return 0;
        }
        if(num1 ==1 ){
            return num2;
        }
        if(num2 == 1){
            return num1;
        }
        return productHelper(num1,num2,0);
    }

    private static int productHelper(int num1, int num2,int val) {
        if(num2 == 0){
            return val;
        }
        return productHelper(num1,num2-1,val+num1);
    }
}
