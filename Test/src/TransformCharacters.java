import java.util.Arrays;

public class TransformCharacters {
    public static void main(String[] args) {
        char[] arr ={'a','b','E','z','i'};

       int ans =  transform(arr);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
    }
    static String vows="aeiou";
    static String vowc="AEIOU";

    private static int transform(char[] arr) {
        return transformHelper(arr,0,0);
    }

    private static int transformHelper(char[] arr, int ind, int count) {
        if(ind == arr.length){
            return count;
        }
        char c = arr[ind];
       if(vows.indexOf(c)!= -1)
        {
            arr[ind] =(char)(arr[ind]-32);
            count++;
            ind++;
        }
       else if(vowc.indexOf(c) != -1){
           ind++;
       }
       else{
           int con = arr[ind]+1;
           if(con == 123){
               arr[ind] = 'a';

           }
           else{
               arr[ind] = (char)con;
           }
           ind++;
       }
       return transformHelper(arr,ind,count);
    }
}
