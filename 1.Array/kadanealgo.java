public class kadanealgo {
    public static void kadane(int arr[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
            if(sum<0){
                sum=0;
            }
            if(max < sum){
                max=sum;
            }
        }
        System.out.print("The maximum Sum is:"+ max);
    }

    public static void main(String[] args){
        int arr[] ={-1, 2, 3,-3,6};
        kadane(arr); 
    }
}
