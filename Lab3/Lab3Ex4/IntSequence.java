package Lab3Ex4;

import java.util.NoSuchElementException;

public interface IntSequence {
    default boolean hasNext() {
    return true;
    }
    int next();

    static IntSequence of(int... values) {
        return new IntSequence() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < values.length;
            }
            
            
            
            @Override
            public int next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                return values[index++];
            }
        };
       

    static IntSequence constant(int num) {
        return () -> num;
    }


    static void a(){
        IntSequence intSequence1 = IntSequence.constant(1);
        while (intSequence1.hasNext()) {
        System.out.println(intSequence1.next());
        }
    }
    }
}
