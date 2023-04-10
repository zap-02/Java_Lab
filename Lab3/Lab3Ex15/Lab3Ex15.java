package Lab3Ex15;

import Lab3Ex4.IntSequence;

import java.util.Random;

public class Lab3Ex15 {
    private static final Random generator = new Random();
    private static class RandomSequence implements IntSequence {
        private final int low;
        private final int high;
        public RandomSequence(int low, int high) {
            this.low = low;
            this.high = high;
        }
        public int next() { return low + generator.nextInt(high - low +1); }
        public boolean hasNext() { return true; }
    }
    public static IntSequence randomInts(int low, int high) {

        return new RandomSequence(low, high);
    }
}
