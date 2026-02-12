import java.util.*;

public class questions {
    // Q.1) isPalindrome() in Arraylist using Stack
    public static boolean isPalindrome(ArrayList<Character> l1) {

        int mid = (l1.size() / 2);
        Stack<Character> s1 = new Stack<>();
        for (int i = 0; i < l1.size(); i++) {
            if (i < mid) {
                s1.push(l1.get(i));
            } else {
                if (l1.size() % 2 != 0 && i == mid) {
                    continue;
                }
                if (l1.get(i) == s1.peek()) {
                    s1.pop();
                } else {
                    return false;
                }
            }
        }

        if (s1.isEmpty()) {
            return true;
        }

        return false;
    }

    // Q.2) Simplify the path
    public static void simplfyPath(String s) {
        Stack<Character> s1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '/' && s1.isEmpty()) {
                s1.push(curr);
            }
            if (curr == '/' && i != s.length() - 1 && s1.peek() != '/') {
                s1.push(curr);
            } else if (curr != '.' && curr != '/') {
                s1.push(curr);
            } else if (curr == '.' && s1.peek() == '/') {
                s1.pop();
            } else if (curr == '.' && s.charAt(i - 1) == '.') {
                while (s1.peek() != '/') {
                    s1.pop();
                }
                s1.pop();
            }
        }

        int i = 0;
        while (i != s1.size()) {
            System.out.print(s1.get(i));
            i++;
        }
    }

    // Q.3) Decode String
    // 3[b 2[v] ] == bvvbvvbvv
    // logic - if num come multiply after alphabate and alphabate come after
    // alphabate add ;

    public static void decodeStr(String s) {
        Stack<Character> s1 = new Stack<>();
        StringBuilder ans = new StringBuilder();
            
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ']') {
                while (!s1.isEmpty() && s1.peek() != '[') {
                    ans.insert(0,s1.peek());
                    s1.pop();
                }

                if (!s1.isEmpty()) {
                    s1.pop();
                }

                if (!s1.isEmpty() && Character.isDigit(s1.peek())) {    //multipliacation 
                    int cn = 1;
                    String temp=ans.toString() ; 
                    while (cn < s1.peek() - '0' ) {
                        ans.append(temp);
                        cn++;
                    } 
                } else if (!s1.isEmpty() && Character.isLetter(s1.peek())) {   //addition 
                    ans.insert(0, s1.peek());
                }

                s1.pop() ;

            } else {
                s1.push(ch);
            }
        }

        System.out.println(ans.toString());
    }

    public static void main(String[] args) {
        decodeStr("3[cv]");
    }

}
