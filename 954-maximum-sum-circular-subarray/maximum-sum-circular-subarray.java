class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currentMax = 0;
        int maxSum = nums[0];
        int currentMin = 0;
        int minSum = nums[0];
        int totalSum = 0;
        
        for(int i = 0;i < nums.length;i++){
            currentMax = Math.max(nums[i] , currentMax + nums[i]);
            maxSum = Math.max(maxSum , currentMax);

            currentMin = Math.min(nums[i] , currentMin + nums[i]);
            minSum = Math.min(minSum , currentMin);

            totalSum += nums[i];
        }
        if(maxSum < 0){
            return maxSum;
        }else{
            return Math.max(maxSum , totalSum - minSum);
        }
    }
}