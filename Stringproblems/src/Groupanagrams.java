import java.util.*;

public class Groupanagrams {
    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        HashMap<String,ArrayList<String>> has = group(arr);
        System.out.println(has.values());
      Collection<ArrayList<String>> str = has.values();
    }
    private static HashMap<String, ArrayList<String>> group(String[] arr) {
        HashMap<String ,ArrayList<String>> grp = new HashMap<>();
        for(String s : arr){
           String sorted =  sortString(s);
           if(grp.containsKey(sorted)){
               grp.get(sorted).add(s);
           }
           else{
               ArrayList<String> lis = new ArrayList<>();
               lis.add(s);
               grp.put(sorted,lis);
           }
        }
        return grp;
    }
    private static String sortString(String s) {
        char[] arr = new char[s.length()];
        int ind =0;
        for(char c : s.toCharArray()){
            arr[ind++] =c;
        }
        int i;
        int j;
        for(i = 1;i<arr.length;i++){
            j =i-1;
            char ch = arr[i];
            while(j > -1 && arr[j] > ch){
                arr[j+1] = arr[j];
                j--;
            }
            j++;
            arr[j] = ch;
        }
        StringBuilder res = new StringBuilder();
        for(char ch : arr){
            res.append(ch);
    }
        return res.toString();
}}
