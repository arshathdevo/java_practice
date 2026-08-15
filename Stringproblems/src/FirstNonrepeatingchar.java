import java.util.HashMap;

public class FirstNonrepeatingchar {
    public static void main(String[] args) {
        String s = "aabaaacb";
        HashMap<Character,Integer> map =  new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : s.toCharArray()){
            if(map.get(ch) == 1){
                System.out.println(ch);
                break;
            }
          //  map.put(ch,map.getOrDefault(ch,0)+1);
        }


    }
}
