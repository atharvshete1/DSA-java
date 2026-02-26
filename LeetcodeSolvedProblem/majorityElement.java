import java.util.* ; 
class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        Arrays.sort(nums);
        int mid = nums.length / 2 ; 

        if(nums.length >2){
        return nums[mid] ; 
        }
        
        return nums[0];
    }
}
