class Solution {
    public int findMin(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        
        int small=0;
        while(s<=e){
           int mid = s+(e-s)/2;
            if(nums[0]>nums[mid]){
                small=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return nums[small];
    }
}
