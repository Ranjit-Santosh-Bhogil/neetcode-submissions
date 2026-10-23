class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }

        int freq[] = new int[26];

        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            freq[ch-'a']++;
        }

        int l = 0;
        int count=0;

        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if(freq[ch-'a']>0){
                count++;
            }

            freq[ch-'a']--;

            if(i-l+1>s1.length()){
                char left = s2.charAt(l);
                if(freq[left-'a']>=0){
                    count--;
                }
                freq[left-'a']++;
                l++;
            }

            if(count==s1.length()){
                return true;
            }
        }
        return false;
    }
}
