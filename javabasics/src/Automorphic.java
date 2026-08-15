public class Automorphic {
    public static void main(String[] args) {
        int n= 4;
        int sqnum =square(n);
        if(sqnum%10 == n){
            System.out.println("Automorphic");
        }
        else{
            System.out.println("not automorphic");
        }
    }

    private static int square(int n) {
        return n*n;
    }
}
