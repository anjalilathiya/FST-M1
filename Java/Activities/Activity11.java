package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Red");
        hm.put(2, "Green");
        hm.put(3, "Blue");
        hm.put(4, "White");
        hm.put(5, "Black");

        System.out.println("Original map: " + hm);

        hm.remove(4);
        System.out.println("After removing White: " + hm);

        if (hm.containsValue("Green")) {
            System.out.println("Green present");
        } else {
            System.out.println("Green not present");
        }
        System.out.println("Number: " + hm.size());
    }
}
