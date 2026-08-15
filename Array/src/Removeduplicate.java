import java.util.Arrays;

public class Removeduplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int write = 1;
        int read;
        int lastseen=arr[0];
        for( read =1;read<arr.length;read++){
            if(arr[read] == lastseen){

                while(read < arr.length && arr[read] == lastseen){
                    read++;
                }
                if(read < arr.length) {
                    arr[write] = arr[read];
                    lastseen = arr[read];
                    write++;
                }
            }
            else{
                arr[write] = arr[read];
                write++;
                lastseen=arr[read];
            }


        }
        int origlen = write;
        while(write < arr.length){
            arr[write] =0;
            write++;
        }
        System.out.println("Original length after removing duplicates    "+origlen);
        System.out.println(Arrays.toString(arr));
    }
}
