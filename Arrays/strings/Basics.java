package strings;

public class Basics {
    public static void main(String[] args) {
        // declaration
        String Name = "John";
        String Surname = "John";

        // concatenation
        String fullname = Name + " " + Surname;
        Name.concat(Surname);

        // length
        System.out.println(fullname.length());

        // charAt
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }

        // compare two string
        String name1 = "Tony";
        String name2 = "Tony";

        // n1>n2 =poitive
        // n1<n2 =negative
        // n1==n2 =zero

        if (name1.compareTo(name2) == 0) {
            System.out.println("strings are equal");
        } else {
            System.out.println("not equal");
        }

        // in some cases == fail
        if (name1 == name2) {
            System.out.println("strings are equal");
        } else {
            System.out.println("not equal");
        }

        // based on object -memory
        if (new String("Tony") == new String("Tony")) {
            System.out.println("strings are equal");
        } else {
            System.out.println("not equal");
        }

        // substring
        String Sentence = "My name is India";

        System.out.println(Sentence.split(""));
        System.out.println(Sentence.substring(5, 12));

        // parsInt method -string to int
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        // tostring-int to string
        String str1 = Integer.toString(number);
        System.out.println(str1);
    }
}
// string is a immutable data type.