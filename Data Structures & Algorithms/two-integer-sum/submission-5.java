class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> pre = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int left = target - nums[i];
            if (pre.containsKey(left)) {
                result[0] = pre.get(left);
                result[1] = i;
                return result;
            }

            pre.put(nums[i], i);
        }
        return null;
    }
}
