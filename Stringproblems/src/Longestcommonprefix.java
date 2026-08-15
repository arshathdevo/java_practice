public class Longestcommonprefix {
    public static void main(String[] args) {
        String[] arr = {"flower","flow","floght"};
        StringBuilder bld = new StringBuilder();
        int minpos=Integer.MAX_VALUE;
        if(arr.length == 0 && arr ==null ){
            System.out.println("there is no comman prefix");
            return;
        }
        for(String ind : arr){
            if(minpos > ind.length()){
                minpos = ind.length();
            }//end of if
        }//end of for
   for(int i=0;i<minpos;i++){
       char ch = arr[0].charAt(i);
       boolean negligible = false;
       for(String hay:arr){
           if(!(hay.charAt(i) == ch) ){
               negligible =  true;
               break;
           }//end of if
       }// end of inner  for
       if(negligible){
           System.out.println(bld);
           break;
       }else {
           bld.append(ch);
       }
   }
    }
}
