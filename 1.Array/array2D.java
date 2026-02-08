import java.util.*;
import java.util.Arrays;
public class array2D{

    public static void largest(int arr[][]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                max=Math.max(max,arr[i][j]);
                min=Math.min(min,arr[i][j]);
            }
        }

        System.out.println("The Largest No.: "+max+" The Smallest No.: "+min);
        
    }


    public static void main(String[] args){

        int arr2[][] = new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr2));
        largest(arr2);  
    } 


    
}
