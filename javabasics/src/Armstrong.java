import java.util.Random;

public class Armstrong {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n = Math.abs(rnd.nextInt());
        int count = 0;
        int cpnum = n;
        int sum = 0;
        while(cpnum != 0){
            cpnum = cpnum / 10;
            count++;
        }
        cpnum = n;
        while(cpnum != 0) {
            if(sum > Integer.MAX_VALUE/10){
               break;
            }
            sum += Math.pow(cpnum % 10, count);
            cpnum /= 10;
        }
        System.out.println(n);
        System.out.println(count+"   "+sum);



    }
}
