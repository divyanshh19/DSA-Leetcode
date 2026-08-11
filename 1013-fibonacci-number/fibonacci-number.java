class Solution {
    public int fib(int n) {
        //Iterative approach
        // int firstTerm = 0;
        // int secondTerm = 1;

        // if (n == 0) {
        //     return 0;
        // } else if (n == 1) {
        //     return 1;
        // } else {
        //     for (int i = 2; i <= n; i++) {
        //         int thirdTerm = firstTerm + secondTerm;
        //         firstTerm = secondTerm;
        //         secondTerm = thirdTerm;
        //     }
        //     return secondTerm;
        //}

        //optimal approach

        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        
        return fib(n - 1) + fib(n - 2);
    }
}
