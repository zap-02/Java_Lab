package Lab2Ex10;

import java.util.List;
import java.util.Random;



public class RandomNumber {

    private static final Random random = new Random();

    public static int randomElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        return arr[random.nextInt(arr.length)];
    }

    public static int randomElement(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return list.get(random.nextInt(list.size()));
    }
}
