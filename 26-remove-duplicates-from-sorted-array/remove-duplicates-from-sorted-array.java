class Solution {
    public int removeDuplicates(int[] nums) {
        // int n = nums.length;
        // int j = 0;
        // if(n == 0){
        //     return 0;
        // }
        // for(int i = 1;i < n;i++){
        //     if(nums[i] != nums[j]){
        //         j++;
        //         nums[j] = nums[i];
        //     }
        // }
        // return j + 1;  //ans with +1 due to 0 array indexing

        // int n = nums.length;
        // int i = 0; //store unique values
        // int j = 1;

        // while(j < n){
        //     if(nums[i] == nums[j]){
        //         j++;
        //     }
        //     else{ 
        //         //no match(unique element)
        //         i++;
        //         nums[i] = nums[j];
        //         j++;
        //     }
        // }
        // return i + 1;

        int i = 0;
        for(int j = 1;j < nums.length;j++){
            if(nums[j] != nums[i]){
                // nums[i+1] = nums[j];    //take the front position i+1
                // i++;
                //or first go to next position then update it
                i++;
                nums[i] = nums[j];
            }
        }
        return (i + 1); //as we have to tell the total number of elements
    }
}