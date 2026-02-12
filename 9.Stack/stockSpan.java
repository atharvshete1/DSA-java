import java.util.* ; 
public class stockSpan {
    public static void span(int [] stock){
        int []span = new int[stock.length];
        Stack <Integer> s1 =new Stack<>() ;
        s1.push(0);
        span[0] = 1 ;
        
        for(int i =1 ; i<stock.length ; i++){
            int curr =stock[i];
            while(!s1.isEmpty() && curr > stock[s1.peek()]){
                s1.pop();
            }

            if(s1.isEmpty()){
                span[i] = i +1 ;  
            }
            else{
                int highprev = s1.peek() ; 
                span[i] = i - highprev ; 
            }

            s1.push(i);
        }

        System.out.println(Arrays.toString(span));
    }
    public static void main(String[] args){
        int []stock = {100,80,60,70,60,85,100} ; 
        span(stock);  
    }
}
