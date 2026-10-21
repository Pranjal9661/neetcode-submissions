class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int right = 0;
        int maxLen =0;
        Set<Character> st = new HashSet<>();
        while(left<s.length()){
            while(right<=left && st.contains(s.charAt(left))){
                st.remove(s.charAt(right));
                right++;
            }
             st.add(s.charAt(left));
            int len = left -right+1;
            maxLen =Math.max(len,maxLen);
            
            left++;
        }
        return maxLen;
    }
}
