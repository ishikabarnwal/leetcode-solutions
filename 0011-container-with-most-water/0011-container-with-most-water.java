class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxwater=0;

        while(i<j){
                int Length=Math.min(height[i],height[j]);
                int width=j-i;
                maxwater=Math.max(maxwater, Length*width);

                if(height[i]<height[j]){
                    i++;
                }else{
                    j--;
                }

        }
        return maxwater;
        
    }
}