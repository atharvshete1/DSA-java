import java.util.*;
public class prefixsum{
public static void sumsubarr(int arr[]) {
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1; i<arr.length ; i++){
                prefix[i]=prefix[i-1]+arr[i];
        }
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int start=0; start<arr.length; start++){
            int maxsum=Integer.MIN_VALUE;
            for(int end=start; end<arr.length; end++){
                if(start==0){
                    sum=prefix[end];
                }
                else{
                sum=prefix[end]-prefix[start-1];
                }
                if(sum>maxsum){
                    maxsum=sum;
                }
            }
             if(sum>max){
                    max=sum;
                }
        }
        System.out.println(max);
}

public static void main(String[] args){
    int []arr= {1,-2,3,6,8,5,9};
    sumsubarr(arr);
}
}
