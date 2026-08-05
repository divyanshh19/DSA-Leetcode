class Solution {
    public int subarraySum(int[] nums, int k) {
        //Brute force --
        // int n = nums.length;
        // int count = 0;
        // for(int i = 0;i < n;i++){
        //     int sum = 0;
        //     for(int j = i;j < n;j++){
        //         sum = sum + nums[j];
        //         if(sum == k){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        //optimal approach --
        HashMap<Integer,Integer> prefixCounter = new HashMap<>();
        prefixCounter.put(0 , 1);
        int count = 0;
        int prefixSum = 0;
        for(int n : nums){
            prefixSum += n;
            int reqSum = prefixSum - k;
            if(prefixCounter.containsKey(reqSum)){
                count += prefixCounter.get(reqSum);
            }
            prefixCounter.put(prefixSum , prefixCounter.getOrDefault(prefixSum ,0) +1);
        }
        return count;

        //Optimal solution -- only when non negative numbers are present
        // int n = nums.length;
        // int i = 0;
        // int j = 0;
        // long sum = 0;
        // int len = 0;
        // while(j < n){
        //     sum = sum + nums[j];
        //     while(i <= j && sum > k){
        //         sum = sum - nums[i];
        //         i++;
        //     }
        //     if(sum == k){
        //         len = Math.max(len , j - i + 1);
        //     }
            
        //     j++;
        // }
        // return len;
    }
}