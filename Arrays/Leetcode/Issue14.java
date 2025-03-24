import java.util.Arrays;

class Problem {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        System.out.println();
        String s = "ndjs";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {

        }
        sb.charAt(0);
        System.out.println(sb.charAt(2));
        // for (String i : strs) {
        // System.out.println(i.charAt(0));
        // System.out.println(i.charAt(1));
        // // System.out.println(i.charAt(2));
        // // System.out.println(i.charAt(0) == i.codePointAt(0));
        // // System.out.println(i.charAt(1) == i.codePointAt(1));
        // }

        return s;
    }
}

public class Issue14 {
    public static void main(String[] args) {
        Problem p = new Problem();
        String strs[] = { "apple", "apl", "ap" };
        p.longestCommonPrefix(strs);
    }
}
