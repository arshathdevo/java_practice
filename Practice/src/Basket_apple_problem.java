import java.util.Arrays;
import java.util.Scanner;
public class Basket_apple_problem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("No of Baskets");
        int bas = sc.nextInt();
        int[] arr = new int[bas];
        for(int i = 0;i<bas;i++){
            System.out.println("Enter the number of apples in basket "+(i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int apple_moved =0;
        int sum = 0;
        for(int i : arr){
            sum+=i;
        }
        int avg = sum/bas;
        for(int i : arr){
            if(i < avg){
                apple_moved += avg-i;
            }
        }
        System.out.printf("No of apples moved is %d",apple_moved);
    }

}
