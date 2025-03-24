// package Leetcode;

class Solution {
    public String addStrings(String num1, String num2) {
        // long n1=Long.parseLong(num1);
        // long n2=Long.parseLong(num2);
        Double n1 = Double.parseDouble(num1);
        Double n2 = Double.parseDouble(num2);
        Double sum = n1 + n2;
        System.out.println(sum.toString());
        // System.out.println(Integer.toString(sum));
        return Double.toString(sum);

    }
}

public class Issue415 {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.addStrings("69132592441234567892345678", "7110334312345678934567");
    }
}
