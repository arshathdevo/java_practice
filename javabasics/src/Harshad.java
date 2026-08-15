public class Harshad {
    public static void main(String[] args) {
        int n =18;
        int cpnum= n;
        int sum= 0;
        while(cpnum != 0){
            sum+=cpnum%10;
            cpnum/=10;
        }
        if(n%sum == 0){
            System.out.println("harshad");
        }
        else{
            System.out.println("not harshad");
        }
    }
}
