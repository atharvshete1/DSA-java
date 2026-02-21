import java.util.* ; 
public class problem4{
    /*
    Given an array prices[] where prices[i] is the stock price on day i,
    find the maximum profit by buying once and selling once.

    You must buy before selling.
    If no profit is possible, return 0.
*/
    public static void ans(int []arr){
        int smallest = arr[0];
        int maxAdd= 0 ;
        int sold = 0 ; 
        int buy = 1 ;
        for(int i =1 ; i<arr.length ; i++){
            int curr = arr[i];
            if(maxAdd < curr-smallest){
                maxAdd = curr-smallest ; 
                sold = i+1 ; 
            }
            if(smallest > curr){
                smallest = curr ;
                buy = i+1 ;  
            }
        }

        System.out.println("The Total Profit is:"+ maxAdd + "//  Best Day is to buy the Stock:" +buy +"//  Best Day to Sold Stock:" + sold );
    }
    public static void main(String[] args){
        int arr[] ={1,5,4,3,2,7};
        ans(arr);
}
}