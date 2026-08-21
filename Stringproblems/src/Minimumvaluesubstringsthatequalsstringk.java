public class Minimumvaluesubstringsthatequalsstringk {
    public static void main(String[] args) {
        String s = "ACCAECBA";
        String t ="ABC";
         String ans = findSmall(s,t);
        System.out.println(ans);
    }
    private static  String findSmall(String s,String t){
        int distinct = 0;
        String res = "";
        int left = 0;
        int right ;
        int formed = 0;
        int[] target = new int[26];
        int[] window = new int[26];
        for(char ch : t.toCharArray()){
            if(target[ch - 65] == 0){
                distinct++;
            }
            target[ch - 65]++;
        }
        System.out.println(distinct);

        for(right = 0;right < s.length();right++){
            if(++window[s.charAt(right)-65] == target[s.charAt(right)-65]){

                formed++;
            }
            if(formed == distinct){

               // res = s.substring(left,right+1);

                while(formed == distinct){

                    window[s.charAt(left)-65]--;
                    if( window[s.charAt(left)-65] < target[s.charAt(left)-65]){
                        formed--;

                    }
                    left++;

                }//end while
                if(res.length()==0 || res.length() > (right-left+2)){
                    res = s.substring(left-1,right+1);
                }
                System.out.println(res);

            }//end outer if

        }
        return res;
    }
}
