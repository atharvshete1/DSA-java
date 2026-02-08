import java.util.*;
public class countingsort {
    public static void sort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest=Math.max(arr[i],largest);
        }

        int []count = new int[largest+1];
        for(int j=0; j<arr.length; j++){
            count[arr[j]]++ ;
        }

        int c=0;
        for(int k=0; k<count.length; k++){
        while(count[k] > 0){
            arr[c]=k;
            c++;
            count[k]-- ;
        }
    }
    System.out.println(Arrays.toString(arr));
}

    public static void main(String[] args)
    {
        int []arr = {8,2,4,3,6,1,9,3};
        sort(arr);
    }
}
