class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int max = 0;
        int right = heights.length - 1;
        int left = 0;
        while (right > left) {
            area = Math.min(heights[right], heights[left]) * (right - left);
            if (area > max) {
                max = area;
            }
            if (heights[right] > heights[left]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
