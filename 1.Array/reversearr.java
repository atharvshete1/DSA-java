import java.util.Arrays;

public class reversearr {
    public static void reverse(int arr[]){
        int start=0;
        int temp=0;
        int end=arr.length-1;
        for( start=0; start<end+1 / 2 ; start++){
            temp= arr[end];
            arr[end]= arr[start];
            arr[start] = temp;
            end-- ; 
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void main(String[] args){
        int arr[]= {1,3,5,7,8,35,9,22};
        reverse(arr);
    }
    
}
