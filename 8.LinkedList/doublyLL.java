public class doublyLL {

    public static class Node {
        int Data;
        Node Prev;
        Node Next;

        public Node(int data) {
            this.Data = data;
            this.Next = null;
            this.Prev = null;
        }
    }

    public static Node Head;
    public static Node Tail;
    public static int Size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        Size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }

        newNode.Next = Head;
        Head.Prev = newNode;
        Head = newNode;
    }

    public void addLast(int Data) {
        Node newNode = new Node(Data);
        Size++;

        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        Tail.Next = newNode;
        newNode.Prev = Tail;
        Tail = newNode;
    }

    public void removeFirst() {
        if (Head == null) {
            return;
        }

        Node temp = Head.Next;
        Head.Next = null;
        temp.Prev = null;
        Head = temp;
        Size--;
    }

    public void removeLast() {
        if (Head == null) {
            return;
        }

        Node temp = Tail.Prev;
        temp.Next = null;
        Tail = temp;
        Size--;
    }

    public void reverse() {
        Node temp = Head = Tail;

        while (temp != null) {
            Node next = temp.Prev;
            temp.Prev = temp.Next;
            temp.Next = next;
            temp = next;
        }
        Tail = temp;
    }

    public void print() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.Data + " -> ");
            temp = temp.Next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        doublyLL d2 = new doublyLL();
        d2.addFirst(3);
        d2.addFirst(4);
        d2.addFirst(5);
        d2.addFirst(6);
        d2.addFirst(7);
        d2.print();
        d2.reverse();
        d2.print();

    }

}
