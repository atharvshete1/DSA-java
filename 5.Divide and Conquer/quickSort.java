import java.util.* ; 

public class quickSort{

    public static void quick(int arr[] , int si , int ei){
        if(si >= ei){
            return ; 
        }
        int j =si ; 
        int i = si -1  ;
        int pivot = arr[ei];
        int temp= 0; 

        while(j < ei){
            if(arr[j] < pivot){
                i++;
                temp = arr[i];
                arr[i] = arr[j] ;
                arr[j] = temp ; 
            }
            j++; 
        }

        i++;
        temp = arr[j];
        arr[j] =arr[i];
        arr[i] = temp ; 

        quick(arr , si, i-1) ; 
        quick(arr, i+1 ,ei ) ; 
    }

    public static void print(int arr[]){
        for(int i =0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main (String[] args){
        int arr [] = {6,7,2,5,3,1};
        quick(arr, 0 , arr.length-1);
        print(arr);
    }
}