class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(char c: s1.toCharArray()){
            freq1[c-'a']++;
        }
        int i = 0;
        while(i<s1.length() && s2.length() >=s1.length()){
           freq2[s2.charAt(i)-'a']++;
           i++;
        }
        boolean res = false;
        res = Arrays.equals(freq1,freq2);
         if(res){
               return res;
             }
        for(int j = s1.length();j<s2.length();j++){
             freq2[s2.charAt(j-s1.length())-'a']--;
             freq2[s2.charAt(j)-'a']++;
             res = Arrays.equals(freq1,freq2);
             if(res){
                break;
             }
        }
        return res;
        
    }
}
