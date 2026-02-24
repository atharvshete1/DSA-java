class Solution {
    public int maxArea(int[] height) {
        int start =0;
        int end=height.length-1;
        int max=Integer.MIN_VALUE;
        while(start < height.length && end > start){
            int smallest=Math.min(height[start] , height[end]);
            int waterContainer=(end-start)*smallest;
            max=Math.max(max,waterContainer);
            if(smallest == height[start]){
                start++;
            }
            else{
                end--;
            }
            
        }

        return max;
        
    }
}
