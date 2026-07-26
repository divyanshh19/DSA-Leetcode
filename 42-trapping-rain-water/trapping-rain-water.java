class Solution {
    public int trap(int[] height) {
        // int L = 0;
        // int R = height.length - 1;
        // int maxL = 0;
        // int maxR = 0;
        // int total = 0;

        // while(L < R){
        //     if(height[L] <= height[R]){
        //         if(height[L] >= maxL){
        //             maxL = height[L];
        //         }else{
        //             total += maxL - height[L];
        //         }
        //         L++;
        //     }
        //     else{
        //         if(height[R] >= maxR){
        //             maxR = height[R];
        //         }else{
        //             total += maxR - height[R];
        //         }
        //         R--;
        //     }
        // }
        // return total;

        // STACK 

        
        int n = height.length;
        int[] maxL = new int[n];
        int[] maxR = new int[n];

        maxL[0] = height[0];
        for(int i = 1;i < n;i++){
            maxL[i] = Math.max(maxL[i - 1] , height[i]);
        }
        maxR[n - 1] = height[n -1];
        for(int i = n - 2; i >= 0;i--){
            maxR[i] = Math.max(maxR[i + 1] , height[i]);
        }
        int[] water = new int[n];

        for(int i = 0;i < n;i++){
            water[i] = Math.min(maxR[i] , maxL[i]) - height[i];
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += water[i];
        }
        return sum;
    }
}