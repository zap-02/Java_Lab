
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Lab1_Ex16 {

    public static void main(String[] args) {
        System.out.print("Enter string numbers: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        List<Double> list = Arrays.stream(str.trim().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        double sum = 0;
        for (double it : list) {
            sum += it;
        }

        System.out.println((double) sum / 2);

    }
}





