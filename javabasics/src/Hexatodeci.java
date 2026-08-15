public class Hexatodeci {
    public static void main(String[] args) {
        String hex = "1A";
        int deci = 0;
        int pow =1;
       for(int digit = hex.length()-1;digit>=0;digit--){
           if(hex.charAt(digit) < '9'){
               deci+= (hex.charAt(digit)-48)*pow;
               pow*=16;
           }
           else{
               deci += ((hex.charAt(digit))-55)*pow;
               System.out.println((hex.charAt(digit))-55);

               pow*=16;
           }
       }
        System.out.println(deci);
    }
}
