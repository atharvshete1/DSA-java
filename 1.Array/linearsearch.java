public class linearsearch {
    public static int largestno(int arr[])
    {
        double x = Double.NEGATIVE_INFINITY;
        int y=(int) x;
        for(int i=0; i<arr.length ; i++){
            if(arr[i] > y){
                y =arr[i];
            }

            else{
                continue;
            }
        }
        return y;

    }

    public static void main(String[] args){
        int arr[]={10,56,67,9,90,112,54,87,24,98,88,87,22};
        System.out.print(largestno(arr));
    }
    
}
