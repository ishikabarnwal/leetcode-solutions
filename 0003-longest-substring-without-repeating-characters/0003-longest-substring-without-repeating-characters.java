class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int []lastSeen=new int[128];
        // for(int i=0;i<128;i++){
        //     lastSeen[i]=-1;
        // }
        // int maxLen=0;
        // int left=0;

        // for(int right=0;right<s.length();right++){
        //     char c=s.charAt(right);
        //     if(lastSeen[c]>=left){
        //         left=lastSeen[c]+1;
        //     }
        //     lastSeen[c]=right;
        //     maxLen=Math.max(maxLen,right-left+1);
        // }
        // return maxLen;
        HashSet<Character> set = new HashSet<>();
        int start=0;
        int maxLength=0;

        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(i));
            maxLength=Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }
}