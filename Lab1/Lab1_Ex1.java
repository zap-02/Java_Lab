import java.util.Scanner;

public class Lab1Ex1 {
    public static void main(String[] args)
    {   System.out.print("Write your number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //-------Var 1------------
        String str;
        str = "Binary " + Integer.toString(n, 2);
        System.out.println(str);
        //-------Var 2------------
        System.out.println("Octal " + Integer.toString(n, 8));
        System.out.println("Hexadecimal " + Integer.toString(n, 16));
        System.out.println("Hexadecimal revers " + Double.toHexString((double)1/n));
    }
}
