package Lab3Ex1;

public class Employee implements Measurable {
    private final String name;
    private final double salary;

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

    @Override
    public double getMeasure() {
        return salary;
    }

    public static double average(Measurable[] objects) {
        if (objects.length == 0) {
            return 0.0;
        }

        double sum = 0.0;

        for (Measurable object : objects) {
            sum += object.getMeasure();
        }

        return sum / objects.length;
    }
    
    public static String largest(Measurable[] objects) {

    if (objects.length == 0)
    return "Nothing";

    String LargestSal = null;
    double Sal = 0.0;

    for (Measurable object: objects) {
    if ( Sal <= object.getMeasure() ){
    Sal = object.getSalary();
    LargestSal = object.getName();
    }
    }
    return LargestSal ;


}
}

