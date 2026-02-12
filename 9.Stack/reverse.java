import java.util.*;

public class reverse {
    public static class Node {
        Node Next;
        int Data;

        Node(int Data) {
            this.Data = Data;
            this.Next = null;
        }
    }

    public static void bottomUp(Stack<Integer> s1, int Data) {
        if (s1.isEmpty()) {
            s1.push(Data);
            return;
        }

        int top = s1.pop();
        bottomUp(s1, Data);
        s1.push(top);
    }

    public static void reverse1(Stack<Integer> s1) {
        if (s1.size() == 1) {
            return;
        }

        int top = s1.pop();
        reverse1(s1);
        bottomUp(s1, top);
    }

    public static void spanStock(int[] Stock) {
        Stack<Integer> s1 = new Stack<>();
        int[] span = new int[Stock.length];
        span[0] = 1;
        s1.push(0);

        for (int i = 1; i < Stock.length; i++) {
            int curr = Stock[i];
            while (!s1.isEmpty() && curr > Stock[s1.peek()]) {
                s1.pop();
            }

            if (s1.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s1.peek();
                span[i] = i - prevHigh;
            }
            s1.push(i);
            
        }

        for (int val : span) {
            System.out.print(val + " ");
        }

    }

    public static void main(String[] args) {
        int[] s1 = { 100, 80, 60, 70, 60, 85 ,100} ; 

        spanStock(s1);
    }

}
