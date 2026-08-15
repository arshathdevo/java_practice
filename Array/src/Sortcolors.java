import java.util.Arrays;

public class Sortcolors {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,0,1,2,1,1,1,2,0,0};
        int low  = 0;
        int mid  = 0;
        int high = arr.length-1;
double btime = System.currentTimeMillis();
        while(mid <= high){
            if(arr[mid] == 0 && mid != low){
                swap(arr,low,mid);
                mid++;
                low++;

            } else if (arr[mid] == 1) {
                mid++;

            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
        double atime = System.currentTimeMillis();
        System.out.println("Execution time %.4f  "+ (atime-btime));
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr,int f,int e) {
        int temp  = arr[f];
        arr[f] = arr[e];
        arr[e] =temp;

    }
}
