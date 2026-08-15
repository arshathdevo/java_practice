import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
class Nqueens{
    public static void main (String[] a){
        Scanner kbrd = new Scanner(System.in);
        int nq = kbrd.nextInt();
        solve(nq);
    }
    static void solve(int nq){
        if(nq<4){
            System.out.println("cannot be placed");
            return;
        }

        int [] occ = new int[nq];
        Arrays.fill(occ,-1);
        solveHelper(0,nq,occ);

    }
    static void solveHelper(int cq,int nq,int[]occ){
        if(cq == nq){
            System.out.println(cq);
            System.out.println("Queens placed");
            return;
        }
        for(int col = 0;col < nq;col++){
            if(valid(cq,col,occ,nq)){
                occ[cq] = col;
                solveHelper(cq+1,nq,occ);
                occ[cq] = -1;
            }
        }


    }
    static boolean valid(int row,int col,int[] occ,int nq){
//leftdiag
        int lrd,lcd;
        lrd = row-1;
        lcd = col-1;
        while(lrd > -1 && lcd > -1){
            if(occ[lrd] == lcd){
                return false;
            }
            lrd--;
            lcd--;
        }
//top
        lrd = row-1;
        lcd = col;
        while(lrd > -1 ){
            if(occ[lrd] == lcd){
                return false;
            }
            lrd--;
        }
//right diag
        lrd = row-1;
        lcd = col+1;
        while(lrd > -1 && lcd < nq){
            if(occ[lrd] == lcd){
                return false;
            }
            lrd++;
            lcd++;
        }


        return true;

    }


}
