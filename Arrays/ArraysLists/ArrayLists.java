package ArraysLists;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        // type start with capital letter

        // 1. declare arraylist with different types
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<Boolean> list2 = new ArrayList<Boolean>();
        ArrayList<Float> list3 = new ArrayList<Float>();

        // 2. add element
        list.add(30);
        list.add(50);
        list.add(90);

        System.out.println(list);

        // 3.get element
        int element = list.get(0); // 0is index
        System.out.println(element);

        // 4.add element in between
        list.add(2, 80);
        System.out.println(list);

        // set element
        list.set(2, 100);
        System.out.println(list);

        // remove element
        list.remove(0); // remove 0 index element
        System.out.println(list);

        // size of element
        int size = list.size();
        System.out.println(size);

        // iterations
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // sorting the list
        Collections.sort(list);
        System.out.println(list);

    }
}
