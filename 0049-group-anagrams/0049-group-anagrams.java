class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
        return new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for(String s: strs){
            char[] array = s.toCharArray();
            Arrays.sort(array);

            String key = new String(array);
            if(!map.containsKey(key))
            map.put(key, new ArrayList<>());

            map.get(key).add(s);

        }
        ans.addAll(map.values());

        return ans;
    }
}