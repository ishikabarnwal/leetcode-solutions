class Solution {
    public boolean isAnagram(String s, String t) {

        //first check
        if(s.length()!=t.length()){
            return false;
        }
        //Now , creating HashMap because it saves key,value pair and Hashset keep track of unique

        HashMap<Character,Integer>map=new HashMap<>();
        for(char c :s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        //now process on string2 
        for(char c :t.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }
            map.put(c,map.get(c)-1);//decreasing the count

            if(map.get(c)==0){
                map.remove(c);
            }
        }
        return map.isEmpty();
    }
}