import java.util.*;

public class trap_rainwater {
    public static void trapped_water(int arr[]) {
        int[] leftgretest = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                leftgretest[i] = arr[i];
                continue;
            } else if (leftgretest[i - 1] < arr[i]) {
                leftgretest[i] = arr[i];
            } else {
                leftgretest[i] = leftgretest[i - 1];
            }
        }
        System.out.println(Arrays.toString(leftgretest));

        int[] rightgretest = new int[arr.length];
        for (int j = arr.length - 1; j >= 0; j--) {
            if (j == arr.length - 1) {
                rightgretest[j] = arr[j];
                continue;
            } else if (rightgretest[j] > arr[j + 1]) {
                rightgretest[j] = arr[j + 1];
            } else {
                rightgretest[j] = rightgretest[j + 1];
            }
        }
        System.out.println(Arrays.toString(rightgretest));

        int totalWater = 0;
        for (int k = 0; k < arr.length; k++) {
            int waterLevel = Math.min(leftgretest[k], rightgretest[k]) - arr[k];
            System.out.println(waterLevel);
            totalWater = totalWater + waterLevel;
        }

        System.out.println("The Total water level :" + totalWater);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 0, 3, 5, 6 };
        trapped_water(arr);
    }

}
