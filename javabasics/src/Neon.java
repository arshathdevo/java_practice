public class Neon {
    public static void main(String[] args) {
        int n =12;
        int cpnum =square(n);
        int sum;
        sum =0;
        while(cpnum != 0){
            sum+=cpnum%10;
            cpnum/=10;
        }
        if(sum == n){
            System.out.println("neon");
        }
        else{
            System.out.println("not Neon");
        }
    }

    private static int square(int i) {
        return i*i;
    }
}
