import java.util.* ; 
class Solution {
    public int binaryGap(int n) {
        int a =0 ;
        int x = 0 ;
        int distance = 0 ; 
        int count = 0 ;  
        int largestDis = 0 ;   
        while(n > 0){
            int remainder = n % 2 ; 
            a = a + (int)(remainder * Math.pow(10 , x));
            if(remainder == 1 ){
                if(count == 1){
                    count=0; 
                    distance++ ; 
                    largestDis = Math.max(largestDis , distance);
                    distance =0 ;
                    count =1 ;   
                }
                else{
                    count++ ; 
                }
            }
            else if(count==1 && remainder == 0){
                distance++ ; 
            }
            n = n/2 ; 
            x++ ;    
        }

        return largestDis ; 
        
    }
}
