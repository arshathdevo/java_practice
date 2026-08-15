public class StringCompression {
    public static void main(String[] args) {
        char [] arr={'a','b','b','b','b','b','b','b','b','d','b','b','b','b','b','b','b','b','c'};
        int write = 0;
        int read ;
        int count = 0;
        for(read =0;read < arr.length;read++){
            count++;
            if( read == arr.length-1 || arr[read] != arr[read+1]){
                if(count == 1){
                    arr[write]=arr[read];
                    write++;
                    count =0;
                    continue;

                }
                if(count > 1 && count <= 9) {
                    arr[write] = arr[read];
                    write++;
                    arr[write] =(char) (count+48);
                    count = 0;
                    write++;
                }
                else if(count > 9){
                    int digit =( (int)Math.log10(count))+1;
                    int val = count;
                    arr[write] = arr[read];
                    write++;
                    while(val != 0){
                        int dig=(int)(val/(Math.pow(10,digit-1)));
                        arr[write] =(char) (dig+48);
                       val = (int)(val%(Math.pow(10,digit-1)));
                       digit--;
                        write++;

                    }
                    count = 0;


                }
                else{
                    arr[write] = arr[read];
                }
            }

        }

        for(char ch : arr){
            System.out.print(ch+",");
        }
        System.out.println();
        System.out.println(write);
    }
}
