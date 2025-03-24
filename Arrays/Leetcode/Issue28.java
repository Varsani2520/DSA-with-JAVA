// package Leetcode;

class Solution {
    public int strStr(String haystack, String needle) {
        int i = haystack.indexOf(needle);
        return i;
    }
}

public class Issue28 {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.strStr("byeuby", "by");
    }
}
