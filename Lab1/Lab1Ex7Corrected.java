import java.util.Scanner;

public class Lab1Ex7Corrected {

    private static final int SHORT_SHIFT = 32768;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        short a = (short) (in.nextInt() - SHORT_SHIFT);

        System.out.print("Enter the second number: ");
        short b = (short) (in.nextInt() - SHORT_SHIFT);

        System.out.println("*  " + ((a + SHORT_SHIFT) * (b + SHORT_SHIFT)));
        System.out.println("+  " + ((a + SHORT_SHIFT) + (b + SHORT_SHIFT)));
        System.out.println("-  " + ((a + SHORT_SHIFT) - (b + SHORT_SHIFT)));
        System.out.println("/  " + ((a + SHORT_SHIFT) / (b + SHORT_SHIFT)));
        System.out.println("%  " + ((a + SHORT_SHIFT) % (b + SHORT_SHIFT)));
    }
}
