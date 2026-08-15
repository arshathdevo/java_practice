import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int tot = (2*n)-1;
        int val;

        for(int  i = 0;i<tot;i++){
            for(int j = 0;j<tot;j++)
            {
                int left = j;
                int top = i;
                int right = tot-j-1;
                int bottom = tot-i-1;
                val = Math.min(j,Math.min(i,Math.min(right,bottom)));
                System.out.print(n-val+" ");
            }
            System.out.println();
        }
    }
}
