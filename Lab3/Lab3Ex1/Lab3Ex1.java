package Lab3Ex1;

public class Lab3Ex1 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John", 50000),
                new Employee("Mary", 60000),
                new Employee("Bob", 70000)
        };

        double averageSalary = Employee.average(employees);
        System.out.println("Average salary: " + averageSalary);
    }
}
