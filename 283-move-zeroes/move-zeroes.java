class Solution {
    public void moveZeroes(int[] nums) {
    //     int insertPos = 0;

        
    //     for (int num : nums) {
    //         if (num != 0) {
    //             nums[insertPos++] = num;//non zero elements ko aage kr rhe
    //         }
    //     }

        
    //     while (insertPos < nums.length) {
    //         nums[insertPos++] = 0;// bache hue index ko zero se fill kro
    //     }
    // int left = 0;
    // int right = 0;

    // for(right =0;right <nums.length;right++){
    //     if(nums[right] != 0){
    //         //swap the 1 with left pointer(0)
    //         int temp = nums[left];
    //         nums[left] = nums[right];
    //         nums[right] = temp;
    //         left++;
    //     }
    // }
        int j = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++; 
            }
        }
    }
}
