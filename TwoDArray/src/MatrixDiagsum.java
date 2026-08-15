public class MatrixDiagsum {
    public static void main(String[] args) {
        int[][]  arr = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        int row= arr.length;
        int col = arr[0].length;
       int colDiag = 0;
       int rowDiag = 1;
       while(colDiag < col){
           int rowAccess = 0;
           int colAccess = colDiag;

           while(rowAccess < row && colAccess < col){
               sum += arr[rowAccess][colAccess];
               rowAccess++;
               colAccess++;
           }
           System.out.println(sum);
           colDiag++;
           sum = 0;
       }
        System.out.println("Sum 2 ");
      while(rowDiag < row){
          int rowAcess  = rowDiag;
          int colAcess = 0;
          while(rowAcess < row){
              sum += arr[rowAcess][colAcess];
              rowAcess++;
              colAcess++;
          }
          rowDiag++;
          System.out.println(sum);
          sum = 0;

      }
    }
}
