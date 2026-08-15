public class StringCompressionforcontinuouselements {
    public static void main(String[] args) {
        char [] arr={'a','b','b','b','b','b','b','b','b','b','b','b'};
        int[] fre = new int[26];
        for(char ch : arr){
            fre[ch-97]++;
        }
        int length =0;
        for(int a : fre){
          //  System.out.println(a);
            if(a > 0){
                length++;
                if(a != 1){
                int val = a;
                while(val != 0){
                    length++;
                    val/=10;
                }}

            }
        }
        System.out.println(length);
    }
}
