// package Leetcode;

// class Solution {
//     public int lengthOfLastWord(String s) {
//         // remove white spce
//         int count = 0;
//         String newString = s.strip();
//         for (int i = newString.length() - 1; i >= 0; i--) {
//             if (newString.charAt(i) == ' ') {
//                 break;
//             } else {

//                 count++;
//             }
//         }
//         // System.out.println(count);
//         return count;
//     }
// }

// public class Issue58 {

//     public static void main(String[] args) {
//         Solution s = new Solution();
//         s.lengthOfLastWord(" H");
//     }
// }
