public  class Matrixrotation{
    public static void main(String[] args) {
        int[][] arr =  {{1,2,3},{4,5,6},{7,8,9}};
        print(arr);
        transpose(arr);
        System.out.println();
        print(arr);
        System.out.println();
        rerverse( arr);
        print(arr);
    }

    private static void rerverse(int[][] arr) {
        int len = arr.length;
        for(int row = 0;row < len;row++){
            rowReverse(arr,row);
        }
    }

    private static void print(int[][] arr) {
        for(int i[]: arr){
            for(int j : i){
                System.out.print(j+",");
            }
            System.out.println();
        }
    }

    private static void transpose(int[][] arr) {
        int i= 0;
        int j = 0;
        int len = arr.length;
        int jlen = arr[0].length;
        while(i<len) {
            while (j < jlen) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
                j++;
            }
            i++;
            j = i;
        }
    }
    public static void rowReverse(int[][] arr,int rownum){
        int len = arr[0].length;
        for(int j = 0;j<len/2;j++){
            int temp = arr[rownum][j];
            arr[rownum][j] = arr[rownum][len-j-1];
            arr[rownum][len-j-1] = temp;


        }
    }
}