public class LargestNuminanarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,57,6,7,8,9,10};
        int largest = largeFinder(arr);
        System.out.println(largest);
    }
    static  int largeFinder(int[] arr){
        if(arr.length == 1){
            return arr[0];
        }
        return largeFinderHelper(arr,arr[0],1);
    }
    static  int largeFinderHelper(int[] arr,int large,int cur){
        if(cur == arr.length){
            return large;
        }
        if(large < arr[cur]){
            large =arr[cur];
        }
        return largeFinderHelper(arr,large,cur+1);
    }
}
