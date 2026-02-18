import java.util.* ; 
// Find the Chain made by pairs in which if pair is (a,b) so a<b and (c,d) so b<c then that is chain so we have to return pair number
public class chainNo{
    public static void number(int [][] arr){
        Arrays.sort(arr , Comparator.comparingInt(a -> a[1]));
        int preStart = 0 ;
        int preEnd = 0 ;
        int sum =0 ;
        for(int i =0 ; i<arr.length ; i++){
            if(i == 0){
                preStart = arr[i][0] ; 
                preEnd = arr[i][1] ; 
                sum++;
            }

            if(preEnd <arr[i][0]){
                preStart = arr[i][0] ; 
                preEnd = arr[i][1] ; 
                sum++;
            }
        }

        System.out.println(sum);
    }
    public static void main (String[] args){
        int [][] arr = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        number(arr);
    }
}