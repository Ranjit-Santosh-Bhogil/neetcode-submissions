class Solution {
    public int characterReplacement(String s, int k) {
        HashSet<Character> charSet = new HashSet<>();
        int max = 0;
        for(char ch : s.toCharArray()){
            charSet.add(ch);
        }

        for(char c :charSet){
            int count =0,l=0;

            for(int i=0;i<s.length();i++){

                if(c==s.charAt(i)){
                    count++;
                }

                while((i-l+1)-count>k){
                    if(c==s.charAt(l)){
                        count--;
                    }
                    l++;
                }
                max = Math.max(max,i-l+1);
            }
        }
        return max;
    }
}
