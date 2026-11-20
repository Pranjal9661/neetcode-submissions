class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            st.add(nums[i]);
        }
        int maxLen = 0;
        for(int num: st){
            if(!st.contains(num-1)){
                int curNum=num;
                int curLen=1;
                while(st.contains(curNum+1)){
                    curNum++;
                    curLen++;
                }
                maxLen=Math.max(maxLen,curLen);
            }
        }
        return maxLen;
    }
}
