import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner kbrd =  new Scanner(System.in);
        int n= kbrd.nextInt();
       int res = factorial(n);
        System.out.println(res);
    }
    static  int factorial(int num){
        if(num == 1){
            return 1;
        }
        return num * factorial(num-1);
    }
}
