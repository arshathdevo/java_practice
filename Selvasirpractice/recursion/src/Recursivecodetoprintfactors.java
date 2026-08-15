import java.util.*;
public class Recursivecodetoprintfactors {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        print(kbrd.nextInt());

    }
    public  static void print(int num){
        if(num < 2){
            System.out.println(num);
            return;
        }
        printf(1,num/2,num);
    }
    public static void printf(int factor,int num,int org){
        if(factor > num){
            return;
        }
        if(org%factor == 0){
            System.out.println(factor);

        }
        printf(factor+1,num,org);

    }
}
