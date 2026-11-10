import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
    //    if(s.length() != t.length())
    //     return false;

    //    char[] arr = s.toCharArray();
    //    char[] tar = t.toCharArray();

    //    Arrays.sort(arr);
    //    Arrays.sort(tar);

    //    return Arrays.equals(arr , tar);

    //IInd method

        if(s.length() != t.length()){
            return false;
        }
        int[] freq = new int[26];

        for(int i = 0;i < s.length();i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for(int count : freq){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
