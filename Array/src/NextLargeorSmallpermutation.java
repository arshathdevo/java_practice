import java.util.Arrays;

public class NextLargeorSmallpermutation {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1};
        int index  = -1;
        int last  = arr.length-1;
        while(last > 0){
            if(arr[last] > arr[last-1]){
                index = last;
                break;
            }
            last--;
        }
        if(index != -1){
            int temp = arr[index];
            arr[index] = arr[index-1];
            arr[index-1] = temp;
        }
        else{
            reverse(arr);
        }
        System.out.println(Arrays.toString(arr));
    }
    public  static  void reverse(int[] arr){
        int i = 0;
        int j =arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
