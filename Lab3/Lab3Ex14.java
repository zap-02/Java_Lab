import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lab3Ex14 {
    private String name;
    private double salary;

    public Lab3Ex14(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }

    public String getName() {

        return name;
    }

    public double getSalary() {
        return salary;
    }


    public static void main(String[] args) {
        Lab3Ex14 e1 = new Lab3Ex14("John", 2000);
        Lab3Ex14 e2 = new Lab3Ex14("Mike", 2500);
        Lab3Ex14 e3 = new Lab3Ex14("Mary", 1800);
        Lab3Ex14 e4 = new Lab3Ex14("David", 3000);

        List<Lab3Ex14> employees = Arrays.asList(e1, e2, e3, e4);

        // Сортировка по зарплате, а затем по имени
        employees.sort(Comparator.comparingDouble(Lab3Ex14::getSalary).thenComparing(Lab3Ex14::getName));
        System.out.println("Сортировка по зарплате, а затем по имени:");
        employees.forEach(System.out::println);

        // Сортировка в обратном порядке
        employees.sort(Comparator.comparingDouble(Lab3Ex14::getSalary).thenComparing(Lab3Ex14::getName).reversed());
        System.out.println("Сортировка в обратном порядке:");
        employees.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }
}