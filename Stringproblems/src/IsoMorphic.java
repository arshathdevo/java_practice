import java.util.HashMap;

public class IsoMorphic {
    public static void main(String[] args) {
        String a = "aabbcc";
        String b = "ddeeff";
        HashMap<Character, Character> map = new HashMap<>();
        if (a.length() != b.length()) {
            System.out.println("Not an isomorphic");
            return;
        }
        int len = a.length();
        for(int i = 0;i<len;i++){
            char ach = a.charAt(i);
            char bch  = b.charAt(i);
            if (!map.containsKey(ach )) {
                if(!map.containsKey(bch) ){
                    map.put(ach, bch);
                    map.put(bch, ach);
                }
                else{
                    System.out.println("not an ispmorphic");
                    return;
                }

            }//end first if
            else{
                if(map.get(ach) == bch){
                    continue;
                }
                else{
                    System.out.println("Not an isomorphic");
                    return;
                }
            }

        }
        System.out.println("isomorphic");


    }


}
