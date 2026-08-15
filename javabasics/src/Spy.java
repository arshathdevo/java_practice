public class Spy {
    public static void main(String[] args) {
        int n =11125;
        int prod =1;
        int sum = 0;
        while(n != 0){
            int val = n%10;
            sum+=val;
            prod*=val;
            n/=10;
        }
        if(prod == sum){
            System.out.println("spy");
        }
        else{
            System.out.println("not spy");
        }
    }
}
