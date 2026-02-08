public class palindrome {
    public static boolean isPalindrome(String str) {
        int n = (str.length()) - 1;
        // for better time complexity we put n/2
        for (int i = 0; i <= n; i++) {
            if (str.charAt(i) != str.charAt(n - i)) {
                return false;
            } else {
                continue;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String str = new String("noon");
        System.out.print(isPalindrome(str));

    }

}