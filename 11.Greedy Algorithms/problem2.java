public class problem2 {

    // Given two integers N and K.
    // Print the lexicographically smallest string of length N
    // consisting of lowercase English letters ('a' to 'z')
    // such that the sum of characters equals K.
    //
    // Character values:
    // 'a' = 1, 'b' = 2, 'c' = 3, .... , 'z' = 26.
    //
    // Return the lexicographically smallest possible string.

    public static void ans(int n, int k) {
        String str = new String();
        int i = 0;
        int z = 25;
        while (i < n) {
            if (k > z) {
                while ((k - z <= n - (i + 1)) && z >= 0) {
                    z--;
                }
                if( z < 0){System.out.println("It is not possible"); return ;}

                char ans = (char) (97 + z);
                k -= z + 1;
                str += ans;
                i++;
                z = 25;
            } else {
                System.out.println("It is not possible");
                return ;
            }
        }

        for (i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        ans(5, 130);
    }
}