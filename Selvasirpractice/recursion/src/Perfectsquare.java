import java.util.Scanner;

public class Perfectsquare {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        perfect(kbrd.nextInt());
    }
    private static void perfect(int num) {
       if(num < 4){
           System.out.println(0);
           return;
       }
       perfects(num,2);
    }
    private static void perfects(int num, int cur) {
        if((cur * cur)== num){
            System.out.println(1);
            return;
        }
        if((cur * cur) > num){
            System.out.println("0");
            return;
        }
        perfects(num,cur+1);
    }
}
