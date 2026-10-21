class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c) && !Character.isWhitespace(c)){
                sb.append(c);
            }
        }
        String test = sb.toString().toLowerCase();
        System.out.println(" Extract String: " + test);
        int left = 0;
        int right = test.length()-1;
        boolean res = true;
        while(left<right){
            if(test.charAt(left)==test.charAt(right)){
                left++;
                right--;
            }
            else{
                res = false;
                break;
            }
        }
        return res;
    }
}
