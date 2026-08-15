//use Stringbuilder for optimisation
public class Replacedigits {
    public static void main(String[] args) {
        String org = "2026zoho";
        String res="";
        int len = org.length();
        for(char ch:org.toCharArray()){
            if(Character.isLetter(ch)){
                res +=ch;
            }
        }
        System.out.println(res);
    }
}
