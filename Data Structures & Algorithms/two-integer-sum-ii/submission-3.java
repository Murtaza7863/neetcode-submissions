class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int remainder = 0;
        int left = 0;
        int right = 1;
        while (left < numbers.length) {
            remainder = target - numbers[left];
            right = left + 1;

            while (right < numbers.length) {

                if (numbers[right] == remainder) {
                    result[0] = left + 1;
                    result[1] = right + 1;
                    return result;
                }

                right++;
            }

            left++;
        }
        return result;
    }
}
