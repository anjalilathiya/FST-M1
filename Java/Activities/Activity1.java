package activities;

public class Activity1 {
    public static void main(String[] args) {
        Car ciaz = new Car();
        ciaz.make = 2014;
        ciaz.color="Black";
        ciaz.transmission="Manual";

        ciaz.displayCharacteristics();
        ciaz.accelarate();
        ciaz.brake();

    }


}
