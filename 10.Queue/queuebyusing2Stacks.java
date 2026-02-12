import java.util.* ; 

public class queuebyusing2Stacks {
    static class Queue{
        static Stack<Integer> s1 ;
        static Stack<Integer> s2 ;
        static int size ;
        static int front ;
        static int rear;  
        Queue(int size){
            this.size= size ; 
            s1 = new Stack<>();
            s2=new Stack<>();
        }

        public boolean isEmpty(){
            return s1.isEmpty() ; 
        }
        public void add(int data){
            if(isEmpty()){
                front = 0 ;
                rear = 0 ;
                s1.push(data);
                return ; 
            }
            rear++ ; 
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop()) ; 
            }
        }

        public int remove(){
            if(s1.isEmpty()){
                System.out.println("The Queue is Empty");
                return -1; 
            }
            rear -- ;
            int front = s1.pop();
            return front ; 
        }

        public int peek(){
            if(s1.isEmpty()){
                System.out.println("The Queue is Empty");
                return -1; 
            }

            return s1.peek() ; 
        }

    }
    public static void main(String[] args){
        Queue q1 = new Queue(10);

        for(int i=1 ; i<q1.size ; i++){
            q1.add(i);
        }

        while(!q1.isEmpty()){
        System.out.print(q1.remove()+" ") ; 
        }

    }    
}
