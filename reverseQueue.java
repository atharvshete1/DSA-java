import java.util.* ; 
// by using the Stack we can reverse Queue
public class reverseQueue {

    public static void reverse(Queue<Integer> q1){
        Stack<Integer>temp = new Stack<>() ;
        while(!q1.isEmpty()){
            temp.push(q1.remove()) ; 
        } 

        while(!temp.isEmpty()){
            q1.add(temp.pop());
        }

        System.out.println(q1);
    }
    public static void main (String[] args){
    Queue<Integer> q1 = new LinkedList<>();
    for(int i =0 ; i<10; i++){q1.add(i);}
    reverse(q1);
}

}
