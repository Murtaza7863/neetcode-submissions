class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> preResult = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        if (nums.length == 0) {
            return 0;
        }
        current.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                continue;
            }
            if (nums[i] == nums[i-1]+1) {
                current.add(nums[i]);
            } else {
                preResult.add(current);
                current = new ArrayList<>();
                current.add(nums[i]);
            }
        }
        preResult.add(current);
        int max = 0;
        for (List<Integer> l : preResult) {
            if (l.size() > max) {
                max = l.size();
            }
        }
        return max;
    }
}
