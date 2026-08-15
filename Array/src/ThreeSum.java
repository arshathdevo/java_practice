import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr= {-1,0,1,2,-1,-4};

        System.out.println("Before sorting  "+ Arrays.toString(arr));
        sort(arr);
        System.out.println("After sorting  "+ Arrays.toString(arr));

      List<List<Integer>> res  =  findSumZero(arr);
        System.out.println(res);

    }

    private static List<List<Integer>> findSumZero(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        int second =1;
        int third = arr.length-1;
        for(int first = 0;first < arr.length-2;first++){
            second = first+1;
            third = arr.length-1;
            if(first > 0 && arr[first] == arr[first-1]){
                continue;
            }
            while(second < third){
                int sum = arr[first]+arr[second]+arr[third];
                if(sum == 0){
                    res.add(Arrays.asList(arr[first],arr[second],arr[third]));
                    second++;
                    third--;
                    while(second < third && arr[second] == arr[second-1]){
                        second++;
                    }
                    while(third > second && arr[third] == arr[third+1]){
                        third--;
                    }
                }
                else if(sum < 0){
                    second++;
                }
                else{
                    third--;
                }
            }




        }
        return res;

    }

    public  static void sort(int [] arr){
      int iter;
      int len = arr.length;
      for(iter =1;iter < len;iter++){
          int key = arr[iter];
          int j = iter-1;
          while( j != -1  && arr[j] > key  ){
              arr[j+1] = arr[j];
              j--;
          }
          j++;
          arr[j] = key;
      }
    }
}
