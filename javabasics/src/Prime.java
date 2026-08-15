public class Prime {
    public static void main(String[] args) {
        int n =22;
        boolean [] arr = new boolean[n+1];
        for(int i = 2;i*i <= n;i++ ){
            for(int j = i*2;j<=n;j+=i){
                if(!arr[i]){
                    arr[j] = true;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(!arr[n]);
    }
}
