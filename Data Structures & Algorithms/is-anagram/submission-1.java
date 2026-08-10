class Solution {
    public boolean isAnagram(String s, String t) {
    boolean res = false;
    if(s.length()!=t.length()){
        return res;
    }
    else{
        int[] freq = new int[26];
        int[] freq2 = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) -'a']++;
        }
        for(int i=0;i<t.length();i++){
            freq2[t.charAt(i) -'a']++;
        }
        if(Arrays.equals(freq,freq2)){
            res = true;
        }
    }
    return res;
    }
}
