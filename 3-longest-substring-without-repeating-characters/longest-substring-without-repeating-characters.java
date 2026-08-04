class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Array to store last seen index of each character
        // Assuming ASCII (256); if only lowercase letters, you can use 128 or 26
        // int[] lastIndex = new int[256];
        
        // Initialize with -1 meaning "not seen"
        // for (int i = 0; i < 256; i++) {
        //     lastIndex[i] = -1;
        // }
        
        // int n = s.length();
        // int left = 0;      // start of current window
        // int maxLen = 0;
        
        // for (int right = 0; right < n; right++) {
        //     char c = s.charAt(right);
            
            // If character was seen and is inside the current window
            // if (lastIndex[c] >= left) {
                // Move left to one position after the last occurrence
            //     left = lastIndex[c] + 1;
            // }
            
            // Update last seen index of this character
            // lastIndex[c] = right;
            
            // Update maximum length
        //     int windowLen = right - left + 1;
        //     if (windowLen > maxLen) {
        //         maxLen = windowLen;
        //     }
        // }
        
        // return maxLen;

        // int left = 0;
        // int maxLen = 0;

        // HashSet<Character> freq = new HashSet<>();

        // for(int right = 0; right < s.length();right++){
        //      char c = s.charAt(right);

        //     while(freq.contains(c)){
        //         freq.remove(s.charAt(left));
        //         left++;
        //     }
        //     freq.add(c);
        //     maxLen = Math.max(maxLen , right - left + 1);
        // }
        // return maxLen;
        int left = 0;
        int maxLen = 0;
        int right = 0;
        HashSet<Character> window = new HashSet<>();
        for(right = 0;right < s.length();right++){
            while(window.contains(s.charAt(right))){
                window.remove(s.charAt(left));
                left++;
            }
            window.add(s.charAt(right));
            maxLen = Math.max(maxLen , right - left + 1);
        }
        return maxLen;
    }
}
