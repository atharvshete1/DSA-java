public class printSpiral {

    public static void print(int arr[][]){
        int startrow=0;
        int endrow= arr.length-1;
        int startcol=0;
        int endcol=arr[0].length-1;


        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int i=startcol; i<=endcol; i++){
                System.out.print(arr[startrow][i]+" ");
            }
            //right col
            for(int i=startrow + 1 ; i<=endrow; i++){
                System.out.print(arr[i][endcol]+" ");
            }
            //bottom
            for(int j=endcol-1; j>=startcol; j--){
                System.out.print(arr[endrow][j]+" ");
            }
            //left col
            for(int k= endrow-1; k>=startrow+1; k--){
                System.out.print(arr[k][startcol]+" ");
            }  
            
            startcol++;
            endcol--;
            startrow++;
            endrow--;
            }
    }

    public static void diagonalsum(int arr[][]){
        int sum1=0;
        int sum2=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i==j){
                    sum1 += arr[i][j];
                }

                if((i + j )==arr.length-1){
                    sum2 += arr[i][j];
                }
            }
        }
        System.out.println("1)The Diagonal1 Sum:"+sum1+" 2)The Diagonal2 Sum:"+sum2);   
    }



    public static void main(String[] ags){
        int [][]arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print(arr);
    }
    
}
