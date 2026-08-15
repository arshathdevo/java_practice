public class Largestsumofsubarray {
    public static void main(String[] args) {
        int[] arr = {2,3,-1,-3,4,9};
        int presum = arr[0];
        int max  = arr[0];
        for(int iter =1;iter < arr.length;iter++){
            if(presum+arr[iter] > arr[iter]){
                presum = presum+arr[iter];
                if(max < presum){
                    max  = presum;
                }}
            else{
                presum = arr[iter];
                if(max < presum){
                    max  = presum;
                }


            }}
        System.out.println(max);}
}
