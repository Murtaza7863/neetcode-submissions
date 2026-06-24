 class Solution {
    public int trap(int[] height) {
        int water = 0;
        for (int i = 0; i < height.length; i++) {
            int maxLeft = 0;
            int maxRight = 0;
            for (int j = 0; j <= i; j++) {
                maxLeft = Math.max(maxLeft, height[j]);
            }
            for (int j = i; j < height.length; j++) {
                maxRight = Math.max(maxRight, height[j]);
            }
            int waterLevel = Math.min(maxLeft, maxRight);
            water += waterLevel - height[i];
        }
        return water;
    }
}