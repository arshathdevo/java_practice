public class Sumofelementsinanarray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8};
        int res = sumAll(arr);
        System.out.println(res);
    }
    static int sumAll(int[] arr){
        if(arr.length == 1){
            return arr[0];
        }
        return sumAllHelper(arr,0,0);
    }
    static  int sumAllHelper(int[] arr,int cur,int sum){
        if(cur == arr.length){
            return sum;
        }
        return sumAllHelper(arr,cur+1,(sum+arr[cur]));
    }
}
