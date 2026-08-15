import java.util.Scanner;

public class Triangular {
    public static void main(String[] args) {
        Scanner kbrd =new Scanner(System.in);
        boolean res = triangular(kbrd.nextInt());
        System.out.println(res);
    }
    static boolean triangular(int num){
        if(num == 1){
            return true;
        }
        return triangleHelper(num,0,0);
    }

    private static boolean triangleHelper(int num, int cur, int sum) {
        if(sum == num){
            return true;
        }
        if(sum > num){
            return false;
        }

        return triangleHelper(num,cur+1,sum+cur);
    }
}
