class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // ArrayDeque<Integer> que = new ArrayDeque<>();
        // int i = 0;
        // int n = nums.length;
        // int ans[] = new int[n - k + 1];
        // int st = 0;
        // int j = 0;
        
        // while (i < n) {
           
        //     while (!que.isEmpty() && que.peekLast() < nums[i]) {
        //         que.pollLast();
        //     }
            
        //     que.offer(nums[i]);

        //     if (i - j + 1 == k) {
                
        //         ans[st++] = que.peek();  // max element
                
        //         if (nums[j] == que.peek()) {
        //             que.pollFirst();     // remove if max is leaving window
        //         }
                
        //         j++;
        //     }

        //     i++;
        // }
        
        // return ans;

        //Optimal soltuion Deque
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] res = new int[n - k + 1];    //new arrar size
        int str = 0;

        for(int i = 0;i < n;i++){
            while(!dq.isEmpty() && dq.peekFirst() < i - k + 1){ //window first eleemnt
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            
            if(i >= k - 1){
                res[str++] = nums[dq.peekFirst()];
            }
        }
        return res;
    }
}
