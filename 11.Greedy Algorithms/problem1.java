public class problem1 {
    /*
     * Given a balanced string str of size N containing only 'L' and 'R'
     * with equal number of 'L' and 'R'.
     * Find the maximum number X such that the string can be
     * partitioned into X balanced substrings.
     * A substring is balanced if number of 'L' equals number of 'R'.
     */

    public static void maxStringPartiation(String s) {
        int count = 0;
        int i = 0;
        int partitioncount = 0;
        while (i < s.length()) {
            char curr = s.charAt(i);
            if (curr == 'L') {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                partitioncount++;
            }
            i++ ; 
        }
        System.out.println("The pair of the String: " + partitioncount);
    }

    public static void main(String[] args) {
        maxStringPartiation("LRRRRLLRLLRL");
        maxStringPartiation("LLLLRRRR");
    }
}
