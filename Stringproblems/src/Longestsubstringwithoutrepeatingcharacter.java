import java.util.HashMap;

public class Longestsubstringwithoutrepeatingcharacter {
//    public static void main(String[] args) {
//        String s = "abcad";
//        int res = 0;
//        int max = 0;
//        HashMap<Character,Integer> map = new HashMap<>();
//        int left = 0;
//       for(int i = 0;i<s.length();i++){
//           if(!map.containsKey(s.charAt(i))){
//               map.put(s.charAt(i),i);
//               max++;
//           }
//           else{
//               int lim =(int) map.get(s.charAt(i));
//               for(int j = left;j<=lim;j++){
//                   if(map.containsKey(s.charAt(j))){
//                       left++;
//                       map.remove(s.charAt(j));
//                       max--;
//                   }
//               }//forj
//           }//else
//           res = (res>max)?res:max;
//       }//for i
//        System.out.println(res);
//    }
public static void main(String[] args) {
    String s = "abcdebcadefghi";
    int max = 0;
    int left = 0;
    HashMap<Character,Integer> map = new HashMap<>();
    for(int i = 0;i<s.length();i++){
        if((map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= left)){
            left = map.get(s.charAt(i))+1;
            map.put(s.charAt(i),i);
        }
        else{
            map.put(s.charAt(i),i);
        }
        max = Math.max(max,i-left+1);
    }
    System.out.println(max);
}
}
