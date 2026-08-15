import java.util.LinkedList;
import java.util.Queue;

public class Maximuminawindow {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int k =3;
        int start = 0;
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int[] res = new int[10];
        int max = Integer.MIN_VALUE;
        while(k!=start){
            max=Math.max(max,arr[start]);
            q.offer(arr[start]);
            start++;
            }
        System.out.println(max);
        for(int i = k;i<arr.length;i++){
            int polval = q.poll();
            if(arr[i] > max){
                max = arr[i];
            }
            else if(max == polval){
                max = arr[i];
                for(int j =0;j<k;j++){
                    int offval = q.poll();
                    if(offval > max){
                        max = offval;
                    }
                    q.offer(offval);
                }
            }
            else{
                q.offer(arr[i]);
            }
            System.out.println(max);
        }
    }
}
