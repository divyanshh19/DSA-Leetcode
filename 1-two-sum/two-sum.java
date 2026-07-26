class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            int remaining = target - nums[i];
            if(map.containsKey(remaining)){
                return new int[] {map.get(remaining),i};
            }
            map.put(nums[i],i);
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