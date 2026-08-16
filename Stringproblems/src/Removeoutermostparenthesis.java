public class Removeoutermostparenthesis {
    public static void main(String[] args) {
        String res = removeOuterParentheses("(()())(())(()(()))");
        System.out.println(res);
    }
    public static String removeOuterParentheses(String s) {
       int octr = 0;
       int cctr = 0;
       int si = 0;
       int ind;
       StringBuilder bd = new StringBuilder();
        for(ind = 0;ind < s.length();ind++){
            if(s.charAt(ind) == '('){
                octr++;
            }
            else{
                cctr++;
            }
            if(octr == cctr){
                octr = cctr =0;
                int i;
                for( i = si+1;i<ind;i++){
                 bd.append(s.charAt(i));
                }
                si = i+1;
            }
        }
return bd.toString();
    }
}
