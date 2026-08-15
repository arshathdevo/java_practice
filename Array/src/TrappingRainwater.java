import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class TrappingRainwater {
    public static void main(String[] args) {
        //int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] arr={4,2,0,3,2,5};
        Stack<Integer> large = new Stack<>();
        large.push(arr[arr.length-1]);
        for(int ind = arr.length-3;ind > 0;ind--){
            int max = Math.max(large.peek(),arr[ind+1]);
            large.push(max);
        }
        int size  = large.size();
//        for(int i = 0;i<size;i++){
//            System.out.print(large.get(i)+",");
//        }

        int tWater = 0;
        int lmax = arr[0];
        for(int i =1;i<arr.length-1;i++){
            int min = Math.min(lmax,large.peek());
            tWater +=Math.max(0,min-arr[i]);
            large.pop();
            lmax =  Math.max(lmax,arr[i]);
        }
        System.out.println(tWater);
    }

}


//import java.util.Stack;
//
//public class TrappingRainwater {
//    public static void main(String[] args) {
//        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
//        Stack<Integer> large = new Stack<>();
//        large.push(arr[arr.length-1]);
//        for(int ind  =  arr.length-2;ind > 1;ind--){
//            large.push(Math.max(large.peek(),arr[ind]));
//
//        }
//        int tWater = 0;
//        int lmax  = arr[0];
//        for(int i =1;i < arr.length-1;i++){
//            int min = Math.min(lmax,large.peek());
//            tWater += Math.max(0,min-arr[i]);
//            large.pop();
//            lmax  = Math.max(lmax,arr[i]);
//        }
//        System.out.println(tWater);
//    }
//
//}

