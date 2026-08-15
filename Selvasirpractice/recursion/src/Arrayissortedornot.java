public class Arrayissortedornot {
    public static void main(String[] args) {
        int[] arr ={1,12,3,4,5,6};
        int ans = check(arr);
        System.out.println(ans);
    }
    static int check(int[] arr){
        if(arr.length == 1){
            return 1;
        }
        return checkHelper(arr,0,1);
    }
    static int checkHelper(int[] arr,int first,int second){
        if(second == arr.length){
            return 1;
        }
        if(arr[first] > arr[second]){
            return 0 ;
        }
        return checkHelper(arr,second,second+1);
    }
}
