public class Longestpalindromicstring {
    public static void main(String[] args) {
        String s = "aaaaaa";
        String res = findLong(s);
        System.out.println(res);
    }
    private static String findLong(String s){
        int ind ;
        String res="";
        int left;
        int right;
        String first = "";
        String second = "";
        for(ind = 0;ind < s.length();ind++){
            left = ind;
            right = ind;
            while( left-1 > -1 && right+1 < s.length()){
                if(s.charAt(left-1) == s.charAt(right+1)){
                    left--;
                    right++;
                }
                else{
                    break;
                }
            }//end while
            first =s.substring(left,right+1);// right-left+1;
            left = ind;
            right = ind+1;
            while( right < s.length() && s.charAt(left) == s.charAt(right) && left-1 > -1 && right+1 < s.length()){
                if(s.charAt(left-1) == s.charAt(right+1)){
                    left--;
                    right++;
                }
                else{
                    break;
                }
                second = s.substring(left,right+1);
            }//end while

            if(first.length() < second.length()){
                if(res.length() < second.length()) {
                    res = second;
                }
            }
            else{
                if(res.length() < first.length()) {
                    res = first;
                }

            }
        }
        return res;
    }
}
