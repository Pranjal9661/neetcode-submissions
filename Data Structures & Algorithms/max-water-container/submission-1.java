class Solution {
    public int maxArea(int[] heights) {
        // Naive solutions n2 
        int maxArea = 0;
        int left = 0;
        int right = heights.length-1;
        maxArea = (right - left) * Math.min(heights[left],heights[right]);
        while(left<right){
              int tempArea = (right - left ) * Math.min(heights[left],heights[right]);
            maxArea =Math.max(maxArea,tempArea);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
          
        }
        return maxArea;
    }
}
