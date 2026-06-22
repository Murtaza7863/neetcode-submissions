class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int sum = 0;
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            sum = numbers[left] + numbers[right];
            if (sum > target) {
                right--;
            }

            if (sum < target) {
                left++;
            }

            if (sum == target) {
                break;
            }

        }
        result[0] = left + 1;
        result[1] = right + 1;
        return result;
    }
}
