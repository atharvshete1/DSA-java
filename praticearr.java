import java.util.Arrays;

public class praticearr {

    public static boolean repeat(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
            }
            if (counter >= 2) {
                return true;
            }
        }

        return false;
    }

    public static int que2(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid - 1] >= target && arr[start] <= target) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }
        }

        return -1;
    }

    public static int buyStock(int arr[]) {
        int buyprice = arr[0];
        int maxprofit = 0;
        int profit = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > buyprice) {
                profit = arr[i] - buyprice;
                maxprofit = Math.max(profit, maxprofit);
            } else {
                buyprice = arr[i];
            }
        }

        return maxprofit;
    }

    public static void trappedwater(int arr[]) {
        int[] leftMax = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > leftMax[i - 1]) {
                leftMax[i] = arr[i];
            } else {
                leftMax[i] = leftMax[i - 1];
            }
        }
        int[] rigthMax = new int[arr.length];
        rigthMax[arr.length-1]=arr[arr.length-1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > rigthMax[i + 1]) {
                rigthMax[i] = arr[i];
            } else {
                rigthMax[i] = rigthMax[i + 1];
            }
        }
        int waterLevel = 0;
        int trappedWater = 0;
        for (int i = 0; i < arr.length; i++) {
            waterLevel = (Math.min(leftMax[i], rigthMax[i])) - arr[i];
            System.out.println(waterLevel);
            trappedWater = trappedWater + waterLevel;
        }

        System.out.println(trappedWater);
    }


        public static void q5(int []arr){
            int []arr1 = new int[(arr.length + 1) / 2];
            for(int i=0; i<arr.length; i++){
                arr1[0]=arr[i];
                for(int j=i+1; j<arr.length; j++){
                    arr1[1]=arr[j];
                    for(int k=j+1; k<arr.length; k++){
                        arr1[2]=arr[k];

                        if(arr1[0]+arr1[1]+arr1[2] == 0 && arr1[0] != arr1[1] && arr1[2]!=arr1[1] && arr1[0] != arr1[2]){
                            System.out.println("["+arr1[0]+","+arr1[1]+","+arr1[2]+"]");
                        }
                        else{
                            System.out.println("[]");
                        }
                    }
                }
            }
        } 

    public static void main(String[] args) {
        int[] arr ={};
        int target = 1;
        q5(arr);
    }

}
