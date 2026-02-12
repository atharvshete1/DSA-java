import java.util.*;

public class LinkedList1 {
    public static class Node {
        int Data;
        Node Next;

        public Node(int Data) {
            this.Data = Data;
            this.Next = null;
        }
    }

    public static Node Tail;
    public static Node Head;
    public static int Size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        Size++;

        if (Head == null) {
            Head = Tail = newNode;
            return;
        }

        newNode.Next = Head;
        Head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        Size++;

        if (Head == null) {
            Head = Tail = newNode;
        }

        Tail.Next = newNode;
        Tail = newNode;
    }

    public void print() {
        if (Head == null) {
            System.out.println("The LinkeList is Null");
            return;
        }

        Node temp = Head;

        while (temp != null) {
            System.out.print(temp.Data + " -> ");
            temp = temp.Next;
        }
        System.out.print(" null");
        System.out.println();
    }

    public void add(int index, int data) {
        Node newNode = new Node(data);
        Size++;

        int i = 1;
        Node temp = Head;
        for (i = 1; i < index - 1; i++) {
            temp = temp.Next;
            i++;
        }

        newNode.Next = temp.Next ; 
        temp.Next = newNode ; 

    }

    public void removeFirst(){
        if(Head == null){
            System.out.println("LL is Null ");
            return ; 
        }

        Head=Head.Next ;  
    }

    public void removeLast(){
        if(Head == null){
            System.out.println("LL is Null ");
            return ; 
        }

        Node temp = Head ; 
        int i =1 ; 
        while(i < Size -1){
            temp= temp.Next;
            i++ ; 
        }
        temp.Next = null ; 
        Tail = temp ; 
    }

    public void search(int key){
        if(Head == null){
            System.out.println("LL is Null ");
            return ; 
        }

        Node temp = Head ;
        int i =1 ; 
        while(temp != Tail){
            if(temp.Data==key){
                System.out.println("Key is at Node : " + i);
                return ;
            }
            temp=temp.Next ; 
            i++ ; 
        }
    }
    static int c = 1 ;
    public int searchRECC(int key , Node Head)
    {   
        if(Head==null){
            System.out.println("---> Not Found <---");
            return -1; 
        }

        if(Head.Data == key){
            System.out.print("Key is Found at : " + c);
            return c;
        }

        Head = Head.Next ; 
        c++;
        return searchRECC(key , Head);
    }

    public void reverse(){
        if(Head == null){
            System.out.println("LL is Null");
            return ;
        }

        Node prev = null ; 
        Node curr = Tail =Head ; 
        Node next ; 

        while(curr != null){
            next = curr.Next ; 
            curr.Next = prev ;
            prev = curr ; 
            curr= next ;  
        }

        Head = prev ;
    }

    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1(); 
        ll.addFirst(21);
        ll.addFirst(22);
        ll.addFirst(23);
        ll.addFirst(24);
        ll.addFirst(25);
        ll.addFirst(26);
        ll.addLast(20);
        ll.print();
        ll.reverse();
        ll.print();
        
    }
}
