public class binerysearch {
    public static int search(int arr[], int key) {

        int start = 0;
        int end=arr.length-1;
        int target=key;
        

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return mid; 
                }
                if (arr[mid] > target) {
                    end = mid - 1; 
                } else {
                    start = mid + 1;
                }
            }

        
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 7, 9, 11, 13, 16, 18, 20, 23, 34, 56, 67, 80, 92 };
        int key = 1;
        System.out.print("the index of key is: " + search(arr, key));

    }

}
