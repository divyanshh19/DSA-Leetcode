class Solution {
    public boolean isPalindrome(int x) {
        //Iterative approach
        // if(x < 0){
        //     return false;
        // }

        // int rem = 0;
        // int reverse = 0;
        // int n = x;

        // while(n > 0){
        //     rem = n % 10;           //gives the remainder
        //     reverse = reverse*10 + rem; //reversing the number
        //     n = n/10;
        // }
        // if(reverse == x){
        //     return true;
        // }else{
        //     return false;
        // }
        //Recursive approach
        if(x < 0){
            return false;
        }
        return x == rev(x);
    }
    public int rev(int x){
        return helper(x , 0);
    }
    public int helper(int x, int rev){
        if(x == 0){
            return rev;
        }

        if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10){
            return 0;
        }
        int rem = x % 10;
        rev = rev*10 + rem;
        return helper(x/10 , rev);
    }
}