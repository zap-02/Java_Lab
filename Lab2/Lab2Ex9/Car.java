package Lab2Ex9;

public class Car {
    private double positionOnX;
    private final double consumption;

    public double getCurrentFuel() {
        return currentFuel;
    }

    private double currentFuel;
    public Car(double consumption){
        this.consumption = consumption;
        this.currentFuel = 0;
        this.positionOnX = 0;
    }
    public double getPositionOnX(){
        return positionOnX;
    }
    public void fillTheCar(double amount){
        currentFuel += amount;
    }
    public boolean movePositive(double km){
        if(km <= currentFuel * consumption){
            positionOnX += km;
            currentFuel -= km/consumption;
            return true;
        }
        else {
            while (currentFuel >= consumption) {
                positionOnX += consumption;
                currentFuel -= 1;

            }
            positionOnX += currentFuel*consumption;
            currentFuel = 0;
            System.out.println("Car run out of fuel before reaching the destination!");
            return false;
        }
    }
    public boolean moveNegative(double km){
        if(km <= currentFuel * consumption){
            positionOnX -= km;
            currentFuel -= km/consumption;
            return true;
        }
        else {
            while (currentFuel >= consumption) {
                positionOnX -= consumption;
                currentFuel -= 1;

            }
            positionOnX -= currentFuel*consumption;
            currentFuel = 0;
            System.out.println("Car run out of fuel before reaching the destination!");
            return false;
        }
    }


}
