import java.util.Arrays;

public class Rotatearray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k =2;
        rotate(reverse(arr,0,arr.length-1),k);
        System.out.println(Arrays.toString(arr));
    }
    public  static int [] reverse(int[] arr,int start,int end){
        int left = start;
        int right = end;
        int temp;
        while(left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void rotate(int[] arr,int k){
        int nod = arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k, arr.length-1);
    }
}
