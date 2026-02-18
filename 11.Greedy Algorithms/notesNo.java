import java.util.*;

public class coinNo {
    public static void coin(int price, int[] arr) { 
        int k = arr.length-1 ; 
        for(int i =0 ;i < arr.length /2  ; i++){
            int temp = arr[k] ; 
            arr[k] = arr[i];
            arr[i] = temp ;  
            k-- ; 
        }
        System.out.println(Arrays.toString(arr));
        int notes = 0;
        int i =0 ;
        while (price > 0 && i<arr.length) {
            int currNote = arr[i];
            if (currNote <= price) {
                int count = price / currNote;
                price -= count * currNote;
                notes += count;
            }
            i++; 
        }
        System.out.println(notes);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 10, 20, 50, 100, 200 ,  500, 2000 };
        coin(999, arr);
    }
}
