class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int columns = matrix[0].length-1;
        while(rowStart<=rowEnd){
            int mid1= (rowStart) + (rowEnd - rowStart)/2;
            if(matrix[mid1][columns]<target ){
               rowStart=mid1+1;
            }
            else if( matrix[mid1][0] > target){
               rowEnd=mid1-1;
            }
            else{
                int columnStart = 0;
                int columnsEnd = columns;
                while(columnStart<=columnsEnd){
                    int mid2 = (columnStart) + (columnsEnd - columnStart)/2;
                    if(matrix[mid1][mid2]>target ){
                        columnsEnd=mid2-1;
                    }
                    else if (matrix[mid1][mid2]<target ){
                        columnStart=mid2+1;
                    }
                    else{
                           return true;
                    }
                }
                 return false;
            }
           
        }
         return false;
    }
}
