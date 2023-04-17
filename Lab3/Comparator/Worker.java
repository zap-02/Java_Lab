package Comparator;

public class Worker {
    private final int salary;
    private final int id;
    public Worker(int salary, int id){
        this.salary = salary;
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
