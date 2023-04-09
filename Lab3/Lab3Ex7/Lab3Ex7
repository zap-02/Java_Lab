package Lab3Ex7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lab3Ex7 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("banana");
        strings.add("apple");
        strings.add("grape");
        strings.add("orange");
        strings.add("pear");

        Comparator<String> comp = (s1, s2) -> s1.compareTo(s2);

        ComparatorDemo comparatorDemo = new ComparatorDemoImpl();
        comparatorDemo.luckySort(strings, comp);

        System.out.println(strings);
    }
}

