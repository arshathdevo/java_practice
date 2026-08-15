public class Fibbonacci {
        public static void main(String[] args) {
            int[] arr ={0,1,1,2,3,5,9};
            int ans = check(arr);
            System.out.println("Fibbonacci  "+ans);
        }
        static int check(int[] arr){
            if(arr.length == 1){
                if(arr[0] == 0) {
                    return 1;
                }
            }
            if(arr.length == 2){
                if(arr[0] == 0 && arr[1] == 1) {
                    return 1;
                }
            }
            return checkHelper(arr,0,1);
        }
        static int checkHelper(int[] arr,int first,int second){
            if(first == arr.length){
                return 1;
            }
            if( first < arr.length-1 && (arr[first] + arr[second]) != arr[first+1]){
                return 0 ;
            }
            return checkHelper(arr,first+1,first);
        }
}
