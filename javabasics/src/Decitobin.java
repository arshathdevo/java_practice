public class Decitobin {
    public static void main(String[] args) {
        int n = 13;
        int binary =0;
        int pos =1;
        while(n != 0){
            binary +=  (pos*(n%2));
            n = n/2;
            pos*=10;
        }
        System.out.println(binary);
    }
}
