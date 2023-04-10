package Lab3Ex6;

import java.io.File;
import java.util.Arrays;

public class Lab3Ex6 {
    public static void main(String[] args) {
        DigitSequence ds = new DigitSequence(12345);
        while (ds.hasNext()) {
            System.out.print(ds.next() + " ");
        }
    }
}
