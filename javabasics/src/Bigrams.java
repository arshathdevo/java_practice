public class Bigrams {
    public static void main(String[] args) {
        long n = 9677359926L;
        long cp = n;
        long power=1L;
        while(cp / power != 0){
            power*=10;
        }
        power/=10;
        while(power >= 10) {
            System.out.print(cp / (power/10)+" ");
            cp = cp%power;
            power/=10;
        }


    }
}
