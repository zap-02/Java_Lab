package Lab3Ex5;

public abstract class Lab3Ex5 {

        public interface IntSequence {
         default boolean hasNext() {
            return true;
        }

        long next();
        static IntSequence constant(int num) {
            return () -> num;
        }

    }

    static void a(){
        IntSequence intSequence1 = IntSequence.constant(1);
        while (intSequence1.hasNext()) {
            System.out.println(intSequence1.next());
        }
    }



}
