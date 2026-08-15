import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int d=n-1;
        int temp = 0;
        for(int i = 1;i<=n;i++){
            d = n-1;
            temp = i;
            System.out.print(i+" ");
            for(int j = 1;j < i;j++){
                temp = temp + d;
                System.out.print(temp+" ");
                d--;
            }
            System.out.println();

        }
    }
}
