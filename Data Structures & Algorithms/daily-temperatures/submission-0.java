class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> s = new Stack<>();
        int result[] = new int[t.length];
        for(int i=0;i<t.length;i++){

            while(!s.isEmpty() && t[i] > t[s.peek()]){
                int idx = s.pop();
                result[idx] = i-idx;
            }
            s.push(i);
        }

        return result;
    }
}
