import java.util.Scanner;
public class Hriring_car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter r1");
        int r1 = sc.nextInt();
        System.out.println("Enter n of hours");
        int n = sc.nextInt();
        System.out.println("Enter r2");
        int r2 = sc.nextInt();
        System.out.println("Enter total minute travelled");
        double tot_hr = sc.nextInt();
        tot_hr = Math.ceil(tot_hr/60);
        System.out.println(tot_hr);
         int rup = 0;
         if(tot_hr > n){
         rup = r1*n;
         rup+=r2*((int)tot_hr-n);
         }
         else {
             rup = (int)(r1*tot_hr);
         }
        System.out.println("Total expense:"+ rup);
    }
}
