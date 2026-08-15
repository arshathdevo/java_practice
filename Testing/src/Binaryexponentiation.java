public class Binaryexponentiation {
    public static void main(String[] args) {
      long ans =  calpow(20,25);
        System.out.println(ans);
    }
//    static long calpow(long a,long b){
//        long res =1;
//        for(long i =0;i<b;i++){
//            res = (res*20)%1000000007;
//        }
//        return res;
//    }
    static long calpow(long base,long expo){
        if(expo == 0){
            return 1;
        }
        if(expo == 1){
            return base;
        }


        //process
        long half = expo/2;
        long res =1;
        if(expo%2 ==1){
            res = base;
        }
        long half_ans=calpow(base,half);
        long full = (half_ans*half_ans)%1000000007;
        return (res*full)%1000000007;

    }
}
