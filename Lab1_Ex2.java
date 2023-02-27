import java.util.Scanner;

public class Lab1_Ex2 {
    public static void main(String[] args)
    {   System.out.print("Write your number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //-------Var 1------------
        int i = ((n % 360) + 360) % 360;
        System.out.println("Var 1: " + i);

        //-------Var 2------------
        i = Math.floorMod(n, 360);
        System.out.println("Var 2: " + i);

    }
}
