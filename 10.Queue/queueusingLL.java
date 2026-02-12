import java.util.* ;
public class queueusingLL {
    //Creating queue using the LinkeList
    static class queue{
        static class Node{
            int Data ; 
            Node Next ;
            
            Node(int Data){
                this.Data = Data ; 
                this.Next = null ;
            }
        }

        int front; 
        int rear ; 
        static Node Head ; 
        static Node Tail ;
        queue(){
            front = -1;
            rear = -1;
        }

        boolean isEmpty(){
            return front == -1 && rear == -1 ; 
        }

        void add(int data){
            Node newNode = new Node(data);
            if(front == -1){
                front = 0 ;
                Head = Tail = newNode ;
                return ;  
            }

            rear++ ; 
            Tail.Next = newNode; 
            Tail = newNode ; 
    }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
            }
            if(rear == -1){front = -1 ;}

            int result = Head.Data;
            Head = Head.Next;
            rear--; 
            return result ; 
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }

            return Head.Data ; 
        }

    }
    public static void main(String[] args){
        queue q1 = new queue();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);


        while(!q1.isEmpty()){
            System.out.print(q1.peek() + " ");
            q1.remove();
        }
    }
    
}
