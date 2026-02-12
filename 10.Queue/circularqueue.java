public class circularqueue {
    // creating circular queue
    // logic- use rear = (rear+1) % size ,this make circular queue
    // front = front+1

    static class circularqueue1 {
        static int[] arr;
        static int front;
        static int rear;
        static int size;

        circularqueue1(int data) {
            this.arr = new int[data];
            this.front = -1;
            this.rear = -1;
            this.size = data;
        }

        public boolean isFull() {
            return front == (rear + 1) % size;
        }

        public boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("The Queue is Full");
                return;
            }
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = arr[front];
            front = (front + 1) % size;
            return result;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }

            int result = arr[front];
            return result;
        }

        public static void main(String[] args) {
            circularqueue1 q1 = new circularqueue1(10);
            for (int i = 0; i < q1.size; i++) {
                q1.add(i);
            }
        }

    }
}
