public class MatrixDiagwithk {
    public static void main(String[] args) {
        int[][]  arr = {{25,2,3,1},{4,5,6,2},{7,8,9,3},{1,2,3,4}};
        int sum = 0;
        int row= arr.length;
        int col = arr[0].length;
        int colDiag = 0;
        int rowDiag = 1;
        int k = 2;
        int max = 0;
        if(k > row){
            System.out.println("k s value is greater than expected ");
            return;
        }
        while(colDiag < col && colDiag <= row-k){
            int rowAccess = 0;
            int colAccess = colDiag;
            while(colAccess < col-k+1){
                int klim = 0;
                while(klim < k){
                    sum += arr[rowAccess][colAccess];
                    rowAccess++;
                    colAccess++;
                    klim++;
                }
                if(max < sum){
                    max = sum;
                }
             //   System.out.println(sum);
                sum = 0;
                rowAccess = rowAccess-k+1;
                colAccess = colAccess-k+1;
            }
//            System.out.println(sum);
            colDiag++;
        }
      //  System.out.println("Sum 2 ");
        while(rowDiag < row && rowDiag <= row-k){
            int rowAcess  = rowDiag;
            int colAcess = 0;
            while(rowAcess < row-k+1){
                int klim = 0;
                while(klim < k ) {
                    sum += arr[rowAcess][colAcess];
                    rowAcess++;
                    colAcess++;
                    klim++;
                }
               // System.out.println(sum);
                if(max < sum){
                    max = sum;
                }
                sum = 0;
                rowAcess = rowAcess-k+1;
                colAcess = colAcess-k+1;
            }
           rowDiag++;
//            System.out.println(sum);
        }
        System.out.println(max);
    }
}
