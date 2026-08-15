import java.util.Random;
public class Countdigit {
    public static void main(String[] args) {
        Random rnd = new Random();
        int orig_n = rnd.nextInt();
        int count_digit=0;
        int rem ;
        int n =orig_n;
        if(n < 0){
            n = -(n);
        }
        while(n != 0)
        {
            rem = n % 10;
            n = n / 10;
            count_digit++;
        }
        System.out.println(orig_n);
        System.out.println(count_digit);
    }
}
