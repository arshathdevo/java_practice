public class Givenasortedarrayofintegersremovealoccurrencesofagivenvalueinplace {
    public static void main(String[] args) {
        int []  arr = {1,2,2,2,2,2,3,3,3,3,4,5};
        int len = arr.length;
        int firstoccurance = -1;
        int val = 3;
        int start = 0;
        int end  = arr.length-1;
        while(start < end){
            int mid  = start+(end-start)/2;
            if(arr[mid] == val){
                end = mid;
                continue;
            }
            if(arr[mid] < val){
                start = mid+1;
            }
            else{
                end  = mid-1;
            }
        }
        if(arr[start] == val){
            len--;
            start++;
            while(arr[start] == val){
                start++;
                len--;
            }

        }
        System.out.println(len);

    }
}
