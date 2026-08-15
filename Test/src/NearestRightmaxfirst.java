import java.util.Arrays;
import java.util.Stack;

public class NearestRightmaxfirst {
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        int [] arr = {5,1,4,0, 6};
        int[] res = new int[arr.length];
       int next =arr[ arr.length-1];
        int ind;
        s.push(-1);
        for(ind =arr.length-2 ;ind > -1;ind--){
            if(arr[ind] < arr[ind+1]){
                next = arr[ind+1];
            }
            if(arr[ind] < next){
                s.push(next);
            }
            else{
                next = arr[ind];
                s.push(-1);
            }
   }    int in =0;
        while(!s.isEmpty()){
            res[in++] =s.pop();
        }
        System.out.println(Arrays.toString(res));
    }
}
