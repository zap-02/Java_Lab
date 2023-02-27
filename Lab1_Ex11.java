import java.util.Scanner;
import java.nio.charset.Charset;

public class Lab1_Ex11 {
    public static void main(String[] args) {
        System.out.print("Enter string:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();


        for (int i = 0; i< str.length(); i++) {
            if( str.charAt(i) > 127)
                System.out.println(str.charAt(i) + " " + (int) str.charAt(i));

        }

    }
}
