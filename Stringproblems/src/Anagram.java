public class Anagram {
    public static void main(String[] args) {
        String s  = "siqilene";
        String s1 = "liisten";
        int[] arr = new int[26];
        if(s1.length() != s.length()){
            System.out.println("Not an anagram");
            return;
        }
        for(char c : s.toCharArray()){
            arr[c-97] ++;

        }
        for(char c : s1.toCharArray()){
            arr[c-97] --;
            if(arr[c-97] == -1){
                System.out.println("Not an anagram");
                return;
            }
        }
//        for(int val : arr){
//            if(val != 0){
//                System.out.println("Not an anagram");
//                return;
//            }
//        }
        System.out.println("Anagram");

    }
}
