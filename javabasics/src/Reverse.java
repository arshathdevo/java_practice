import java.util.Random;

public class Reverse {
    public static void main(String[] args) {
        Random rnd  = new Random();
        int ogNum = rnd.nextInt();
        int cpnum;
        int rem = 0;
        if(ogNum < 0){
            ogNum=-(ogNum);
        }
        cpnum = ogNum;
        while(cpnum != 0)
        {   if(rem  > Integer.MAX_VALUE/10){
            System.out.println(ogNum);
            System.out.println(0);
            return;
        }
            rem = rem * 10 + cpnum % 10;

            cpnum = cpnum / 10;
        }
        System.out.println(ogNum);
        System.out.println(rem);
    }
}
