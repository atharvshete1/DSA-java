import java.util.*;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public static void reverse() {

            Node prev = null;
            Node curr = Tail = Head;
            Node next;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Head = prev;
        }
    }
    public static Node Head;
    public static Node Tail;
    public static int size;

    public void addFirst(int data) {
        // crate newnode
        Node newNode = new Node(data);
        size++;

        // if the list is null
        if (Head == null) {
            Head = Tail = newNode;
            return; // close the function
        }

        newNode.next = Head; // linking the next of newNode To the Head

        Head = newNode; // assigning the new Head
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (Head == null) {
            Head = Tail = newNode;
            return;
        }

        Tail.next = newNode;

        Tail = newNode;
    }

    public void print(Node Head) {
        if (Head == null) {
            System.out.print("Null");
            return;
        }

        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void add(int data, int index) {
        Node newNode = new Node(data);
        size++;
        Node temp = Head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("LL is Null");
            return;
        }

        if (size == 1) {
            Head = Tail = null;
            size = 0;
            return;
        }

        Head = Head.next;
        size--;
        return;
    }

    public void removeLast() {
        if (Head == null) {
            System.out.println("LL is Null");
            return;
        }

        if (size == 1) {
            Head = Tail = null;
            size = 0;
            return;
        }

        // Now going to the previous Node of the Tail

        Node prev = Head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        // prev == size -1
        prev.next = null;
        Tail = prev;
        size--;
    }

    public int search(int n) {
        if (Head == null) {
            System.out.println("LL is Null");
            return -1;
        }

        Node temp = Head;
        int i = 1;
        while (temp != null) {
            if (temp.data == n) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    int i = 0;

    public int searchREC(Node Head, int key) {
        if (Head == null) {
            return -1;
        }

        if (Head.data == key) {
            return ++i;
        }

        i++;
        Head = Head.next;
        return searchREC(Head, key);
    }

    public static void reverse() {

        Node prev = null;
        Node curr = Tail = Head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Head = prev;
    }

    public void deletefromEnd(int n) {
        int index = (size - n);
        Node Temp = Head;
        int i = 1;
        while (i < index) {
            Temp = Temp.next;
            i++;
        }

        Temp.next = Temp.next.next;

    }

    public boolean palindrome(Node Head, Node Tail) {
        if (Head == Tail) {
            return true;
        }

        if (Head.data != Tail.data) {
            return false;
        }

        Head = Head.next;

        Node temp = Head;

        while (temp.next != Tail) {
            temp = temp.next;
        }

        Tail = temp;

        return palindrome(Head, Tail);

    }

    public static boolean isCycle() {
        Node slow = Head;
        Node fast = Head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void removeCycle() {
        Node slow = Head;
        Node fast = Head;
        // Checking Cycle is exist
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        // Finding Matching Point
        slow = Head;
        Node prev = null;
        while (slow != fast) {
            slow = slow.next;
            prev = fast; // last point of the LL
            fast = fast.next;
        }

        // removing Cycle

        prev.next = null;

    }

    public Node mergeSort(Node Head) {
        if (Head == null) {
            return null;
        }
        // Base case
        if (Head.next == null) {
            return Head;
        }
        // find The mid
        Node slow = Head;
        Node fast = Head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;
        Node rightHead = mid.next;
        mid.next = null; // Divide LL in Two Parts

        // make two part

        Node newLeft = mergeSort(Head);
        Node newRight = mergeSort(rightHead);

        // call the merge function

        return merge(newLeft, newRight);
    }

    public Node merge(Node Head1, Node Head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (Head1 != null && Head2 != null) {
            if (Head1.data <= Head2.data) {
                temp.next = Head1;
                temp = Head1;
                Head1 = Head1.next;
            } else {
                temp.next = Head2;
                temp = Head2;
                Head2 = Head2.next;
            }
        }

        while (Head1 != null) {
            temp.next = Head1;
            temp = Head1;
            Head1 = Head1.next;
        }

        while (Head2 != null) {
            temp.next = Head2;
            temp = Head2;
            Head2 = Head2.next;
        }

        return mergedLL.next;
    }

    public void zigZag() {
        // Find mid

        Node slow = Head;
        Node fast = Head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node RH = slow.next;
        slow.next = null;

        // revrse Rightarray
        Node prev = null;
        Node curr = Tail = RH;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        RH = prev;

        // arrange in the Zigzag
        Node LH = Head;
        Node nextL, nextR;

        while (LH != null && RH != null) {
            nextL = LH.next;
            LH.next = RH;
            nextR = RH.next;
            RH.next = nextL;
            // Updatation
            RH = nextR;
            LH = nextL;
        }
    }

    // Question

    public static void interPoint(Node H1, Node H2) {
        Node temp = H1;
        temp.reverse();

        Node temp1 = H2;
        temp1.reverse();

        while (temp != null && temp1 != null) {
            temp = temp.next;
            temp1 = temp1.next;
        }

        System.out.println("The Intersection point is:" + temp.data);
        return;
    }

    public void transverse(int n) {
        Node temp = Head;
        int count = 1;
        while (temp != null && temp.next != null ) {
            temp = temp.next;
            count++;
            Node Next = temp ;
            int target = count + n + 1 ;  
            while(count != target && Next != null)
            {
                Next = Next.next ;
                count++ ;  
            }
            temp.next = Next ; 
            temp = Next ; 
        }
    }

    public void swapping(int x , int y)
    {
        Node temp =Head ; 
        Node prevX = null ; 
        Node prevY = null ; 
        Node prev = null ;
        Node x1 = null ; 
        Node y1 = null ;  
        
        while(temp !=  null)
        {
            if(temp.data == x){
                 x1 = temp ; 
                prevX = prev ; 
            }

            if(temp.data == y ){
                 y1 = temp ; 
                prevY = prev ; 
            }

            prev = temp ; 
            temp = temp.next ; 
        }
        if(prevX != null){
        prevX.next = y1 ;
        }
        else{
            Head = y1 ; 
        }  

        if(prevY != null){
        prevY.next = x1 ; 
        }   

        else{
            Head = x1 ; 
        }

        Node Temp = x1.next ; 
        x1.next = y1.next ; 
        y1.next = Temp ; 

    }

    public void evenOdd(){
       Node temp = Head ; 
       Node evenH =null ;     // Creating Varible for the Head
       Node evenS = null ;    // this is even serise
       Node oddH = null ;     // Creating this varible for the attaching
       Node oddS = null;      // this is odd serise
       int count = 0 ;
       int count1 = 0 ;


       while(temp != null){
            if(temp.data % 2 == 0){
                count++;
                if(count == 1){
                    evenH = temp ; 
                    evenS = evenH ; 
                }
                else{
                    evenS.next = temp ;
                    evenS = temp ; 
                }
            }
            else{
                count1 ++ ;
                if(count1 == 1){
                    oddH = temp;
                    oddS = oddH ;
                }
                else{
                    oddS.next = temp ; 
                    oddS = temp ;
                }
            }
            temp = temp.next ; 
       }
       Head = evenH ; 
       evenS.next = oddH ; 
       oddS.next = null ;
       Tail = oddS ; 

    
    }
    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();
        // ll.addFirst(4);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(5);
        // ll.addLast(6);
        // // ll.removeFirst();
        // // ll.removeLast();
        // // ll.print();
        // // System.out.println() ;
        // // // System.out.println(ll.search(8)) ;
        // // // System.out.println(ll.searchREC(Head, 3));
        // // ll.reverse();
        // // ll.print();
        // // System.out.println();
        // // ll.deletefromEnd(3);
        // // System.out.println();
        // ll.print();
        // System.out.println();
        // ll.zigZag();
        // ll.print();

        // Node intercept = new Node(8);
        // intercept.next = new Node(9);
        // Node last = intercept.next.next = new Node(10);

        // LinkedList ll = new LinkedList();
        // ll.addFirst(5);
        // ll.addFirst(4);
        // ll.addFirst(3);
        // ll.addFirst(2);
        // ll.addFirst(1);
        // Tail.next = intercept ;
        // Tail = last;

        // Node H1 = LinkedList.Head ;

        // LinkedList.Head = null ; // this line make the LinkedList separate Head ;

        // LinkedList l2 = new LinkedList();
        // l2.addFirst(7);
        // l2.addFirst(6);
        // Tail.next = intercept ;
        // Tail = last;
        // Node H2 = LinkedList.Head;

        LinkedList L1 = new LinkedList();
        L1.addFirst(2);
        L1.addFirst(1);
        Node H1 = Head ; 
        Node T1 = Tail ;

        LinkedList.Head = null; 
        LinkedList L2 = new LinkedList();
        L2.addLast(3);
        L2.addLast(4);
        Node H2=Head ; 
        Node T2 = Tail ; 

        LinkedList.Head = null;
        LinkedList L3 = new LinkedList();
        L3.addLast(5);
        L3.addLast(6);
        Node H3 = Head ; 
        Node T3 = Tail ;
        
        LinkedList l4 = new LinkedList() ; 
        Head = H1;
        T1.next = H2 ;
        T2.next = H3 ; 
        Tail = T3 ; 
        
        l4.print(Head);



    }
}
