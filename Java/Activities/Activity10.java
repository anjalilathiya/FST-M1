package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        System.out.println(hs.size());
        hs.remove("E");
        hs.remove("O");
        hs.contains("X"); // false
        System.out.println(hs);
    }
}
