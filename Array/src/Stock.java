public class Stock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,2,9,0,6};
        int maxprofit = 0;
        int min =arr[0];
        int day =1;
        while(day < arr.length){
            if(arr[day] < min){
                min=arr[day];
                day++;
            }
            else{
                maxprofit = (arr[day] - min) > maxprofit?arr[day] - min:maxprofit;
                day++;
            }

        }
        System.out.println(maxprofit);
    }
}
