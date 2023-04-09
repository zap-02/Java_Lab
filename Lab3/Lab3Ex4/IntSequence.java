package Lab3Ex4;

import java.util.NoSuchElementException;

public interface IntSequence {
    boolean hasNext();
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
       default boolean hasNext() {
return true;
}

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
