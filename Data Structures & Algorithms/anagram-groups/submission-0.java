class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String val = strs[i];
            char[] ch = strs[i].toCharArray();

            Arrays.sort(ch);

            String key = new String(ch);

            if(map.containsKey(key)){
                map.get(key).add(val);   
            }else{
                map.put(key,new ArrayList<>(List.of(val)));
            }
        }
        List<List<String>> answer = new ArrayList<>();

            
        for(String key:map.keySet()){
            List<String> one = map.get(key);
            answer.add(one);
        }
        return answer;
    }
}
