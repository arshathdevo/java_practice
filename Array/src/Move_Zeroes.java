import java.util.Arrays;

public class Move_Zeroes {
    public static void main(String[] args) {
        int [] arr = {1,2,3,90,0,0,5};
        int nlen = arr.length;
        int right = 0;
        for(int iter = 0;iter<nlen-right;){
            while(arr[iter] == 0 && right < nlen-1 ){
                shift(arr,iter);
                right++;
            }
            iter++;
        }
        System.out.println(Arrays.toString(arr));


    }
    public static void shift(int[] arr,int start){
        while(start < arr.length-1){
            arr[start] = arr[start+1];
            start++;
        }
        arr[arr.length-1] = 0;



    }
}
