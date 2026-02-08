import java.util.*;
public class bubblesort {
    
    public static void bubblesort1(int arr[]){
        for(int start = 0 ; start < arr.length ; start++){
            for(int j=0; j<arr.length-1-start; j++){
                if(arr[j] > arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
            }
    

    public static void main(String[] args){
        int []arr = {5,3,1,7,8,3,6,5};
        bubblesort1(arr);
    }

}