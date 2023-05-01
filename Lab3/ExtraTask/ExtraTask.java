package ExtraTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExtraTask {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("one", "two", "three"));
        Iterator<String> iterator = strings.iterator();

        MappingIterator<Integer> mappingIterator = MappingIterator.fromIterator(iterator).map(String::length);



        List<Integer> numbers = new ArrayList<>();
        while (mappingIterator.hasNext()) {
            numbers.add(mappingIterator.next());
        }

        System.out.println(numbers);
    }
}


