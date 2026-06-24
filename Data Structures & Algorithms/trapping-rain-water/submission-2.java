 class Solution {
    public int trap(int[] height) {
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        int max = 0;
        int count = 0;
        for (int i : height) {
            if (max > i) {
                maxLeft[count++] = max;
            } else {
                maxLeft[count++] = i;
                max = i;
            }
        }

        max = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            if (max > height[i]) {
                maxRight[i] = max;
            } else {
                maxRight[i] = height[i];
                max = height[i];
            }
        }


        int total = 0;
        for (int i = 0; i < height.length; i++) {
            total += (Math.min(maxLeft[i], maxRight[i]) - height[i]);
        }

        return total;
    }
}