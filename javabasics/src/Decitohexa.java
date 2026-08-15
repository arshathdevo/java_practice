public class Decitohexa {
    public static void main(String[] args) {
        int deci =26;
        String hexa = "";
        char digit;
        int remainder;
        while(deci != 0)
        {
            remainder = deci % 16;
            deci/=16;
            if (remainder < 10) {
                digit = (char) ('0' + remainder);
            } else {
                digit = (char) ('A' + (remainder - 10));
            }
            hexa = digit + hexa;
        }
        System.out.println(hexa);
    }
}
