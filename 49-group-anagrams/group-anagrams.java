class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Ist method optimal 
        //using the freq count of each character and hashmap

        // HashMap<String , List<String>> map = new HashMap<>();
        
        // for(String s : strs){
        //     int[] freq = new int[26];

        //     for(int i = 0;i < s.length();i++){
        //         freq[s.charAt(i) - 'a']++;
        //     }
        //     StringBuilder key = new StringBuilder();
        //     for(int count : freq){
        //         key.append('#').append(count);
        //     }
        //     map.putIfAbsent(key.toString() , new ArrayList<>());
        //     map.get(key.toString()).add(s);
        // }
        // return new ArrayList<>(map.values());

        //IInd method less optimal due to s.c = O(nm)
        //using the sorting characters and hashmap

        HashMap<String , List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            
            String key = new String(ch);
            map.putIfAbsent(key , new ArrayList<>());
            map.get(key.toString()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}