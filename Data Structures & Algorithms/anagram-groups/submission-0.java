class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> pre = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            if (!pre.containsKey(str)) {
                pre.put(str, new ArrayList<>());
            }
            pre.get(str).add(s);
        }
        return new ArrayList<>(pre.values());
    }
}
