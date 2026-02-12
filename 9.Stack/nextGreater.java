import java.util.*;

public class nextGreater {

    public static void nextGreater(int[] arr) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(arr.length - 1);
        int[] nextGre = new int[arr.length];
        nextGre[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            int curr = arr[i];

            while (!s1.isEmpty() && curr > arr[s1.peek()]) {
                s1.pop();
            }

            if (s1.isEmpty()) {
                nextGre[i] = -1;
            } else {
                nextGre[i] = arr[s1.peek()];
            }

            s1.push(i);
        }

        System.out.println(Arrays.toString(nextGre));

    }

    public static void main(String[] args) {
        int [] arr ={6,8,0,1,3};
        nextGreater(arr);
    }
}
