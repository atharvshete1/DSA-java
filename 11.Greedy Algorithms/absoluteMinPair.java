import java.util.* ; 
// Q)Min Sum Absolute Differnce pairs 
/* 
   Here we have to make pair and  
   we have to get the mininmum sum of that pair
   logic - we sort it and subtract element at same index
*/
public class absoluteMinPair {
    public static void minPair(int[] a , int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int sum = 0 ;
        int i =0 ;
        while(i < a.length){
            int diff = Math.abs(a[i] - b[i]);
            sum += diff ; 
            i++ ; 
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        int[]a = {4,1,8,7};
        int[]b= {2,3,6,5};
        minPair(a , b);
    }
}
