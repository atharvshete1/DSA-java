import java.util.Arrays;

public class pratice {
    public static void print(int arr[][]){
       int startrow=0;
       int endrow=arr.length-1;
       int startcol=0;
       int endcol=arr[0].length-1;

        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int i=startcol; i<=endcol; i++){
                System.out.print(arr[startrow][i]+" ");
            }
            //right col
            for(int j=startrow+1; j<=endrow; j++){
                System.out.print(arr[j][endcol]+" ");
            }
            //bottom
            for(int k=endcol-1; k>=startcol; k--){
                System.out.print(arr[endrow][k]+" ");
            }
            //left col
            for(int j=endrow-1; j>=startrow+1; j--){
                System.out.print(arr[j][startcol]+" ");
            }
            startcol++;
            endcol--;
            startrow++;
            endrow--;
        }
    }

    public static boolean staircaseSearch(int arr[][], int key){
        int i=0;
        int j=arr[0].length-1;
        
            while(j >=0 && i <arr.length){
            if(arr[i][j]==key){
               System.out.println("The key at: ("+ i +","+ j +") ");
               return true;
            }
            else if(arr[i][j] > key){
                j--;
            }
            else if(arr[i][j] < key){
                i++;
            }
        }
        return false;
}
    public static void main(String[] args){
          int[][] var1 = new int[][]{{10, 20, 30, 40}, {32, 47, 67, 88}, {44, 49, 69, 89}, {64, 66, 78,95}};
          System.out.println(staircaseSearch(var1,88));
    }
    
}
