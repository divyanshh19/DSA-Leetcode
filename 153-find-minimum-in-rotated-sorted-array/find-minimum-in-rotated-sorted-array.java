class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int n = nums.length;

        // while(left <= right){
        //     if(nums[left] <= nums[right]){
        //         return nums[left]; //for same sorted array(input)
        //     }
        //     int mid = left + (right - left)/2;

        //     int prev = (mid - 1 + n) % n;
        //     int next = (mid + 1) % n;

        //     if(nums[mid] <= nums[prev] && nums[mid] <= nums[next]){
        //         return nums[mid];     //Minimum Array Element
        //     }
        //     else if(nums[mid] >= nums[left]){
        //         left = mid + 1;
        //     } 
        //     else{
        //         right = mid - 1;
        //     }
        // }
        // return 0;
        
        //Or can do without calculating prev and next

            while(left <= right){
                int mid = left + (right - left)/2;

                if(nums[left] <= nums[right]){
                    return nums[left];
                }
                if(nums[mid] >= nums[left]){
                    left = mid + 1;
                }
                else{
                    right = mid;
                }
            }
            return nums[left];
    }
}