import java.util.Scanner;
import java.math.BigInteger;


public class Lab1Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        BigInteger answer;
        answer = BigInteger.valueOf(1);

            for (int i = 2; i <= n; i++)
                answer = answer.multiply(BigInteger.valueOf(i));

        System.out.println("Factorial : " + answer);
    }

}
