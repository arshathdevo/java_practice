public class Factor {
    public static void main(String[] args) {
        int n =63;
        for(int i =1;i*i <= n;i++){
            if(n%i == 0){
                System.out.print(i+"*"+n/i+"  ");
            }
        }
    }
}
