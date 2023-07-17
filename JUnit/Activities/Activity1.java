package activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Activity1 {
    static ArrayList<String> list;

    @BeforeEach
    @Test
    void setup() throws Exception {
        // Initialize a new ArrayList
        list = new ArrayList<String>();
        // Add values to the list
        list.add("alpha"); // at index 0
        list.add("beta"); // at index 1
    }


    @Test
    void insertTest() {
        assertEquals(2, list.size());
        list.add("gamma");
        assertEquals(3, list.size());
        assertEquals("alpha", list.get(0));
        assertEquals("beta", list.get(1));
        assertEquals("gamma", list.get(2));
    }

    public void replaceTest() {
        assertEquals(2, list.size());
        list.add("delta");
        assertEquals(3, list.size());
        list.set(1, "theta");
        assertEquals("theta", list.get(0));
        assertEquals("beta", list.get(1));
        assertEquals("gamma", list.get(2));
    }
}
