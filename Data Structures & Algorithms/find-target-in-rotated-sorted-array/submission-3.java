class Solution {
    public int search(int[] nums, int target) {
        int si = 0;
        int ei = nums.length-1;

        while(si<=ei){
            int mid = si+(ei-si)/2;

            if(nums[mid]==target){
                return mid;
            }
            //line 1
            if(nums[si]<=nums[mid]){
                //case a:left
                if(nums[si]<=target && target<=nums[mid]){
                    ei=mid-1;
                }
                //case b :right
                else{
                    si=mid+1;
                }
            }

            //line2
            else{
                // case c :right
                if(nums[mid]<=target&&target<=nums[ei]){
                    si=mid+1;
                }
                //case d :left
                else{
                    ei=mid-1;
                }
            }
        }
        return -1;
    }
}
