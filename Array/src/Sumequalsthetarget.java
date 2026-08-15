public class Sumequalsthetarget {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target  = 1;
        for(int first = 0;first<arr.length-1;first++){
            for(int end = first+1;end < arr.length;end++){
                if((arr[first] + arr[end]) == target){
                    System.out.println("True");
                    return;
                }
            }
        }
        System.out.println("false");
    }
}
