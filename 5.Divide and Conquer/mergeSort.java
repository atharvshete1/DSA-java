import java.util.*;

public class mergeSort{
    public static void print(int temp[]){
        for(int i = 0; i< temp.length ; i++){
            System.out.print(temp[i] + " ");
        }
    }
    
    public static void mergeSorting(int arr [] , int si, int ei){
        if(si >= ei){
            return ; 
        }

        int mid = si + ((ei - si) / 2) ;

        mergeSorting(arr, si , mid);

        mergeSorting(arr , mid+1 , ei) ; 

        merge(arr , si ,ei,mid);
    }

    public static void merge(int arr[] , int si , int ei , int mid ){
        int temp[] = new int[ei-si+1];
        int k =0 ;
        int i = si ; 
        int j = mid + 1;

        while(i <= mid && j <=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++ ;
            }
            else{
                temp[k] = arr[j] ;
                j++ ;  
            }
            k++ ; 
        }

        while(i <=mid ){
            temp[k++] =arr[i++] ; 
        }


        while(j <=  ei ){
            temp[k++]=arr[j++];
        }

        i=si;
        for(k=0 ; k< temp.length ; k++){
            arr[i] = temp[k] ; 
            i++ ; 
        }
    }
    public static void main(String [] args){
        int arr[] ={6,3,9,5,2,8};
        mergeSorting(arr , 0 , arr.length-1);
        print(arr);


    }
}