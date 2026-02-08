import java.util.*;
public class selectionsort {
    

    public static void selectionsort1(int arr[]){
        for(int start=0; start<arr.length; start++){
            int smallest =Integer.MAX_VALUE;
            int smallindex=start;
            for(int compare=start+1; compare<arr.length; compare++){
                if(arr[smallindex] > arr[compare]){
                    smallindex = compare;
                }
            }
            int temp= arr[start];
            arr[start] = arr[smallindex];
            arr[smallindex] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args){
        int []arr = {9,4,3,2,6,1,9};
        selectionsort1(arr);
    }
    
}
