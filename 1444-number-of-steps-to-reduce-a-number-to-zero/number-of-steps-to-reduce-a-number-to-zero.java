class Solution {
    public int numberOfSteps(int num) {
        //iterative approach
        // int steps = 0;
        // if(num == 0){
        //     return 0;
        // }
        // while(num != 0){
        //     if(num % 2 == 0){ //even 
        //         num = num/2;
        //         steps++;
        //     }
        //     if(num % 2 != 0){ //odd
        //         num = num - 1;
        //         steps++;
        //     }
        // }
        // return steps;

        //recursion approach
            return helper(num , 0);  //initialize steps 0
    }
    public static int helper(int num , int steps){
        if(num == 0){
            return steps;
        }
        if(num % 2 == 0){
            return helper(num/2 , steps+1);  //even
        }
        return helper(num-1, steps+1);       //odd
    }
}