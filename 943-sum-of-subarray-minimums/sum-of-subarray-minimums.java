class Solution {
    public int sumSubarrayMins(int[] arr) {
        // Stack<Integer> st = new Stack<>();
        // ArrayList<Integer> ls = new ArrayList<>();
        // int n = arr.length;
        // int sum = 0;

        // for(int i = 0;i < n;i++){
        //     if(!st.isEmpty() && arr[i] > st.peek()){
        //         st.pop();
        //     }
        //     if(st.isEmpty()){
        //         ls.add(-1);
        //     }
        //     else if(!st.isEmpty() && arr[i] < st.peek()){
        //         ls.add(st.peek());
        //     }
        //     st.push(arr[i]);
        // }
        // for(int i = 0;i < ls.size();i++){
        //     sum = sum + ls.get(i);
        // }
        // return sum;
        int n = arr.length;
        long sum = 0;
        int MOD = 1_000_000_007;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();

        // Previous Smaller Element
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                left[i] = i + 1;
            } else {
                left[i] = i - st.peek();
            }

            st.push(i);
        }

        st.clear();

        // Next Smaller Element
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                right[i] = n - i;
            } else {
                right[i] = st.peek() - i;
            }

            st.push(i);
        }

        // Calculate contribution
        for (int i = 0; i < n; i++) {
            sum = (sum + (long) arr[i] * left[i] * right[i]) % MOD;
        }

        return (int) sum;
    }
}