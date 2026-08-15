import java.util.Scanner;

public class Minepoly {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int base  = sc.nextInt();
        polyd(base);
    }

    private static void polyd(int base) {
        if((base&1) == 1){
            return;
        }
        //set the environment
        boolean [] used  = new boolean[base];
        pdHelper(used,base,0,1);
    }

    private static void pdHelper(boolean[] used, int base, int cur, int pos) {
        if(pos == base){
            System.out.println(cur);
            return;
        }

        int myVal =0;
        int ind ;
        for(ind =1 ;ind < base;ind++){
            if(!used[ind] ){
                myVal = (cur*base)+ind;
                if(myVal%pos == 0){
                    used[ind] = true;
                    pdHelper(used,base,myVal,pos+1);
                    used[ind] = false;
                }
            }
        }


    }
}
