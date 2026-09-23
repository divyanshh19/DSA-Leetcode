class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer ,Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            int required = target - nums[i];

            if(map.containsKey(required)){
                return new int[]{map.get(required) ,i};
            }
            map.put(nums[i] , i);
        }
        return null;
        // if array is sorted use the two pointer -
        // int n = nums.length;
        // int left = 0;
        // int right = nums.length - 1;
        // int sum = 0;

        // while(left < right){
        //     sum =  nums[left] + nums[right];

        //     if(sum == target){
        //         return new int[] {left,right};
        //     }else if(sum < target){
        //         left++;
        //     }else{
        //         right--;
        //     }
        // }
        // return null;
    }
}