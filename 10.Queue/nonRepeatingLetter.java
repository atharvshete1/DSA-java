import java.util.*;

public class nonRepeatingLetter {
    public static StringBuilder nonrepeatingL(String s) {
        Queue<Character> w1 = new LinkedList<>();
        int[] arr = new int[26];
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            int index = curr - 'a';
            arr[index] += 1;
            w1.add(curr);
            while (!w1.isEmpty()  &&  arr[w1.peek() - 'a'] > 1 ) {
                w1.remove();
            }

            if (w1.isEmpty()) {
                str.append('#');    
            } else {
                str.append(w1.peek()) ; 
            }

        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println(nonrepeatingL("abcabc"));  // answer = aaabc# 

    }
}
