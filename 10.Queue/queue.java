import java.util.*;

// Creating Queue Using the Array , This Queue is definite or not dynamic. 
    public class queue{
        static class queue1{
            static int []arr ; 
            static int size ; 
            static int rear ; 
            static int front ;

            queue1(int data){
                arr = new int[data] ; 
                this.size = data ; 
                this.front = -1 ;
                this.rear = -1 ; 
            }

            public boolean isEmpty(){
                return front==rear ; 
            }

            public void add(int data){
                if(rear == size-1){
                    System.out.println("The Queue is Full");
                    return ; 
                }
                if(front==-1){
                    front = 0 ; 
                }
                rear++ ; 
                arr[rear] = data ; 
            }

            public int remove(){
                if(isEmpty()){
                    System.out.println("The Queue is Empty");
                    return -1; 
                }

                int result = arr[front] ; 
                for(int i =front+1; i<size ; i++){
                    arr[i-1] = arr[i] ; 
                }

               rear-- ; 
                return result ; 
            }

            public int peek(){
                if(isEmpty()){
                    return -1;
                }
                return arr[front];
            }


        }

    public static void main(String[] args) {
        queue1 q1 = new queue1(10);
        for(int i =1 ; i<=q1.size ; i++){
            q1.add(i);
        }

    
        while(!q1.isEmpty()){
            System.out.print(q1.peek() + " ");
            q1.remove() ;  
        }

    }
}