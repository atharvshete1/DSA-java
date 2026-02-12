import java.util.* ; 
public class stackbyusing2Queue {
    static class stack{
        Queue<Integer>s1 = new LinkedList<>(); 
        Queue<Integer>s2 = new LinkedList<>() ; 
        
        public boolean isEmpty(){
            return s1.isEmpty() && s2.isEmpty() ; 
        }
        public void push(int data){
            if(!s1.isEmpty()){
            s1.add(data) ; 
            }
            else{
                s2.add(data);
            }
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("The Stack is Empty");
                return -1 ; 
            }
            int top =-1 ;
            if(s1.isEmpty()){
                while(!s2.isEmpty()){
                    top = s2.remove() ;
                    if(s2.isEmpty()){break ; }
                    s1.add(top) ;
                    }
                }
            

            else{
                while(!s1.isEmpty()){
                    top = s1.remove() ;
                    if(s1.isEmpty()){break ; }
                    s2.add(top) ;
                    }
            }

            return top ; 
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("The Stack is Empty");
                return -1 ; 
            }

            if(s1.isEmpty()){
                while(!s2.isEmpty()){
                    int top = s2.remove() ; 
                    s1.add(top) ; 
                    if(s2.isEmpty()){
                        return top ;
                    }
                }
            }

            else{
                while(!s1.isEmpty()){
                    int top = s1.remove() ; 
                    s2.add(top) ;
                    if(s1.isEmpty()){ 
                        return top ; 
                    }
                }
            }
                return -1 ; 
            
        }

        public static void main (String[] args){
            stack s1 = new stack();
            s1.push(1);
            s1.push(2);
            s1.push(3);

            while(!s1.isEmpty()){
                System.out.println(s1.peek());
                s1.pop();
            }


        }
    }
}
