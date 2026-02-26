import java.util.* ; 
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack <Integer> s1 = new Stack<>() ; 
        int []nsl = new int[heights.length] ; 
        int []nsr = new int[heights.length] ; 
        //next smallest right
        for(int i=heights.length-1 ; i>=0 ; i--){
            int curr = heights[i] ; 
            while(!s1.isEmpty() && curr<=heights[s1.peek()]){
                s1.pop() ; 
            }
            if(s1.isEmpty()){
                nsr[i] = heights.length ;  
            }
            else{
                nsr[i] = s1.peek() ; 
            }
            s1.push(i); 
        }
        //next smallest left
        s1 = new Stack<>() ; 
        for(int i=0 ; i<heights.length ; i++){
            int curr = heights[i] ; 
            while(!s1.isEmpty() && curr<=heights[s1.peek()]){
                s1.pop() ; 
            }
            if(s1.isEmpty()){
                nsl[i] = -1 ;  
            }
            else{
                nsl[i] = s1.peek() ; 
            }
            s1.push(i); 
        }
        //return maxarea  
        int maxArea = 0 ; 
        for(int i =0 ; i<heights.length ; i++){
            int area = heights[i]* (nsr[i] - nsl[i] -1) ; 
            maxArea = Math.max(area , maxArea);
        }

        return maxArea ;
    }
}
