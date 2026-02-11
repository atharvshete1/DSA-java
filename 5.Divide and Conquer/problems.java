import java.util.* ; 
public class problems {
    public static void mergeSort(String arr[] , int si , int ei){
        if(si >= ei){ return ;}

        int mid = si + (ei - si) / 2 ;
        mergeSort(arr , si , mid) ; 
        mergeSort(arr , mid+1 , ei) ; 

        merge(arr , si , mid, ei) ;
    }

    public static void merge(String arr[], int si , int mid , int ei){
        if(si >= ei){return ;}

        String temp[] = new String[(ei - si)+1] ;
        int i =si ;
        int j = mid+1 ; 
        int k = 0 ;
        
        while(i <=mid && j <=ei){
            String s1 = arr[i];
            String s2 = arr[j];
            
            if(s1.charAt(0) < s2.charAt(0)){
                temp[k] = s1 ;
                i++ ;  
            }
            
            else{
                temp[k] = s2 ;
                j++ ;  
            }
            k++;
        }

        while (i <= mid){
            String s1 = arr[i];
            temp[k] = s1 ;
            i++ ; k++;   
        }
        while(j <= ei){
            String s2 = arr[j];  
            temp[k] = s2 ;
            j++ ; k++ ; 
        }


        i =si ;
        for(int v = 0 ; v <temp.length ; v++ ){
            arr[i] = temp[v] ; 
            i++; 
        }

    }

    public static void subset(String s , String ans , int index)
    { 
        if(index == s.length()){
            System.out.println(ans);
            return ; 
        }

        subset(s , ans+s.charAt(index) , index+1);

        subset(s , ans , index +1 ); // backtracking 
    }

    public static void print(String arr[]){
        for(int i =0 ; i<arr.length ; i++){
        System.out.print(arr[i] + " ");
        }
    }

    public static int  majorityNum(int arr [], int si , int ei){
        //base case 
        if(si >= ei){ 
            return arr[si];
        }
        int mid = si + (ei - si)/2 ; 

        int leftNum = majorityNum(arr , si , mid ) ;
        int rightNum = majorityNum(arr , mid+1 , ei) ; 

        if(leftNum == rightNum){
            return leftNum ; 
        }

        int cntL = count(leftNum , arr , si , mid) ; 
        int cntR = count(rightNum , arr, mid+1 , ei) ; 

        if(cntL < cntR){
            return rightNum;
        }
        return leftNum ;
    }

    public static int count(int tar , int []arr , int si , int ei) {
        
    if(si == ei){return arr[si];}

    int cnt =0 ; 
    for(int i =0 ; i<arr.length; i++){
        if(arr[i] == tar){
            cnt++;
        }
    }
      return cnt ;   
    }

    public static void main(String[] args){
        int arr[] = {1,2,2,3,1,1,1,2,2,5,3}; 
        subset("abc" , "", 0 );

    }

    
    
}
