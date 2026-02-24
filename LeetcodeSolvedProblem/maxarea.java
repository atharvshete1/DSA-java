class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
     int multi = 1;
     int i =0;
     int count=0;
     for(i=0; i<nums.length; i++){
       int j=i+1;
       multi = multi * nums[i] ;
       if(multi < k) 
       {count++;
      
       }
       while(multi < k && j<nums.length){
        multi = multi * nums[j];
        if(multi < k) 
        { count++;
            j++;
        }
       } 
       multi = 1; 
    }

    return count;
}
}
