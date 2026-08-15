public class Pyramidpattern {
    public static void main(String[] args) {
        int n =3;
        for(int i = 1;i<n+1;i++){
            int mid = ((2*i)-1)/2;
            int copyi = i;
            for(int space =0;space<n-i;space++){
                System.out.print("  ");
            }
            for(int j =0;j<(2*i)-1;j++){
                if(j<mid){
                    System.out.print(copyi+" ");
                    copyi++;
                }
                else{
                    System.out.print(copyi+" ");
                    copyi--;
                }


            }
            System.out.println();

        }
    }
}
