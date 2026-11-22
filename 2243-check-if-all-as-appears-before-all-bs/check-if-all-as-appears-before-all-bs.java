class Solution {
    public boolean checkString(String s) {
        boolean seen_B = false;
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'b'){
                seen_B = true;
            }else if(seen_B){
                return false;
            }
        }
        return true;   
    }
}