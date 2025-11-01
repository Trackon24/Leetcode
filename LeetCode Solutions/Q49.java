public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> map=new HashMap<>();
        for(String s:strs){
            int[] count=new int[26];
            for(char c:s.toCharArray())count[c-'a']++;
            map.computeIfAbsent(Arrays.hashCode(count),(k)->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}