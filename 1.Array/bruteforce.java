public class bruteforce{
    
    public static void subarr(int arr[]){
       int sumMin=Integer.MAX_VALUE;
          int sumMax=0;
        for(int i=0; i< arr.length; i++){
          int min=Integer.MAX_VALUE;
          int max=0;
            for(int j=i; j< arr.length; j++){
                int z=0;
                for(int k=i; k<=j ; k++){
                           System.out.print(arr[k] + " ");
                           z=z+arr[k];
                        }  
                     System.out.println();
                     System.out.println("the addition of above subarray:"+ z);
                      System.out.println();
                     if(max<z){
                        max=z;
                     }
                     if(min>z){
                        min=z;
                     }    
                }
                 System.out.println();
                     if(sumMax<max){
                        sumMax=max;
                     }
                     if(sumMin>min){
                        sumMin=min;
                     }    
            }
            System.out.println("max:" +sumMax);
                      System.out.println("min:"+sumMin);  
                      System.out.println();
                     System.out.println("_____________________________________");
                     System.out.println();

             System.out.println();
        }
    public static void main(String[] args){
        int arr[] = {2,3,4,5,6};
        subarr(arr);
    }
    
}

