public class Strong {
    public static void main(String[] args) {
        int n = 15;
        int sum =0;
        int copynum = n;
        int[] fact = new int[10];
        fact[0] =1;
        for(int i = 1;i<=9;i++){
            fact[i]=i*fact[i-1];
        }
        while(copynum != 0){
            sum+=fact[copynum%10];
            copynum/=10;
        }
        System.out.println(sum == n ? "strong number":"not strong");
    }
}
