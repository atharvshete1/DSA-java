import java.util.* ; 
public class twoHalvesOfQueue {
    public static Queue<Integer> twoHalves(Queue <Integer> q1){
        Queue <Integer>q2 = new LinkedList<>() ; 
        int mid = q1.size() / 2 ;
        int count =0 ;
        while(count < mid){
            q2.add(q1.remove());
            count++;
        }

        while(count>0){
            q1.add(q2.remove());
            q1.add(q1.remove());
            count-- ; 
        }
        return q1 ;  
    }
    
    public static void main(String[] args){
        Queue<Integer> q1 = new LinkedList<>();
        for(int i=1; i<=10 ; i++){
            q1.add(i) ; 
        }

        System.out.println(twoHalves(q1));
    }
    
}
