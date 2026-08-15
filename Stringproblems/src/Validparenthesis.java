import java.util.Stack;

public class Validparenthesis {
    public static void main(String[] args) {
        String s ="({{[([)]]}})";
        String open = "{[(";
        String close ="}])";
        Stack<Character> ms = new Stack<>();
        for(char ch : s.toCharArray()){
            if(open.indexOf(ch) != -1){
                ms.push(ch);
            }
            else{
                if(ms.isEmpty()){
                    System.out.println("Not valid");
                    return;
                }
                char c= ms.pop();
                if(!(( ch == '}' && c == '{') || (ch == ']' && c == '[')  || (ch == ')' && c == '(' ))) {
                    System.out.println("Not valid");
                    return;
                }}
        }
        if(ms.isEmpty()) {
            System.out.println("valid parenthesis");
        }
        else{
            System.out.println("not valid");
        }
    }
}
