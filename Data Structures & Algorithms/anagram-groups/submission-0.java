class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap<>();
        for(String s : strs){
            char [] chararr = s.toCharArray();
            Arrays.sort(chararr);
            String sorteds = new String(chararr);
            res.putIfAbsent(sorteds,new ArrayList<>());
            res.get(sorteds).add(s);
        }

        return new ArrayList<>(res.values());
        
    }
}
