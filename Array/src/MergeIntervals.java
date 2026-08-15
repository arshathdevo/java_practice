public class MergeIntervals {
    public static void main(String[] args) {
//       int[][] arr={{1,3},{2,6},{8,10},{15,18}};
        int [][] arr = {{5,8},{1,4},{4,6},{1,3},{2,6},{8,10},{15,18}};
//        int[][] arr={{4,5},{1,4}};
        int[][] result = merge(arr);

        System.out.println();
        for(int i [] : result){
            for(int j:i){
                System.out.print(j+",");
            }
            System.out.print("  ");
        }



    }
    public static  int[][] merge(int[][] intervals) {
        int index  = 0;
        for(int out = 0;out<intervals.length-1;out++){
            for(int in = 0;in <intervals.length-1-out;in++){
                if(intervals[in][0] > intervals[in+1][0]){
                    swap(intervals,in,in+1);

                }
            }

        }
        for(int[]  i : intervals){
            for(int j:i){
                System.out.print(j+",");
            }
            System.out.print("  ");
        }

        int[][] result = new int[intervals.length][2];
        result[0][0] = intervals[0][0];
        result[0][1] = intervals[0][1];
        int resultInd = 0;
        int intervalInd =1;
        for(int iter  = 1;iter < intervals.length;){
            while( iter < intervals.length   && result[resultInd][1] >= intervals[iter][0] ){
                if(result[resultInd][1] < intervals[iter][1]){
                    result[resultInd][1] = intervals[iter][1];
                }
                iter++;
            }//end of while
            if(iter < intervals.length) {
                resultInd++;
                result[resultInd][0] = intervals[iter][0];
                result[resultInd][1] = intervals[iter][1];
                iter++;

            }//end if


        }//end of for

       return result;

    }
    public static void swap(int[][] arr,int first,int second){
        int temp[] = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
