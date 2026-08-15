import java.util.Random;

public class Palindrome {
    public static void main(String[] args) {
        Random rnd  = new Random();
        int ogNum = rnd.nextInt();
        int cpnum;
        int rem = 0;
        if(ogNum < 0){
            ogNum=-(ogNum);
        }
//        ogNum = 1234554321;
        cpnum = ogNum;
        while(cpnum != 0)
        {   if(rem  > Integer.MAX_VALUE/10){
            rem = 0;
            cpnum = 0;


        }else {
            rem = rem * 10 + cpnum % 10;

            cpnum = cpnum / 10;
        }
        }
        System.out.println(ogNum);
        System.out.println(rem);
        if(rem == ogNum){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
}
