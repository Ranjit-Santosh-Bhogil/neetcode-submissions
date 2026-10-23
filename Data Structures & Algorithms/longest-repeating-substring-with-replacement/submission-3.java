class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int l = 0;
        int len = s.length();
        int best = 0;
        int count[] = new int[26];

        for(int i =0; i< len; i++)
        {
            count[s.charAt(i) - 'A']++;
            max = Math.max(max, count[s.charAt(i) - 'A']);

            while(i - l - max + 1 > k)
            {
                count[s.charAt(l) - 'A']--;
                l++;
            }

            best = Math.max(best, i - l + 1);

        }

        return best;
    }
}
