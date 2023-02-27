import java.util.Scanner;

public class lab9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String s1 = input.nextLine();
        String s2 = input.nextLine();
        int length = Math.min(s1.length(), s2.length()); // находим минимальную длину двух строк

        int i = 0;
        while (i < length && s1.charAt(i) == s2.charAt(i)) { // пока символы в строках совпадают
            i++;
        }

        if (i == length) {
            if (s1.length() == s2.length()) {
                System.out.println("Строки s1 и s2 равны");
            } else if (s1.length() > s2.length()) {
                System.out.println("Строка s1 больше строки s2");
            } else {
                System.out.println("Строка s2 больше строки s1");
            }
        } else if (s1.charAt(i) > s2.charAt(i)) {
            System.out.println("Строка s1 больше строки s2");
        } else {
            System.out.println("Строка s2 больше строки s1");
        }

    }
}
