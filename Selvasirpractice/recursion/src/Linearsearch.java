import java.util.*;
public class Linearsearch {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        int no = kbrd.nextInt();
        int[] arr =new int[no];
        for(int in =0  ;in < no;in++){
            arr[in] = kbrd.nextInt();
        }
        System.out.println("Target");
        int target = kbrd.nextInt();
        search(arr,target,0);
    }
    static void search(int[] arr,int k,int cur){
        if(cur == arr.length){
            System.out.println("Elment not found");
            return;
        }
        if(arr[cur] == k){
            System.out.println("Element found at index "+cur);
            return;
        }
        search (arr,k,cur+1);
    }
}
