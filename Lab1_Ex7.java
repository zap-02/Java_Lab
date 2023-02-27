import java.util.Scanner;

public class Lab1_Ex7 {

    public static void main(String[] args) {

        int shift=32768;
        Scanner in = new Scanner(System.in);
        short a = (short) ( in.nextInt()-shift);
        short b = (short) ( in.nextInt()-shift);
        System.out.println("*  " + ( (a+shift) * (b+shift) ));
        System.out.println("+  " + ( (a+shift) + (b+shift) ));
        System.out.println("-  " + ( (a+shift) - (b+shift) ));
        System.out.println("/  " + ( (a+shift) / (b+shift) ));
        System.out.println("%  " + ( (a+shift) % (b+shift) ));

    }

}
