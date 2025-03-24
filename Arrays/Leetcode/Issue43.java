class Solution {
    public String multiply(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int ans = n1 * n2;

        String finalAns = Integer.toString(ans);
        return finalAns;
    }
}

public class Issue43 {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.multiply("2", "3");
    }
}
