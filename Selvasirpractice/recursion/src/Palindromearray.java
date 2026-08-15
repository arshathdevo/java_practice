public class Palindromearray {

        public static void main(String[] args) {
            int[] arr ={1,2,23,3,2,1};
            int ans = check(arr);
            System.out.println("palindrome  "+ans);
        }
        static int check(int[] arr){
            if(arr.length == 1){
                return 1;
            }
            return checkHelper(arr,0,arr.length-1);
        }
        static int checkHelper(int[] arr,int first,int second){
            if(first > second){
                return 1;
            }
            if(arr[first] != arr[second]){
                return 0 ;
            }
            return checkHelper(arr,first+1,second-1);
        }



}
