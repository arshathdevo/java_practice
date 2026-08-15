public class Arraysorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,6,6,7,7,7,8,9,};
        int ind  =0;
        while(ind < arr.length-1){
            if(arr[ind] <= arr[ind+1]){
                ind++;
                continue;

            }
            System.out.println("not sorted");
            return;


        }
        System.out.println("sorted");
    }
}
