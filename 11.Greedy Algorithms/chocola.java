import java.util.*;

public class chocola {
    public static void costOfCut(int[] horizontal, int[] vertical) {
        Arrays.sort(horizontal);
        Arrays.sort(vertical);
        int k = horizontal.length - 1;
        for (int i = 0; i < horizontal.length / 2; i++) {
            int temp = horizontal[i];
            horizontal[i] = horizontal[k];
            horizontal[k] = temp;
            k--;
        }
        int k1 = vertical.length - 1;
        for (int i = 0; i < vertical.length / 2; i++) {
            int temp = vertical[i];
            vertical[i] = vertical[k1];
            vertical[k1] = temp;
            k1--;
        }
        System.out.println(Arrays.toString(vertical));
        System.out.println(Arrays.toString(horizontal));
        int cutH = 0;
        int cutV = 0;
        int cost = 0;
        int h = 0;
        int v = 0;
        while (h < horizontal.length && v < vertical.length) {
            if (horizontal[h] < vertical[v]) {
                cost += (cutH + 1) * vertical[v];
                v++;
                cutV++;
            } else {
                cost += (cutV + 1) * horizontal[h];
                h++;
                cutH++;
            }
        }

        while (v < vertical.length) {
            cost += (cutH + 1) * vertical[v];
            v++;
            cutV++;

        }

        while (h < horizontal.length) {
            cost += (cutV + 1) * horizontal[h];
            h++;
            cutH++;
        }

        System.out.println(cost);

    }

    public static void main(String[] args) {
        int[] horizontal = { 4, 1, 2 };
        int[] vertical = { 2, 1, 3, 1, 4 };
        costOfCut(horizontal, vertical);
    }
}
