package Lab2Ex9;

public class Lab2Ex9 {
    public static void main(String[] args) {
        Car car = new Car(7.3);
        car.fillTheCar(50);
        car.movePositive(100);
        System.out.println("Current position: " + car.getPositionOnX());
        System.out.println("Current fuel: " + car.getCurrentFuel());
        car.moveNegative(500);
        System.out.println("Current position: " + car.getPositionOnX());
        car.fillTheCar(40);
        car.moveNegative(140);
        System.out.println("Current position: " + car.getPositionOnX());
    }
    /* класс не может быть неизменяемым, так как его параметры местонахождения на оси x и запас топлива в баке изменяются */
}
