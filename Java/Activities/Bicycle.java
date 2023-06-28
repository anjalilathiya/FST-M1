package activities;

public class Bicycle implements BicycleParts, BicycleOperations {
public int gears;
public int currentSpeed;
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    public void applyBrake(int decrement) {
        currentSpeed = currentSpeed - decrement;
        System.out.println("Current speed is : " + currentSpeed);
    }

    public void speedUp(int increment) {
        currentSpeed = currentSpeed + increment;
        System.out.println("Current speed is : " + currentSpeed);
    }

    public String bicycleDesc(){
        return ("\n No. of gears: " + gears + "." + "\n Current Speed is: " + speed + ".");
    }

}
