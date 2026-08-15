public class Happy {
    public static void main(String[] args) {
        int n =42;
        int fast = n;
        int slow = n;
        int cpnum = n;
        int sum = 0;
        do{
            sum = 0;
            while(cpnum != 0){
                sum+=square(cpnum%10);
                cpnum /= 10;
            }
            slow = sum;
            fast = fast1(fast);
            cpnum = sum;

        }while(slow != fast);
        if(slow == 1){
            System.out.println("happy");
        }
        else{
            System.out.println("not happy");
        }
    }

    private static int fast1(int n) {
        int sum=0 ;

        for(int i = 0;i<2;i++){
            while(n != 0)
            {
                sum+=square(n%10);
                n/=10;


            }
            n=sum;
            sum = 0;
        }
        return n;
    }

    private static int square(int i) {
        return i*i;
    }
}
