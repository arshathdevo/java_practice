public class Spiralmatrix {
    public static void main(String[] args) {
        int[] [] arr = {{1,2,3,10}};
//                        {4,5,6,11}};
//                        {7,8,9,12},
//                        {5,6,7,8},
//                        {13,14,15,16},
//                        {21,22,23,24}    };
        int rStart = 0;
        int cStart =0;
        int rEnd = arr.length-1;
        int cEnd = arr[0].length-1;
        int row= 0;
        int col = 0;
        if(rEnd == rStart){
            for(int i = 0;i<=cEnd;i++){
                System.out.print(arr[0][i]+",");
            }
            return;
        }
        while(rStart <= rEnd && cStart <= cEnd){
            while(col <= cEnd){
                System.out.print(arr[row][col]+",");
                col++;
            }
            col--;
            row++;
            rStart++;
            while(row <= rEnd){
                System.out.print(arr[row][col]+",");
                row++;
            }
            row--;
            col--;
            cEnd--;
            while(col>=cStart){
                System.out.print(arr[row][col]+",");
                col--;

            }
            col++;
            row--;
            rEnd--;
            while(row >= rStart){
                System.out.print(arr[row][col]+",");
                row--;

            }
            row++;
            col++;
            cStart++;
        }
    }
}
