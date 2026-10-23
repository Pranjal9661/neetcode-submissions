class Solution {
    public int search(int[] nums, int target) {
        int res =-1;
        int left =0;
        int right = nums.length-1;
        int mid = left + (right -left)/2;
        while(left<=right){
            mid =left+(right-left)/2;
            if(nums[mid]>target){
                right--;
            }
            else if(nums[mid]<target){
                left++;
            }
            else{
                res = mid;
                break;
            }
        }
        return res;
    }
}
