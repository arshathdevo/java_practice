import java.util.Scanner;

public class Recursivecodetoprint7smultipletillinput {
    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        print(1,kbrd.nextInt());
    }
    public static void print(int cur,int lim){
        if(cur > lim){
            return;
        }
        System.out.println(7*cur);
        print(cur+1,lim);
    }
}
