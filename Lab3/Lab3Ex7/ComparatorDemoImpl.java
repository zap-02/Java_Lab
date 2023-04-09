package Lab3Ex7;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemoImpl implements ComparatorDemo {

    @Override
    public void luckySort(List<String> strings, Comparator<String> comp) {
        while (!isSorted(strings, comp)) {
            Collections.shuffle(strings);
           // System.out.println(strings);
        }
    }

    private boolean isSorted(List<String> strings, Comparator<String> comp) {
        for (int i = 0; i < strings.size() - 1; i++) {
            if (comp.compare(strings.get(i), strings.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }
}

