import java.util.Arrays;

public class Check {
    public static void main(String[] args) {
//        int n  = 455555555;
//        System.out.println(n*10);
//        String s ="we";
//        s='r'+s;
//        System.out.println(s);
        int[][] arr ={{1,2},{2,3},{3,4},{5,6}};
        int[] a = arr[0];
        int temp[] = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.println(Arrays.toString(arr[0]));
        for(int[] i:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.print("    ");
        }
        System.out.println(Arrays.toString(arr));
    }
}
