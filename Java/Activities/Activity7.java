package activities;

public class Activity7 {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(1,2,3);
        System.out.println(mountainBike.bicycleDesc());
        mountainBike.speedUp(20);
        mountainBike.applyBrake(10);
    }
}
