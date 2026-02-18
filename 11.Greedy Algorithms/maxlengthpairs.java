import java.util.*;

public class maxlengthpairs {
    public static void pairs(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));
        int preStart = 0;
        int preEnd = 0;
        int pair = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] > preEnd) {
                preStart = arr[i][0];
                preEnd = arr[i][1];
                pair++;
            }
        }
        System.out.println(pair);
    }

    public static void main(String[] args) {
        int[][] arr = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        pairs(arr);
    }
}
