public class Sec_lrgest {
    public static void main(String[] args) {
        int [] arr={1,5,43,23,65,7,98,98,69,32};
        int max=arr[0];
        int smax = arr[0];
        for(int ind = 1;ind < arr.length;ind++){
            if(max < arr[ind]){

                smax = max;
                max = arr[ind];
            }
            else{
                if(smax < arr[ind] && max > arr[ind]){
                    smax = arr[ind];
                }
            }
        }
        System.out.println(smax);
    }
}
