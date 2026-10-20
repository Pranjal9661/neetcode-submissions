class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // We traverse the Array and gourp the anagram of each string by getting the frequency of the elements in that array
       Map<String,List<String>> mp = new HashMap<>();
       for(int i =0;i<strs.length;i++){
        String temp = strs[i];
        int[] freq = new int[26];
             for(char c: temp.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int count: freq){
            sb.append('&').append(count);
        } 
        String key = sb.toString();
        mp.computeIfAbsent(key, k -> new ArrayList<>()).add(temp);
      
        }
        return new ArrayList<>(mp.values());
    }
}
