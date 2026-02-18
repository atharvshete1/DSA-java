import java.util.* ; 
public class fractionalKnapsack {
    public static void answer(int []value , int[] weight , int maxweight){
        int ratio [][] = new int[value.length][2] ; 
        for(int i = 0 ; i<value.length ; i++){
            ratio[i][0] = i ;
            ratio[i][1] = value[i] / weight[i] ;   
        }

        Arrays.sort(ratio , Comparator.comparingInt( (int[]a ) -> a[1] ).reversed());
        int capicity= maxweight - 0 ;
        int totalvalue = 0 ; 
        int k =0  ; 
        while(k < value.length && capicity > 0){
            if((weight[ratio[k][0]])< capicity ){
                totalvalue += value[ratio[k][0]] ;
                capicity -=weight[ratio[k][0]] ;  
            }
            else{
                int remaining = capicity ; 
                totalvalue += (remaining * ratio[k][1]) ;
            }
            k++ ; 
        }
        System.out.println("This is maximum capicity for the weight"+ " " + maxweight +" : "+ totalvalue);
    }
    public static void main(String[] args){
        int[]value = {60 , 100 ,120};
        int[]weight = {10 ,20 ,30} ; 
        answer(value , weight, 50);
    }
}
