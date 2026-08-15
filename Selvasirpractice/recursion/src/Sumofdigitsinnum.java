import java.util.Scanner;

public class Sumofdigitsinnum {



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

        private static int digCountHelper(long num, int sum) {
            if(num == 0){
                return sum;
            }
            sum += num%10;
            return digCountHelper(num/10,sum);
        }


}
