class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre =1;
        int post =1;
        int l =nums.length;
        int[] result =new int[l];
        for(int i=0;i<l;i++){
            result[i]=1;
        }
        for(int i=0;i<l;i++){

            result[i] = pre * result[i];
            pre = pre*nums[i];
        }

        for(int i=l-1;i>= 0;i--){

            result[i] = post * result[i];
            post = nums[i]*post;

        }


        return result;
    }
}