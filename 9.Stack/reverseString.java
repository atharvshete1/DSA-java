import java.util.*;

public class reverseString {

    public static void reverse1(String s1, Stack<Character> s2) {
        int i = 0;
        while (i != s1.length()) {
            s2.push(s1.charAt(i));
            i++;
        }

        while (!s2.isEmpty()) {
            System.out.print(s2.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Character> s2 = new Stack<>();

        String s1 = new String("Hellowworld");
        reverse1(s1, s2);

    }
}