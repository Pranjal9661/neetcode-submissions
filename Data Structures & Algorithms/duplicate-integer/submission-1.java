class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        boolean res = false;
        for(int i = 0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int i =0;i<nums.length;i++){
            if(mp.get(nums[i])>=2){
                res = true;
                break;
            }
        }
        return res;
    }
}