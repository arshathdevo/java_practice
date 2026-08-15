public class Reversethewords {
    public static void main(String[] args) {
        String org = "   Apple  is good for health";
        org = org.trim();
        StringBuilder bld = new StringBuilder(org);
        reverse(bld,0,org.length());
        System.out.println(bld);
        int start;
        int end= 0;
        start =0;
        int i = 0;
        while(start < org.length()) {
            while (i < org.length() &&bld.charAt(i) != ' ') {
                end++;
                i++;
            }
            reverse(bld, start, end);
            System.out.println(bld);
          //  while(bld.charAt(++end) == ' ');
            end++;

            while( end < org.length() && bld.charAt(end) == ' '){
                end++;
                i++;
                System.out.println("inspace");
            }
     start = end;
          //  end = start;
            i++;

        }
    }

    private static void reverse(StringBuilder bld, int start, int length) {

        int i ;
        int j ;
        for(i = start,j =length-1;i<j;i++,j--){
            char ch;
           ch  =  bld.charAt(i);
           bld.setCharAt(i,bld.charAt(j));
           bld.setCharAt(j,ch);
        }
    }
}
