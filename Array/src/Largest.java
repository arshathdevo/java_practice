public class Largest {
    public static void main(String[] args) {
        int[] arr = {15};
        int max  = arr[0];
        for(int val =1;val<arr.length;val++){
            if(max < arr[val]){
                max = arr[val];
            }
        }
        System.out.println(max);
    }
}
