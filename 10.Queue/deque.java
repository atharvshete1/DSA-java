import java.util.*;

public class deque {
    // deque = double ended queue
    // in these queue we have use 3 fuction at first and last both.

    // by using deque creating stack and queue

    static Deque<Integer> d1 = new LinkedList<>();

    public static class stack {
        int size =0; 

        public boolean isEmpty() {
            return size == 0 ;
        }

        public void push(int data) {
           d1.addLast(data);
           size++ ; 
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = d1.getLast() ; 
            d1.removeLast() ;
            size-- ;
            return top ;  
        }
        public int peek(){
             if(isEmpty()){
                return -1;
            }
            int top = d1.getLast() ; 
            return top ;
        }
    }

    static Deque<Integer>d2 = new LinkedList<>() ; 

    public static class queue {
        int size =0 ; 

        public boolean isEmpty(){
            return size == 0 ; 
        }
        public void add(int data){
         d2.addLast(data);
         size++ ; 
        }
        public int remove(){
            if(isEmpty()){
                return -1;
            }

            int top = d2.getFirst() ;
         d2.removeFirst(); 
         size -- ;
            return top ; 
        }

        public int peek(){
            if(isEmpty()){
                return -1; 
            }
            int top = d2.getFirst();
            return top ; 
        }

    }

    public static void main(String[] args) {
       stack s1= new stack() ; 
       s1.push(1);
       s1.push(2);
       s1.push(3);

       while(!s1.isEmpty()){
        System.out.println(s1.pop());
       }
       
       System.out.println();

       queue q1= new queue() ;
       q1.add(1);
       q1.add(2);
       q1.add(3);

       while(!q1.isEmpty()){
        System.out.println(q1.remove());
       }
    }

}
