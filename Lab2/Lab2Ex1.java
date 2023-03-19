import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class Lab2Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ввод года и месяца
        System.out.print("Введите год: ");
        int year = input.nextInt();
        System.out.print("Введите месяц (числом от 1 до 12): ");
        int month = input.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = (weekday.getValue() % 7);
        System.out.println(value);
        // Неделя начинается с воскресенья
        System.out.println(" Вс Пн Вт Ср Чт Пт Сб");
        for (int i = 0; i < value; i++) {
            System.out.print("   ");
        }
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfWeek().getValue() == 6) {
                System.out.println();
            }
            date = date.plusDays(1);
        }
        if (date.getDayOfWeek().getValue() != 7) {
            System.out.println();
        }
    }
}
