import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        int num = kbrd.nextInt();
        int sum = sumof(num);
        if(sum == num){
            System.out.println("perfect");
        }
        else {
            System.out.println("imperfect");
        }
    }
    static int sumof(int num){
        if(num == 1){
            return num;
        }
        return  sumHelper(num,(int)Math.sqrt(num),1,0);
    }
    static int sumHelper(int num,int range,int cur,int sum){
        if(cur > range){
            return sum;
        }
        //System.out.println(cur);
        if(num%cur == 0){

            sum += cur;
            if((num/cur) != num && (num/cur) != cur) {
                //   System.out.println(cur);
                sum += num / cur;
            }
        }
        return sumHelper(num,range,cur+1,sum);
    }
}
