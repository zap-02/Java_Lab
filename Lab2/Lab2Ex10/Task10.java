package Task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Task10.RandomNumber.randomElement;

public class Task10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));

        // Получаем произвольный элемент из обычного массива
        int randomFromArray = randomElement(arr);
        System.out.println("Random element from array: " + randomFromArray);

        // Получаем произвольный элемент из списка
        int randomFromList = randomElement(list);
        System.out.println("Random element from list: " + randomFromList);

        // Пустой массив
        int[] emptyArray = {};
        int randomFromEmptyArray = randomElement(emptyArray);
        System.out.println("Random element from empty array: " + randomFromEmptyArray);

        // Пустой список
        List<Integer> emptyList = new ArrayList<>();
        int randomFromEmptyList = randomElement(emptyList);
        System.out.println("Random element from empty list: " + randomFromEmptyList);
    }
}
