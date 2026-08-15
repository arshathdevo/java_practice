public class Matrixsum {
    public static void main(String[] args) {
        int[][]  arr = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        int iter;
        for(iter = 0;iter < arr.length;iter++){
            int row = iter;
            int col = 0;
            while(col < arr.length){
                sum += arr[row][col];
                col++;
            }
            System.out.println("Sum "+ sum);
            sum = 0;
        }
    }
}
