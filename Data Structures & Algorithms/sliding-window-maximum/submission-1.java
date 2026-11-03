class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n-k+1];
        int m=0;
        Deque<Integer> dq = new ArrayDeque<>();

        //first window
        for(int i=0;i<k;i++){
            while(dq.size()>0 && nums[dq.peekLast()] <= nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        //remaining window
        for(int i=k;i<n;i++){
            ans[m++]=nums[dq.peekFirst()];

            //out of window
            while(dq.size()>0 && dq.peekFirst()==i-k){
                dq.removeFirst();
            }

            //max check
            while(dq.size()>0 && nums[dq.peekLast()] <= nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        ans[m]=nums[dq.peekFirst()];//last window max

        return ans;
    }
}
