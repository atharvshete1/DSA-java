import java.util.*;

public class maxAreaInHistro {

    public static int maxArea(int [] arr){
        // next smaller Right
        Stack <Integer>s1 = new Stack<>() ;
        int [] nsr = new int[arr.length] ;  
        for(int i= arr.length-1;i>= 0 ; i--) {
            int curr = arr[i] ;
            while(!s1.isEmpty() && curr <= arr[s1.peek()] ){
                s1.pop() ; 
            }

            if(s1.isEmpty()){
                nsr[i] = arr.length; 
            }
            else{
                nsr[i] = s1.peek(); 
            }

            s1.push(i);
        }
        
        // next smaller Left
        s1 = new Stack<>() ; 
        int [] nsl = new int[arr.length] ;    
        for(int i= 0  ;i < arr.length ; i++){
            int curr = arr[i] ;
            while(!s1.isEmpty() && curr <= arr[s1.peek()] ){
                s1.pop() ; 
            }

            if(s1.isEmpty()){
                nsl[i] = -1 ; 
            }
            else{
                nsl[i] = s1.peek(); 
            }

            s1.push(i);
        }
        // max area 
        int maxArea = 0 ; 
        for(int i=0 ; i<arr.length ; i++)
            { 
                int area = arr[i] * (nsr[i] - nsl[i] - 1) ; 
                maxArea = Math.max(area , maxArea) ;  
            }    

            System.out.println(Arrays.toString(nsr));
            System.out.println(Arrays.toString(nsl));

            return maxArea ; 
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3 };
        System.out.println(maxArea(arr));
    }

}
