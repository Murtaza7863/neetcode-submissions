class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> pre = new HashMap<>();
        for (int i : nums) {
            if (!pre.containsKey(i)) {
                pre.put(i, 1);
            } else {
                pre.put(i, pre.get(i) + 1);
            }
        }
        List<Map.Entry<Integer, Integer>> preRes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : pre.entrySet()) {
            preRes.add(entry);
        }
        Collections.sort(preRes, (a, b) -> b.getValue() - a.getValue());
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = preRes.get(i).getKey();
        }

        return result;
    }
}

