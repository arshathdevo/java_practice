public class StringRotation {
    public static void main(String[] args) {
String s = "abcde";
String goal = "abacde";//0 rotattion

       if(s.equals(goal) || (s.length() == goal.length()&&(s+s).contains(goal))){
           System.out.println(true);
       }
       else {
           System.out.println(false);
       }

    }
}
