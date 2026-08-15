public class Decitooct {
    public static void main(String[] args) {
        int deci = 150;
        int octal = 0;
        int pos =1;
while(deci != 0) {
    octal += pos * (deci % 8);
    deci = deci / 8;
    pos*=10;
}
        System.out.printf("(%d)8",octal);


    }
}
