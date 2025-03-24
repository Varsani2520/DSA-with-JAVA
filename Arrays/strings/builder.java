package strings;

public class builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // insert
        sb.insert(0, 'S');
        System.out.println(sb);

        // delete
        sb.delete(2, 3);
        System.out.println(sb);

        // append - add in last
        sb.append("h");
        sb.append("e");
        sb.append("l");
        System.out.println(sb);
        System.out.println(sb.length());

    }
}
