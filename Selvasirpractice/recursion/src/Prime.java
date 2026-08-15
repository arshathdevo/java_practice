public class Prime {
    public static void main(String[] args) {
        int num = 11;
        int ans = check(num);
        System.out.println("prime check "+ans);
    }
    private static int check(int num) {
        if(num < 2){
            return 0;
        }
        if(num %2 ==0){
            return 0;
        }
        return checkHelper(num,2);
    }
    static int checkHelper(int num,int fact){
        if(fact * fact > num){
            return 1;
        }
        if(num % fact == 0){
            return 0;
        }
        return checkHelper(num,fact+1);
    }
}
