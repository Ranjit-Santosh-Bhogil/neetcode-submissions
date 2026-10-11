class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums){
            set.add(num);
        }
        int ans = 0;
        
        for(int num : nums){
            if(!set.contains(num-1)){
                int max = 0,curr=num;
                while(set.contains(curr)){
                    curr++;
                    max++;
                }
                ans = Math.max(ans,max);
            }
        }
        return ans;
}
}
