package Leetcode;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();

    }
}

public class Issue392 {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.isSubsequence("asb", "acdefghbs");
    }
}
