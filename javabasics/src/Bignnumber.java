import java.util.Scanner;
public class Bignnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Enter q if need to quit");
        char c = sc.next().charAt(0);
        int max  = n;
//        System.out.println(n);
       while(Character.toLowerCase(c) != 'q'  ){

           System.out.println("Enter number");
            n = sc.nextInt();
           System.out.println("Enter q if need to quit");
            c = sc.next().charAt(0);
            if(max < n){
                max = n;
            }
       }
        System.out.println(max);
    }
}
