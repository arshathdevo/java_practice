public class Numisapowofanothernum {
    public static void main(String[] args) {
        int num1 =1024;
        int num2 =2;
       int ans =  checkPow(num1,num2,num2);
        System.out.println(ans);
    }
    static int checkPow(int n1,int n2,int curVal){
        if (curVal > n1) {
            return 0;

        }
        if(curVal == n1){
            return 1;
        }
       return checkPow(n1,n2,curVal*n2);

    }
}
