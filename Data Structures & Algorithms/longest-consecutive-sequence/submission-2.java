class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int count = 0;
        for (Integer num : set) {
            if (!set.contains(num - 1)){
                int i = 0;
                while (set.contains(num + i)) {
                    i++;
                }

                if (i > count) {
                    count = i;
                }
           }
        }
        return count;
    }
}

