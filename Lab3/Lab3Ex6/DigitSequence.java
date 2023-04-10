package Lab3Ex6;

import java.util.Iterator;

public class DigitSequence implements Iterator<Integer> {
    private int number;

    public DigitSequence(int i) {
        number = i;
    }

    @Override
    public boolean hasNext() {
        return number != 0;
    }

    @Override
    public Integer next() {
        int result = number % 10;
        number /= 10;
        return result;
    }

    @Override
    public void remove() {
        //ничего
    }
}
