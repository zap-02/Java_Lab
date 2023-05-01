
package ExtraTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class MappingIterator<T> implements Iterator<T> {
    private final Iterator<T> iterator;





    public MappingIterator(Iterator<T> iterator) {
        this.iterator = iterator;

    }
    


    public static <T> MappingIterator<T> fromIterator(Iterator<T> iterator) {
        return new MappingIterator<>(iterator);
    }

    public <R> MappingIterator<R> map(Function<T, R> mapper) {
        List<R> resultList = new ArrayList<>();
        iterator.forEachRemaining(t -> resultList.add(mapper.apply(t)));
        return new MappingIterator<R>(resultList.iterator());
    }


    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.iterator.next();
    }

    @Override
    public void remove() {
        iterator.remove();
    }
}
