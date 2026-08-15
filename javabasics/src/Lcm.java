public class Lcm {
    public static void main(String[] args) {
        int n1=12;
        int n2 = 24;
        int min = n1<n2 ? n1:n2;
        int max = (n1+n2) - min;
        System.out.println(n1*n2/gcd(min,max));
    }

    private static int gcd(int min, int max) {

        if(min == 0){
            return max;
        }
        return gcd(max%min,min);
    }
}
