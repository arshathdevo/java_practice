import java.util.Arrays;

public class Reverse_array {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int left  = 0;
        int right = arr.length-1;
       while(left < right){
            swap(arr,left,right);
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public  static void swap(int[] arr,int left,int right){
        arr[left] = arr[left]+arr[right];
        arr[right] = arr[left] - arr[right];
        arr[left] = arr[left] - arr[right];

    }
}
