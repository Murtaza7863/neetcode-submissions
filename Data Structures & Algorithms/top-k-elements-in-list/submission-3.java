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
        List<Integer>[] preRes = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> m : pre.entrySet()) {

            int freq = m.getValue();
            int num = m.getKey();
            if (preRes[freq] == null) {
                preRes[freq] = new ArrayList<>();
            }
            preRes[freq].add(num);
        }
        int[] result = new int[k];
        int index = 0;

        for (int i = preRes.length - 1; i >= 0; i--) {
            if (preRes[i] != null) {
                for (int num : preRes[i]) {
                    result[index] = num;
                    index++;
                    if (index == k) {
                        return result;
                    }
                }
            }
        }
        return result;
    }
}

