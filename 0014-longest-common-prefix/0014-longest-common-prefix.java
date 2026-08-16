class Solution {
    public String longestCommonPrefix(String[] strs) {
        String firstWord=strs[0];

        for(int i=0;i<firstWord.length();i++){
            for(String word :strs){
                // ==>If this word is shorter than index i,
                // then there is no character to compare.
                // So the common prefix ends before i.
                if(i>=word.length()){
                    return firstWord.substring(0,i);
                }
                // ==>Compare the character at index i
                // with the character at index i of the first word.
                if(word.charAt(i)!=firstWord.charAt(i)){
                    return firstWord.substring(0, i);
                }
            }   
        }
        return firstWord;
    }
}