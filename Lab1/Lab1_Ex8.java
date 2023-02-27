import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.Stream;

public class Lab1_Ex8 {
       public static void main(String[] args) {
              System.out.print("Enter string: ");
              Scanner in = new Scanner(System.in);
              String str = in.nextLine();
              Stream.of(str.split("\\s+")).forEach(System.out::println);

       }


}
