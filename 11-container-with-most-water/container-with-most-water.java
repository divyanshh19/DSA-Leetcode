class Solution {
    public int maxArea(int[] height) {
        int L = 0;
        int R = height.length - 1;
        int maxWater = 0;
        while(L < R){
            int width = R - L;
            int currArea = Math.min(height[L],height[R]) * width;
            maxWater = Math.max(maxWater, currArea);

            if(height[L] < height[R]){
                L++;
            }else{
                R--;
            }
        }
        return maxWater;
    }
}