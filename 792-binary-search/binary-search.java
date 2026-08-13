//iterative approach
class Solution {
    public int search(int[] nums, int target) {
        //binary search approach
        // int left = 0 ,right = nums.length -1;
        // while(left <= right){
        //     int mid = (left + right)/2;
        //     if(target == nums[mid]){
        //         return mid;
        //     }
        //     else if(target < nums[mid])
        //     {
        //         left = left;
        //         right = mid -1;
        //     }
        //     else
        //     {
        //         right = right;
        //         left = mid + 1;
        //     }
        // }
        // return -1;

        //Recursive approach

        return helper(nums , target, 0 ,nums.length - 1);
    }
    public int helper(int[] nums, int target, int start,int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target){
            return helper(nums, target, mid + 1,end);
        }
        return helper(nums, target, start, mid - 1);
    }
}

