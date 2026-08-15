public class Reverseaddpalindrome {
    public static void main(String[] args) {
        long n = 265;
        long rem = 0;
        long rev = reverse(n);
        while(true){
            n = rev+n;
            rev = reverse(n);

            if(rev == n){
                System.out.println(rev);
                return;
            }
            else if(n > Integer.MAX_VALUE){
                System.out.println("no palindrome");
                return;

            }

           }
    }

    private static long reverse(long n) {
        long rem=0;
        while(n != 0) {
            rem = rem * 10 + (n % 10);
            n = n / 10;
        }
        return  rem;
    }
}
