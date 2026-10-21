class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Trying to optimize the solution using prefix and suffix solutions
       int[] res = new int[nums.length];
       int left = 1;
       for(int i =0;i<nums.length;i++){
        res[i]=left;
        left*=nums[i];
       }
       int right = 1;
       for(int j= nums.length-1;j>=0;j--){
        res[j]*=right;
        right*=nums[j];
       }
       return res;
    }
}  
