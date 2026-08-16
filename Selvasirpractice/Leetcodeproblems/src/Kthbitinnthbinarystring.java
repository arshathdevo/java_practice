public class Kthbitinnthbinarystring {
    public static void main(String[] args) {
        calcBit(2);
    }

    private static void calcBit(int k) {
        long input = k-1;
        long pow = 1;
        while(pow <= k){
            pow = pow*2;
        }
        long mid, gap;
       long ctr =0;
        while(input > 0){
            pow =pow/2;
            mid = pow-1;
            if(mid == input){
                break;
            }
            if(input-mid  >= 0){
                gap = input-mid;
                input = mid - gap;
                ctr++;

            }

        }
        int bit ;
        if(ctr%2==0)
        {
            if(input==0) bit=0;
            else bit =1;
        }
        else
        {
            if(input==0) bit =1;
            else bit =0;
        }
        System.out.println(bit);

    }
}
