package ch1;

import java.util.Random;
import java.util.Scanner;

public class Lab1Ex10Corrected {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < 30; i++) {
            Random rand = new Random();
            long value = rand.nextLong();
            String str = Long.toUnsignedString(value, 36);
            result.append(str);
        }
        System.out.println(result.substring(0, n));
    }
}
