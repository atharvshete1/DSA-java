import java.util.*;

public class StackA {
    public static class Stack0 {
        // Creating stack by using the arraylist

        ArrayList<Integer> a1 = new ArrayList<>();

        public boolean isEmpty() {
            return a1.size() == 0;
        }

        public void push(int data) {
            a1.add(data);
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = a1.get(a1.size() - 1);
            a1.remove(a1.size() - 1);
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            int top = a1.get(a1.size() - 1);
            return top;
        }

    }

    public static class Stack1{
        // Creating the stack in the LinkeList 
        public static class Node{
            int Data ; 
            Node Next ;
            
            Node(int data)
            {
                this.Data = data ; 
                this.Next = null ; 
            }
        }

        public static Node Head = null ; 

        public Boolean isEmpty(){
            return Head==null ; 
        } 

        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                Head = newNode ; 
                return ;
            }
            Node temp = Head  ; 
            Head = newNode  ;
            Head.Next = temp; 
              
        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = Head.Data ; 
            Head = Head.Next;
            return top ; 
        }

        public int peek()
        {
            if(isEmpty()){
                return -1;
            }

            int top =Head.Data ; 
            return top ; 
        }

        public void pushBottom(Stack1 s1 , int data){
            if(isEmpty()){
                s1.push(data);
                return ; 
            }

            int top = s1.pop();
            pushBottom(s1 , data);
            s1.push(top);
        }
    }

  
    public static void main(String[] args) {
        Stack1 s1 = new Stack1();
        s1.push(23);
        s1.push(24);
        s1.push(25);

        s1.pushBottom(s1 , 26);
        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }

    }
}