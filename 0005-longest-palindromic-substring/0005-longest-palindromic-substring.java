class Solution {
    public String longestPalindrome(String s) {
        String best = "";
        //base_case:if the string is empty or has one char then itself it is ans:
        if(s.length()<2){
            return s;
        }
        //odd palindrome
        for(int i=0;i<s.length();i++){
            int left=i;
            int right=i;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
            String odd=s.substring(left+1,right);
            // If this palindrome is longer than our current answer,save it.
            if (odd.length() > best.length()) {
                best = odd;
            }
        
        //even palindrome
            left=i;
            right=i+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
            String even = s.substring(left + 1, right);

            // Keep it if it is longer than our current answer.
            if (even.length() > best.length()) {
                best = even;
            }
       }
       return best;       
    }
}