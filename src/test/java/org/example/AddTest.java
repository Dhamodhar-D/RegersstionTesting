package org.example;

import static org.junit.Assert.*;

public class AddTest {

    @org.junit.Test
    public void add() {
        Add ad = new Add();
        assertEquals(7,ad.add(2,5));
    }
}