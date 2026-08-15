import java.util.Scanner;

public class Numberofdigits {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        int digit = digCount(kbrd.nextLong());
        System.out.println(digit);
    }

    private static int digCount(long num) {
        if(num < 10){
            return 1;
        }
        return digCountHelper(num,0);

    }

    private static int digCountHelper(long num, int count) {
        if(num == 0){
            return count;
        }
        return digCountHelper(num/10,count+1);
    }
}
