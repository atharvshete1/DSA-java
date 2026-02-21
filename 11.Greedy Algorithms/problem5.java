public class problem5 {
    /*
     * Given an array arr[] of N elements and an integer K (1 ≤ K ≤ N),
     * 
     * Split the array into K contiguous subarrays such that:
     * - Every element must be included.
     * - The maximum subarray sum is minimized.
     * 
     * Return that minimum possible maximum subarray sum.
     * 
     * Example:
     * Input:
     * arr = [7, 2, 5, 10, 8]
     * K = 2
     * 
     * Output:
     * 18
     * 
     * Explanation:
     * Split as [7,2,5] and [10,8]
     * Subarray sums = 14 and 18
     * Maximum = 18 (minimum possible)
     */
    public static void ans(int arr[], int k) {
        int sum1 = 0;
        int gretest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
            gretest = Math.max(arr[i], gretest);
        }
        int high = sum1;
        int low = gretest;
        while (high >= low) {
            int mid = (high + low) / 2;
            int parts = 1;
            int i = 0;
            int sum = 0;
            while (i < arr.length) {
                if (sum + arr[i] < mid) {
                    sum += arr[i];
                } else {
                    sum = arr[i];
                    parts++;
                }
                i++;
            }
            if (parts <= k) {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println(low);
        System.out.println(high);
        

    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7 };
        ans(arr, 3);
    }
}
