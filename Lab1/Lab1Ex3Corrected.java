import java.util.Scanner;

public class Lab1Ex3Corrected {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        String input = in.nextLine();
        String[] numbers = input.split(" ");
        int[] intNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);
        }

        int max1 = findMaxNumber1(intNumbers);
        int max2 = findMaxNumber2(intNumbers);

        System.out.println("The biggest number (findMaxNumber1) is: " + max1);
        System.out.println("The biggest number (findMaxNumber2) is: " + max2);
    }

    public static int findMaxNumber1(int... numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int findMaxNumber2(int... numbers) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
        }
        return max;
    }
}

