class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 1;
        int end = numbers.length;

        while(start<end){
            int sum = numbers[start-1] + numbers[end-1];

            if(sum==target){
                return new int[]{start,end};
            }

            if(sum>target){
                end--;
            }else{
                start++;
            }
        }
        return new int[]{};
    }
}
