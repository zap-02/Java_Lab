import java.util.Scanner;

public class Lab1_Ex3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int number_1, number_2, number_3;
        number_1 = in.nextInt();
        number_2 = in.nextInt();
        number_3 = in.nextInt();

        //-------Var 1------------
        if(number_1 > number_2){
            if (number_1 > number_3)
                System.out.println("Biggest number is: " + number_1);
            else
                System.out.println("Biggest number is : " + number_3);
        }
        else{
            if (number_2 > number_3)
                System.out.println("Biggest number is : " + number_2);
            else
                System.out.println("Biggest number is : " + number_3);
        }

        //-------Var 2------------
        System.out.println("Biggest number is : " + Math.max(Math.max(number_1,number_2),Math.max(number_2,number_3)));
    }
}
