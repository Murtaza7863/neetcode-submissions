class Solution {
    public boolean isPalindrome(String s) {
        String alpha = s.replaceAll("[^a-zA-Z0-9]", "");
        String l = alpha.toLowerCase();
        for (int i = 0; i < l.length()/2; i++) {
            if (l.charAt(i) != l.charAt(l.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
