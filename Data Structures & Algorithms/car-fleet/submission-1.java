class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;
        int car[][] = new int[n][2];

        for(int i=0;i<n;i++){
            car[i][0]=position[i];
            car[i][1]=speed[i];
        }

        Arrays.sort(car,(a,b)->Integer.compare(b[0],a[0]));


        Stack<Double> s = new Stack<>();

        for(int[] p:car){
            s.push((double)(target-p[0])/p[1]);

            if(s.size()>=2 && s.peek()<=s.get(s.size()-2)){
                s.pop();//this to get second element from top (size-2)

            }
        }
        return s.size();
    }
}
