class Solution {
    public boolean isPalindrome(String s) {
        // int L = 0;
        // int R = s.length() - 1;

        // while(L < R) {//skip the non alphanumeric characters which are not letter or digit
        //     if(!Character.isLetterOrDigit(s.charAt(L))){
        //         L++;
        //         continue;
        //     }
        //     if(!Character.isLetterOrDigit(s.charAt(R))){
        //         R--;
        //         continue;
        //     }
        //     //compare the elements from left and right with L move forward and R move backward
        //     if(Character.toLowerCase(s.charAt(L)) != Character.toLowerCase(s.charAt(R))){
        //         return false;
        //     }
        //     L++;
        //     R--;
        // }
        // return true;

        //using the recursion
        return checker(s , 0 ,s.length() - 1);
    }
    public static boolean checker(String s , int left , int right){
        if (left >= right) {
        return true;
    }

    if (!Character.isLetterOrDigit(s.charAt(left))) {
        return checker(s, left + 1, right);
    }

    if (!Character.isLetterOrDigit(s.charAt(right))) {
        return checker(s, left, right - 1);
    }

    if (Character.toLowerCase(s.charAt(left)) !=
        Character.toLowerCase(s.charAt(right))) {
        return false;
    }

    return checker(s, left + 1, right - 1);
    }
}