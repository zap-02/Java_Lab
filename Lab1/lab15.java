import java.util.ArrayList;
import java.util.Scanner;

public class lab15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту треугольника Паскаля: ");
        int height = scanner.nextInt();

        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    ArrayList<Integer> prevRow = triangle.get(i - 1);
                    int num = prevRow.get(j - 1) + prevRow.get(j);
                    row.add(num);
                }
            }
            triangle.add(row);
        }

        for (ArrayList<Integer> row : triangle) {
            int spaces = height - row.size();
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
