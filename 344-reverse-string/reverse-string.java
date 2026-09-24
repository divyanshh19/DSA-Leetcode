class Solution {
    public void reverseString(char[] s) {
        int n = s.length ;
        reverse(s , 0 , n - 1);
    }
    public void reverse(char[] s, int start ,int end){
        while(start <= end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}