public class MajorityElement {
    public static void main(String[] args) {
        int [] arr = {2,2,1,3,4,5,6,2,2,2,2};
        int vote = 0;
        int oldcan = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i] == oldcan){
                vote++;
            }
            else{
                vote--;
            }
            if(vote < 1 ){
                oldcan = arr[i];
            }
        }
        System.out.println(oldcan);
    }
}
