package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("A");
        arrList.add("B");
        arrList.add("C");
        arrList.add("D");
        arrList.add("E");

        for (String arrayItem : arrList) {
            System.out.println(arrayItem);
        }

        System.out.println("Third item in list is " + arrList.get(2));
        System.out.println("Conatins is " + arrList.contains("E"));
        System.out.println("Number of items in ArrayList is " + arrList.size());
        arrList.remove("E");
        System.out.println("Number of items in ArrayList is " + arrList.size());

    }
}