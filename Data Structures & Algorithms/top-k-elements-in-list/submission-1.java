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

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> m : pre.entrySet()) {
            minHeap.add(m);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll().getKey();
        }
        return result;
    }
}

