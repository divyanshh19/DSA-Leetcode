class Solution {
    public int search(int[] nums, int target) {
    //     int n = nums.length;
    //     int minIndex = findMinIndex(nums);
    //     int leftSearch = bs(nums ,0 , minIndex - 1,target);  //left search min index
    //     int rightSearch = bs(nums,minIndex , n - 1, target); //right search of min index
    //     if(leftSearch != -1){
    //         return leftSearch;
    //     }else{
    //         return rightSearch;
    //     }
    // }

    // public int bs(int[] nums,int left ,int right , int target){
        
    //     while(left <= right){
    //         int mid = left + (right - left)/2;
    //         if(nums[mid] == target){
    //             return mid;
    //         }else if(nums[mid] < target){
    //             left = mid + 1;
    //         }else{
    //             right = mid - 1;
    //         }
    //     }
    //     return -1;
    // }

    // public int findMinIndex(int[] nums){
    //     int left = 0;
    //     int right = nums.length - 1;
    //     int N = nums.length;

    //     while(left <= right){
    //         if(nums[left] < nums[right]) return left;
    //         int mid = left + (right - left)/2;
    //         int prev = (mid + N - 1) % N;
    //         int next = (mid + 1) % N;

    //         if(nums[mid] <= nums[prev] && nums[mid] <= nums[next]){
    //             return mid;
    //         }else if(nums[left] <= nums[mid]){
    //             left = mid + 1;
    //         }else{
    //             right = mid - 1;            
    //         }
    //     }
    //     return 0;

    //use recursion approach

        return helper(nums ,target ,0 , nums.length - 1);
    }

    public static int helper(int[] nums,int target,int s,int e){
        int m= s + (e - s)/2;
        if(s > e){
            return -1;
        }
        if(nums[m] == target){
            return m;
        }
        if(nums[s] <= nums[m]){
            if(target >= nums[s] && target <= nums[m]){
                return helper(nums ,target ,s ,m - 1);
            }
            else{
                return helper(nums ,target ,m + 1 ,e);
            }
        }
        if(target >= nums[m] && target <= nums[e]){
            return helper(nums ,target ,m + 1 ,e);
        }else{
            return helper(nums , target , s,m - 1);
        }
    } 
}