public class Countgoodnumbers {
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(15));
    }
        public  static int countGoodNumbers(long input) {
            long pow = input/2;

            long res=calpow(20,pow);
            if(input %2 == 0){
                return (int)res;
            }
           else{
               return (int)res*5;
            }
        }

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
