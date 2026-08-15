public class Gcd {
//    public static void main(String[] args) {
//        int n1 = 12;
//        int n2 =564;
//        int min = (n1>n2) ? n2:n1;
//        int gcd =1;
//        for(int i =1;i<=min;i++){
//            if(n1 % i == 0 && n2 % i == 0){
//                gcd = i;
//            }
//        }
//        System.out.println("gcd is "+gcd);
//    }

    public static void main(String[] args) {
        int n1=32;
        int n2 = 56;
        int min = n1<n2 ? n1:n2;
        int max = (n1+n2) - min;
        System.out.println(gcd(min,max));
    }

    private static int gcd(int min, int max) {
        int gcd =1;
        if(min == 0){
            return max;
        }
        return gcd(max%min,min);
    }
}
