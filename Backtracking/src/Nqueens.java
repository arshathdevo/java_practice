import java.util.Arrays;
import java.util.Scanner;

public class Nqueens {
    static int count= 0;
    public static void main(String[] args) {
        Scanner kbrd  =  new Scanner(System.in);
        int nq = kbrd.nextInt();
        nqSolver(nq);
    }

    private static void nqSolver(int nq) {
        //arms length,edge cases,valid trivia
        if(nq == 1){
            System.out.println("Solued");
            return;
        }
        if(nq < 4 ){
            System.out.println("No solution");
            return;
        }
        //set environment
        int [] pos = new int[nq];
        Arrays.fill(pos,-1);

        // cal helper
        nqHelper(pos,0,nq);
    }

    private static void nqHelper(int[] pos, int q, int nq) {

        if(q == nq){
            System.out.println("solved  "+ ++count);
            printBoard(pos,nq);
            return;

        }
        int ind ;

        for(ind = 0;ind < nq;ind++){
            if(isSafe(pos,q,ind,nq)){
                pos[q] = ind;
                nqHelper(pos,q+1,nq);
                pos[q] = -1;

            }
        }
    }

    private static void printBoard(int[] pos,int nq) {
        for(int i = 0;i <nq;i++ ){
            for(int j =0;j<nq;j++){
                if(pos[i] == j ){
                    System.out.print(" ♛ ");
                }
                else{
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isSafe(int[] pos, int q, int ind ,int nq) {
        //leftDiagonal
        int row;
        int col;
        for(row = q-1,col = ind-1;row > -1 && col>-1;col--,row--){
            if(pos[row] == col){
                return false;
            }
        }
        //upward
        for(row = q-1,col = ind;row>-1;row--){
            if(pos[row] == col){
                return false;
            }
        }
        //rightdiagonal
        for(row = q-1,col = ind+1;row > -1 && col < nq ;col++,row--){
            if(pos[row] == col){
                return false;
            }
        }
        return true;
    }
}
