public class Containerwithmostwater {
    public static void main(String[] args) {
        int[] arr ={9,8,6,2,5,4,8,3,7};
        int maxLeft = 0;
        int maxRight = arr.length-1;
        int max  = Integer.MIN_VALUE;
        while(maxLeft < maxRight){
            int min = (arr[maxLeft] < arr[maxRight]) ? arr[maxLeft]:arr[maxRight];
            int area = (maxRight-maxLeft)*(min);

            if(max < area){
                max  = area;
            }
            if(maxLeft < maxRight){
                maxLeft++;
                continue;
            }
            maxRight--;

        }
        System.out.println("Maximum water is  "+ max);
    }
}
