class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left <= right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;

        //using the recursion
    //     return checker(s , 0 ,s.length() - 1);
    // }
    // public static boolean checker(String s , int left , int right){
    //     if(left >= right){
    //         return true;
    //     }
    //     if(!Character.isLetterOrDigit(s.charAt(left))){
    //         return checker(s , left + 1, right);
    //     }
    //     if(!Character.isLetterOrDigit(s.charAt(right))){
    //         return checker(s , left , right - 1);
    //     }

    //     if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
    //         return false;
    //     }
    //     return checker(s , left + 1, right - 1);
    }
}