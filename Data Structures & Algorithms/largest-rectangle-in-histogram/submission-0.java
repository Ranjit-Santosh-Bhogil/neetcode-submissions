class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int maxarea = 0;
        int n = heights.length;
        int nsr[] = new int[n];
        int nsl[] = new int[n];

        //next smaller right
        Stack<Integer> s = new Stack<>();

        for(int i=n-1;i>=0;i--){


            while(!s.isEmpty() && heights[s.peek()] >= heights[i] ){
                s.pop();
            }

            if(s.isEmpty()){
                nsr[i] = n;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //next smaller left
        s = new Stack<>();

        for(int i=0;i<n;i++){

            while(!s.isEmpty()&& heights[s.peek()]>=heights[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nsl[i] = -1;//-1 is a virtual boundary outside the array, allowing the width formula to include index 0.
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //max area

        for(int i=0;i<n;i++){
            int area = heights[i]*(nsr[i]-nsl[i]-1);
            maxarea = Math.max(area,maxarea);
        }
        return maxarea;
    }
}
