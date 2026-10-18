class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;

        for(int it : piles){
            max = Math.max(it,max);
        }

        int l = 1;
        int r =max;
        int ans = r;

        while(l<=r){
            int k = l+(r-l)/2;

            long total = 0;

            for(int it:piles){
                total += Math.ceil((double)it/k);
            }

            if(total>h){
                l=k+1;
            }
            else{
                //total<=h
                ans=k;
                r=k-1;
            }
        }
        return ans;
    }
}
