public class Smallestpossible {
    public static void main(String[] args) {
        int num = 60053214;
        int smallest = 0;
        int countDigit =0;
        int copynum = num;
        int zerocount = 0;
        int countnonzero=1;
         for(int i = 1;i<10;i++){
            while (copynum != 0)
             {   countDigit++;
                 if (copynum % 10 == i) {
                     countnonzero *= 10;
                     smallest = smallest * 10 + i;
                     copynum /= 10;
                 } else {
                     copynum /= 10;
                 }
             }
            copynum =num;

         }
        System.out.println("smallest  "+smallest);
         countnonzero /=10;
        countDigit/=9;

         smallest = (smallest/countnonzero)*(int)(Math.pow(10,countDigit)/10)+smallest%countnonzero;
        System.out.println("digitcount  "+countDigit);
        System.out.println("Non zero elements  "+countnonzero);
       System.out.println("Smallest after addding zero  "+smallest);



//         zerocount = (int)Math.pow(10,countnonzero);
//         smallest = (smallest/(zerocount/10))*zerocount+smallest%(zerocount/10);
//        System.out.println(countnonzero);
//        System.out.println(zerocount);
//        System.out.println(countDigit);
//        System.out.println(smallest);
    }
}
