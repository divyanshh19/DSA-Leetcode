class Solution {
    public int maxProduct(int[] nums) {
        int minSum = nums[0];
        int ans = nums[0];
        int maxSum = nums[0];

        for(int i = 1;i < nums.length;i++){
            if(nums[i] < 0){
                int temp = maxSum;
                maxSum = minSum;
                minSum = temp;
            }
            maxSum = Math.max(nums[i] , nums[i] * maxSum);
            minSum = Math.min(nums[i] , nums[i] * minSum);

            ans = Math.max(ans , maxSum);
        }
        return ans;
    }
}