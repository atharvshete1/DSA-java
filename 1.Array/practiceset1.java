import java.util.*;
public class practiceset1 {

    /*
    Q.1)Print the number of 7’s that are inthe 2d array.
    Example :Input - int[][] array = { {4,7,8},{8,8,7} };
    Output = 2 
    */
    public static void q1(int arr[][], int key){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == key){
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    /*
    Q.2)Print out the sum of the numbers in the second row of the “nums” array.
    Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
    Output - 18;
    */

    public static void q2(int arr[][]){
        int sum=0;
        int j=1;
        for(int i=0; i<arr[0].length; i++){
            sum += arr[j][i];
        }

        System.out.println("the addition of second row is: "+sum);
    }

    /*
    Q.3)Write a program to FindTransposeofa Matrix.
    What is Transpose?
    Transpose of a matrix is the process ofswapping therows to columns. For a 2x3 matrix 
    */

    public static void q3(int arr[][]){
        int row=arr[0].length;
        int col=arr.length;
        int arr2[][]= new int[row][col];
        for(int i=0; i<row ; i++){
            for(int j=0; j<col; j++){
                arr2[i][j]=arr[j][i];
            }
        }
        System.out.println(Arrays.deepToString(arr2));
    }

    public static void main(String[] args){
        int arr[][] = {{4,7,8},{8,8,7}};
        int key=8;
        //q1(arr,key);
        //q2(arr);
        q3(arr);
    }
    
}
