class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length-1;
        int ans = 0;

        while(start<end){
            int h = Math.min(heights[start],heights[end]);
            int len = end-start;

            ans = Math.max(ans,h*len);

            if(heights[start] < heights[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return ans;
    }
}
