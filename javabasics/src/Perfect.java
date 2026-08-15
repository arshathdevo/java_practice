public class Perfect {
    public static void main(String[] args) {
        int n =2;
        int sum = 1;
        for(int i = 2;i*i<=n;i++){
            if(n%i == 0) {
                sum += i+n/i;
            }
        }
        System.out.println(sum==n ? "true":"false");
    }
}
