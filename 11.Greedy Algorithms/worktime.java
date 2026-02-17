// select no of activity which does not overlap with another activity time 
import java.util.* ; 

public class worktime{
    public static void noOfActivity(int []start , int[]end){
        int count = 0;
        int preStartTime= 0 ; 
        int preEndTime = 0 ; 
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0 ;i<end.length ; i++){
            if(i == 0){
                count++ ; 
                preStartTime = start[0] ;
                preEndTime = end[0] ;
                ans.add(i); 
                continue ;  
            }

            if(preEndTime <= start[i]){
                count++ ; 
                ans.add(i);
                preStartTime = start[i];
                preEndTime = end[i];
            }
        }

        System.out.println("Count: "+count + ", The working Activity :"+ ans);
    }

    public static void main(String[] args){
        int[] start ={10,12,20}; 
        int[] end  ={20,25,30};
        noOfActivity(start , end);
    }
}