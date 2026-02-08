import java.util.*;
public class insertionsort {
    public static void insertion(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr= arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > curr){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        System.out.print(Arrays.toString(arr));
  
    }
    public static void main(String[] args){
        int arr[] = {1,5,8,2,9,3,6,7,4};
        insertion(arr);
    }
}
