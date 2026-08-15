public class setrowcolto0 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,0,5},{1,6,1}};
        boolean[] zerorow = new boolean[arr.length];
        boolean[] zerocol = new boolean[arr[0].length];
        for(int row = 0;row < arr.length;row++){
            for(int col = 0;col < arr[0].length;col++){
                if(arr[row][col] == 0){
                    zerorow[row ] = true;
                    zerocol[col] = true;
                }
            }
        }//end for

        for(int row = 0;row < arr.length;row++){

            if(zerorow[row]){
                for(int col = 0;col < arr[0].length;col++){
                    arr[row][col] = 0;

            }

        }

    }//end for

        for(int col = 0;col < arr[0].length;col++){

            if(zerocol[col]){
                for(int row = 0;row < arr.length;row++){
                    arr[row][col] = 0;

                }

            }

        }
        //end for
        for(int[] val:arr){
            for(int data:val){
                System.out.print(data+",");
            }
            System.out.println();
        }

    }
}
