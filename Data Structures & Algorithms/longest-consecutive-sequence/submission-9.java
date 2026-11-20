class Solution {
    public int longestConsecutive(int[] nums) {
       Arrays.sort(nums);
        int maxLen = 0,currLen=1;
        if(nums.length==0){
            return maxLen;
        }
       for(int i = 1;i<nums.length;i++){
         maxLen=Math.max(maxLen,currLen);
        if(nums[i]==nums[i-1]){
            continue;
        }
        else if(nums[i]==nums[i-1]+1){
            ++currLen;
        }
        else{
            currLen=1;
        }
           

       }
       return Math.max(maxLen,currLen);
    }
}
