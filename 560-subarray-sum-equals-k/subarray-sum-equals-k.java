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
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0 , 1);
        int prefSum = 0;
        int cnt = 0;
        int n = nums.length;
        int i = 0;

        for(i = 0;i < n;i++){
            prefSum += nums[i];
            int remove = prefSum - k;

            if(map.containsKey(remove)){
                cnt = cnt + map.get(remove);
            }
            map.put(prefSum , map.getOrDefault(prefSum, 0) + 1);
        }
        return cnt;

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