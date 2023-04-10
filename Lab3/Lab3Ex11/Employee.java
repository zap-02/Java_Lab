package Lab3Ex11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
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
        Employee e1 = new Employee("John", 2000);
        Employee e2 = new Employee("Mike", 2500);
        Employee e3 = new Employee("Mary", 1800);
        Employee e4 = new Employee("David", 3000);

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4);

        // Сортировка по зарплате, а затем по имени
        employees.sort(Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName));
        System.out.println("Сортировка по зарплате, а затем по имени:");
        employees.forEach(System.out::println);

        // Сортировка в обратном порядке
        employees.sort(Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName).reversed());
        System.out.println("Сортировка в обратном порядке:");
        employees.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }
}