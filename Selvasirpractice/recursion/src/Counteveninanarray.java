public class Counteveninanarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,12,14};
        int count = count(arr);
        System.out.println(count);
    }
    static int count(int []arr){
        if(arr.length == 0){
            return 0;
        }
        return countHelper(arr,0,0);
    }
    static int countHelper(int[] arr,int count,int cur){
        if(cur == arr.length){
            return count;
        }
        if(arr[cur]%2 == 0){
            count++;
        }
        return countHelper(arr,count,cur+1);
    }
}
